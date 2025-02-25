package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartAxisTitleFormat extends Entity {
  /** Represents the font attributes, such as font name, font size, color, etc. of chart axis title object. Read-only. */
  var font: js.UndefOr[WorkbookChartFont] = js.undefined
}

object WorkbookChartAxisTitleFormat {
  @scala.inline
  def apply(font: WorkbookChartFont = null, id: java.lang.String = null): WorkbookChartAxisTitleFormat = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[WorkbookChartAxisTitleFormat]
  }
}

