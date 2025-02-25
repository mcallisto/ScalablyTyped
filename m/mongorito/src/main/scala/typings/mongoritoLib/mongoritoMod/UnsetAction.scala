package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsetAction extends Action {
  var keys: java.lang.String | js.Array[java.lang.String]
  var `type`: mongoritoLib.mongoritoMod.ActionTypes.UNSET
}

object UnsetAction {
  @scala.inline
  def apply(
    keys: java.lang.String | js.Array[java.lang.String],
    `type`: mongoritoLib.mongoritoMod.ActionTypes.UNSET
  ): UnsetAction = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UnsetAction]
  }
}

