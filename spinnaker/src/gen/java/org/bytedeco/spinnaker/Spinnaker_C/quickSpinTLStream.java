// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**	
* \defgroup TLStreamC_h TLStream Structures
* \ingroup CQuickSpin
*/
/*@{*/

@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class quickSpinTLStream extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public quickSpinTLStream() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public quickSpinTLStream(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public quickSpinTLStream(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public quickSpinTLStream position(long position) {
        return (quickSpinTLStream)super.position(position);
    }

	public native @Cast("quickSpinStringNode") spinNodeHandle StreamID(); public native quickSpinTLStream StreamID(spinNodeHandle StreamID);
	public native @Cast("quickSpinEnumerationNode") spinNodeHandle StreamType(); public native quickSpinTLStream StreamType(spinNodeHandle StreamType);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle StreamTotalBufferCount(); public native quickSpinTLStream StreamTotalBufferCount(spinNodeHandle StreamTotalBufferCount);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle StreamDefaultBufferCount(); public native quickSpinTLStream StreamDefaultBufferCount(spinNodeHandle StreamDefaultBufferCount);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle StreamDefaultBufferCountMax(); public native quickSpinTLStream StreamDefaultBufferCountMax(spinNodeHandle StreamDefaultBufferCountMax);
	public native @Cast("quickSpinEnumerationNode") spinNodeHandle StreamDefaultBufferCountMode(); public native quickSpinTLStream StreamDefaultBufferCountMode(spinNodeHandle StreamDefaultBufferCountMode);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle StreamBufferCountManual(); public native quickSpinTLStream StreamBufferCountManual(spinNodeHandle StreamBufferCountManual);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle StreamBufferCountResult(); public native quickSpinTLStream StreamBufferCountResult(spinNodeHandle StreamBufferCountResult);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle StreamBufferCountMax(); public native quickSpinTLStream StreamBufferCountMax(spinNodeHandle StreamBufferCountMax);
	public native @Cast("quickSpinEnumerationNode") spinNodeHandle StreamBufferCountMode(); public native quickSpinTLStream StreamBufferCountMode(spinNodeHandle StreamBufferCountMode);
	public native @Cast("quickSpinEnumerationNode") spinNodeHandle StreamBufferHandlingMode(); public native quickSpinTLStream StreamBufferHandlingMode(spinNodeHandle StreamBufferHandlingMode);
	public native @Cast("quickSpinBooleanNode") spinNodeHandle StreamCRCCheckEnable(); public native quickSpinTLStream StreamCRCCheckEnable(spinNodeHandle StreamCRCCheckEnable);
	public native @Cast("quickSpinBooleanNode") spinNodeHandle GevPacketResendMode(); public native quickSpinTLStream GevPacketResendMode(spinNodeHandle GevPacketResendMode);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevMaximumNumberResendRequests(); public native quickSpinTLStream GevMaximumNumberResendRequests(spinNodeHandle GevMaximumNumberResendRequests);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevPacketResendTimeout(); public native quickSpinTLStream GevPacketResendTimeout(spinNodeHandle GevPacketResendTimeout);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevMaximumNumberResendBuffers(); public native quickSpinTLStream GevMaximumNumberResendBuffers(spinNodeHandle GevMaximumNumberResendBuffers);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevTotalPacketCount(); public native quickSpinTLStream GevTotalPacketCount(spinNodeHandle GevTotalPacketCount);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevFailedPacketCount(); public native quickSpinTLStream GevFailedPacketCount(spinNodeHandle GevFailedPacketCount);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevResendPacketCount(); public native quickSpinTLStream GevResendPacketCount(spinNodeHandle GevResendPacketCount);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle StreamFailedBufferCount(); public native quickSpinTLStream StreamFailedBufferCount(spinNodeHandle StreamFailedBufferCount);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle StreamBufferUnderrunCount(); public native quickSpinTLStream StreamBufferUnderrunCount(spinNodeHandle StreamBufferUnderrunCount);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevResendRequestCount(); public native quickSpinTLStream GevResendRequestCount(spinNodeHandle GevResendRequestCount);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle StreamBlockTransferSize(); public native quickSpinTLStream StreamBlockTransferSize(spinNodeHandle StreamBlockTransferSize);
}