package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationChangeEvent extends js.Object {
  var state: js.Any
  var `type`: java.lang.String
}

object LocationChangeEvent {
  @scala.inline
  def apply(state: js.Any, `type`: java.lang.String): LocationChangeEvent = {
    val __obj = js.Dynamic.literal(state = state)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LocationChangeEvent]
  }
}

