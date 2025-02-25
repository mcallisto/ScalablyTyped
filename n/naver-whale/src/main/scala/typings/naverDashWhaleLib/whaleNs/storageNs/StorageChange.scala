package typings
package naverDashWhaleLib.whaleNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageChange extends js.Object {
  /** Optional. The new value of the item, if there is a new value. */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** Optional. The old value of the item, if there was an old value. */
  var oldValue: js.UndefOr[js.Any] = js.undefined
}

object StorageChange {
  @scala.inline
  def apply(newValue: js.Any = null, oldValue: js.Any = null): StorageChange = {
    val __obj = js.Dynamic.literal()
    if (newValue != null) __obj.updateDynamic("newValue")(newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[StorageChange]
  }
}

