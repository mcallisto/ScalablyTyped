package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deleted extends js.Object {
  /** Represents the state of the deleted item. */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object Deleted {
  @scala.inline
  def apply(state: java.lang.String = null): Deleted = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Deleted]
  }
}

