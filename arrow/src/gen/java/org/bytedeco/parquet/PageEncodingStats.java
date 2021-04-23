// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


/** \brief Public struct for Thrift PageEncodingStats in ColumnChunkMetaData */
@Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class PageEncodingStats extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PageEncodingStats() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PageEncodingStats(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PageEncodingStats(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PageEncodingStats position(long position) {
        return (PageEncodingStats)super.position(position);
    }
    @Override public PageEncodingStats getPointer(long i) {
        return new PageEncodingStats((Pointer)this).position(position + i);
    }

  public native PageType.type page_type(); public native PageEncodingStats page_type(PageType.type setter);
  public native Encoding.type encoding(); public native PageEncodingStats encoding(Encoding.type setter);
  public native int count(); public native PageEncodingStats count(int setter);
}
