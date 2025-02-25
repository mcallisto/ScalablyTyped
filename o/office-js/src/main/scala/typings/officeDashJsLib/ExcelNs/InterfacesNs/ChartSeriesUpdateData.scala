package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartSeries object, for use in "chartSeries.set({ ... })". */
trait ChartSeriesUpdateData extends js.Object {
  /**
    *
    * Returns or sets the group for the specified series. Read/Write
    *
    * [Api set: ExcelApi 1.8]
    */
  var axisGroup: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisGroup | officeDashJsLib.officeDashJsLibStrings.Primary | officeDashJsLib.officeDashJsLibStrings.Secondary
  ] = js.undefined
  /**
    *
    * Encapsulates the bin options for histogram charts and pareto charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var binOptions: js.UndefOr[ChartBinOptionsUpdateData] = js.undefined
  /**
    *
    * Encapsulates the options for the box and whisker charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var boxwhiskerOptions: js.UndefOr[ChartBoxwhiskerOptionsUpdateData] = js.undefined
  /**
    *
    * This can be an integer value from 0 (zero) to 300, representing the percentage of the default size. This property only applies to bubble charts. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bubbleScale: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the chart type of a series. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 84 */ js.Any
  ] = js.undefined
  /**
    *
    * Represents a collection of all dataLabels in the series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsUpdateData] = js.undefined
  /**
    *
    * Represents the doughnut hole size of a chart series.  Only valid on doughnut and doughnutExploded charts.
    Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var doughnutHoleSize: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the explosion value for a pie-chart or doughnut-chart slice. Returns 0 (zero) if there's no explosion (the tip of the slice is in the center of the pie). Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var explosion: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Boolean value representing if the series is filtered or not. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var filtered: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts. Can be a value from 0 through 360. Read/Write
    *
    * [Api set: ExcelApi 1.8]
    */
  var firstSliceAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the formatting of a chart series, which includes fill and line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartSeriesFormatUpdateData] = js.undefined
  /**
    *
    * Represents the gap width of a chart series.  Only valid on bar and column charts, as well as
    specific classes of line and pie charts.  Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var gapWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the color for maximum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns or sets the type for maximum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumType: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartGradientStyleType | officeDashJsLib.officeDashJsLibStrings.ExtremeValue | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Percent
  ] = js.undefined
  /**
    *
    * Returns or sets the maximum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumValue: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the color for midpoint value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns or sets the type for midpoint value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointType: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartGradientStyleType | officeDashJsLib.officeDashJsLibStrings.ExtremeValue | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Percent
  ] = js.undefined
  /**
    *
    * Returns or sets the midpoint value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointValue: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the color for minimum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns or sets the type for minimum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumType: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartGradientStyleType | officeDashJsLib.officeDashJsLibStrings.ExtremeValue | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Percent
  ] = js.undefined
  /**
    *
    * Returns or sets the minimum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumValue: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets series gradient style of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientStyle: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartGradientStyle | officeDashJsLib.officeDashJsLibStrings.TwoPhaseColor | officeDashJsLib.officeDashJsLibStrings.ThreePhaseColor
  ] = js.undefined
  /**
    *
    * Boolean value representing if the series has data labels or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabels: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the fill color for negative data points in a series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var invertColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * True if Microsoft Excel inverts the pattern in the item when it corresponds to a negative number. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var invertIfNegative: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Encapsulates the options for a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var mapOptions: js.UndefOr[ChartMapOptionsUpdateData] = js.undefined
  /**
    *
    * Represents markers background color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents markers foreground color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents marker size of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents marker style of a chart series. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartMarkerStyle | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Square | officeDashJsLib.officeDashJsLibStrings.Diamond | officeDashJsLib.officeDashJsLibStrings.Triangle | officeDashJsLib.officeDashJsLibStrings.X | officeDashJsLib.officeDashJsLibStrings.Star | officeDashJsLib.officeDashJsLibStrings.Dot | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.Circle | officeDashJsLib.officeDashJsLibStrings.Plus | officeDashJsLib.officeDashJsLibStrings.Picture
  ] = js.undefined
  /**
    *
    * Represents the name of a series in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Specifies how bars and columns are positioned. Can be a value between –100 and 100. Applies only to 2-D bar and 2-D column charts. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var overlap: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the series parent label strategy area for a treemap chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var parentLabelStrategy: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartParentLabelStrategy | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Banner | officeDashJsLib.officeDashJsLibStrings.Overlapping
  ] = js.undefined
  /**
    *
    * Represents the plot order of a chart series within the chart group.
    *
    * [Api set: ExcelApi 1.7]
    */
  var plotOrder: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the size of the secondary section of either a pie of pie chart or a bar of pie chart, as a percentage of the size of the primary pie. Can be a value from 5 to 200. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var secondPlotSize: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Specifies whether or not connector lines are shown in waterfall charts. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showConnectorLines: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether or not leader lines are displayed for each data label in the series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showLeaderLines: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the series has a shadow or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the series is smooth or not. Only applicable to line and scatter charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var smooth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the way the two sections of either a pie of pie chart or a bar of pie chart are split. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var splitType: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartSplitType | officeDashJsLib.officeDashJsLibStrings.SplitByPosition | officeDashJsLib.officeDashJsLibStrings.SplitByValue | officeDashJsLib.officeDashJsLibStrings.SplitByPercentValue | officeDashJsLib.officeDashJsLibStrings.SplitByCustomSplit
  ] = js.undefined
  /**
    *
    * Returns or sets the threshold value that separates two sections of either a pie-of-pie chart or a bar-of-pie chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var splitValue: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * True if Microsoft Excel assigns a different color or pattern to each data marker. The chart must contain only one series. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var varyByCategories: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the error bar object of a chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var xErrorBars: js.UndefOr[ChartErrorBarsUpdateData] = js.undefined
  /**
    *
    * Represents the error bar object of a chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var yErrorBars: js.UndefOr[ChartErrorBarsUpdateData] = js.undefined
}

object ChartSeriesUpdateData {
  @scala.inline
  def apply(
    axisGroup: officeDashJsLib.ExcelNs.ChartAxisGroup | officeDashJsLib.officeDashJsLibStrings.Primary | officeDashJsLib.officeDashJsLibStrings.Secondary = null,
    binOptions: ChartBinOptionsUpdateData = null,
    boxwhiskerOptions: ChartBoxwhiskerOptionsUpdateData = null,
    bubbleScale: scala.Int | scala.Double = null,
    chartType: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 84 */ js.Any = null,
    dataLabels: ChartDataLabelsUpdateData = null,
    doughnutHoleSize: scala.Int | scala.Double = null,
    explosion: scala.Int | scala.Double = null,
    filtered: js.UndefOr[scala.Boolean] = js.undefined,
    firstSliceAngle: scala.Int | scala.Double = null,
    format: ChartSeriesFormatUpdateData = null,
    gapWidth: scala.Int | scala.Double = null,
    gradientMaximumColor: java.lang.String = null,
    gradientMaximumType: officeDashJsLib.ExcelNs.ChartGradientStyleType | officeDashJsLib.officeDashJsLibStrings.ExtremeValue | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Percent = null,
    gradientMaximumValue: scala.Int | scala.Double = null,
    gradientMidpointColor: java.lang.String = null,
    gradientMidpointType: officeDashJsLib.ExcelNs.ChartGradientStyleType | officeDashJsLib.officeDashJsLibStrings.ExtremeValue | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Percent = null,
    gradientMidpointValue: scala.Int | scala.Double = null,
    gradientMinimumColor: java.lang.String = null,
    gradientMinimumType: officeDashJsLib.ExcelNs.ChartGradientStyleType | officeDashJsLib.officeDashJsLibStrings.ExtremeValue | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Percent = null,
    gradientMinimumValue: scala.Int | scala.Double = null,
    gradientStyle: officeDashJsLib.ExcelNs.ChartGradientStyle | officeDashJsLib.officeDashJsLibStrings.TwoPhaseColor | officeDashJsLib.officeDashJsLibStrings.ThreePhaseColor = null,
    hasDataLabels: js.UndefOr[scala.Boolean] = js.undefined,
    invertColor: java.lang.String = null,
    invertIfNegative: js.UndefOr[scala.Boolean] = js.undefined,
    mapOptions: ChartMapOptionsUpdateData = null,
    markerBackgroundColor: java.lang.String = null,
    markerForegroundColor: java.lang.String = null,
    markerSize: scala.Int | scala.Double = null,
    markerStyle: officeDashJsLib.ExcelNs.ChartMarkerStyle | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Square | officeDashJsLib.officeDashJsLibStrings.Diamond | officeDashJsLib.officeDashJsLibStrings.Triangle | officeDashJsLib.officeDashJsLibStrings.X | officeDashJsLib.officeDashJsLibStrings.Star | officeDashJsLib.officeDashJsLibStrings.Dot | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.Circle | officeDashJsLib.officeDashJsLibStrings.Plus | officeDashJsLib.officeDashJsLibStrings.Picture = null,
    name: java.lang.String = null,
    overlap: scala.Int | scala.Double = null,
    parentLabelStrategy: officeDashJsLib.ExcelNs.ChartParentLabelStrategy | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Banner | officeDashJsLib.officeDashJsLibStrings.Overlapping = null,
    plotOrder: scala.Int | scala.Double = null,
    secondPlotSize: scala.Int | scala.Double = null,
    showConnectorLines: js.UndefOr[scala.Boolean] = js.undefined,
    showLeaderLines: js.UndefOr[scala.Boolean] = js.undefined,
    showShadow: js.UndefOr[scala.Boolean] = js.undefined,
    smooth: js.UndefOr[scala.Boolean] = js.undefined,
    splitType: officeDashJsLib.ExcelNs.ChartSplitType | officeDashJsLib.officeDashJsLibStrings.SplitByPosition | officeDashJsLib.officeDashJsLibStrings.SplitByValue | officeDashJsLib.officeDashJsLibStrings.SplitByPercentValue | officeDashJsLib.officeDashJsLibStrings.SplitByCustomSplit = null,
    splitValue: scala.Int | scala.Double = null,
    varyByCategories: js.UndefOr[scala.Boolean] = js.undefined,
    xErrorBars: ChartErrorBarsUpdateData = null,
    yErrorBars: ChartErrorBarsUpdateData = null
  ): ChartSeriesUpdateData = {
    val __obj = js.Dynamic.literal()
    if (axisGroup != null) __obj.updateDynamic("axisGroup")(axisGroup.asInstanceOf[js.Any])
    if (binOptions != null) __obj.updateDynamic("binOptions")(binOptions)
    if (boxwhiskerOptions != null) __obj.updateDynamic("boxwhiskerOptions")(boxwhiskerOptions)
    if (bubbleScale != null) __obj.updateDynamic("bubbleScale")(bubbleScale.asInstanceOf[js.Any])
    if (chartType != null) __obj.updateDynamic("chartType")(chartType)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (doughnutHoleSize != null) __obj.updateDynamic("doughnutHoleSize")(doughnutHoleSize.asInstanceOf[js.Any])
    if (explosion != null) __obj.updateDynamic("explosion")(explosion.asInstanceOf[js.Any])
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered)
    if (firstSliceAngle != null) __obj.updateDynamic("firstSliceAngle")(firstSliceAngle.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (gapWidth != null) __obj.updateDynamic("gapWidth")(gapWidth.asInstanceOf[js.Any])
    if (gradientMaximumColor != null) __obj.updateDynamic("gradientMaximumColor")(gradientMaximumColor)
    if (gradientMaximumType != null) __obj.updateDynamic("gradientMaximumType")(gradientMaximumType.asInstanceOf[js.Any])
    if (gradientMaximumValue != null) __obj.updateDynamic("gradientMaximumValue")(gradientMaximumValue.asInstanceOf[js.Any])
    if (gradientMidpointColor != null) __obj.updateDynamic("gradientMidpointColor")(gradientMidpointColor)
    if (gradientMidpointType != null) __obj.updateDynamic("gradientMidpointType")(gradientMidpointType.asInstanceOf[js.Any])
    if (gradientMidpointValue != null) __obj.updateDynamic("gradientMidpointValue")(gradientMidpointValue.asInstanceOf[js.Any])
    if (gradientMinimumColor != null) __obj.updateDynamic("gradientMinimumColor")(gradientMinimumColor)
    if (gradientMinimumType != null) __obj.updateDynamic("gradientMinimumType")(gradientMinimumType.asInstanceOf[js.Any])
    if (gradientMinimumValue != null) __obj.updateDynamic("gradientMinimumValue")(gradientMinimumValue.asInstanceOf[js.Any])
    if (gradientStyle != null) __obj.updateDynamic("gradientStyle")(gradientStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDataLabels)) __obj.updateDynamic("hasDataLabels")(hasDataLabels)
    if (invertColor != null) __obj.updateDynamic("invertColor")(invertColor)
    if (!js.isUndefined(invertIfNegative)) __obj.updateDynamic("invertIfNegative")(invertIfNegative)
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions)
    if (markerBackgroundColor != null) __obj.updateDynamic("markerBackgroundColor")(markerBackgroundColor)
    if (markerForegroundColor != null) __obj.updateDynamic("markerForegroundColor")(markerForegroundColor)
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (overlap != null) __obj.updateDynamic("overlap")(overlap.asInstanceOf[js.Any])
    if (parentLabelStrategy != null) __obj.updateDynamic("parentLabelStrategy")(parentLabelStrategy.asInstanceOf[js.Any])
    if (plotOrder != null) __obj.updateDynamic("plotOrder")(plotOrder.asInstanceOf[js.Any])
    if (secondPlotSize != null) __obj.updateDynamic("secondPlotSize")(secondPlotSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showConnectorLines)) __obj.updateDynamic("showConnectorLines")(showConnectorLines)
    if (!js.isUndefined(showLeaderLines)) __obj.updateDynamic("showLeaderLines")(showLeaderLines)
    if (!js.isUndefined(showShadow)) __obj.updateDynamic("showShadow")(showShadow)
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth)
    if (splitType != null) __obj.updateDynamic("splitType")(splitType.asInstanceOf[js.Any])
    if (splitValue != null) __obj.updateDynamic("splitValue")(splitValue.asInstanceOf[js.Any])
    if (!js.isUndefined(varyByCategories)) __obj.updateDynamic("varyByCategories")(varyByCategories)
    if (xErrorBars != null) __obj.updateDynamic("xErrorBars")(xErrorBars)
    if (yErrorBars != null) __obj.updateDynamic("yErrorBars")(yErrorBars)
    __obj.asInstanceOf[ChartSeriesUpdateData]
  }
}

