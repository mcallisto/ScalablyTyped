package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * This object represents the attributes for a chart's error bars.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ChartErrorBarsLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the error bars have an end style cap.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endStyleCap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies the formatting type of the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[ChartErrorBarsFormatLoadOptions] = js.undefined
  /**
    *
    * Specifies which parts of the error bars to include.
    *
    * [Api set: ExcelApi 1.9]
    */
  var include: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The type of range marked by the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the error bars are displayed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartErrorBarsLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    endStyleCap: js.UndefOr[scala.Boolean] = js.undefined,
    format: ChartErrorBarsFormatLoadOptions = null,
    include: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartErrorBarsLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(endStyleCap)) __obj.updateDynamic("endStyleCap")(endStyleCap)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(include)) __obj.updateDynamic("include")(include)
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartErrorBarsLoadOptions]
  }
}

