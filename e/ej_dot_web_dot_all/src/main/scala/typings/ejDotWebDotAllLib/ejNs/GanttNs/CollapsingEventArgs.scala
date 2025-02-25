package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the data of edited cell record..
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns state of a record whether it is in expanded or collapsed state.
    */
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the row index of collapsing record.
    */
  var recordIndex: js.UndefOr[scala.Double] = js.undefined
}

object CollapsingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    recordIndex: scala.Int | scala.Double = null
  ): CollapsingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (recordIndex != null) __obj.updateDynamic("recordIndex")(recordIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsingEventArgs]
  }
}

