// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// An object that waits on multiple futures at once.  Only one waiter
// can be registered for each future at any time.
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FutureWaiter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FutureWaiter(Pointer p) { super(p); }

  public enum Kind { ANY((byte)0), ALL((byte)1), ALL_OR_FIRST_FAILED((byte)2), ITERATE((byte)3);

      public final byte value;
      private Kind(byte v) { this.value = v; }
      private Kind(Kind e) { this.value = e.value; }
      public Kind intern() { for (Kind e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  @MemberGetter public static native double kInfinity();
  public static final double kInfinity = kInfinity();

  public static native @UniquePtr FutureWaiter Make(Kind kind, @ByVal FutureImplVector futures);
  public static native @UniquePtr FutureWaiter Make(@Cast("arrow::FutureWaiter::Kind") byte kind, @ByVal FutureImplVector futures);

  public native @Cast("bool") boolean Wait(double seconds/*=arrow::FutureWaiter::kInfinity*/);
  public native @Cast("bool") boolean Wait();
  public native int WaitAndFetchOne();

  public native @StdVector IntPointer MoveFinishedFutures();
}
