package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpromise extends js.Object {
  /**
    * Wraps a function that expects a node-style callback as its final
    * argument. This callback expects two arguments: an error value (which will
    * be null if the call succeeded), and the success value as the second
    * argument. The callback will the resolve or reject the returned promise,
    * based on its arguments.
    */
  // tslint:disable-next-line:no-any  Variable args have variable types.
  def checkedNodeCall[T](fn: js.Function, varArgs: js.Any*): js.Promise[T] = js.native
  /**
    * Creates a promise that will be resolved at a set time in the future.
    */
  def delayed(ms: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Calls a function for each element in an array, and if the function returns
    * true adds the element to a new array.
    *
    * If the return value of the filter function is a promise, this function
    * will wait for it to be fulfilled before determining whether to insert the
    * element into the new array.
    *
    * If the filter function throws or returns a rejected promise, the promise
    * returned by this function will be rejected with the same reason. Only the
    * first failure will be reported; all subsequent errors will be silently
    * ignored.
    */
  def filter[T, V](
    arr: js.Array[T],
    fn: js.Function3[/* element */ T, /* index */ scala.Double, /* array */ js.Array[T], V]
  ): js.Promise[js.Array[V]] = js.native
  def filter[T, V](
    arr: js.Array[T],
    fn: js.Function3[/* element */ T, /* index */ scala.Double, /* array */ js.Array[T], V],
    // tslint:disable-next-line:no-any The type of archaic `self` adds no
  // value
  optSelf: js.Any
  ): js.Promise[js.Array[V]] = js.native
  def filter[T, V](
    arr: js.Promise[js.Array[T]],
    fn: js.Function3[/* element */ T, /* index */ scala.Double, /* array */ js.Array[T], V]
  ): js.Promise[js.Array[V]] = js.native
  def filter[T, V](
    arr: js.Promise[js.Array[T]],
    fn: js.Function3[/* element */ T, /* index */ scala.Double, /* array */ js.Array[T], V],
    // tslint:disable-next-line:no-any The type of archaic `self` adds no
  // value
  optSelf: js.Any
  ): js.Promise[js.Array[V]] = js.native
  /**
    * Returns a promise that will be resolved with the input value in a
    * fully-resolved state. If the value is an array, each element will be fully
    * resolved. Likewise, if the value is an object, all keys will be fully
    * resolved. In both cases, all nested arrays and objects will also be
    * fully resolved.  All fields are resolved in place; the returned promise
    * will resolve on {@code value} and not a copy.
    *
    * Warning: This function makes no checks against objects that contain
    * cyclical references:
    *
    *     var value = {};
    *     value['self'] = value;
    *     promise.fullyResolved(value);  // Stack overflow.
    */
  // tslint:disable-next-line:no-any Complex relation between input and output
  def fullyResolved(value: js.Any): js.Promise[_] = js.native
  // region Functions
  /**
    * Determines whether a {@code value} should be treated as a promise.
    * Any object whose 'then' property is a function will be considered a
    * promise.
    */
  def isPromise(value: js.Any): scala.Boolean = js.native
  /**
    * Calls a function for each element in an array and inserts the result into a
    * new array, which is used as the fulfillment value of the promise returned
    * by this function.
    *
    * If the return value of the mapping function is a promise, this function
    * will wait for it to be fulfilled before inserting it into the new array.
    *
    * If the mapping function throws or returns a rejected promise, the
    * promise returned by this function will be rejected with the same reason.
    * Only the first failure will be reported; all subsequent errors will be
    * silently ignored.
    */
  // tslint:disable-next-line:no-any The type of archaic `self` adds no value
  def map[T, V](
    arr: js.Array[T],
    fn: js.Function4[/* self */ js.Any, /* type */ T, /* index */ scala.Double, /* array */ js.Array[T], V]
  ): js.Promise[js.Array[V]] = js.native
  def map[T, V](
    arr: js.Array[T],
    fn: js.Function4[/* self */ js.Any, /* type */ T, /* index */ scala.Double, /* array */ js.Array[T], V],
    optSelf: js.Any
  ): js.Promise[js.Array[V]] = js.native
  def map[T, V](
    arr: js.Promise[js.Array[T]],
    fn: js.Function4[/* self */ js.Any, /* type */ T, /* index */ scala.Double, /* array */ js.Array[T], V]
  ): js.Promise[js.Array[V]] = js.native
  def map[T, V](
    arr: js.Promise[js.Array[T]],
    fn: js.Function4[/* self */ js.Any, /* type */ T, /* index */ scala.Double, /* array */ js.Array[T], V],
    optSelf: js.Any
  ): js.Promise[js.Array[V]] = js.native
  /**
    * Registers a listener to invoke when a promise is resolved, regardless
    * of whether the promise's value was successfully computed. This function
    * is synonymous with the {@code finally} clause in a synchronous API:
    *
    *     // Synchronous API:
    *     try {
    *       doSynchronousWork();
    *     } finally {
    *       cleanUp();
    *     }
    *
    *     // Asynchronous promise API:
    *     doAsynchronousWork().finally(cleanUp);
    *
    * __Note:__ similar to the {@code finally} clause, if the registered
    * callback returns a rejected promise or throws an error, it will silently
    * replace the rejection error (if any) from this promise:
    *
    *     try {
    *       throw Error('one');
    *     } finally {
    *       throw Error('two');  // Hides Error: one
    *     }
    *
    *     let p = Promise.reject(Error('one'));
    *     promise.finally(p, function() {
    *       throw Error('two');  // Hides Error: one
    *     });
    */
  def thenFinally[R](promise: js.Any, callback: js.Function0[R | js.Promise[R]]): js.Promise[R] = js.native
}

