// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Semaphore signal node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v1 position(long position) {
        return (CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v1)super.position(position);
    }
    @Override public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v1 getPointer(long i) {
        return new CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v1((Pointer)this).position(position + i);
    }

    /** Array of external semaphore handles. */
    public native @ByPtrPtr CUextSemaphore_st extSemArray(); public native CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v1 extSemArray(CUextSemaphore_st setter);
    /** Array of external semaphore signal parameters. */
    public native @Cast("const CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS*") CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS_v1 paramsArray(); public native CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v1 paramsArray(CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS_v1 setter);
    /** Number of handles and parameters supplied in extSemArray and paramsArray. */
    public native @Cast("unsigned int") int numExtSems(); public native CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v1 numExtSems(int setter);
}
