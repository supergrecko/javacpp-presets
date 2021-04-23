// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Int32Scalar extends BaseInt32Type {
    static { Loader.load(); }

  
  
    public Int32Scalar(@Cast("arrow::NumericScalar<arrow::Int32Type>::ValueType") int value) { super((Pointer)null); allocate(value); }
    private native void allocate(@Cast("arrow::NumericScalar<arrow::Int32Type>::ValueType") int value);
  
    public Int32Scalar() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Int32Scalar(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Int32Scalar(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Int32Scalar position(long position) {
        return (Int32Scalar)super.position(position);
    }
    @Override public Int32Scalar getPointer(long i) {
        return new Int32Scalar((Pointer)this).position(position + i);
    }

}
