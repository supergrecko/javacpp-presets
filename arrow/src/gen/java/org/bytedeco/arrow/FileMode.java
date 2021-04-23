// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::io") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FileMode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FileMode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FileMode(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileMode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FileMode position(long position) {
        return (FileMode)super.position(position);
    }
    @Override public FileMode getPointer(long i) {
        return new FileMode((Pointer)this).position(position + i);
    }

  public enum type { READ(0), WRITE(1), READWRITE(2);

      public final int value;
      private type(int v) { this.value = v; }
      private type(type e) { this.value = e.value; }
      public type intern() { for (type e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
}
