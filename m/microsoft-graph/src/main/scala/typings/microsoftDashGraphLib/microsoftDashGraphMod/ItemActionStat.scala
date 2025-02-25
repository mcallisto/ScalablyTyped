package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemActionStat extends js.Object {
  var actionCount: js.UndefOr[scala.Double] = js.undefined
  var actorCount: js.UndefOr[scala.Double] = js.undefined
}

object ItemActionStat {
  @scala.inline
  def apply(actionCount: scala.Int | scala.Double = null, actorCount: scala.Int | scala.Double = null): ItemActionStat = {
    val __obj = js.Dynamic.literal()
    if (actionCount != null) __obj.updateDynamic("actionCount")(actionCount.asInstanceOf[js.Any])
    if (actorCount != null) __obj.updateDynamic("actorCount")(actorCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemActionStat]
  }
}

