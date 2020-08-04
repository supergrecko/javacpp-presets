// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------

@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Type extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Type position(long position) {
        return (Type)super.position(position);
    }
    @Override public Type getPointer(long i) {
        return new Type(this).position(position + i);
    }

  /** \brief Main data type enumeration
   * 
   *  This enumeration provides a quick way to interrogate the category
   *  of a DataType instance. */
  /** enum arrow::Type::type */
  public static final int
    /** A NULL type having no physical storage */
    NA = 0,

    /** Boolean as 1 bit, LSB bit-packed ordering */
    BOOL = 1,

    /** Unsigned 8-bit little-endian integer */
    UINT8 = 2,

    /** Signed 8-bit little-endian integer */
    INT8 = 3,

    /** Unsigned 16-bit little-endian integer */
    UINT16 = 4,

    /** Signed 16-bit little-endian integer */
    INT16 = 5,

    /** Unsigned 32-bit little-endian integer */
    UINT32 = 6,

    /** Signed 32-bit little-endian integer */
    INT32 = 7,

    /** Unsigned 64-bit little-endian integer */
    UINT64 = 8,

    /** Signed 64-bit little-endian integer */
    INT64 = 9,

    /** 2-byte floating point value */
    HALF_FLOAT = 10,

    /** 4-byte floating point value */
    FLOAT = 11,

    /** 8-byte floating point value */
    DOUBLE = 12,

    /** UTF8 variable-length string as List<Char> */
    STRING = 13,

    /** Variable-length bytes (no guarantee of UTF8-ness) */
    BINARY = 14,

    /** Fixed-size binary. Each value occupies the same number of bytes */
    FIXED_SIZE_BINARY = 15,

    /** int32_t days since the UNIX epoch */
    DATE32 = 16,

    /** int64_t milliseconds since the UNIX epoch */
    DATE64 = 17,

    /** Exact timestamp encoded with int64 since UNIX epoch
     *  Default unit millisecond */
    TIMESTAMP = 18,

    /** Time as signed 32-bit integer, representing either seconds or
     *  milliseconds since midnight */
    TIME32 = 19,

    /** Time as signed 64-bit integer, representing either microseconds or
     *  nanoseconds since midnight */
    TIME64 = 20,

    /** YEAR_MONTH interval in SQL style */
    INTERVAL_MONTHS = 21,

    /** DAY_TIME interval in SQL style */
    INTERVAL_DAY_TIME = 22,

    /** Precision- and scale-based decimal type. Storage type depends on the
     *  parameters. */
    DECIMAL = 23,

    /** A list of some logical data type */
    LIST = 24,

    /** Struct of logical types */
    STRUCT = 25,

    /** Sparse unions of logical types */
    SPARSE_UNION = 26,

    /** Dense unions of logical types */
    DENSE_UNION = 27,

    /** Dictionary-encoded type, also called "categorical" or "factor"
     *  in other programming languages. Holds the dictionary value
     *  type but not the dictionary itself, which is part of the
     *  ArrayData struct */
    DICTIONARY = 28,

    /** Map, a repeated struct logical type */
    MAP = 29,

    /** Custom data type, implemented by user */
    EXTENSION = 30,

    /** Fixed size list of some logical type */
    FIXED_SIZE_LIST = 31,

    /** Measure of elapsed time in either seconds, milliseconds, microseconds
     *  or nanoseconds. */
    DURATION = 32,

    /** Like STRING, but with 64-bit offsets */
    LARGE_STRING = 33,

    /** Like BINARY, but with 64-bit offsets */
    LARGE_BINARY = 34,

    /** Like LIST, but with 64-bit offsets */
    LARGE_LIST = 35,

    // Leave this at the end
    MAX_ID = 36;
}
