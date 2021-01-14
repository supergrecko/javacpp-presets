// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;



@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyMemAllocatorEx extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyMemAllocatorEx() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyMemAllocatorEx(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyMemAllocatorEx(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyMemAllocatorEx position(long position) {
        return (PyMemAllocatorEx)super.position(position);
    }
    @Override public PyMemAllocatorEx getPointer(long i) {
        return new PyMemAllocatorEx((Pointer)this).position(position + i);
    }

    /* user context passed as the first argument to the 4 functions */
    public native Pointer ctx(); public native PyMemAllocatorEx ctx(Pointer setter);

    /* allocate a memory block */
    public static class Malloc_Pointer_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Malloc_Pointer_long(Pointer p) { super(p); }
        protected Malloc_Pointer_long() { allocate(); }
        private native void allocate();
        public native Pointer call(Pointer ctx, @Cast("size_t") long size);
    }
    public native Malloc_Pointer_long malloc(); public native PyMemAllocatorEx malloc(Malloc_Pointer_long setter);

    /* allocate a memory block initialized by zeros */
    public static class Calloc_Pointer_long_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Calloc_Pointer_long_long(Pointer p) { super(p); }
        protected Calloc_Pointer_long_long() { allocate(); }
        private native void allocate();
        public native Pointer call(Pointer ctx, @Cast("size_t") long nelem, @Cast("size_t") long elsize);
    }
    public native Calloc_Pointer_long_long calloc(); public native PyMemAllocatorEx calloc(Calloc_Pointer_long_long setter);

    /* allocate or resize a memory block */
    public static class Realloc_Pointer_Pointer_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Realloc_Pointer_Pointer_long(Pointer p) { super(p); }
        protected Realloc_Pointer_Pointer_long() { allocate(); }
        private native void allocate();
        public native Pointer call(Pointer ctx, Pointer ptr, @Cast("size_t") long new_size);
    }
    public native Realloc_Pointer_Pointer_long realloc(); public native PyMemAllocatorEx realloc(Realloc_Pointer_Pointer_long setter);

    /* release a memory block */
    public static class Free_Pointer_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Free_Pointer_Pointer(Pointer p) { super(p); }
        protected Free_Pointer_Pointer() { allocate(); }
        private native void allocate();
        public native void call(Pointer ctx, Pointer ptr);
    }
    public native @Name("free") Free_Pointer_Pointer _free(); public native PyMemAllocatorEx _free(Free_Pointer_Pointer setter);
}
