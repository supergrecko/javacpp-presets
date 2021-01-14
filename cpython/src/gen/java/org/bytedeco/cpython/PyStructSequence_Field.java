// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyStructSequence_Field extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyStructSequence_Field() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyStructSequence_Field(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyStructSequence_Field(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyStructSequence_Field position(long position) {
        return (PyStructSequence_Field)super.position(position);
    }
    @Override public PyStructSequence_Field getPointer(long i) {
        return new PyStructSequence_Field((Pointer)this).position(position + i);
    }

    public native @Cast("const char*") BytePointer name(); public native PyStructSequence_Field name(BytePointer setter);
    public native @Cast("const char*") BytePointer doc(); public native PyStructSequence_Field doc(BytePointer setter);
}
