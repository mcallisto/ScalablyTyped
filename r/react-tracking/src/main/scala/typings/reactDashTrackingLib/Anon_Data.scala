package typings
package reactDashTrackingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.UndefOr[js.Object] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Object = null): Anon_Data = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Anon_Data]
  }
}

