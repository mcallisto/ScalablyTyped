package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetRemoveSheetEvent extends SpreadsheetEvent {
  var sheet: js.UndefOr[kendoDashUiLib.kendoNs.spreadsheetNs.Sheet] = js.undefined
}

object SpreadsheetRemoveSheetEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Spreadsheet,
    sheet: kendoDashUiLib.kendoNs.spreadsheetNs.Sheet = null
  ): SpreadsheetRemoveSheetEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (sheet != null) __obj.updateDynamic("sheet")(sheet)
    __obj.asInstanceOf[SpreadsheetRemoveSheetEvent]
  }
}

