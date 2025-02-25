package typings
package pgDashMinifyLib.pgDashMinifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait minifyOptions extends js.Object {
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var removeAll: js.UndefOr[scala.Boolean] = js.undefined
}

object minifyOptions {
  @scala.inline
  def apply(
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    removeAll: js.UndefOr[scala.Boolean] = js.undefined
  ): minifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (!js.isUndefined(removeAll)) __obj.updateDynamic("removeAll")(removeAll)
    __obj.asInstanceOf[minifyOptions]
  }
}

