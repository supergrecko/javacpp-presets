// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * @see llvm::Module::ModuleFlagEntry
 */
@Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMModuleFlagEntry extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMModuleFlagEntry() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMModuleFlagEntry(Pointer p) { super(p); }
}
