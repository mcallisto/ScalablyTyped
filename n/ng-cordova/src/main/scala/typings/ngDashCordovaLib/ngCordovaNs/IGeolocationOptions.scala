package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeolocationOptions extends js.Object {
  var enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined
  var maximumAge: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object IGeolocationOptions {
  @scala.inline
  def apply(
    enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined,
    maximumAge: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): IGeolocationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy)
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeolocationOptions]
  }
}

