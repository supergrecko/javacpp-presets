// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Power usage information for an S-class unit.
 * The power supply state is a human readable string that equals "Normal" or contains
 * a combination of "Abnormal" plus one or more of the following:
 *
 *    - High voltage
 *    - Fan failure
 *    - Heatsink temperature
 *    - Current limit
 *    - Voltage below UV alarm threshold
 *    - Low-voltage
 *    - SI2C remote off command
 *    - MOD_DISABLE input
 *    - Short pin transition
*/
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlPSUInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlPSUInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlPSUInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlPSUInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlPSUInfo_t position(long position) {
        return (nvmlPSUInfo_t)super.position(position);
    }
    @Override public nvmlPSUInfo_t getPointer(long i) {
        return new nvmlPSUInfo_t((Pointer)this).offsetAddress(i);
    }

    /** The power supply state */
    public native @Cast("char") byte state(int i); public native nvmlPSUInfo_t state(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer state();
    /** PSU current (A) */
    public native @Cast("unsigned int") int current(); public native nvmlPSUInfo_t current(int setter);
    /** PSU voltage (V) */
    public native @Cast("unsigned int") int voltage(); public native nvmlPSUInfo_t voltage(int setter);
    /** PSU power draw (W) */
    public native @Cast("unsigned int") int power(); public native nvmlPSUInfo_t power(int setter);
}
