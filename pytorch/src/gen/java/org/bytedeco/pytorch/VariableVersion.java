// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// NOTE [ Version Counter Sharing ]
//
// Every Tensor has a version counter. Version counters are incremented whenever the
// data or size of a tensor changes through in-place Variable operations. Version
// counters are used to detect modifications to saved variables which would result in
// incorrect gradient calculations. Version counters may be shared between Variables:
//
// 1. A view shares the version counter of the base Variable,
// 2. `x.detach()` shares the version counter of `x`,
// 3. Unpacked saved variables share the version counter of the source.
//
// Version counters are not shared in these scenarios:
//
// 1. When we replace a `Variable`'s underlying `Tensor` by calling `set_data(...)`,
// 2. `x.data` does not share the version counter of `x`. (See discussion at
// https://github.com/pytorch/pytorch/issues/5396)
//
// Question: Why do we put the version counter in TensorImpl instead of AutogradMeta?
//
// Answer: After the Variable/Tensor merge, a tensor will not have AutogradMeta when
// its `requires_grad_` is false, but when we use this tensor in the forward pass of
// a function that requires saving this tensor for backward, we need to keep track of
// this tensor's version to make sure it's always valid in the autograd graph.
//
// To achieve this goal, we put the version counter in TensorImpl instead of AutogradMeta,
// and have it always be available. This allows us to have the optimization of not
// carrying AutogradMeta when a tensor doesn't require gradient.
//
// A hypothetical alternative way to achieve this goal is to initialize AutogradMeta and
// create the version counter for the non-requires-grad tensor only when it's saved for
// backward. However, since saving a tensor for backward happens in the forward pass, and
// our invariant is that forward pass needs to be thread-safe, lazy-initializing AutogradMeta
// when saving a tensor can introduce race conditions when we are running the forward
// pass in multi-thread scenarios, thus making the forward pass not thread-safe anymore,
// which breaks the invariant.
@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class VariableVersion extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VariableVersion(Pointer p) { super(p); }

  public native @Cast("bool") boolean unique();
  // NOTE: As of C++11 and 14, default-constructing a std::atomic variable
  // leaves it in a persistently undefined state. See
  // https://cplusplus.github.io/LWG/issue2334.
  public VariableVersion(@Cast("uint32_t") int version/*=0*/) { super((Pointer)null); allocate(version); }
  private native void allocate(@Cast("uint32_t") int version/*=0*/);
  public VariableVersion() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @NoException void bump();

  public native @Cast("uint32_t") @NoException int current_version();
}