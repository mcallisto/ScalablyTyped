package typings
package reactDashEasyDashChartLib.reactDashEasyDashChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaChartProps extends LineChartProps {
  /** Make the gradient area a solid fill rather than a gradient */
  var noAreaGradient: js.UndefOr[scala.Boolean] = js.undefined
}

object AreaChartProps {
  @scala.inline
  def apply(
    data: js.Array[js.Array[LineData]],
    axes: js.UndefOr[scala.Boolean] = js.undefined,
    axisLabels: reactDashEasyDashChartLib.Anon_XY = null,
    clickHandler: (/* data */ LineData, /* mouseEvent */ stdLib.MouseEvent) => _ = null,
    dataPoints: js.UndefOr[scala.Boolean] = js.undefined,
    grid: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    interpolate: reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.linear | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.`linear-closed` | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.step | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.`step-before` | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.`step-after` | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.basis | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.`basis-open` | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.`basis-closed` | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.bundle | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.cardinal | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.`cardinal-open` | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.`cardinal-closed` | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.monotone = null,
    lineColors: js.Array[java.lang.String] = null,
    margin: reactDashEasyDashChartLib.Anon_Bottom = null,
    mouseMoveHandler: (/* data */ LineData, /* mouseEvent */ stdLib.MouseEvent) => _ = null,
    mouseOutHandler: (/* data */ LineData, /* mouseEvent */ stdLib.MouseEvent) => _ = null,
    mouseOverHandler: (/* data */ LineData, /* mouseEvent */ stdLib.MouseEvent) => _ = null,
    noAreaGradient: js.UndefOr[scala.Boolean] = js.undefined,
    tickTimeDisplayFormat: java.lang.String = null,
    verticalGrid: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    xDomainRange: js.Array[stdLib.Date | scala.Double | java.lang.String] = null,
    xTicks: scala.Int | scala.Double = null,
    xType: reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.time | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.text | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.linear = null,
    yAxisOrientRight: js.UndefOr[scala.Boolean] = js.undefined,
    yDomainRange: js.Array[scala.Double | java.lang.String] = null,
    yTicks: scala.Int | scala.Double = null,
    yType: reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.time | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.text | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.linear = null
  ): AreaChartProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes)
    if (axisLabels != null) __obj.updateDynamic("axisLabels")(axisLabels)
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction2(clickHandler))
    if (!js.isUndefined(dataPoints)) __obj.updateDynamic("dataPoints")(dataPoints)
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (lineColors != null) __obj.updateDynamic("lineColors")(lineColors)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (mouseMoveHandler != null) __obj.updateDynamic("mouseMoveHandler")(js.Any.fromFunction2(mouseMoveHandler))
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(js.Any.fromFunction2(mouseOutHandler))
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(js.Any.fromFunction2(mouseOverHandler))
    if (!js.isUndefined(noAreaGradient)) __obj.updateDynamic("noAreaGradient")(noAreaGradient)
    if (tickTimeDisplayFormat != null) __obj.updateDynamic("tickTimeDisplayFormat")(tickTimeDisplayFormat)
    if (!js.isUndefined(verticalGrid)) __obj.updateDynamic("verticalGrid")(verticalGrid)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xDomainRange != null) __obj.updateDynamic("xDomainRange")(xDomainRange)
    if (xTicks != null) __obj.updateDynamic("xTicks")(xTicks.asInstanceOf[js.Any])
    if (xType != null) __obj.updateDynamic("xType")(xType.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisOrientRight)) __obj.updateDynamic("yAxisOrientRight")(yAxisOrientRight)
    if (yDomainRange != null) __obj.updateDynamic("yDomainRange")(yDomainRange)
    if (yTicks != null) __obj.updateDynamic("yTicks")(yTicks.asInstanceOf[js.Any])
    if (yType != null) __obj.updateDynamic("yType")(yType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaChartProps]
  }
}

