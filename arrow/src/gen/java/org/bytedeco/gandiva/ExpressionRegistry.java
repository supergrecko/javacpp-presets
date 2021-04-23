// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gandiva;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.gandiva.*;

/** \brief Exports types supported by Gandiva for processing.
 * 
 *  Has helper methods for clients to programmatically discover
 *  data types and functions supported by Gandiva. */
@Namespace("gandiva") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.gandiva.class)
public class ExpressionRegistry extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExpressionRegistry(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ExpressionRegistry(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ExpressionRegistry position(long position) {
        return (ExpressionRegistry)super.position(position);
    }
    @Override public ExpressionRegistry getPointer(long i) {
        return new ExpressionRegistry((Pointer)this).position(position + i);
    }

  public ExpressionRegistry() { super((Pointer)null); allocate(); }
  private native void allocate();
  public static native @ByVal DataTypeVector supported_types();
  @NoOffset public static class FunctionSignatureIterator extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FunctionSignatureIterator(Pointer p) { super(p); }
  
    public FunctionSignatureIterator(@Cast("gandiva::ExpressionRegistry::native_func_iterator_type") NativeFunction nf_it,
                                           @Cast("gandiva::ExpressionRegistry::native_func_iterator_type") NativeFunction nf_it_end_) { super((Pointer)null); allocate(nf_it, nf_it_end_); }
    private native void allocate(@Cast("gandiva::ExpressionRegistry::native_func_iterator_type") NativeFunction nf_it,
                                           @Cast("gandiva::ExpressionRegistry::native_func_iterator_type") NativeFunction nf_it_end_);
    public FunctionSignatureIterator(@Cast("gandiva::ExpressionRegistry::func_sig_iterator_type") FunctionSignature fs_it) { super((Pointer)null); allocate(fs_it); }
    private native void allocate(@Cast("gandiva::ExpressionRegistry::func_sig_iterator_type") FunctionSignature fs_it);

    public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef FunctionSignatureIterator func_sign_it);

    public native @ByVal @Name("operator *") FunctionSignature multiply();

    public native @Cast("gandiva::ExpressionRegistry::func_sig_iterator_type") @Name("operator ++") FunctionSignature increment(int arg0);
  }
  public native @Const @ByVal FunctionSignatureIterator function_signature_begin();
  public native @Const @ByVal FunctionSignatureIterator function_signature_end();
}
