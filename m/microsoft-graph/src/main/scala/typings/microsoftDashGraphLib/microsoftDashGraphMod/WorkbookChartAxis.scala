package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartAxis extends Entity {
  /** Represents the formatting of a chart object, which includes line and font formatting. Read-only. */
  var format: js.UndefOr[WorkbookChartAxisFormat] = js.undefined
  /** Returns a gridlines object that represents the major gridlines for the specified axis. Read-only. */
  var majorGridlines: js.UndefOr[WorkbookChartGridlines] = js.undefined
  /** Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number. */
  var majorUnit: js.UndefOr[js.Any] = js.undefined
  /** Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number. */
  var maximum: js.UndefOr[js.Any] = js.undefined
  /** Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number. */
  var minimum: js.UndefOr[js.Any] = js.undefined
  /** Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only. */
  var minorGridlines: js.UndefOr[WorkbookChartGridlines] = js.undefined
  /** Represents the interval between two minor tick marks. 'Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number. */
  var minorUnit: js.UndefOr[js.Any] = js.undefined
  /** Represents the axis title. Read-only. */
  var title: js.UndefOr[WorkbookChartAxisTitle] = js.undefined
}

object WorkbookChartAxis {
  @scala.inline
  def apply(
    format: WorkbookChartAxisFormat = null,
    id: java.lang.String = null,
    majorGridlines: WorkbookChartGridlines = null,
    majorUnit: js.Any = null,
    maximum: js.Any = null,
    minimum: js.Any = null,
    minorGridlines: WorkbookChartGridlines = null,
    minorUnit: js.Any = null,
    title: WorkbookChartAxisTitle = null
  ): WorkbookChartAxis = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (majorGridlines != null) __obj.updateDynamic("majorGridlines")(majorGridlines)
    if (majorUnit != null) __obj.updateDynamic("majorUnit")(majorUnit)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum)
    if (minimum != null) __obj.updateDynamic("minimum")(minimum)
    if (minorGridlines != null) __obj.updateDynamic("minorGridlines")(minorGridlines)
    if (minorUnit != null) __obj.updateDynamic("minorUnit")(minorUnit)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[WorkbookChartAxis]
  }
}

