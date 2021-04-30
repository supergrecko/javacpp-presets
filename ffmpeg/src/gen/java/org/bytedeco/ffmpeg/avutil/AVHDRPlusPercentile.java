// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * Represents the percentile at a specific percentage in
 * a distribution.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVHDRPlusPercentile extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVHDRPlusPercentile() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVHDRPlusPercentile(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVHDRPlusPercentile(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVHDRPlusPercentile position(long position) {
        return (AVHDRPlusPercentile)super.position(position);
    }
    @Override public AVHDRPlusPercentile getPointer(long i) {
        return new AVHDRPlusPercentile((Pointer)this).position(position + i);
    }

    /**
     * The percentage value corresponding to a specific percentile linearized
     * RGB value in the processing window in the scene. The value shall be in
     * the range of 0 to100, inclusive.
     */
    public native @Cast("uint8_t") byte percentage(); public native AVHDRPlusPercentile percentage(byte setter);

    /**
     * The linearized maxRGB value at a specific percentile in the processing
     * window in the scene. The value shall be in the range of 0 to 1, inclusive
     * and in multiples of 0.00001.
     */
    public native @ByRef AVRational percentile(); public native AVHDRPlusPercentile percentile(AVRational setter);
}
