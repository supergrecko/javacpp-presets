// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;
  // namespace detail

// Hints about a task that may be used by an Executor.
// They are ignored by the provided ThreadPool implementation.
@Namespace("arrow::internal") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class TaskHints extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TaskHints() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TaskHints(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TaskHints(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TaskHints position(long position) {
        return (TaskHints)super.position(position);
    }
    @Override public TaskHints getPointer(long i) {
        return new TaskHints(this).position(position + i);
    }

  // The lower, the more urgent
  public native int priority(); public native TaskHints priority(int setter);
  // The IO transfer size in bytes
  public native @Cast("int64_t") long io_size(); public native TaskHints io_size(long setter);
  // The approximate CPU cost in number of instructions
  public native @Cast("int64_t") long cpu_cost(); public native TaskHints cpu_cost(long setter);
  // An application-specific ID
  public native @Cast("int64_t") long external_id(); public native TaskHints external_id(long setter);
}
