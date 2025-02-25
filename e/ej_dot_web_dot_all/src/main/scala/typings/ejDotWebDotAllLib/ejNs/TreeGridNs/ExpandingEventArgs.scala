package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the data of expanding record..
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns state of a record whether it is in expanded or collapsed state.
    */
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the row index of expanding record.
    */
  var recordIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the event Type.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ExpandingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    recordIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): ExpandingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (recordIndex != null) __obj.updateDynamic("recordIndex")(recordIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExpandingEventArgs]
  }
}

