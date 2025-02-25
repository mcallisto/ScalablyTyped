package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipSettingsAnimation extends js.Object {
  /** Defines the animation effect for the tooltip that should be shown when the mouse hovers over rows/columns.
    * @Default {none}
    */
  var effect: js.UndefOr[Effect | java.lang.String] = js.undefined
  /** Defines the animation speed for the tooltip that should be shown when the mouse hovers over rows/columns.
    * @Default {0}
    */
  var speed: js.UndefOr[scala.Double] = js.undefined
}

object TooltipSettingsAnimation {
  @scala.inline
  def apply(effect: Effect | java.lang.String = null, speed: scala.Int | scala.Double = null): TooltipSettingsAnimation = {
    val __obj = js.Dynamic.literal()
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipSettingsAnimation]
  }
}

