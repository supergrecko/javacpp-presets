// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;

@Name("std::array<uint8_t,16>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Byte16Array extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Byte16Array(Pointer p) { super(p); }
    public Byte16Array()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef Byte16Array put(@ByRef Byte16Array x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @Cast("uint8_t") byte get(@Cast("size_t") long i);
    public native Byte16Array put(@Cast("size_t") long i, byte value);
}

