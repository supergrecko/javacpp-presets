// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::NumericScalar<arrow::UInt64Type>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseUInt64Type extends PrimitiveScalarBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseUInt64Type(Pointer p) { super(p); }


  public BaseUInt64Type(@Cast("arrow::NumericScalar<arrow::UInt64Type>::ValueType") long value) { super((Pointer)null); allocate(value); }
  private native void allocate(@Cast("arrow::NumericScalar<arrow::UInt64Type>::ValueType") long value);

  public BaseUInt64Type() { super((Pointer)null); allocate(); }
  private native void allocate();
}
