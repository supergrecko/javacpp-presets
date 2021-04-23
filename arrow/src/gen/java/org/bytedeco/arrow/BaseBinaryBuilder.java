// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// Binary and String

@Name("arrow::BaseBinaryBuilder<arrow::BinaryType>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseBinaryBuilder extends ArrayBuilder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseBinaryBuilder(Pointer p) { super(p); }


  public native @ByVal Status Append(@Cast("const uint8_t*") BytePointer value, @Cast("arrow::BaseBinaryBuilder<arrow::BinaryType>::offset_type") int length);
  public native @ByVal Status Append(@Cast("const uint8_t*") ByteBuffer value, @Cast("arrow::BaseBinaryBuilder<arrow::BinaryType>::offset_type") int length);
  public native @ByVal Status Append(@Cast("const uint8_t*") byte[] value, @Cast("arrow::BaseBinaryBuilder<arrow::BinaryType>::offset_type") int length);

  public native @ByVal Status Append(String value, @Cast("arrow::BaseBinaryBuilder<arrow::BinaryType>::offset_type") int length);

  public native @ByVal Status AppendNulls(@Cast("int64_t") long length);

  public native @ByVal Status AppendNull();

  public native @ByVal Status AppendEmptyValue();

  
  ///
  public native @ByVal Status AppendEmptyValues(@Cast("int64_t") long length);

  /** \brief Append without checking capacity
   * 
   *  Offsets and data should have been presized using Reserve() and
   *  ReserveData(), respectively. */
  public native void UnsafeAppend(@Cast("const uint8_t*") BytePointer value, @Cast("arrow::BaseBinaryBuilder<arrow::BinaryType>::offset_type") int length);
  public native void UnsafeAppend(@Cast("const uint8_t*") ByteBuffer value, @Cast("arrow::BaseBinaryBuilder<arrow::BinaryType>::offset_type") int length);
  public native void UnsafeAppend(@Cast("const uint8_t*") byte[] value, @Cast("arrow::BaseBinaryBuilder<arrow::BinaryType>::offset_type") int length);

  public native void UnsafeAppend(String value, @Cast("arrow::BaseBinaryBuilder<arrow::BinaryType>::offset_type") int length);

  public native void UnsafeAppend(@StdString String value);
  public native void UnsafeAppend(@StdString BytePointer value);

  
  ///
  public native void UnsafeAppendNull();

  /** \brief Append a sequence of strings in one shot.
   * 
   *  @param values [in] a vector of strings
   *  @param valid_bytes [in] an optional sequence of bytes where non-zero
   *  indicates a valid (non-null) value
   *  @return Status */
  
  ///
  public native @ByVal Status AppendValues(@Const @ByRef StringVector values,
                        @Cast("const uint8_t*") BytePointer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Const @ByRef StringVector values);
  public native @ByVal Status AppendValues(@Const @ByRef StringVector values,
                        @Cast("const uint8_t*") ByteBuffer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Const @ByRef StringVector values,
                        @Cast("const uint8_t*") byte[] valid_bytes/*=nullptr*/);

  /** \brief Append a sequence of nul-terminated strings in one shot.
   *         If one of the values is NULL, it is processed as a null
   *         value even if the corresponding valid_bytes entry is 1.
   * 
   *  @param values [in] a contiguous C array of nul-terminated char *
   *  @param length [in] the number of values to append
   *  @param valid_bytes [in] an optional sequence of bytes where non-zero
   *  indicates a valid (non-null) value
   *  @return Status */
  public native @ByVal Status AppendValues(@Cast("const char**") PointerPointer values, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") BytePointer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const char**") @ByPtrPtr BytePointer values, @Cast("int64_t") long length);
  public native @ByVal Status AppendValues(@Cast("const char**") @ByPtrPtr BytePointer values, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") BytePointer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const char**") @ByPtrPtr ByteBuffer values, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") ByteBuffer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const char**") @ByPtrPtr ByteBuffer values, @Cast("int64_t") long length);
  public native @ByVal Status AppendValues(@Cast("const char**") @ByPtrPtr byte[] values, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") byte[] valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const char**") @ByPtrPtr byte[] values, @Cast("int64_t") long length);

  public native void Reset();

  public native @ByVal Status ValidateOverflow(@Cast("int64_t") long new_bytes);

  public native @ByVal Status Resize(@Cast("int64_t") long _capacity);

  /** \brief Ensures there is enough allocated capacity to append the indicated
   *  number of bytes to the value data buffer without additional allocations */
  public native @ByVal Status ReserveData(@Cast("int64_t") long elements);

  public native @ByVal Status FinishInternal(@SharedPtr ArrayData out);

  /** @return data pointer of the value date builder */
  public native @Cast("const uint8_t*") BytePointer value_data();
  /** @return size of values buffer so far */
  public native @Cast("int64_t") long value_data_length();
  /** @return capacity of values buffer */
  public native @Cast("int64_t") long value_data_capacity();

  /** @return data pointer of the value date builder */
  
  ///
  public native @Cast("const arrow::BaseBinaryBuilder<arrow::BinaryType>::offset_type*") IntPointer offsets_data();

  /** Temporary access to a value.
   * 
   *  This pointer becomes invalid on the next modifying operation. */
  public native @Cast("const uint8_t*") BytePointer GetValue(@Cast("int64_t") long i, @Cast("arrow::BaseBinaryBuilder<arrow::BinaryType>::offset_type*") IntPointer out_length);
  public native @Cast("const uint8_t*") ByteBuffer GetValue(@Cast("int64_t") long i, @Cast("arrow::BaseBinaryBuilder<arrow::BinaryType>::offset_type*") IntBuffer out_length);
  public native @Cast("const uint8_t*") byte[] GetValue(@Cast("int64_t") long i, @Cast("arrow::BaseBinaryBuilder<arrow::BinaryType>::offset_type*") int[] out_length);

  
  ///
  public native @Cast("arrow::BaseBinaryBuilder<arrow::BinaryType>::offset_type") int offset(@Cast("int64_t") long i);

  /** Temporary access to a value.
   * 
   *  This view becomes invalid on the next modifying operation. */

  // Cannot make this a static attribute because of linking issues
  public static native @Cast("const int64_t") long memory_limit();
}
