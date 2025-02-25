package typings
package atIonicCoreLib.distTypesUtilsOverlaysDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayEventDetail[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
}

object OverlayEventDetail {
  @scala.inline
  def apply[T](data: T = null, role: java.lang.String = null): OverlayEventDetail[T] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[OverlayEventDetail[T]]
  }
}

