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


/** Options for {@code torch::nn::functional::alpha_dropout}.
 * 
 *  Example:
 *  <pre>{@code
 *  namespace F = torch::nn::functional;
 *  F::alpha_dropout(input, F::AlphaDropoutFuncOptions().p(0.5).training(false));
 *  }</pre> */
@Namespace("torch::nn::functional") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AlphaDropoutFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AlphaDropoutFuncOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AlphaDropoutFuncOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AlphaDropoutFuncOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AlphaDropoutFuncOptions position(long position) {
        return (AlphaDropoutFuncOptions)super.position(position);
    }
    @Override public AlphaDropoutFuncOptions getPointer(long i) {
        return new AlphaDropoutFuncOptions((Pointer)this).position(position + i);
    }

  public native @ByRef @NoException DoublePointer p();
  public native @Cast("bool*") @ByRef @NoException BoolPointer training();
  public native @Cast("bool*") @ByRef @NoException BoolPointer inplace();
}