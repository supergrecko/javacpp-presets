// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class ColumnEncryptionProperties extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ColumnEncryptionProperties(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ColumnEncryptionProperties(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ColumnEncryptionProperties position(long position) {
        return (ColumnEncryptionProperties)super.position(position);
    }
    @Override public ColumnEncryptionProperties getPointer(long i) {
        return new ColumnEncryptionProperties((Pointer)this).position(position + i);
    }

  @NoOffset public static class Builder extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Builder(Pointer p) { super(p); }
  
    /** Convenience builder for encrypted columns. */
    public Builder(@StdString String name) { super((Pointer)null); allocate(name); }
    private native void allocate(@StdString String name);
    public Builder(@StdString BytePointer name) { super((Pointer)null); allocate(name); }
    private native void allocate(@StdString BytePointer name);

    /** Convenience builder for encrypted columns. */
    public Builder(@SharedPtr ColumnPath path) { super((Pointer)null); allocate(path); }
    private native void allocate(@SharedPtr ColumnPath path);

    /** Set a column-specific key.
     *  If key is not set on an encrypted column, the column will
     *  be encrypted with the footer key.
     *  keyBytes Key length must be either 16, 24 or 32 bytes.
     *  The key is cloned, and will be wiped out (array values set to 0) upon completion
     *  of file writing.
     *  Caller is responsible for wiping out the input key array. */
    public native Builder key(@StdString String column_key);
    public native Builder key(@StdString BytePointer column_key);

    /** Set a key retrieval metadata.
     *  use either key_metadata() or key_id(), not both */
    public native Builder key_metadata(@StdString String key_metadata);
    public native Builder key_metadata(@StdString BytePointer key_metadata);

    /** A convenience function to set key metadata using a string id.
     *  Set a key retrieval metadata (converted from String).
     *  use either key_metadata() or key_id(), not both
     *  key_id will be converted to metadata (UTF-8 array). */
    public native Builder key_id(@StdString String key_id);
    public native Builder key_id(@StdString BytePointer key_id);

    public native @SharedPtr ColumnEncryptionProperties build();
  }

  public native @StdString String column_path();
  public native @Cast("bool") boolean is_encrypted();
  public native @Cast("bool") boolean is_encrypted_with_footer_key();
  public native @StdString String key();
  public native @StdString String key_metadata();

  /** Upon completion of file writing, the encryption key
   *  will be wiped out. */
  public native void WipeOutEncryptionKey();

  public native @Cast("bool") boolean is_utilized();

  /** ColumnEncryptionProperties object can be used for writing one file only.
   *  Mark ColumnEncryptionProperties as utilized once it is used in
   *  FileEncryptionProperties as the encryption key will be wiped out upon
   *  completion of file writing. */
  public native void set_utilized();

  public native @SharedPtr ColumnEncryptionProperties DeepClone();

  public ColumnEncryptionProperties() { super((Pointer)null); allocate(); }
  private native void allocate();
  public ColumnEncryptionProperties(@Const @ByRef ColumnEncryptionProperties other) { super((Pointer)null); allocate(other); }
  private native void allocate(@Const @ByRef ColumnEncryptionProperties other);
}
