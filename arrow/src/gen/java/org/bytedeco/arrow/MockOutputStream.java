// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief A helper class to tracks the size of allocations
 * 
 *  Writes to this stream do not copy or retain any data, they just bump
 *  a size counter that can be later used to know exactly which data size
 *  needs to be allocated for actual writing. */
@Namespace("arrow::io") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class MockOutputStream extends OutputStream {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MockOutputStream(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MockOutputStream(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MockOutputStream position(long position) {
        return (MockOutputStream)super.position(position);
    }
    @Override public MockOutputStream getPointer(long i) {
        return new MockOutputStream((Pointer)this).position(position + i);
    }

  public MockOutputStream() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Implement the OutputStream interface
  public native @ByVal Status Close();
  public native @Cast("bool") boolean closed();
  public native @ByVal LongResult Tell();
  public native @ByVal Status Write(@Const Pointer data, @Cast("int64_t") long nbytes);
  /** \cond FALSE */
  /** \endcond */

  public native @Cast("int64_t") long GetExtentBytesWritten();
}
