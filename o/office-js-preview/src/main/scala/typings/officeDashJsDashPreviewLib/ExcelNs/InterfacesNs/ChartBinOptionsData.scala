package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartBinOptions.toJSON()". */
trait ChartBinOptionsData extends js.Object {
  /**
    *
    * Specifies whether or not the bin overflow is enabled in a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowOverflow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the bin underflow is enabled in a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowUnderflow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the bin count of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the bin overflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var overflowValue: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the bin's type for a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartBinType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Category | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Auto | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BinWidth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BinCount
  ] = js.undefined
  /**
    *
    * Returns or sets the bin underflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underflowValue: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the bin width value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ChartBinOptionsData {
  @scala.inline
  def apply(
    allowOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    allowUnderflow: js.UndefOr[scala.Boolean] = js.undefined,
    count: scala.Int | scala.Double = null,
    overflowValue: scala.Int | scala.Double = null,
    `type`: officeDashJsDashPreviewLib.ExcelNs.ChartBinType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Category | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Auto | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BinWidth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BinCount = null,
    underflowValue: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): ChartBinOptionsData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowOverflow)) __obj.updateDynamic("allowOverflow")(allowOverflow)
    if (!js.isUndefined(allowUnderflow)) __obj.updateDynamic("allowUnderflow")(allowUnderflow)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (overflowValue != null) __obj.updateDynamic("overflowValue")(overflowValue.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underflowValue != null) __obj.updateDynamic("underflowValue")(underflowValue.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBinOptionsData]
  }
}

