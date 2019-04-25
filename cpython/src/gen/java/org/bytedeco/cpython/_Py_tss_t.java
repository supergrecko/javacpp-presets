// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

/* When Py_LIMITED_API is not defined, the type layout of Py_tss_t is
   exposed to allow static allocation in the API clients.  Even in this case,
   you must handle TSS keys through API functions due to compatibility.
*/
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _Py_tss_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _Py_tss_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _Py_tss_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _Py_tss_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _Py_tss_t position(long position) {
        return (_Py_tss_t)super.position(position);
    }

    public native int _is_initialized(); public native _Py_tss_t _is_initialized(int setter);
    public native @Cast("unsigned long") long _key(); public native _Py_tss_t _key(long setter);
}
