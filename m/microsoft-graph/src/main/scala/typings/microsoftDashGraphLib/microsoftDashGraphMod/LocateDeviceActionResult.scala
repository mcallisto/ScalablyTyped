package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocateDeviceActionResult extends DeviceActionResult {
  /** device location */
  var deviceLocation: js.UndefOr[DeviceGeoLocation] = js.undefined
}

object LocateDeviceActionResult {
  @scala.inline
  def apply(
    actionName: java.lang.String = null,
    actionState: ActionState = null,
    deviceLocation: DeviceGeoLocation = null,
    lastUpdatedDateTime: java.lang.String = null,
    startDateTime: java.lang.String = null
  ): LocateDeviceActionResult = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (actionState != null) __obj.updateDynamic("actionState")(actionState)
    if (deviceLocation != null) __obj.updateDynamic("deviceLocation")(deviceLocation)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime)
    __obj.asInstanceOf[LocateDeviceActionResult]
  }
}

