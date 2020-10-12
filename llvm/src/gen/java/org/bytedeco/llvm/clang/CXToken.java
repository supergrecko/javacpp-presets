// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * Describes a single preprocessing token.
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXToken extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXToken() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXToken(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXToken(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXToken position(long position) {
        return (CXToken)super.position(position);
    }
    @Override public CXToken getPointer(long i) {
        return new CXToken(this).position(position + i);
    }

  public native @Cast("unsigned") int int_data(int i); public native CXToken int_data(int i, int setter);
  @MemberGetter public native @Cast("unsigned*") IntPointer int_data();
  public native Pointer ptr_data(); public native CXToken ptr_data(Pointer setter);
}
