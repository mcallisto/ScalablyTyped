package typings
package atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatInitializerUnderscoreConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomNormalConfig extends js.Object {
  var mean: js.UndefOr[scala.Double] = js.undefined
  var seed: js.UndefOr[scala.Double] = js.undefined
  var stddev: js.UndefOr[scala.Double] = js.undefined
}

object RandomNormalConfig {
  @scala.inline
  def apply(
    mean: scala.Int | scala.Double = null,
    seed: scala.Int | scala.Double = null,
    stddev: scala.Int | scala.Double = null
  ): RandomNormalConfig = {
    val __obj = js.Dynamic.literal()
    if (mean != null) __obj.updateDynamic("mean")(mean.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (stddev != null) __obj.updateDynamic("stddev")(stddev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomNormalConfig]
  }
}

