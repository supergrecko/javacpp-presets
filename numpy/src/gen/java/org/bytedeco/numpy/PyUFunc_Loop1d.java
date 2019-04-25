// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


/* A linked-list of function information for
   user-defined 1-d loops.
 */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyUFunc_Loop1d extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyUFunc_Loop1d() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyUFunc_Loop1d(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyUFunc_Loop1d(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyUFunc_Loop1d position(long position) {
        return (PyUFunc_Loop1d)super.position(position);
    }

        public native PyUFuncGenericFunction func(); public native PyUFunc_Loop1d func(PyUFuncGenericFunction setter);
        public native Pointer data(); public native PyUFunc_Loop1d data(Pointer setter);
        public native IntPointer arg_types(); public native PyUFunc_Loop1d arg_types(IntPointer setter);
        public native PyUFunc_Loop1d next(); public native PyUFunc_Loop1d next(PyUFunc_Loop1d setter);
        public native int nargs(); public native PyUFunc_Loop1d nargs(int setter);
        public native PyArray_Descr arg_dtypes(int i); public native PyUFunc_Loop1d arg_dtypes(int i, PyArray_Descr setter);
        public native @Cast("PyArray_Descr**") PointerPointer arg_dtypes(); public native PyUFunc_Loop1d arg_dtypes(PointerPointer setter);
}
