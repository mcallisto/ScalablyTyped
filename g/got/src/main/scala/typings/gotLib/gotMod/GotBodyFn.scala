package typings
package gotLib.gotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GotBodyFn[T /* <: java.lang.String | scala.Null */] extends js.Object {
  def apply(url: GotUrl): GotPromise[java.lang.String | nodeLib.Buffer] = js.native
  def apply(url: GotUrl, options: GotBodyOptions[T]): GotPromise[java.lang.String | nodeLib.Buffer] = js.native
}

