package typings
package atMaterialDashUiCoreLib.stylesShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/shape.Shape> */
trait ShapeOptions extends js.Object {
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
}

object ShapeOptions {
  @scala.inline
  def apply(borderRadius: scala.Int | scala.Double = null): ShapeOptions = {
    val __obj = js.Dynamic.literal()
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeOptions]
  }
}

