// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Context for expression-global variables and options used by
 *  function evaluation */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ExecContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExecContext(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ExecContext(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ExecContext position(long position) {
        return (ExecContext)super.position(position);
    }
    @Override public ExecContext getPointer(long i) {
        return new ExecContext(this).position(position + i);
    }

  // If no function registry passed, the default is used.
  public ExecContext(MemoryPool pool/*=arrow::default_memory_pool()*/,
                         FunctionRegistry func_registry/*=nullptr*/) { super((Pointer)null); allocate(pool, func_registry); }
  private native void allocate(MemoryPool pool/*=arrow::default_memory_pool()*/,
                         FunctionRegistry func_registry/*=nullptr*/);
  public ExecContext() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** \brief The MemoryPool used for allocations, default is
   *  default_memory_pool(). */
  public native MemoryPool memory_pool();

  public native CpuInfo cpu_info();

  /** \brief The FunctionRegistry for looking up functions by name and
   *  selecting kernels for execution. Defaults to the library-global function
   *  registry provided by GetFunctionRegistry. */
  public native FunctionRegistry func_registry();

  // \brief Set maximum length unit of work for kernel execution. Larger
  // contiguous array inputs will be split into smaller chunks, and, if
  // possible and enabled, processed in parallel. The default chunksize is
  // INT64_MAX, so contiguous arrays are not split.
  public native void set_exec_chunksize(@Cast("int64_t") long chunksize);

  // \brief Maximum length for ExecBatch data chunks processed by
  // kernels. Contiguous array inputs with longer length will be split into
  // smaller chunks.
  public native @Cast("int64_t") long exec_chunksize();

  /** \brief Set whether to use multiple threads for function execution. This
   *  is not yet used. */
  public native void set_use_threads(@Cast("bool") boolean use_threads/*=true*/);
  public native void set_use_threads();

  /** \brief If true, then utilize multiple threads where relevant for function
   *  execution. This is not yet used. */
  public native @Cast("bool") boolean use_threads();

  // Set the preallocation strategy for kernel execution as it relates to
  // chunked execution. For chunked execution, whether via ChunkedArray inputs
  // or splitting larger Array arguments into smaller pieces, contiguous
  // allocation (if permitted by the kernel) will allocate one large array to
  // write output into yielding it to the caller at the end. If this option is
  // set to off, then preallocations will be performed independently for each
  // chunk of execution
  //
  // TODO: At some point we might want the limit the size of contiguous
  // preallocations. For example, even if the exec_chunksize is 64K or less, we
  // might limit contiguous allocations to 1M records, say.
  public native void set_preallocate_contiguous(@Cast("bool") boolean preallocate);

  /** \brief If contiguous preallocations should be used when doing chunked
   *  execution as specified by exec_chunksize(). See
   *  set_preallocate_contiguous() for more information. */
  public native @Cast("bool") boolean preallocate_contiguous();
}
