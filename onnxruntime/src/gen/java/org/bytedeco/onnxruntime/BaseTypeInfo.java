// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;

@Name("Ort::Base<OrtTypeInfo>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseTypeInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseTypeInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseTypeInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseTypeInfo position(long position) {
        return (BaseTypeInfo)super.position(position);
    }

  public BaseTypeInfo() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseTypeInfo(OrtTypeInfo p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtTypeInfo p);

  public native @Name("operator OrtTypeInfo*") OrtTypeInfo asOrtTypeInfo();

  public native OrtTypeInfo release();
}