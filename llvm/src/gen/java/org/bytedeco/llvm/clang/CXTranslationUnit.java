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
 * A single translation unit, which resides in an index.
 */
@Name("CXTranslationUnitImpl") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXTranslationUnit extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXTranslationUnit() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXTranslationUnit(Pointer p) { super(p); }
}
