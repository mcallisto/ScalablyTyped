package typings
package vuexLib.vuexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationPayload extends Payload {
  var payload: js.Any
}

object MutationPayload {
  @scala.inline
  def apply(payload: js.Any, `type`: java.lang.String): MutationPayload = {
    val __obj = js.Dynamic.literal(payload = payload)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MutationPayload]
  }
}

