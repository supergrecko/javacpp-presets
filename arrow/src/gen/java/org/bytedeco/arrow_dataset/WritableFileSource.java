// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

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


/** \brief The path and filesystem where an actual file is located or a buffer which can
 *  be written to like a file */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class WritableFileSource extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WritableFileSource(Pointer p) { super(p); }

  public WritableFileSource(@StdString String path, @SharedPtr FileSystem filesystem,
                       Compression.type compression/*=arrow::Compression::UNCOMPRESSED*/) { super((Pointer)null); allocate(path, filesystem, compression); }
  private native void allocate(@StdString String path, @SharedPtr FileSystem filesystem,
                       Compression.type compression/*=arrow::Compression::UNCOMPRESSED*/);
  public WritableFileSource(@StdString String path, @SharedPtr FileSystem filesystem) { super((Pointer)null); allocate(path, filesystem); }
  private native void allocate(@StdString String path, @SharedPtr FileSystem filesystem);
  public WritableFileSource(@StdString BytePointer path, @SharedPtr FileSystem filesystem,
                       @Cast("arrow::Compression::type") int compression/*=arrow::Compression::UNCOMPRESSED*/) { super((Pointer)null); allocate(path, filesystem, compression); }
  private native void allocate(@StdString BytePointer path, @SharedPtr FileSystem filesystem,
                       @Cast("arrow::Compression::type") int compression/*=arrow::Compression::UNCOMPRESSED*/);
  public WritableFileSource(@StdString BytePointer path, @SharedPtr FileSystem filesystem) { super((Pointer)null); allocate(path, filesystem); }
  private native void allocate(@StdString BytePointer path, @SharedPtr FileSystem filesystem);

  public WritableFileSource(@SharedPtr @ByVal ResizableBuffer buffer,
                                Compression.type compression/*=arrow::Compression::UNCOMPRESSED*/) { super((Pointer)null); allocate(buffer, compression); }
  private native void allocate(@SharedPtr @ByVal ResizableBuffer buffer,
                                Compression.type compression/*=arrow::Compression::UNCOMPRESSED*/);
  public WritableFileSource(@SharedPtr @ByVal ResizableBuffer buffer) { super((Pointer)null); allocate(buffer); }
  private native void allocate(@SharedPtr @ByVal ResizableBuffer buffer);
  public WritableFileSource(@SharedPtr @ByVal ResizableBuffer buffer,
                                @Cast("arrow::Compression::type") int compression/*=arrow::Compression::UNCOMPRESSED*/) { super((Pointer)null); allocate(buffer, compression); }
  private native void allocate(@SharedPtr @ByVal ResizableBuffer buffer,
                                @Cast("arrow::Compression::type") int compression/*=arrow::Compression::UNCOMPRESSED*/);

  /** \brief Return the type of raw compression on the file, if any */
  public native Compression.type compression();

  /** \brief Return the file path, if any. Only valid when file source wraps a path. */
  public native @StdString String path();

  /** \brief Return the filesystem, if any. Otherwise returns nullptr */
  public native @SharedPtr FileSystem filesystem();

  /** \brief Return the buffer containing the file, if any. Otherwise returns nullptr */
  public native @Const @SharedPtr @ByRef ResizableBuffer buffer();

  /** \brief Get an OutputStream which wraps this file source */
  public native @ByVal OutputStreamResult Open();
}
