// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * Source location passed to index callbacks.
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIdxLoc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxLoc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXIdxLoc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxLoc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXIdxLoc position(long position) {
        return (CXIdxLoc)super.position(position);
    }
    @Override public CXIdxLoc getPointer(long i) {
        return new CXIdxLoc((Pointer)this).offsetAddress(i);
    }

  public native Pointer ptr_data(int i); public native CXIdxLoc ptr_data(int i, Pointer setter);
  @MemberGetter public native @Cast("void**") PointerPointer ptr_data();
  public native @Cast("unsigned") int int_data(); public native CXIdxLoc int_data(int setter);
}
