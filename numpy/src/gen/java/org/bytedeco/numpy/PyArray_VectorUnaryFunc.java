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


@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArray_VectorUnaryFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyArray_VectorUnaryFunc(Pointer p) { super(p); }
    protected PyArray_VectorUnaryFunc() { allocate(); }
    private native void allocate();
    public native void call(Pointer arg0, Pointer arg1, @Cast("npy_intp") long arg2, Pointer arg3,
                                       Pointer arg4);
}
