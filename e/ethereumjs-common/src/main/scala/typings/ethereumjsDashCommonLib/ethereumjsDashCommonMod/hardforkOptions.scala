package typings
package ethereumjsDashCommonLib.ethereumjsDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hardforkOptions extends js.Object {
  /** optional, only active HFs (default: false) */
  var onlyActive: js.UndefOr[scala.Boolean] = js.undefined
  /** optional, only allow supported HFs (default: false) */
  var onlySupported: js.UndefOr[scala.Boolean] = js.undefined
}

object hardforkOptions {
  @scala.inline
  def apply(
    onlyActive: js.UndefOr[scala.Boolean] = js.undefined,
    onlySupported: js.UndefOr[scala.Boolean] = js.undefined
  ): hardforkOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onlyActive)) __obj.updateDynamic("onlyActive")(onlyActive)
    if (!js.isUndefined(onlySupported)) __obj.updateDynamic("onlySupported")(onlySupported)
    __obj.asInstanceOf[hardforkOptions]
  }
}

