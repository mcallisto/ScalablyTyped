package typings
package atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatInitializerUnderscoreConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VarianceScalingConfig extends js.Object {
  var distribution: js.UndefOr[DistributionSerialization] = js.undefined
  var mode: js.UndefOr[FanModeSerialization] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var seed: js.UndefOr[scala.Double] = js.undefined
}

object VarianceScalingConfig {
  @scala.inline
  def apply(
    distribution: DistributionSerialization = null,
    mode: FanModeSerialization = null,
    scale: scala.Int | scala.Double = null,
    seed: scala.Int | scala.Double = null
  ): VarianceScalingConfig = {
    val __obj = js.Dynamic.literal()
    if (distribution != null) __obj.updateDynamic("distribution")(distribution)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[VarianceScalingConfig]
  }
}

