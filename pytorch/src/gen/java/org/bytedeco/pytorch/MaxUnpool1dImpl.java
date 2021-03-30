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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ MaxUnpool1d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies maxunpool over a 1-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.MaxUnpool1d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::MaxUnpool1dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  MaxUnpool1d model(MaxUnpool1dOptions(3).stride(2).padding(1));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MaxUnpool1dImpl extends MaxUnpool1dImplBase {
    static { Loader.load(); }

  
    public MaxUnpool1dImpl(@ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size) { super((Pointer)null); allocate(kernel_size); }
    @NoDeallocator private native void allocate(@ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size);
    public MaxUnpool1dImpl(@Const @ByRef MaxUnpool1dOptions options_) { super((Pointer)null); allocate(options_); }
    @NoDeallocator private native void allocate(@Const @ByRef MaxUnpool1dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MaxUnpool1dImpl(Pointer p) { super(p); }

  public native @ByVal Tensor forward(@Const @ByRef Tensor input, @Const @ByRef Tensor indices,
                   @Const @ByRef(nullValue = "c10::optional<std::vector<int64_t> >(c10::nullopt)") LongVectorOptional output_size);
  public native @ByVal Tensor forward(@Const @ByRef Tensor input, @Const @ByRef Tensor indices);
}