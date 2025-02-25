package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookTableColumn extends Entity {
  /** Retrieve the filter applied to the column. Read-only. */
  var filter: js.UndefOr[WorkbookFilter] = js.undefined
  /** Returns the index number of the column within the columns collection of the table. Zero-indexed. Read-only. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the table column. Read-only. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string. */
  var values: js.UndefOr[js.Any] = js.undefined
}

object WorkbookTableColumn {
  @scala.inline
  def apply(
    filter: WorkbookFilter = null,
    id: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    values: js.Any = null
  ): WorkbookTableColumn = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (id != null) __obj.updateDynamic("id")(id)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[WorkbookTableColumn]
  }
}

