package typings
package routeDashRecognizerLib.distRouteDashRecognizerDslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteRecognizer extends js.Object {
  var delegate: js.UndefOr[Delegate] = js.undefined
  def add(routes: js.Array[Route]): scala.Unit
}

object RouteRecognizer {
  @scala.inline
  def apply(add: js.Array[Route] => scala.Unit, delegate: Delegate = null): RouteRecognizer = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
    if (delegate != null) __obj.updateDynamic("delegate")(delegate)
    __obj.asInstanceOf[RouteRecognizer]
  }
}

