package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicatorsUpperLine extends js.Object {
  /** Fill color of the upper line in indicators
    * @Default {#ff9933}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Width of the upper line in indicators.
    * @Default {2}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object IndicatorsUpperLine {
  @scala.inline
  def apply(fill: java.lang.String = null, width: scala.Int | scala.Double = null): IndicatorsUpperLine = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicatorsUpperLine]
  }
}

