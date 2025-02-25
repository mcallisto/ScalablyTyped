package typings
package promDashClientLib.promDashClientMod.SummaryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
  		 * Configurable percentiles, values should never be greater than 1
  		 */
  var percentiles: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Config {
  @scala.inline
  def apply(percentiles: js.Array[scala.Double] = null): Config = {
    val __obj = js.Dynamic.literal()
    if (percentiles != null) __obj.updateDynamic("percentiles")(percentiles)
    __obj.asInstanceOf[Config]
  }
}

