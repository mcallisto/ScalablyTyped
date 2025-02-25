package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownListOpenedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the editable input.
  	 */
  var editorInput: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the list contaier.
  	 */
  var list: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the editor.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DropDownListOpenedEventUIParam {
  @scala.inline
  def apply(editorInput: js.Any = null, list: js.Any = null, owner: js.Any = null): DropDownListOpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (editorInput != null) __obj.updateDynamic("editorInput")(editorInput)
    if (list != null) __obj.updateDynamic("list")(list)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[DropDownListOpenedEventUIParam]
  }
}

