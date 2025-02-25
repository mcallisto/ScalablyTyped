package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageItem extends js.Object {
  /**
  		 * A hint for modal dialogs that the item should be triggered
  		 * when the user cancels the dialog (e.g. by pressing the ESC
  		 * key).
  		 *
  		 * Note: this option is ignored for non-modal messages.
  		 */
  var isCloseAffordance: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * A short title like 'Retry', 'Open Log' etc.
  		 */
  var title: java.lang.String
}

object MessageItem {
  @scala.inline
  def apply(title: java.lang.String, isCloseAffordance: js.UndefOr[scala.Boolean] = js.undefined): MessageItem = {
    val __obj = js.Dynamic.literal(title = title)
    if (!js.isUndefined(isCloseAffordance)) __obj.updateDynamic("isCloseAffordance")(isCloseAffordance)
    __obj.asInstanceOf[MessageItem]
  }
}

