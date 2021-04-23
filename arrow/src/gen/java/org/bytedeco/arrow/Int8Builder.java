// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** Base class for all Builders that emit an Array of a scalar numerical type. */
@Name("arrow::NumericBuilder<arrow::Int8Type>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Int8Builder extends ArrayBuilder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Int8Builder(Pointer p) { super(p); }


  public Int8Builder(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, MemoryPool pool) { super((Pointer)null); allocate(type, pool); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, MemoryPool pool);

  /** Append a single scalar and increase the size if necessary. */
  public native @ByVal Status Append(@Cast("const arrow::NumericBuilder<arrow::Int8Type>::value_type") byte val);

  /** Write nulls as uint8_t* (0 value indicates null) into pre-allocated memory
   *  The memory at the corresponding data slot is set to 0 to prevent
   *  uninitialized memory access */
  public native @ByVal Status AppendNulls(@Cast("int64_t") long length);

  /** \brief Append a single null element */
  public native @ByVal Status AppendNull();

  /** \brief Append a empty element */
  public native @ByVal Status AppendEmptyValue();

  /** \brief Append several empty elements */
  public native @ByVal Status AppendEmptyValues(@Cast("int64_t") long length);

  public native @Cast("arrow::NumericBuilder<arrow::Int8Type>::value_type") byte GetValue(@Cast("int64_t") long index);

  public native void Reset();

  public native @ByVal Status Resize(@Cast("int64_t") long _capacity);

  public native @Cast("arrow::NumericBuilder<arrow::Int8Type>::value_type*") @ByRef @Name("operator []") BytePointer get(@Cast("int64_t") long index);

  /** \brief Append a sequence of elements in one shot
   *  @param values [in] a contiguous C array of values
   *  @param length [in] the number of values to append
   *  @param valid_bytes [in] an optional sequence of bytes where non-zero
   *  indicates a valid (non-null) value
   *  @return Status */
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int8Type>::value_type*") BytePointer values, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") BytePointer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int8Type>::value_type*") BytePointer values, @Cast("int64_t") long length);
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int8Type>::value_type*") ByteBuffer values, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") ByteBuffer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int8Type>::value_type*") ByteBuffer values, @Cast("int64_t") long length);
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int8Type>::value_type*") byte[] values, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") byte[] valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int8Type>::value_type*") byte[] values, @Cast("int64_t") long length);

  /** \brief Append a sequence of elements in one shot
   *  @param values [in] a contiguous C array of values
   *  @param length [in] the number of values to append
   *  @param is_valid [in] an std::vector<bool> indicating valid (1) or null
   *  (0). Equal in length to values
   *  @return Status */
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int8Type>::value_type*") BytePointer values, @Cast("int64_t") long length,
                        @Const @ByRef BoolVector is_valid);
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int8Type>::value_type*") ByteBuffer values, @Cast("int64_t") long length,
                        @Const @ByRef BoolVector is_valid);
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int8Type>::value_type*") byte[] values, @Cast("int64_t") long length,
                        @Const @ByRef BoolVector is_valid);

  /** \brief Append a sequence of elements in one shot
   *  @param values [in] a std::vector of values
   *  @param is_valid [in] an std::vector<bool> indicating valid (1) or null
   *  (0). Equal in length to values
   *  @return Status */
  public native @ByVal Status AppendValues(@Cast("arrow::NumericBuilder<arrow::Int8Type>::value_type*") @StdVector BytePointer values,
                        @Const @ByRef BoolVector is_valid);
  public native @ByVal Status AppendValues(@Cast("arrow::NumericBuilder<arrow::Int8Type>::value_type*") @StdVector ByteBuffer values,
                        @Const @ByRef BoolVector is_valid);
  public native @ByVal Status AppendValues(@Cast("arrow::NumericBuilder<arrow::Int8Type>::value_type*") @StdVector byte[] values,
                        @Const @ByRef BoolVector is_valid);

  /** \brief Append a sequence of elements in one shot
   *  @param values [in] a std::vector of values
   *  @return Status */
  public native @ByVal Status AppendValues(@Cast("arrow::NumericBuilder<arrow::Int8Type>::value_type*") @StdVector BytePointer values);
  public native @ByVal Status AppendValues(@Cast("arrow::NumericBuilder<arrow::Int8Type>::value_type*") @StdVector ByteBuffer values);
  public native @ByVal Status AppendValues(@Cast("arrow::NumericBuilder<arrow::Int8Type>::value_type*") @StdVector byte[] values);

  public native @ByVal Status FinishInternal(@SharedPtr ArrayData out);

  /** \cond FALSE */
  /** \endcond */

  public native @ByVal Status Finish(@Cast("arrow::NumericBuilder<arrow::Int8Type>::ArrayType*") @SharedPtr BytePointer out);
  public native @ByVal Status Finish(@Cast("arrow::NumericBuilder<arrow::Int8Type>::ArrayType*") @SharedPtr ByteBuffer out);
  public native @ByVal Status Finish(@Cast("arrow::NumericBuilder<arrow::Int8Type>::ArrayType*") @SharedPtr byte[] out);

  /** \brief Append a sequence of elements in one shot
   *  @param values_begin [in] InputIterator to the beginning of the values
   *  @param values_end [in] InputIterator pointing to the end of the values
   *  @return Status */

  /** \brief Append a sequence of elements in one shot, with a specified nullmap
   *  @param values_begin [in] InputIterator to the beginning of the values
   *  @param values_end [in] InputIterator pointing to the end of the values
   *  @param valid_begin [in] InputIterator with elements indication valid(1)
   *   or null(0) values.
   *  @return Status */

  // Same as above, with a pointer type ValidIter

  /** Append a single scalar under the assumption that the underlying Buffer is
   *  large enough.
   * 
   *  This method does not capacity-check; make sure to call Reserve
   *  beforehand. */
  public native void UnsafeAppend(@Cast("const arrow::NumericBuilder<arrow::Int8Type>::value_type") byte val);

  public native void UnsafeAppendNull();

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();
}
