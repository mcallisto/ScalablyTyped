package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableRowCollection object, for use in "tableRowCollection.set({ ... })". */
trait TableRowCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[TableRowData]] = js.undefined
}

object TableRowCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[TableRowData] = null): TableRowCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[TableRowCollectionUpdateData]
  }
}

