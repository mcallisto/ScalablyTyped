package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartDataLabelFormat extends Entity {
  /** Represents the fill format of the current chart data label. Read-only. */
  var fill: js.UndefOr[WorkbookChartFill] = js.undefined
  /** Represents the font attributes (font name, font size, color, etc.) for a chart data label. Read-only. */
  var font: js.UndefOr[WorkbookChartFont] = js.undefined
}

object WorkbookChartDataLabelFormat {
  @scala.inline
  def apply(fill: WorkbookChartFill = null, font: WorkbookChartFont = null, id: java.lang.String = null): WorkbookChartDataLabelFormat = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[WorkbookChartDataLabelFormat]
  }
}

