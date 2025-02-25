package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeSelectEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the given target node values
    */
  var nodeDetails: js.UndefOr[js.Any] = js.undefined
  /** returns the target element, the given node to be selected
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeSelectEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    nodeDetails: js.Any = null,
    target: js.Any = null,
    `type`: java.lang.String = null
  ): BeforeSelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (nodeDetails != null) __obj.updateDynamic("nodeDetails")(nodeDetails)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeSelectEventArgs]
  }
}

