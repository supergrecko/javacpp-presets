// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::TimeScalar<arrow::Time64Type>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseTime64Scalar extends BaseBaseTime64Scalar {
    static { Loader.load(); }

  
  
    public BaseTime64Scalar(@Cast("arrow::TemporalScalar<arrow::Time64Type>::ValueType") long value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
    private native void allocate(@Cast("arrow::TemporalScalar<arrow::Time64Type>::ValueType") long value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseTime64Scalar(Pointer p) { super(p); }

}
