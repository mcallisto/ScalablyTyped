package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineFill extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var gradient: js.UndefOr[PolylineFillGradient] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object PolylineFill {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    gradient: PolylineFillGradient = null,
    opacity: scala.Int | scala.Double = null
  ): PolylineFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineFill]
  }
}

