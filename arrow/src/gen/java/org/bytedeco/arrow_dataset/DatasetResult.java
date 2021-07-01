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
  // namespace internal

/** A class for representing either a usable value, or an error.
 * 
 *  A Result object either contains a value of type {@code T} or a Status object
 *  explaining why such a value is not present. The type {@code T} must be
 *  copy-constructible and/or move-constructible.
 * 
 *  The state of a Result object may be determined by calling ok() or
 *  status(). The ok() method returns true if the object contains a valid value.
 *  The status() method returns the internal Status object. A Result object
 *  that contains a valid value will return an OK Status for a call to status().
 * 
 *  A value of type {@code T} may be extracted from a Result object through a call
 *  to ValueOrDie(). This function should only be called if a call to ok()
 *  returns true. Sample usage:
 * 
 *  <pre>{@code
 *    arrow::Result<Foo> result = CalculateFoo();
 *    if (result.ok()) {
 *      Foo foo = result.ValueOrDie();
 *      foo.DoSomethingCool();
 *    } else {
 *      ARROW_LOG(ERROR) << result.status();
 *   }
 *  }</pre>
 * 
 *  If {@code T} is a move-only type, like {@code std::unique_ptr<>}, then the value should
 *  only be extracted after invoking {@code std::move()} on the Result object.
 *  Sample usage:
 * 
 *  <pre>{@code
 *    arrow::Result<std::unique_ptr<Foo>> result = CalculateFoo();
 *    if (result.ok()) {
 *      std::unique_ptr<Foo> foo = std::move(result).ValueOrDie();
 *      foo->DoSomethingCool();
 *    } else {
 *      ARROW_LOG(ERROR) << result.status();
 *    }
 *  }</pre>
 * 
 *  Result is provided for the convenience of implementing functions that
 *  return some value but may fail during execution. For instance, consider a
 *  function with the following signature:
 * 
 *  <pre>{@code
 *    arrow::Status CalculateFoo(int *output);
 *  }</pre>
 * 
 *  This function may instead be written as:
 * 
 *  <pre>{@code
 *    arrow::Result<int> CalculateFoo();
 *  }</pre> */
@Name("arrow::Result<std::shared_ptr<arrow::dataset::Dataset> >") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class DatasetResult extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DatasetResult(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DatasetResult(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DatasetResult position(long position) {
        return (DatasetResult)super.position(position);
    }
    @Override public DatasetResult getPointer(long i) {
        return new DatasetResult((Pointer)this).offsetAddress(i);
    }

  
  ///

  /** Constructs a Result object that contains a non-OK status.
   * 
   *  This constructor is marked {@code explicit} to prevent attempts to {@code return {}}
   *  from a function with a return type of, for example,
   *  {@code Result<std::vector<int>>}. While {@code return {}} seems like it would return
   *  an empty vector, it will actually invoke the default constructor of
   *  Result. */
  public DatasetResult() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** Constructs a Result object with the given non-OK Status object. All
   *  calls to ValueOrDie() on this object will abort. The given {@code status} must
   *  not be an OK status, otherwise this constructor will abort.
   * 
   *  This constructor is not declared explicit so that a function with a return
   *  type of {@code Result<T>} can return a Status object, and the status will be
   *  implicitly converted to the appropriate return type as a matter of
   *  convenience.
   * 
   *  @param status The non-OK Status object to initialize to. */
  
  ///
  ///
  ///
  public DatasetResult(@Const @ByRef Status status) { super((Pointer)null); allocate(status); }
  private native void allocate(@Const @ByRef Status status);

  /** Constructs a Result object that contains {@code value}. The resulting object
   *  is considered to have an OK status. The wrapped element can be accessed
   *  with ValueOrDie().
   * 
   *  This constructor is made implicit so that a function with a return type of
   *  {@code Result<T>} can return an object of type {@code U &&}, implicitly converting
   *  it to a {@code Result<T>} object.
   * 
   *  Note that {@code T} must be implicitly constructible from {@code U}, and {@code U} must not
   *  be a (cv-qualified) Status or Status-reference type. Due to C++
   *  reference-collapsing rules and perfect-forwarding semantics, this
   *  constructor matches invocations that pass {@code value} either as a const
   *  reference or as an rvalue reference. Since Result needs to work for both
   *  reference and rvalue-reference types, the constructor uses perfect
   *  forwarding to avoid invalidating arguments that were passed by reference.
   *  See http://thbecker.net/articles/rvalue_references/section_08.html for
   *  additional details.
   * 
   *  @param value The value to initialize to. */

  /** Constructs a Result object that contains {@code value}. The resulting object
   *  is considered to have an OK status. The wrapped element can be accessed
   *  with ValueOrDie().
   * 
   *  This constructor is made implicit so that a function with a return type of
   *  {@code Result<T>} can return an object of type {@code T}, implicitly converting
   *  it to a {@code Result<T>} object.
   * 
   *  @param value The value to initialize to. */
  // NOTE `Result(U&& value)` above should be sufficient, but some compilers
  // fail matching it.
  
  ///
  ///
  public DatasetResult(@SharedPtr @ByRef(true) Dataset value) { super((Pointer)null); allocate(value); }
  @NoException private native void allocate(@SharedPtr @ByRef(true) Dataset value);

  /** Copy constructor.
   * 
   *  This constructor needs to be explicitly defined because the presence of
   *  the move-assignment operator deletes the default copy constructor. In such
   *  a scenario, since the deleted copy constructor has stricter binding rules
   *  than the templated copy constructor, the templated constructor cannot act
   *  as a copy constructor, and any attempt to copy-construct a {@code Result}
   *  object results in a compilation error.
   * 
   *  @param other The value to copy from. */
  
  ///
  ///
  public DatasetResult(@Const @ByRef DatasetResult other) { super((Pointer)null); allocate(other); }
  private native void allocate(@Const @ByRef DatasetResult other);

  /** Templatized constructor that constructs a {@code Result<T>} from a const
   *  reference to a {@code Result<U>}.
   * 
   *  {@code T} must be implicitly constructible from {@code const U &}.
   * 
   *  @param other The value to copy from. */

  /** Copy-assignment operator.
   * 
   *  @param other The Result object to copy. */
  
  ///
  ///
  public native @ByRef @Name("operator =") DatasetResult put(@Const @ByRef DatasetResult other);

  /** Templatized constructor which constructs a {@code Result<T>} by moving the
   *  contents of a {@code Result<U>}. {@code T} must be implicitly constructible from {@code U
   *  &&}.
   * 
   *  Sets {@code other} to contain a non-OK status with a{@code StatusError::Invalid}
   *  error code.
   * 
   *  @param other The Result object to move from and set to a non-OK status. */

  /** Move-assignment operator.
   * 
   *  Sets {@code other} to an invalid state..
   * 
   *  @param other The Result object to assign from and set to a non-OK
   *  status. */

  /** Compare to another Result. */
  
  ///
  public native @Cast("bool") boolean Equals(@Const @ByRef DatasetResult other);

  /** Indicates whether the object contains a {@code T} value.  Generally instead
   *  of accessing this directly you will want to use ASSIGN_OR_RAISE defined
   *  below.
   * 
   *  @return True if this Result object's status is OK (i.e. a call to ok()
   *  returns true). If this function returns true, then it is safe to access
   *  the wrapped element through a call to ValueOrDie(). */
  
  ///
  public native @Cast("bool") boolean ok();

  /** \brief Equivalent to ok(). */
  // operator bool() const { return ok(); }

  /** Gets the stored status object, or an OK status if a {@code T} value is stored.
  /**
  /** @return The stored non-OK status object, or an OK status if this object
  /**         has a value. */
  
  ///
  ///
  public native @Const @ByRef Status status();

  /** Gets the stored {@code T} value.
   * 
   *  This method should only be called if this Result object's status is OK
   *  (i.e. a call to ok() returns true), otherwise this call will abort.
   * 
   *  @return The stored {@code T} value. */

  /** Gets a mutable reference to the stored {@code T} value.
   * 
   *  This method should only be called if this Result object's status is OK
   *  (i.e. a call to ok() returns true), otherwise this call will abort.
   * 
   *  @return The stored {@code T} value. */
  public native @SharedPtr @ByRef Dataset ValueOrDie();
  public native @SharedPtr @ByRef @Name("operator *") Dataset multiply();
  
  ///
  ///
  public native @SharedPtr @Name("operator ->") Dataset access();

  /** Moves and returns the internally-stored {@code T} value.
   * 
   *  This method should only be called if this Result object's status is OK
   *  (i.e. a call to ok() returns true), otherwise this call will abort. The
   *  Result object is invalidated after this call and will be updated to
   *  contain a non-OK status.
   * 
   *  @return The stored {@code T} value. */
  
  

  /** Helper method for implementing Status returning functions in terms of semantically
   *  equivalent Result returning functions. For example:
   * 
   *  Status GetInt(int *out) { return GetInt().Value(out); } */
  

  /** Move and return the internally stored value or alternative if an error is stored. */
  

  /** Retrieve the value if ok(), falling back to an alternative generated by the provided
   *  factory */
  

  /** Apply a function to the internally stored value to produce a new result or propagate
   *  the stored error. */
  

  /** Apply a function to the internally stored value to produce a new result or propagate
   *  the stored error. */

  /** Cast the internally stored value to produce a new result or propagate the stored
   *  error. */
  

  /** Cast the internally stored value to produce a new result or propagate the stored
   *  error. */

  public native @SharedPtr @ByRef Dataset ValueUnsafe();

  

  public native @SharedPtr @ByVal Dataset MoveValueUnsafe();
}
