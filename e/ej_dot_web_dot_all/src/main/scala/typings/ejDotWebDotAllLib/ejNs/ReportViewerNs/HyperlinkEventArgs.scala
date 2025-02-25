package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HyperlinkEventArgs extends js.Object {
  /** returns the actionInfo's hyperLink detail
    */
  var actionInfo: js.UndefOr[js.Any] = js.undefined
  /** true if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the report model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object HyperlinkEventArgs {
  @scala.inline
  def apply(
    actionInfo: js.Any = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: js.Any = null,
    `type`: java.lang.String = null
  ): HyperlinkEventArgs = {
    val __obj = js.Dynamic.literal()
    if (actionInfo != null) __obj.updateDynamic("actionInfo")(actionInfo)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HyperlinkEventArgs]
  }
}

