// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("c10::impl") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AutogradMetaFactoryRegisterer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AutogradMetaFactoryRegisterer(Pointer p) { super(p); }

  public AutogradMetaFactoryRegisterer(AutogradMetaFactory factory) { super((Pointer)null); allocate(factory); }
  private native void allocate(AutogradMetaFactory factory);
}