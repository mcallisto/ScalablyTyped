package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlwaysInterface[Context] extends js.Object {
  /** Declare a hook that must call `t.end()` when it's done. */
  @JSName("cb")
  var cb_Original: HookCbInterface[Context] = js.native
  @JSName("skip")
  var skip_Original: HookSkipInterface[Context] = js.native
  /** Declare a hook that is run once, after all tests are done. */
  def apply(implementation: Implementation[Context]): scala.Unit = js.native
  /** Declare a hook that is run once, after all tests are done. */
  def apply(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /** Declare a hook that is run once, after all tests are done. */
  def apply[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Declare a hook that is run once, after all tests are done. Additional arguments are passed to the macro. */
  def apply[T /* <: js.Array[_] */](
    title: java.lang.String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Declare a hook that must call `t.end()` when it's done. */
  /** Declare a hook that must call `t.end()` when it's done. */
  def cb(implementation: CbImplementation[Context]): scala.Unit = js.native
  /** Declare a hook that must call `t.end()` when it's done. */
  /** Declare a hook that must call `t.end()` when it's done. */
  def cb(title: java.lang.String, implementation: CbImplementation[Context]): scala.Unit = js.native
  /**
  	 * Declare a hook that uses one or more macros. The macros must call `t.end()` when they're done.
  	 */
  /** Declare a hook that must call `t.end()` when it's done. */
  def cb[T /* <: js.Array[_] */](
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /**
  	 * Declare a hook that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro.
  	 */
  /** Declare a hook that must call `t.end()` when it's done. */
  def cb[T /* <: js.Array[_] */](
    title: java.lang.String,
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Skip this hook. */
  def skip(implementation: Implementation[Context]): scala.Unit = js.native
  /** Skip this hook. */
  def skip(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /** Skip this hook. */
  def skip[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /** Skip this hook. */
  def skip[T /* <: js.Array[_] */](
    title: java.lang.String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
}

