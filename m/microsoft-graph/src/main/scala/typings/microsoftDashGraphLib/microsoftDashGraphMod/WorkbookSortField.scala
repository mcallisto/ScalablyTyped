package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSortField extends js.Object {
  /** Represents whether the sorting is done in an ascending fashion. */
  var ascending: js.UndefOr[scala.Boolean] = js.undefined
  /** Represents the color that is the target of the condition if the sorting is on font or cell color. */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Represents additional sorting options for this field. The possible values are: Normal, TextAsNumber. */
  var dataOption: js.UndefOr[java.lang.String] = js.undefined
  /** Represents the icon that is the target of the condition if the sorting is on the cell's icon. */
  var icon: js.UndefOr[WorkbookIcon] = js.undefined
  /** Represents the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset from the first column (or row). */
  var key: js.UndefOr[scala.Double] = js.undefined
  /** Represents the type of sorting of this condition. The possible values are: Value, CellColor, FontColor, Icon. */
  var sortOn: js.UndefOr[java.lang.String] = js.undefined
}

object WorkbookSortField {
  @scala.inline
  def apply(
    ascending: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    dataOption: java.lang.String = null,
    icon: WorkbookIcon = null,
    key: scala.Int | scala.Double = null,
    sortOn: java.lang.String = null
  ): WorkbookSortField = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending)
    if (color != null) __obj.updateDynamic("color")(color)
    if (dataOption != null) __obj.updateDynamic("dataOption")(dataOption)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (sortOn != null) __obj.updateDynamic("sortOn")(sortOn)
    __obj.asInstanceOf[WorkbookSortField]
  }
}

