// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief A writer for IPC payloads to a client. Also allows sending
 *  application-defined metadata via the Flight protocol.
 * 
 *  This class offers more control compared to FlightDataStream,
 *  including the option to write metadata without data and the
 *  ability to interleave reading and writing. */
@Namespace("arrow::flight") @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class FlightMessageWriter extends MetadataRecordBatchWriter {
    static { Loader.load(); }
    /** Default native constructor. */
    public FlightMessageWriter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FlightMessageWriter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FlightMessageWriter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FlightMessageWriter position(long position) {
        return (FlightMessageWriter)super.position(position);
    }
    @Override public FlightMessageWriter getPointer(long i) {
        return new FlightMessageWriter((Pointer)this).position(position + i);
    }

}
