package typings
package highlandLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO export the top-level functions
// TODO figure out curry arguments
// TODO create more overloads for nested data, like streams-of-streams or streams-of-array-of-streams etc
// TODO use externalised Readable/Writable (not node's)
/**
  * Highland: the high-level streams library
  *
  * Highland may be freely distributed under the Apache 2.0 license.
  * https://github.com/caolan/highland
  * Copyright (c) Caolan McMahon
  *
  */
@js.native
trait HighlandStatic extends js.Object {
  /**
  	 * The end of stream marker. This is sent along the data channel of a Stream
  	 * to tell consumers that the Stream has ended. See the following map code for
  	 * an example of detecting the end of a Stream:
  	 *
  	 * @id nil
  	 * @section Streams
  	 * @name _.nil
  	 * @api public
  	 */
  var nil: highlandLib.HighlandNs.Nil = js.native
  /**
  	 * The Stream constructor, accepts an array of values or a generator function
  	 * as an optional argument. This is typically the entry point to the Highland
  	 * APIs, providing a convenient way of chaining calls together.
  	 *
  	 * **Arrays -** Streams created from Arrays will emit each value of the Array
  	 * and then emit a [nil](#nil) value to signal the end of the Stream.
  	 *
  	 * **Generators -** These are functions which provide values for the Stream.
  	 * They are lazy and can be infinite, they can also be asynchronous (for
  	 * example, making a HTTP request). You emit values on the Stream by calling
  	 * `push(err, val)`, much like a standard Node.js callback. You call `next()`
  	 * to signal you've finished processing the current data. If the Stream is
  	 * still being consumed the generator function will then be called again.
  	 *
  	 * You can also redirect a generator Stream by passing a new source Stream
  	 * to read from to next. For example: `next(other_stream)` - then any subsequent
  	 * calls will be made to the new source.
  	 *
  	 * **Node Readable Stream -** Pass in a Node Readable Stream object to wrap
  	 * it with the Highland API. Reading from the resulting Highland Stream will
  	 * begin piping the data from the Node Stream to the Highland Stream.
  	 *
    * A stream constructed in this way relies on Readable#pipe to end the
    * Highland Stream once there is no more data. Not all Readable Streams do this.
    * For example, IncomingMessage will only emit close when the client aborts
    * communications and will not properly call end. In this case, you can provide
    * an optional onFinished function with the signature onFinished(readable, callback)
    * as the second argument.
    *
    * This function will be passed the Readable and a callback that should called
    * when the Readable ends. If the Readable ended from an error, the error should
    * be passed as the first argument to the callback. onFinished should bind to
    * whatever listener is necessary to detect the Readable's completion. If the
    * callback is called multiple times, only the first invocation counts. If the
    * callback is called after the Readable has already ended (e.g., the pipe method
    * already called end), it will be ignored.
    *
  	 * **EventEmitter / jQuery Elements -** Pass in both an event name and an
  	 * event emitter as the two arguments to the constructor and the first
  	 * argument emitted to the event handler will be written to the new Stream.
  	 *
  	 * You can pass a mapping hint as the third argument, which specifies how
  	 * event arguments are pushed into the stream. If no mapping hint is
  	 * provided, only the first value emitted with the event to the will be
  	 * pushed onto the Stream.
  	 *
  	 * If mappingHint is a number, an array of that length will be pushed onto
  	 * the stream, containing exactly that many parameters from the event. If
  	 * it's an array, it's used as keys to map the arguments into an object which
  	 * is pushed to the tream. If it is a function, it's called with the event
  	 * arguments, and the returned value is pushed.
  	 *
  	 * **Promise -** Accepts an ES6 / jQuery style promise and returns a
  	 * Highland Stream which will emit a single value (or an error).
  	 *
  	 * @id _(source)
  	 * @section Streams
  	 * @name _(source)
  	 * @param {Array | Function | Readable Stream | Promise} source - (optional) source to take values from from
  	 * @api public
  	 */
  def apply[R](): highlandLib.HighlandNs.Stream[R] = js.native
  def apply[R](eventName: java.lang.String, xs: nodeLib.NodeJSNs.EventEmitter): highlandLib.HighlandNs.Stream[R] = js.native
  def apply[R](
    eventName: java.lang.String,
    xs: nodeLib.NodeJSNs.EventEmitter,
    mappingHint: highlandLib.HighlandNs.MappingHint
  ): highlandLib.HighlandNs.Stream[R] = js.native
  def apply[R](xs: highlandLib.HighlandNs.Stream[R]): highlandLib.HighlandNs.Stream[R] = js.native
  def apply[R](xs: js.Array[R | highlandLib.HighlandNs.Stream[R]]): highlandLib.HighlandNs.Stream[R] = js.native
  def apply[R](
    xs: js.Function2[
      /* push */ js.Function2[
        /* err */ stdLib.Error | scala.Null, 
        /* x */ js.UndefOr[R | highlandLib.HighlandNs.Nil], 
        scala.Unit
      ], 
      /* next */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): highlandLib.HighlandNs.Stream[R] = js.native
  // moar (promise for everything?)
  def apply[R](xs: js.Thenable[R | highlandLib.HighlandNs.Stream[R]]): highlandLib.HighlandNs.Stream[R] = js.native
  def apply[R](xs: nodeLib.NodeJSNs.ReadableStream): highlandLib.HighlandNs.Stream[R] = js.native
  def apply[R](xs: nodeLib.NodeJSNs.ReadableStream, of: highlandLib.HighlandNs.OnFinished): highlandLib.HighlandNs.Stream[R] = js.native
  def add(a: scala.Double): js.Function1[/* b */ scala.Double, scala.Double] = js.native
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // OPERATORS
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
  	 * Add two values. Can be partially applied.
  	 *
  	 * @id add
  	 * @section Operators
  	 * @name _.add(a, b)
  	 * @api public
  	 */
  def add(a: scala.Double, b: scala.Double): scala.Double = js.native
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // FUNCTIONS
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
  	 * Creates a composite function, which is the application of function1 to
  	 * the results of function2. You can pass an arbitrary number of arguments
  	 * and have them composed. This means you can't partially apply the compose
  	 * function itself.
  	 *
  	 * @id compose
  	 * @name compose(fn1, fn2, ...)
  	 * @section Functions
  	 * @api public
  	 */
  def compose(functions: js.Function*): js.Function = js.native
  /**
  	 * Transforms a function with specific arity (all arguments must be
  	 * defined) in a way that it can be called as a chain of functions until
  	 * the arguments list is saturated.
  	 *
  	 * This function is not itself curryable.
  	 *
  	 * @id curry
  	 * @name curry(fn, [*arguments])
  	 * @section Functions
  	 * @param {Function} fn - the function to curry
  	 * @param args.. - any number of arguments to pre-apply to the function
  	 * @returns Function
  	 * @api public
  	 */
  def curry(fn: js.Function, args: js.Any*): js.Function = js.native
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // OBJECTS
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
  	 * Extends one object with the properties of another. **Note:** The
  	 * arguments are in the reverse order of other libraries such as
  	 * underscore. This is so it follows the convention of other functions in
  	 * this library and so you can more meaningfully partially apply it.
  	 *
  	 * @id extend
  	 * @section Objects
  	 * @name _.extend(a, b)
  	 * @param {Object} a - the properties to extend b with
  	 * @param {Object} b - the original object to extend
  	 * @api public
  	 */
  def extend(extensions: js.Object, target: js.Object): js.Object = js.native
  def extend(target: js.Object): js.Function1[/* extensions */ js.Object, js.Object] = js.native
  /**
  	 * Evaluates the function `fn` with the argument positions swapped. Only
  	 * works with functions that accept two arguments.
  	 *
  	 * @id flip
  	 * @name flip(fn, [x, y])
  	 * @section Functions
  	 * @param {Function} f - function to flip argument application for
  	 * @param x - parameter to apply to the right hand side of f
  	 * @param y - parameter to apply to the left hand side of f
  	 * @api public
  	 */
  def flip(fn: js.Function, args: js.Any*): js.Function = js.native
  def get(prop: java.lang.String): js.Function1[/* obj */ js.Object, js.Object] = js.native
  /**
  	 * Returns a property from an object.
  	 *
  	 * @id get
  	 * @section Objects
  	 * @name _.get(prop, obj)
  	 * @param {String} prop - the property to return
  	 * @param {Object} obj - the object to read properties from
  	 * @api public
  	 */
  def get(prop: java.lang.String, obj: js.Object): java.lang.String = js.native
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  // UTILS
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
  	 * Returns true if `x` is the end of stream marker.
  	 *
  	 * @id isNil
  	 * @section Streams
  	 * @name _.isNil(x)
  	 * @param x - the object to test
  	 * @api public
  	 */
  def isNil[R](x: R): /* is highland.Highland.Nil */ scala.Boolean = js.native
  def isNil[R](x: highlandLib.HighlandNs.Nil): /* is highland.Highland.Nil */ scala.Boolean = js.native
  /**
  	 * Returns true if `x` is a Highland Stream.
  	 *
  	 * @id isStream
  	 * @section Streams
  	 * @name _.isStream(x)
  	 * @param x - the object to test
  	 * @api public
  	 */
  def isStream(x: js.Any): scala.Boolean = js.native
  def isStreamError(x: js.Any): scala.Boolean = js.native
  def isStreamRedirect(x: js.Any): scala.Boolean = js.native
  /**
  	 * Returns keys from an Object as a Stream.
  	 *
  	 * @id keys
  	 * @section Objects
  	 * @name _.keys(obj)
  	 * @param {Object} obj - the object to return keys from
  	 * @api public
  	 */
  def keys(obj: js.Object): highlandLib.HighlandNs.Stream[java.lang.String] = js.native
  /**
  	 * Logs values to the console, a simple wrapper around `console.log` that
  	 * it suitable for passing to other functions by reference without having to
  	 * call `bind`.
  	 *
  	 * @id log
  	 * @section Utils
  	 * @name _.log(args..)
  	 * @api public
  	 */
  def log(x: js.Any, args: js.Any*): scala.Unit = js.native
  /**
  	 * Same as `curry` but with a specific number of arguments. This can be
  	 * useful when functions do not explicitly define all its parameters.
  	 *
  	 * This function is not itself curryable.
  	 *
  	 * @id ncurry
  	 * @name ncurry(n, fn, [args...])
  	 * @section Functions
  	 * @param {Number} n - the number of arguments to wait for before apply fn
  	 * @param {Function} fn - the function to curry
  	 * @param args... - any number of arguments to pre-apply to the function
  	 * @returns Function
  	 * @api public
  	 */
  def ncurry(n: scala.Double, fn: js.Function, args: js.Any*): js.Function = js.native
  /**
  	 * Perform logical negation on a value. If `x` is truthy then returns false,
  	 * otherwise returns true.
  	 *
  	 * @id not
  	 * @section Operators
  	 * @name _.not(x)
  	 * @param x - the value to negate
  	 * @api public
  	 *
  	 * _.not(true)   // => false
  	 * _.not(false)  // => true
  	 */
  def not[R](a: js.Any): scala.Boolean = js.native
  def pairs(obj: js.Array[_]): highlandLib.HighlandNs.Stream[js.Array[_]] = js.native
  /**
  	 * Returns key/value pairs for an Object as a Stream. Reads properties
  	 * lazily, so if you don't read from all keys on an object, not
  	 * all properties will be read from (may have an effect where getters
  	 * are used).
  	 *
  	 * @id pairs
  	 * @section Objects
  	 * @name _.pairs(obj)
  	 * @param {Object} obj - the object to return key/value pairs from
  	 * @api public
  	 */
  def pairs(obj: js.Object): highlandLib.HighlandNs.Stream[js.Array[_]] = js.native
  /**
  	 * Partially applies the function (regardless of whether it has had curry
  	 * called on it). This will always postpone execution until at least the next
  	 * call of the partially applied function.
  	 *
  	 * @id partial
  	 * @name partial(fn, args...)
  	 * @section Functions
  	 * @param {Function} fn - function to partial apply
  	 * @param args... - the arguments to apply to the function
  	 * @api public
  	 */
  def partial(f: js.Function, args: js.Any*): js.Function = js.native
  /**
  	 * The reversed version of compose. Where arguments are in the order of
  	 * application.
  	 *
  	 * @id seq
  	 * @name seq(fn1, fn2, ...)
  	 * @section Functions
  	 * @api public
  	 */
  def seq(functions: js.Function*): js.Function = js.native
  def set(prop: java.lang.String, `val`: js.Any): js.Function1[/* obj */ js.Object, js.Object] = js.native
  /**
  	 * Updates a property on an object, returning the updated object.
  	 *
  	 * @id set
  	 * @section Objects
  	 * @name _.set(prop, value, obj)
  	 * @param {String} prop - the property to return
  	 * @param value - the value to set the property to
  	 * @param {Object} obj - the object to set properties on
  	 * @api public
  	 */
  def set(prop: java.lang.String, `val`: js.Any, obj: js.Object): js.Object = js.native
  /**
  	 * Returns values from an Object as a Stream. Reads properties
  	 * lazily, so if you don't read from all keys on an object, not
  	 * all properties will be read from (may have an effect where getters
  	 * are used).
  	 *
  	 * @id values
  	 * @section Objects
  	 * @name _.values(obj)
  	 * @param {Object} obj - the object to return values from
  	 * @api public
  	 */
  def values(obj: js.Object): highlandLib.HighlandNs.Stream[_] = js.native
  /**
  	 * Wraps a node-style async function which accepts a callback, transforming
  	 * it to a function which accepts the same arguments minus the callback and
  	 * returns a Highland Stream instead. The wrapped function keeps its context,
  	 * so you can safely use it as a method without binding (see the second
  	 * example below).
  	 *
  	 * wrapCallback also accepts an optional mappingHint, which specifies how
  	 * callback arguments are pushed to the stream. This can be used to handle
  	 * non-standard callback protocols that pass back more than one value.
  	 *
  	 * mappingHint can be a function, number, or array. See the documentation on
  	 * EventEmitter Stream Objects for details on the mapping hint. If
  	 * mappingHint is a function, it will be called with all but the first
  	 * argument that is passed to the callback. The first is still assumed to be
  	 * the error argument.
  	 *
  	 * @id wrapCallback
  	 * @section Utils
  	 * @name _.wrapCallback(f)
  	 * @param {Function} f - the node-style function to wrap
  	 * @param {Array | Function | Number} [mappingHint] - how to pass the arguments to the callback
  	 * @api public
  	 */
  def wrapCallback(f: js.Function): js.Function1[/* repeated */ js.Any, highlandLib.HighlandNs.Stream[_]] = js.native
  def wrapCallback(f: js.Function, mappingHint: highlandLib.HighlandNs.MappingHint): js.Function1[/* repeated */ js.Any, highlandLib.HighlandNs.Stream[_]] = js.native
}

