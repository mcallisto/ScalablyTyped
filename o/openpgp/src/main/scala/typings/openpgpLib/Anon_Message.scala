package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: openpgpLib.openpgpMod.messageNs.Message
}

object Anon_Message {
  @scala.inline
  def apply(message: openpgpLib.openpgpMod.messageNs.Message): Anon_Message = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[Anon_Message]
  }
}

