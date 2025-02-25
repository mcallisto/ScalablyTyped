package typings
package twilsockLib.libServicesUpstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: Headers
  var status: twilsockLib.Anon_Code
}

object Result {
  @scala.inline
  def apply(headers: Headers, status: twilsockLib.Anon_Code, body: js.Any = null): Result = {
    val __obj = js.Dynamic.literal(headers = headers, status = status)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[Result]
  }
}

