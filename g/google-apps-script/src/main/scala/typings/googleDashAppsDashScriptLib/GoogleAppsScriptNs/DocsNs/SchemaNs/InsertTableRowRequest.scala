package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTableRowRequest extends js.Object {
  var insertBelow: js.UndefOr[scala.Boolean] = js.undefined
  var tableCellLocation: js.UndefOr[TableCellLocation] = js.undefined
}

object InsertTableRowRequest {
  @scala.inline
  def apply(insertBelow: js.UndefOr[scala.Boolean] = js.undefined, tableCellLocation: TableCellLocation = null): InsertTableRowRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insertBelow)) __obj.updateDynamic("insertBelow")(insertBelow)
    if (tableCellLocation != null) __obj.updateDynamic("tableCellLocation")(tableCellLocation)
    __obj.asInstanceOf[InsertTableRowRequest]
  }
}

