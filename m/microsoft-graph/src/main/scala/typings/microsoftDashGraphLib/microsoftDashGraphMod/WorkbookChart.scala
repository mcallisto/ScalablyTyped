package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChart extends Entity {
  /** Represents chart axes. Read-only. */
  var axes: js.UndefOr[WorkbookChartAxes] = js.undefined
  /** Represents the datalabels on the chart. Read-only. */
  var dataLabels: js.UndefOr[WorkbookChartDataLabels] = js.undefined
  /** Encapsulates the format properties for the chart area. Read-only. */
  var format: js.UndefOr[WorkbookChartAreaFormat] = js.undefined
  /** Represents the height, in points, of the chart object. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The distance, in points, from the left side of the chart to the worksheet origin. */
  var left: js.UndefOr[scala.Double] = js.undefined
  /** Represents the legend for the chart. Read-only. */
  var legend: js.UndefOr[WorkbookChartLegend] = js.undefined
  /** Represents the name of a chart object. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Represents either a single series or collection of series in the chart. Read-only. */
  var series: js.UndefOr[js.Array[WorkbookChartSeries]] = js.undefined
  /** Represents the title of the specified chart, including the text, visibility, position and formating of the title. Read-only. */
  var title: js.UndefOr[WorkbookChartTitle] = js.undefined
  /** Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart). */
  var top: js.UndefOr[scala.Double] = js.undefined
  /** Represents the width, in points, of the chart object. */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** The worksheet containing the current chart. Read-only. */
  var worksheet: js.UndefOr[WorkbookWorksheet] = js.undefined
}

object WorkbookChart {
  @scala.inline
  def apply(
    axes: WorkbookChartAxes = null,
    dataLabels: WorkbookChartDataLabels = null,
    format: WorkbookChartAreaFormat = null,
    height: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    left: scala.Int | scala.Double = null,
    legend: WorkbookChartLegend = null,
    name: java.lang.String = null,
    series: js.Array[WorkbookChartSeries] = null,
    title: WorkbookChartTitle = null,
    top: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    worksheet: WorkbookWorksheet = null
  ): WorkbookChart = {
    val __obj = js.Dynamic.literal()
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (name != null) __obj.updateDynamic("name")(name)
    if (series != null) __obj.updateDynamic("series")(series)
    if (title != null) __obj.updateDynamic("title")(title)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet)
    __obj.asInstanceOf[WorkbookChart]
  }
}

