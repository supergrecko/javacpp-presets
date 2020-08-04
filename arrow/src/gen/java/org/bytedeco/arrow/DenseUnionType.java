// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class DenseUnionType extends UnionType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DenseUnionType(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();

  public static native String type_name();

  public DenseUnionType(@ByVal FieldVector fields,
                   @StdVector BytePointer type_codes) { super((Pointer)null); allocate(fields, type_codes); }
  private native void allocate(@ByVal FieldVector fields,
                   @StdVector BytePointer type_codes);
  public DenseUnionType(@ByVal FieldVector fields,
                   @StdVector ByteBuffer type_codes) { super((Pointer)null); allocate(fields, type_codes); }
  private native void allocate(@ByVal FieldVector fields,
                   @StdVector ByteBuffer type_codes);
  public DenseUnionType(@ByVal FieldVector fields,
                   @StdVector byte[] type_codes) { super((Pointer)null); allocate(fields, type_codes); }
  private native void allocate(@ByVal FieldVector fields,
                   @StdVector byte[] type_codes);

  // A constructor variant that validates input parameters
  public static native @ByVal DataTypeResult Make(
        @ByVal FieldVector fields, @StdVector BytePointer type_codes);
  public static native @ByVal DataTypeResult Make(
        @ByVal FieldVector fields, @StdVector ByteBuffer type_codes);
  public static native @ByVal DataTypeResult Make(
        @ByVal FieldVector fields, @StdVector byte[] type_codes);

  public native @StdString String name();
}
