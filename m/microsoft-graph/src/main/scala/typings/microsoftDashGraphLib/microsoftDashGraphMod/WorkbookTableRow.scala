package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookTableRow extends Entity {
  /** Returns the index number of the row within the rows collection of the table. Zero-indexed. Read-only. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string. */
  var values: js.UndefOr[js.Any] = js.undefined
}

object WorkbookTableRow {
  @scala.inline
  def apply(id: java.lang.String = null, index: scala.Int | scala.Double = null, values: js.Any = null): WorkbookTableRow = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[WorkbookTableRow]
  }
}

