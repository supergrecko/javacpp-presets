// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Namespace("onnx") @Opaque @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TreeEnsembleClassifier_OnnxML_ver1 extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TreeEnsembleClassifier_OnnxML_ver1() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TreeEnsembleClassifier_OnnxML_ver1(Pointer p) { super(p); }
}
