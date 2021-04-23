// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** A container of options for equality comparisons */
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class EqualOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EqualOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EqualOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EqualOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EqualOptions position(long position) {
        return (EqualOptions)super.position(position);
    }
    @Override public EqualOptions getPointer(long i) {
        return new EqualOptions((Pointer)this).position(position + i);
    }

  /** Whether or not NaNs are considered equal. */
  public native @Cast("bool") @org.bytedeco.javacpp.annotation.Function boolean nans_equal();

  /** Return a new EqualOptions object with the "nans_equal" property changed. */
  public native @ByVal @org.bytedeco.javacpp.annotation.Function EqualOptions nans_equal(@Cast("bool") boolean v);

  /** The absolute tolerance for approximate comparisons of floating-point values. */
  public native @org.bytedeco.javacpp.annotation.Function double atol();

  /** Return a new EqualOptions object with the "atol" property changed. */
  public native @ByVal @org.bytedeco.javacpp.annotation.Function EqualOptions atol(double v);

  /** The ostream to which a diff will be formatted if arrays disagree.
   *  If this is null (the default) no diff will be formatted. */
  public native @Cast("std::ostream*") @org.bytedeco.javacpp.annotation.Function Pointer diff_sink();

  /** Return a new EqualOptions object with the "diff_sink" property changed.
   *  This option will be ignored if diff formatting of the types of compared arrays is
   *  not supported. */
  public native @ByVal @org.bytedeco.javacpp.annotation.Function EqualOptions diff_sink(@Cast("std::ostream*") Pointer diff_sink);

  public static native @ByVal EqualOptions Defaults();
}
