package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartBoxwhiskerOptions.toJSON()". */
trait ChartBoxwhiskerOptionsData extends js.Object {
  /**
    *
    * Returns or sets the quartile calculation type of a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartBoxQuartileCalculation | officeDashJsLib.officeDashJsLibStrings.Inclusive | officeDashJsLib.officeDashJsLibStrings.Exclusive
  ] = js.undefined
  /**
    *
    * Specifies whether or not the inner points are shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showInnerPoints: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the mean line is shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanLine: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the mean marker is shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanMarker: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether or not outlier points are shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showOutlierPoints: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartBoxwhiskerOptionsData {
  @scala.inline
  def apply(
    quartileCalculation: officeDashJsLib.ExcelNs.ChartBoxQuartileCalculation | officeDashJsLib.officeDashJsLibStrings.Inclusive | officeDashJsLib.officeDashJsLibStrings.Exclusive = null,
    showInnerPoints: js.UndefOr[scala.Boolean] = js.undefined,
    showMeanLine: js.UndefOr[scala.Boolean] = js.undefined,
    showMeanMarker: js.UndefOr[scala.Boolean] = js.undefined,
    showOutlierPoints: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartBoxwhiskerOptionsData = {
    val __obj = js.Dynamic.literal()
    if (quartileCalculation != null) __obj.updateDynamic("quartileCalculation")(quartileCalculation.asInstanceOf[js.Any])
    if (!js.isUndefined(showInnerPoints)) __obj.updateDynamic("showInnerPoints")(showInnerPoints)
    if (!js.isUndefined(showMeanLine)) __obj.updateDynamic("showMeanLine")(showMeanLine)
    if (!js.isUndefined(showMeanMarker)) __obj.updateDynamic("showMeanMarker")(showMeanMarker)
    if (!js.isUndefined(showOutlierPoints)) __obj.updateDynamic("showOutlierPoints")(showOutlierPoints)
    __obj.asInstanceOf[ChartBoxwhiskerOptionsData]
  }
}

