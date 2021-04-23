// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;

// #endif

/** \brief Flight-specific error information in a Status. */
@Namespace("arrow::flight") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class FlightStatusDetail extends StatusDetail {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FlightStatusDetail(Pointer p) { super(p); }

  public FlightStatusDetail(FlightStatusCode code) { super((Pointer)null); allocate(code); }
  private native void allocate(FlightStatusCode code);
  public FlightStatusDetail(@Cast("arrow::flight::FlightStatusCode") byte code) { super((Pointer)null); allocate(code); }
  private native void allocate(@Cast("arrow::flight::FlightStatusCode") byte code);
  public FlightStatusDetail(FlightStatusCode code, @StdString String extra_info) { super((Pointer)null); allocate(code, extra_info); }
  private native void allocate(FlightStatusCode code, @StdString String extra_info);
  public FlightStatusDetail(@Cast("arrow::flight::FlightStatusCode") byte code, @StdString BytePointer extra_info) { super((Pointer)null); allocate(code, extra_info); }
  private native void allocate(@Cast("arrow::flight::FlightStatusCode") byte code, @StdString BytePointer extra_info);
  public native String type_id();
  public native @StdString String ToString();

  /** \brief Get the Flight status code. */
  public native FlightStatusCode code();
  /** \brief Get the extra error info */
  public native @StdString String extra_info();
  /** \brief Get the human-readable name of the status code. */
  public native @StdString String CodeAsString();
  /** \brief Set the extra error info */
  
  ///
  public native void set_extra_info(@StdString String extra_info);
  public native void set_extra_info(@StdString BytePointer extra_info);

  /** \brief Try to extract a \a FlightStatusDetail from any Arrow
   *  status.
   * 
   *  @return a \a FlightStatusDetail if it could be unwrapped, \a
   *  nullptr otherwise */
  public static native @SharedPtr FlightStatusDetail UnwrapStatus(@Const @ByRef Status status);
}
