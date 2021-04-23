// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::io") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class WritableFile extends OutputStream {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WritableFile(Pointer p) { super(p); }
    public Seekable asSeekable() { return asSeekable(this); }
    @Namespace public static native @Name("static_cast<arrow::io::Seekable*>") Seekable asSeekable(WritableFile pointer);

  public native @ByVal Status WriteAt(@Cast("int64_t") long _position, @Const Pointer data, @Cast("int64_t") long nbytes);
}
