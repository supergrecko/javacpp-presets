// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.plasma;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.plasma.*;


@Namespace("plasma") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.plasma.class)
public class PlasmaClient extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PlasmaClient(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PlasmaClient(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PlasmaClient position(long position) {
        return (PlasmaClient)super.position(position);
    }
    @Override public PlasmaClient getPointer(long i) {
        return new PlasmaClient((Pointer)this).position(position + i);
    }

  public PlasmaClient() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** Connect to the local plasma store. Return the resulting connection.
   * 
   *  @param store_socket_name The name of the UNIX domain socket to use to
   *         connect to the Plasma store.
   *  @param manager_socket_name The name of the UNIX domain socket to use to
   *         connect to the local Plasma manager. If this is "", then this
   *         function will not connect to a manager.
   *         Note that plasma manager is no longer supported, this function
   *         will return failure if this is not "".
   *  @param release_delay Deprecated (not used).
   *  @param num_retries number of attempts to connect to IPC socket, default 50
   *  @return The return status. */
  
  ///
  public native @ByVal Status Connect(@StdString String store_socket_name,
                   @StdString String manager_socket_name/*=""*/, int release_delay/*=0*/,
                   int num_retries/*=-1*/);
  public native @ByVal Status Connect(@StdString String store_socket_name);
  public native @ByVal Status Connect(@StdString BytePointer store_socket_name,
                   @StdString BytePointer manager_socket_name/*=""*/, int release_delay/*=0*/,
                   int num_retries/*=-1*/);
  public native @ByVal Status Connect(@StdString BytePointer store_socket_name);

  /** Set runtime options for this client.
   * 
   *  @param client_name The name of the client, used in debug messages.
   *  @param output_memory_quota The memory quota in bytes for objects created by
   *         this client. */
  
  ///
  ///
  public native @ByVal Status SetClientOptions(@StdString String client_name, @Cast("int64_t") long output_memory_quota);
  public native @ByVal Status SetClientOptions(@StdString BytePointer client_name, @Cast("int64_t") long output_memory_quota);

  /** Create an object in the Plasma Store. Any metadata for this object must be
   *  be passed in when the object is created.
   * 
   *  @param object_id The ID to use for the newly created object.
   *  @param data_size The size in bytes of the space to be allocated for this
   *  object's
   *         data (this does not include space used for metadata).
   *  @param metadata The object's metadata. If there is no metadata, this
   *  pointer
   *         should be NULL.
   *  @param metadata_size The size in bytes of the metadata. If there is no
   *         metadata, this should be 0.
   *  @param data The address of the newly created object will be written here.
   *  @param device_num The number of the device where the object is being
   *         created.
   *         device_num = 0 corresponds to the host,
   *         device_num = 1 corresponds to GPU0,
   *         device_num = 2 corresponds to GPU1, etc.
   *  @param evict_if_full Whether to evict other objects to make space for
   *         this object.
   *  @return The return status.
   * 
   *  The returned object must be released once it is done with.  It must also
   *  be either sealed or aborted. */
  
  ///
  public native @ByVal Status Create(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id, @Cast("int64_t") long data_size, @Cast("const uint8_t*") BytePointer metadata,
                  @Cast("int64_t") long metadata_size, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer data, int device_num/*=0*/,
                  @Cast("bool") boolean evict_if_full/*=true*/);
  public native @ByVal Status Create(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id, @Cast("int64_t") long data_size, @Cast("const uint8_t*") BytePointer metadata,
                  @Cast("int64_t") long metadata_size, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer data);
  public native @ByVal Status Create(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id, @Cast("int64_t") long data_size, @Cast("const uint8_t*") ByteBuffer metadata,
                  @Cast("int64_t") long metadata_size, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer data, int device_num/*=0*/,
                  @Cast("bool") boolean evict_if_full/*=true*/);
  public native @ByVal Status Create(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id, @Cast("int64_t") long data_size, @Cast("const uint8_t*") ByteBuffer metadata,
                  @Cast("int64_t") long metadata_size, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer data);
  public native @ByVal Status Create(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id, @Cast("int64_t") long data_size, @Cast("const uint8_t*") byte[] metadata,
                  @Cast("int64_t") long metadata_size, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer data, int device_num/*=0*/,
                  @Cast("bool") boolean evict_if_full/*=true*/);
  public native @ByVal Status Create(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id, @Cast("int64_t") long data_size, @Cast("const uint8_t*") byte[] metadata,
                  @Cast("int64_t") long metadata_size, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer data);

  /** Create and seal an object in the object store. This is an optimization
   *  which allows small objects to be created quickly with fewer messages to
   *  the store.
   * 
   *  @param object_id The ID of the object to create.
   *  @param data The data for the object to create.
   *  @param metadata The metadata for the object to create.
   *  @param evict_if_full Whether to evict other objects to make space for
   *         this object.
   *  @return The return status. */
  
  ///
  public native @ByVal Status CreateAndSeal(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id, @StdString String data,
                         @StdString String metadata, @Cast("bool") boolean evict_if_full/*=true*/);
  public native @ByVal Status CreateAndSeal(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id, @StdString String data,
                         @StdString String metadata);
  public native @ByVal Status CreateAndSeal(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id, @StdString BytePointer data,
                         @StdString BytePointer metadata, @Cast("bool") boolean evict_if_full/*=true*/);
  public native @ByVal Status CreateAndSeal(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id, @StdString BytePointer data,
                         @StdString BytePointer metadata);

  /** Create and seal multiple objects in the object store. This is an optimization
   *  of CreateAndSeal to eliminate the cost of IPC per object.
   * 
   *  @param object_ids The vector of IDs of the objects to create.
   *  @param data The vector of data for the objects to create.
   *  @param metadata The vector of metadata for the objects to create.
   *  @param evict_if_full Whether to evict other objects to make space for
   *         these objects.
   *  @return The return status. */
  
  ///
  ///
  public native @ByVal Status CreateAndSealBatch(@Cast("plasma::ObjectID*") @StdVector UniqueID object_ids,
                              @Const @ByRef StringVector data,
                              @Const @ByRef StringVector metadata,
                              @Cast("bool") boolean evict_if_full/*=true*/);
  public native @ByVal Status CreateAndSealBatch(@Cast("plasma::ObjectID*") @StdVector UniqueID object_ids,
                              @Const @ByRef StringVector data,
                              @Const @ByRef StringVector metadata);

  /** Get some objects from the Plasma Store. This function will block until the
   *  objects have all been created and sealed in the Plasma Store or the
   *  timeout expires.
   * 
   *  If an object was not retrieved, the corresponding metadata and data
   *  fields in the ObjectBuffer structure will evaluate to false.
   *  Objects are automatically released by the client when their buffers
   *  get out of scope.
   * 
   *  @param object_ids The IDs of the objects to get.
   *  @param timeout_ms The amount of time in milliseconds to wait before this
   *         request times out. If this value is -1, then no timeout is set.
   *  @param object_buffers [out] The object results.
   *  @return The return status. */
  
  ///
  ///
  public native @ByVal Status Get(@Cast("plasma::ObjectID*") @StdVector UniqueID object_ids, @Cast("int64_t") long timeout_ms,
               @StdVector ObjectBuffer object_buffers);

  /** Deprecated variant of Get() that doesn't automatically release buffers
   *  when they get out of scope.
   * 
   *  @param object_ids The IDs of the objects to get.
   *  @param num_objects The number of object IDs to get.
   *  @param timeout_ms The amount of time in milliseconds to wait before this
   *         request times out. If this value is -1, then no timeout is set.
   *  @param object_buffers An array where the results will be stored.
   *  @return The return status.
   * 
   *  The caller is responsible for releasing any retrieved objects, but it
   *  should not release objects that were not retrieved. */
  
  ///
  public native @ByVal Status Get(@Cast("const plasma::ObjectID*") UniqueID object_ids, @Cast("int64_t") long num_objects, @Cast("int64_t") long timeout_ms,
               ObjectBuffer object_buffers);

  /** Tell Plasma that the client no longer needs the object. This should be
   *  called after Get() or Create() when the client is done with the object.
   *  After this call, the buffer returned by Get() is no longer valid.
   * 
   *  @param object_id The ID of the object that is no longer needed.
   *  @return The return status. */
  
  ///
  ///
  public native @ByVal Status Release(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id);

  /** Check if the object store contains a particular object and the object has
   *  been sealed. The result will be stored in has_object.
   * 
   *  \todo: We may want to indicate if the object has been created but not
   *  sealed.
   * 
   *  @param object_id The ID of the object whose presence we are checking.
   *  @param has_object The function will write true at this address if
   *         the object is present and false if it is not present.
   *  @return The return status. */
  
  ///
  ///
  public native @ByVal Status Contains(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id, @Cast("bool*") BoolPointer has_object);
  public native @ByVal Status Contains(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id, @Cast("bool*") boolean[] has_object);

  /** List all the objects in the object store.
   * 
   *  This API is experimental and might change in the future.
   * 
   *  @param objects [out] ObjectTable of objects in the store. For each entry
   *              in the map, the following fields are available:
   *              - metadata_size: Size of the object metadata in bytes
   *              - data_size: Size of the object data in bytes
   *              - ref_count: Number of clients referencing the object buffer
   *              - create_time: Unix timestamp of the object creation
   *              - construct_duration: Object creation time in seconds
   *              - state: Is the object still being created or already sealed?
   *  @return The return status. */
  
  ///
  public native @ByVal Status List(@Cast("plasma::ObjectTable*") StringStringMap objects);

  /** Abort an unsealed object in the object store. If the abort succeeds, then
   *  it will be as if the object was never created at all. The unsealed object
   *  must have only a single reference (the one that would have been removed by
   *  calling Seal).
   * 
   *  @param object_id The ID of the object to abort.
   *  @return The return status. */
  
  ///
  public native @ByVal Status Abort(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id);

  /** Seal an object in the object store. The object will be immutable after
   *  this
   *  call.
   * 
   *  @param object_id The ID of the object to seal.
   *  @return The return status. */
  
  ///
  ///
  public native @ByVal Status Seal(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id);

  /** Delete an object from the object store. This currently assumes that the
   *  object is present, has been sealed and not used by another client. Otherwise,
   *  it is a no operation.
   * 
   *  \todo We may want to allow the deletion of objects that are not present or
   *        haven't been sealed.
   * 
   *  @param object_id The ID of the object to delete.
   *  @return The return status. */
  
  ///
  public native @ByVal Status Delete(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id);

  /** Delete a list of objects from the object store. This currently assumes that the
   *  object is present, has been sealed and not used by another client. Otherwise,
   *  it is a no operation.
   * 
   *  @param object_ids The list of IDs of the objects to delete.
   *  @return The return status. If all the objects are nonexistent, return OK. */

  /** Delete objects until we have freed up num_bytes bytes or there are no more
   *  released objects that can be deleted.
   * 
   *  @param num_bytes The number of bytes to try to free up.
   *  @param num_bytes_evicted Out parameter for total number of bytes of space
   *  retrieved.
   *  @return The return status. */
  
  ///
  public native @ByVal Status Evict(@Cast("int64_t") long num_bytes, @Cast("int64_t*") @ByRef LongPointer num_bytes_evicted);
  public native @ByVal Status Evict(@Cast("int64_t") long num_bytes, @Cast("int64_t*") @ByRef LongBuffer num_bytes_evicted);
  public native @ByVal Status Evict(@Cast("int64_t") long num_bytes, @Cast("int64_t*") @ByRef long[] num_bytes_evicted);

  /** Bump objects up in the LRU cache, i.e. treat them as recently accessed.
   *  Objects that do not exist in the store will be ignored.
   * 
   *  @param object_ids The IDs of the objects to bump.
   *  @return The return status. */
  
  ///
  public native @ByVal Status Refresh(@Cast("plasma::ObjectID*") @StdVector UniqueID object_ids);

  /** Compute the hash of an object in the object store.
   * 
   *  @param object_id The ID of the object we want to hash.
   *  @param digest A pointer at which to return the hash digest of the object.
   *         The pointer must have at least kDigestSize bytes allocated.
   *  @return The return status. */
  
  ///
  public native @ByVal Status Hash(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id, @Cast("uint8_t*") BytePointer digest);
  public native @ByVal Status Hash(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id, @Cast("uint8_t*") ByteBuffer digest);
  public native @ByVal Status Hash(@Cast("const plasma::ObjectID*") @ByRef UniqueID object_id, @Cast("uint8_t*") byte[] digest);

  /** Subscribe to notifications when objects are sealed in the object store.
   *  Whenever an object is sealed, a message will be written to the client
   *  socket that is returned by this method.
   * 
   *  @param fd Out parameter for the file descriptor the client should use to
   *  read notifications
   *          from the object store about sealed objects.
   *  @return The return status. */
  
  ///
  public native @ByVal Status Subscribe(IntPointer fd);
  public native @ByVal Status Subscribe(IntBuffer fd);
  public native @ByVal Status Subscribe(int[] fd);

  /** Receive next object notification for this client if Subscribe has been called.
   * 
   *  @param fd The file descriptor we are reading the notification from.
   *  @param object_id Out parameter, the object_id of the object that was sealed.
   *  @param data_size Out parameter, the data size of the object that was sealed.
   *  @param metadata_size Out parameter, the metadata size of the object that was sealed.
   *  @return The return status. */
  public native @ByVal Status GetNotification(int fd, @Cast("plasma::ObjectID*") UniqueID object_id, @Cast("int64_t*") LongPointer data_size,
                           @Cast("int64_t*") LongPointer metadata_size);
  public native @ByVal Status GetNotification(int fd, @Cast("plasma::ObjectID*") UniqueID object_id, @Cast("int64_t*") LongBuffer data_size,
                           @Cast("int64_t*") LongBuffer metadata_size);
  public native @ByVal Status GetNotification(int fd, @Cast("plasma::ObjectID*") UniqueID object_id, @Cast("int64_t*") long[] data_size,
                           @Cast("int64_t*") long[] metadata_size);

  
  ///
  public native @ByVal Status DecodeNotifications(@Cast("const uint8_t*") BytePointer buffer, @Cast("plasma::ObjectID*") @StdVector UniqueID object_ids,
                               @Cast("int64_t*") @StdVector LongPointer data_sizes,
                               @Cast("int64_t*") @StdVector LongPointer metadata_sizes);
  public native @ByVal Status DecodeNotifications(@Cast("const uint8_t*") ByteBuffer buffer, @Cast("plasma::ObjectID*") @StdVector UniqueID object_ids,
                               @Cast("int64_t*") @StdVector LongBuffer data_sizes,
                               @Cast("int64_t*") @StdVector LongBuffer metadata_sizes);
  public native @ByVal Status DecodeNotifications(@Cast("const uint8_t*") byte[] buffer, @Cast("plasma::ObjectID*") @StdVector UniqueID object_ids,
                               @Cast("int64_t*") @StdVector long[] data_sizes,
                               @Cast("int64_t*") @StdVector long[] metadata_sizes);

  /** Disconnect from the local plasma instance, including the local store and
   *  manager.
   * 
   *  @return The return status. */
  
  ///
  public native @ByVal Status Disconnect();

  /** Get the current debug string from the plasma store server.
   * 
   *  @return The debug string. */
  
  ///
  public native @StdString String DebugString();

  /** Get the memory capacity of the store.
   * 
   *  @return Memory capacity of the store in bytes. */
  public native @Cast("int64_t") long store_capacity();
}
