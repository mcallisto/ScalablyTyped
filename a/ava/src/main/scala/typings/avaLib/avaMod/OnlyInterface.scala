package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnlyInterface[Context] extends js.Object {
  /** Declare a test. Only this test and others declared with `.only()` are run. */
  def apply(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. The macro is responsible for generating a unique test title.
  	 * Only this test and others declared with `.only()` are run.
  	 */
  def apply[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. Additional arguments are passed to the macro.
  	 * Only this test and others declared with `.only()` are run.
  	 */
  def apply[T /* <: js.Array[_] */](
    title: java.lang.String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): scala.Unit = js.native
}

