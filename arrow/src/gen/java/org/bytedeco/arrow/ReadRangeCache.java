// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief A read cache designed to hide IO latencies when reading.
 * 
 *  To use this, you must first pass it the ranges you'll need in the future.
 *  The cache will combine those ranges according to parameters (see constructor)
 *  and start fetching the combined ranges in the background.
 *  You can then individually fetch them using Read(). */
@Namespace("arrow::io::internal") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ReadRangeCache extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReadRangeCache(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const int64_t") long kDefaultHoleSizeLimit();
  public static final long kDefaultHoleSizeLimit = kDefaultHoleSizeLimit();
  @MemberGetter public static native @Cast("const int64_t") long kDefaultRangeSizeLimit();
  public static final long kDefaultRangeSizeLimit = kDefaultRangeSizeLimit();

  /** Construct a read cache with default */
  public ReadRangeCache(@SharedPtr RandomAccessFile file, @ByVal AsyncContext ctx) { super((Pointer)null); allocate(file, ctx); }
  private native void allocate(@SharedPtr RandomAccessFile file, @ByVal AsyncContext ctx);

  /** Construct a read cache with given options */
  public ReadRangeCache(@SharedPtr RandomAccessFile file, @ByVal AsyncContext ctx,
                            @ByVal CacheOptions options) { super((Pointer)null); allocate(file, ctx, options); }
  private native void allocate(@SharedPtr RandomAccessFile file, @ByVal AsyncContext ctx,
                            @ByVal CacheOptions options);

  /** \brief Cache the given ranges in the background.
   * 
   *  The caller must ensure that the ranges do not overlap with each other,
   *  nor with previously cached ranges.  Otherwise, behaviour will be undefined. */
  public native @ByVal Status Cache(@StdVector ReadRange ranges);

  /** \brief Read a range previously given to Cache(). */
  public native @ByVal BufferResult Read(@ByVal ReadRange range);
}
