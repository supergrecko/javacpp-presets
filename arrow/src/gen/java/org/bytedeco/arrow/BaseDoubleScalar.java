// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::NumericScalar<arrow::DoubleType>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseDoubleScalar extends PrimitiveScalarBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseDoubleScalar(Pointer p) { super(p); }


  public BaseDoubleScalar(@Cast("arrow::NumericScalar<arrow::DoubleType>::ValueType") double value) { super((Pointer)null); allocate(value); }
  private native void allocate(@Cast("arrow::NumericScalar<arrow::DoubleType>::ValueType") double value);

  public BaseDoubleScalar() { super((Pointer)null); allocate(); }
  private native void allocate();
}
