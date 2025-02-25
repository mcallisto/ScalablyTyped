package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShuffleOptions extends DeviceOptions {
  var state: js.UndefOr[scala.Boolean] = js.undefined
}

object ShuffleOptions {
  @scala.inline
  def apply(device_id: java.lang.String = null, state: js.UndefOr[scala.Boolean] = js.undefined): ShuffleOptions = {
    val __obj = js.Dynamic.literal()
    if (device_id != null) __obj.updateDynamic("device_id")(device_id)
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ShuffleOptions]
  }
}

