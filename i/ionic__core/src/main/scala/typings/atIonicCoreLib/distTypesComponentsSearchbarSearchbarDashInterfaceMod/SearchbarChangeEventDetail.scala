package typings
package atIonicCoreLib.distTypesComponentsSearchbarSearchbarDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchbarChangeEventDetail extends js.Object {
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object SearchbarChangeEventDetail {
  @scala.inline
  def apply(value: java.lang.String = null): SearchbarChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SearchbarChangeEventDetail]
  }
}

