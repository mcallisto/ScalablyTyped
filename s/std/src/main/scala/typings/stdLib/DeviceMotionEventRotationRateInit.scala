package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMotionEventRotationRateInit extends js.Object {
  var alpha: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var beta: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var gamma: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object DeviceMotionEventRotationRateInit {
  @scala.inline
  def apply(
    alpha: scala.Int | scala.Double = null,
    beta: scala.Int | scala.Double = null,
    gamma: scala.Int | scala.Double = null
  ): DeviceMotionEventRotationRateInit = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (beta != null) __obj.updateDynamic("beta")(beta.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMotionEventRotationRateInit]
  }
}

