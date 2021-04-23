// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::io") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Writable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Writable(Pointer p) { super(p); }


  /** \brief Write the given data to the stream
   * 
   *  This method always processes the bytes in full.  Depending on the
   *  semantics of the stream, the data may be written out immediately,
   *  held in a buffer, or written asynchronously.  In the case where
   *  the stream buffers the data, it will be copied.  To avoid potentially
   *  large copies, use the Write variant that takes an owned Buffer. */
  
  ///
  public native @ByVal Status Write(@Const Pointer data, @Cast("int64_t") long nbytes);

  /** \brief Write the given data to the stream
   * 
   *  Since the Buffer owns its memory, this method can avoid a copy if
   *  buffering is required.  See Write(const void*, int64_t) for details. */
  public native @ByVal Status Write(@SharedPtr ArrowBuffer data);

  /** \brief Flush buffered bytes, if any */
  public native @ByVal Status Flush();

  public native @ByVal Status Write(@StdString String data);
  public native @ByVal Status Write(@StdString BytePointer data);
}
