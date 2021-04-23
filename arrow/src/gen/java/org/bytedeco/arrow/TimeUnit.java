// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class TimeUnit extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TimeUnit() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TimeUnit(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TimeUnit(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TimeUnit position(long position) {
        return (TimeUnit)super.position(position);
    }
    @Override public TimeUnit getPointer(long i) {
        return new TimeUnit((Pointer)this).position(position + i);
    }

  /** The unit for a time or timestamp DataType */
  public enum type { SECOND(0), MILLI(1), MICRO(2), NANO(3);

      public final int value;
      private type(int v) { this.value = v; }
      private type(type e) { this.value = e.value; }
      public type intern() { for (type e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
}
