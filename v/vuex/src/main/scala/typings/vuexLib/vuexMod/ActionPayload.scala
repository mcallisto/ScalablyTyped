package typings
package vuexLib.vuexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionPayload extends Payload {
  var payload: js.Any
}

object ActionPayload {
  @scala.inline
  def apply(payload: js.Any, `type`: java.lang.String): ActionPayload = {
    val __obj = js.Dynamic.literal(payload = payload)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionPayload]
  }
}

