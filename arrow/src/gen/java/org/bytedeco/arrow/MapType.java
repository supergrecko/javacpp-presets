// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Concrete type class for map data
 * 
 *  Map data is nested data where each value is a variable number of
 *  key-item pairs.  Maps can be recursively nested, for example
 *  map(utf8, map(utf8, int32)). */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class MapType extends ListType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MapType(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();

  public static native String type_name();

  public MapType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType key_type, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType item_type,
            @Cast("bool") boolean keys_sorted/*=false*/) { super((Pointer)null); allocate(key_type, item_type, keys_sorted); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType key_type, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType item_type,
            @Cast("bool") boolean keys_sorted/*=false*/);
  public MapType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType key_type, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType item_type) { super((Pointer)null); allocate(key_type, item_type); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType key_type, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType item_type);

  public MapType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType key_type, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field item_field,
            @Cast("bool") boolean keys_sorted/*=false*/) { super((Pointer)null); allocate(key_type, item_field, keys_sorted); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType key_type, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field item_field,
            @Cast("bool") boolean keys_sorted/*=false*/);
  public MapType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType key_type, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field item_field) { super((Pointer)null); allocate(key_type, item_field); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType key_type, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field item_field);

  public MapType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field key_field, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field item_field,
            @Cast("bool") boolean keys_sorted/*=false*/) { super((Pointer)null); allocate(key_field, item_field, keys_sorted); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field key_field, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field item_field,
            @Cast("bool") boolean keys_sorted/*=false*/);
  public MapType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field key_field, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field item_field) { super((Pointer)null); allocate(key_field, item_field); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field key_field, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field item_field);

  public MapType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field value_field, @Cast("bool") boolean keys_sorted/*=false*/) { super((Pointer)null); allocate(value_field, keys_sorted); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field value_field, @Cast("bool") boolean keys_sorted/*=false*/);
  public MapType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field value_field) { super((Pointer)null); allocate(value_field); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field value_field);

  // Validating constructor
  public static native @ByVal DataTypeResult Make(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field value_field,
                                                  @Cast("bool") boolean keys_sorted/*=false*/);
  public static native @ByVal DataTypeResult Make(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field value_field);

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field key_field();
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType key_type();

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field item_field();
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType item_type();

  public native @StdString String ToString();

  public native @StdString String name();

  public native @Cast("bool") boolean keys_sorted();
}
