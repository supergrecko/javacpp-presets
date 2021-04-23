// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;

@Name("std::array<uint64_t,4>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Long4Array extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Long4Array(Pointer p) { super(p); }
    public Long4Array()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef Long4Array put(@ByRef Long4Array x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @Cast("uint64_t") long get(@Cast("size_t") long i);
    public native Long4Array put(@Cast("size_t") long i, long value);
}

