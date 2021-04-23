// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// Naming this file OutputStream because it does not support seeking (like the
// WritableFile interface)
@Namespace("arrow::io") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class HdfsOutputStream extends OutputStream {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HdfsOutputStream(Pointer p) { super(p); }


  public native @ByVal Status Close();

  public native @Cast("bool") boolean closed();
  public native @ByVal Status Write(@Const Pointer buffer, @Cast("int64_t") long nbytes);
  public native @ByVal Status Write(@Const Pointer buffer, @Cast("int64_t") long nbytes, @Cast("int64_t*") LongPointer bytes_written);
  public native @ByVal Status Write(@Const Pointer buffer, @Cast("int64_t") long nbytes, @Cast("int64_t*") LongBuffer bytes_written);
  public native @ByVal Status Write(@Const Pointer buffer, @Cast("int64_t") long nbytes, @Cast("int64_t*") long[] bytes_written);

  public native @ByVal Status Flush();

  public native @ByVal LongResult Tell();
}
