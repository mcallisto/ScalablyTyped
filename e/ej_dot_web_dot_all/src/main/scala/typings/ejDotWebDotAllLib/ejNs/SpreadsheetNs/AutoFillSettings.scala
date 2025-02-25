package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFillSettings extends js.Object {
  /** This property is used to set fillType unit in Spreadsheet. It has five types which are CopyCells, FillSeries, FillFormattingOnly, FillWithoutFormatting and FlashFill.
    * @Default {ej.Spreadsheet.AutoFillOptions.FillSeries}
    */
  var fillType: js.UndefOr[AutoFillOptions | java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to enable or disable auto fill options in the Spreadsheet.
    * @Default {true}
    */
  var showFillOptions: js.UndefOr[scala.Boolean] = js.undefined
}

object AutoFillSettings {
  @scala.inline
  def apply(
    fillType: AutoFillOptions | java.lang.String = null,
    showFillOptions: js.UndefOr[scala.Boolean] = js.undefined
  ): AutoFillSettings = {
    val __obj = js.Dynamic.literal()
    if (fillType != null) __obj.updateDynamic("fillType")(fillType.asInstanceOf[js.Any])
    if (!js.isUndefined(showFillOptions)) __obj.updateDynamic("showFillOptions")(showFillOptions)
    __obj.asInstanceOf[AutoFillSettings]
  }
}

