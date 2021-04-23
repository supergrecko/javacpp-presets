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


/** \brief DirectoryPartitioning parses one segment of a path for each field in its
 *  schema. All fields are required, so paths passed to DirectoryPartitioning::Parse
 *  must contain segments for each field.
 * 
 *  For example given schema<year:int16, month:int8> the path "/2009/11" would be
 *  parsed to ("year"_ == 2009 and "month"_ == 11) */
@Namespace("arrow::dataset") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class DirectoryPartitioning extends KeyValuePartitioning {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DirectoryPartitioning(Pointer p) { super(p); }

  // If a field in schema is of dictionary type, the corresponding element of dictionaries
  // must be contain the dictionary of values for that field.
  public DirectoryPartitioning(@SharedPtr @ByVal Schema schema,
                                   @ByVal(nullValue = "arrow::ArrayVector{}") ArrayVector dictionaries) { super((Pointer)null); allocate(schema, dictionaries); }
  private native void allocate(@SharedPtr @ByVal Schema schema,
                                   @ByVal(nullValue = "arrow::ArrayVector{}") ArrayVector dictionaries);
  public DirectoryPartitioning(@SharedPtr @ByVal Schema schema) { super((Pointer)null); allocate(schema); }
  private native void allocate(@SharedPtr @ByVal Schema schema);

  public native @StdString String type_name();

  public static native @SharedPtr PartitioningFactory MakeFactory(
        @ByVal StringVector field_names, @ByVal(nullValue = "arrow::dataset::PartitioningFactoryOptions{}") PartitioningFactoryOptions arg1);
  public static native @SharedPtr PartitioningFactory MakeFactory(
        @ByVal StringVector field_names);
}
