package typings
package jsgraphLib.jsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsGraphResponse extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var result: js.UndefOr[js.Any] = js.undefined
}

object JsGraphResponse {
  @scala.inline
  def apply(error: js.Any = null, result: js.Any = null): JsGraphResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[JsGraphResponse]
  }
}

