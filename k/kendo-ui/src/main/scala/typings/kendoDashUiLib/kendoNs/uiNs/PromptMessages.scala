package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptMessages extends js.Object {
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  var okText: js.UndefOr[java.lang.String] = js.undefined
}

object PromptMessages {
  @scala.inline
  def apply(cancel: java.lang.String = null, okText: java.lang.String = null): PromptMessages = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (okText != null) __obj.updateDynamic("okText")(okText)
    __obj.asInstanceOf[PromptMessages]
  }
}

