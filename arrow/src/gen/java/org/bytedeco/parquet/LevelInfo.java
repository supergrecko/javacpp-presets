// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet::internal") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class LevelInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LevelInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LevelInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public LevelInfo position(long position) {
        return (LevelInfo)super.position(position);
    }
    @Override public LevelInfo getPointer(long i) {
        return new LevelInfo((Pointer)this).position(position + i);
    }

  public LevelInfo() { super((Pointer)null); allocate(); }
  private native void allocate();
  public LevelInfo(int null_slots, int definition_level, int repetition_level,
              int repeated_ancestor_definition_level) { super((Pointer)null); allocate(null_slots, definition_level, repetition_level, repeated_ancestor_definition_level); }
  private native void allocate(int null_slots, int definition_level, int repetition_level,
              int repeated_ancestor_definition_level);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef LevelInfo b);

  public native @Cast("bool") boolean HasNullableValues();

  // How many slots an undefined but present (i.e. null) element in
  // parquet consumes when decoding to Arrow.
  // "Slot" is used in the same context as the Arrow specification
  // (i.e. a value holder).
  // This is only ever >1 for descendents of FixedSizeList.
  public native int null_slot_usage(); public native LevelInfo null_slot_usage(int setter);

  // The definition level at which the value for the field
  // is considered not null (definition levels greater than
  // or equal to this value indicate a not-null
  // value for the field). For list fields definition levels
  // greater than or equal to this field indicate a present,
  // possibly null, child value.
  public native short def_level(); public native LevelInfo def_level(short setter);

  // The repetition level corresponding to this element
  // or the closest repeated ancestor.  Any repetition
  // level less than this indicates either a new list OR
  // an empty list (which is determined in conjunction
  // with definition levels).
  public native short rep_level(); public native LevelInfo rep_level(short setter);

  // The definition level indicating the level at which the closest
  // repeated ancestor is not empty.  This is used to discriminate
  // between a value less than |def_level| being null or excluded entirely.
  // For instance if we have an arrow schema like:
  // list(struct(f0: int)).  Then then there are the following
  // definition levels:
  //   0 = null list
  //   1 = present but empty list.
  //   2 = a null value in the list
  //   3 = a non null struct but null integer.
  //   4 = a present integer.
  // When reconstructing, the struct and integer arrays'
  // repeated_ancestor_def_level would be 2.  Any
  // def_level < 2 indicates that there isn't a corresponding
  // child value in the list.
  // i.e. [null, [], [null], [{f0: null}], [{f0: 1}]]
  // has the def levels [0, 1, 2, 3, 4].  The actual
  // struct array is only of length 3: [not-set, set, set] and
  // the int array is also of length 3: [N/A, null, 1].
  //
  public native short repeated_ancestor_def_level(); public native LevelInfo repeated_ancestor_def_level(short setter);

  /** Increments levels according to the cardinality of node. */
  public native void Increment(@Const @ByRef Node node);

  /** Incremetns level for a optional node. */
  public native void IncrementOptional();

  /** Increments levels for the repeated node.  Returns
   *  the previous ancestor_list_def_level. */
  public native short IncrementRepeated();

  
}
