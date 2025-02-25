package typings
package gotLib.gotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GotFn extends js.Object {
  def apply(url: GotUrl): GotPromise[java.lang.String] = js.native
  def apply(url: GotUrl, options: GotBodyOptions[scala.Null | java.lang.String]): GotPromise[java.lang.String] = js.native
  def apply(url: GotUrl, options: GotFormOptions[scala.Null | java.lang.String]): GotPromise[java.lang.String] = js.native
  def apply(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
}

