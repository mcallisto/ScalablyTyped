package typings
package throttleitLib.throttleitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("throttleit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Returns a new function that, when invoked, invokes `func` at most once per `wait` milliseconds.
    *
    * @param func Function to wrap.
    * @param wait Number of milliseconds that must elapse between `func` invocations.
    * @return A new function that wraps the `func` function passed in.
    */
  def apply[GFunction /* <: AnyFunction */](fn: GFunction, wait: scala.Double): GFunction = js.native
}

