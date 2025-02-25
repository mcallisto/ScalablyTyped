package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFixedEventUIParam extends js.Object {
  /**
  	 * Gets the columnKey or the columnIndex.
  	 */
  var columnIdentifier: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets whether header cell has children(use this argument ONLY when multi-column-headers are enabled).
  	 */
  var isGroupHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets a reference to the widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnFixedEventUIParam {
  @scala.inline
  def apply(
    columnIdentifier: js.Any = null,
    isGroupHeader: js.UndefOr[scala.Boolean] = js.undefined,
    owner: js.Any = null
  ): ColumnFixedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIdentifier != null) __obj.updateDynamic("columnIdentifier")(columnIdentifier)
    if (!js.isUndefined(isGroupHeader)) __obj.updateDynamic("isGroupHeader")(isGroupHeader)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ColumnFixedEventUIParam]
  }
}

