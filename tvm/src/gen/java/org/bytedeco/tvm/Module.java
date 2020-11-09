// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/**
 * \brief Module container of TVM.
 */
@Namespace("tvm::runtime") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class Module extends ObjectRef {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Module(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Module(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Module position(long position) {
        return (Module)super.position(position);
    }
    @Override public Module getPointer(long i) {
        return new Module(this).position(position + i);
    }

  public Module() { super((Pointer)null); allocate(); }
  private native void allocate();
  // constructor from container.
  public Module(@ByVal ObjectPtr n) { super((Pointer)null); allocate(n); }
  private native void allocate(@ByVal ObjectPtr n);
  /**
   * \brief Get packed function from current module by name.
   *
   * @param name The name of the function.
   * @param query_imports Whether also query dependency modules.
   * @return The result function.
   *  This function will return PackedFunc(nullptr) if function do not exist.
   * \note Implemented in packed_func.cc
   */
  public native @ByVal PackedFunc GetFunction(@StdString BytePointer name, @Cast("bool") boolean query_imports/*=false*/);
  public native @ByVal PackedFunc GetFunction(@StdString BytePointer name);
  public native @ByVal PackedFunc GetFunction(@StdString String name, @Cast("bool") boolean query_imports/*=false*/);
  public native @ByVal PackedFunc GetFunction(@StdString String name);
  // The following functions requires link with runtime.
  /**
   * \brief Import another module into this module.
   * @param other The module to be imported.
   *
   * \note Cyclic dependency is not allowed among modules,
   *  An error will be thrown when cyclic dependency is detected.
   */
  public native void Import(@ByVal Module other);
  /** @return internal container */
  public native @Name("operator ->") ModuleNode access();
  /** @return internal container */
  /**
   * \brief Load a module from file.
   * @param file_name The name of the host function module.
   * @param format The format of the file.
   * \note This function won't load the import relationship.
   *  Re-create import relationship by calling Import.
   */
  public static native @ByVal Module LoadFromFile(@StdString BytePointer file_name, @StdString BytePointer format/*=""*/);
  public static native @ByVal Module LoadFromFile(@StdString BytePointer file_name);
  public static native @ByVal Module LoadFromFile(@StdString String file_name, @StdString String format/*=""*/);
  public static native @ByVal Module LoadFromFile(@StdString String file_name);
  // refer to the corresponding container.
}