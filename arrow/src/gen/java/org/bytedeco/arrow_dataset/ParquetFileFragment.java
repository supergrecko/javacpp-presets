// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief A FileFragment with parquet logic.
 * 
 *  ParquetFileFragment provides a lazy (with respect to IO) interface to
 *  scan parquet files. Any heavy IO calls are deferred to the Scan() method.
 * 
 *  The caller can provide an optional list of selected RowGroups to limit the
 *  number of scanned RowGroups, or to partition the scans across multiple
 *  threads.
 * 
 *  Metadata can be explicitly provided, enabling pushdown predicate benefits without
 *  the potentially heavy IO of loading Metadata from the file system. This can induce
 *  significant performance boost when scanning high latency file systems. */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ParquetFileFragment extends FileFragment {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParquetFileFragment(Pointer p) { super(p); }

  public native @ByVal FragmentResult SplitByRowGroup(@ByVal Expression predicate);

  /** \brief Return the RowGroups selected by this fragment. */
  public native @StdVector IntPointer row_groups();

  /** \brief Return the FileMetaData associated with this fragment. */
  public native @SharedPtr FileMetaData metadata();

  /** \brief Ensure this fragment's FileMetaData is in memory. */
  public native @ByVal Status EnsureCompleteMetadata(FileReader reader/*=nullptr*/);
  public native @ByVal Status EnsureCompleteMetadata();

  /** \brief Return fragment which selects a filtered subset of this fragment's RowGroups. */
  public native @ByVal FragmentResult Subset(@ByVal Expression predicate);
  public native @ByVal FragmentResult Subset(@StdVector IntPointer row_group_ids);
  public native @ByVal FragmentResult Subset(@StdVector IntBuffer row_group_ids);
  public native @ByVal FragmentResult Subset(@StdVector int[] row_group_ids);
}
