package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptions extends js.Object {
  /** Pass the border condition
    */
  var border: js.UndefOr[scala.Boolean] = js.undefined
  /** Pass the cell style to be removed
    */
  var cellStyle: js.UndefOr[scala.Boolean] = js.undefined
  /** Pass the format
    */
  var format: js.UndefOr[scala.Boolean] = js.undefined
  /** Pass the table style to be removed
    */
  var tableStyle: js.UndefOr[scala.Boolean] = js.undefined
}

object FormatOptions {
  @scala.inline
  def apply(
    border: js.UndefOr[scala.Boolean] = js.undefined,
    cellStyle: js.UndefOr[scala.Boolean] = js.undefined,
    format: js.UndefOr[scala.Boolean] = js.undefined,
    tableStyle: js.UndefOr[scala.Boolean] = js.undefined
  ): FormatOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border)
    if (!js.isUndefined(cellStyle)) __obj.updateDynamic("cellStyle")(cellStyle)
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(tableStyle)) __obj.updateDynamic("tableStyle")(tableStyle)
    __obj.asInstanceOf[FormatOptions]
  }
}

