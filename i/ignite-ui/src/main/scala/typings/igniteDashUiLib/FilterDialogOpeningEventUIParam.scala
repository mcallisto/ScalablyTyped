package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDialogOpeningEventUIParam extends js.Object {
  /**
  	 * Gets reference to the filtering dialog DOM element.
  	 */
  var dialog: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets reference to GridFiltering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object FilterDialogOpeningEventUIParam {
  @scala.inline
  def apply(dialog: java.lang.String = null, owner: js.Any = null): FilterDialogOpeningEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dialog != null) __obj.updateDynamic("dialog")(dialog)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[FilterDialogOpeningEventUIParam]
  }
}

