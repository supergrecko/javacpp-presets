// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::NumericScalar<arrow::Int8Type>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseInt8Type extends PrimitiveScalarBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseInt8Type(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseInt8Type(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseInt8Type position(long position) {
        return (BaseInt8Type)super.position(position);
    }
    @Override public BaseInt8Type getPointer(long i) {
        return new BaseInt8Type((Pointer)this).position(position + i);
    }


  public BaseInt8Type(@Cast("arrow::NumericScalar<arrow::Int8Type>::ValueType") byte value) { super((Pointer)null); allocate(value); }
  private native void allocate(@Cast("arrow::NumericScalar<arrow::Int8Type>::ValueType") byte value);

  public BaseInt8Type() { super((Pointer)null); allocate(); }
  private native void allocate();
}
