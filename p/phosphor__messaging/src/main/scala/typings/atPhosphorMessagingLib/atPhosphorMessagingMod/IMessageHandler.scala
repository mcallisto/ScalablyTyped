package typings
package atPhosphorMessagingLib.atPhosphorMessagingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageHandler extends js.Object {
  /**
    * Process a message sent to the handler.
    *
    * @param msg - The message to be processed.
    */
  def processMessage(msg: Message): scala.Unit
}

object IMessageHandler {
  @scala.inline
  def apply(processMessage: Message => scala.Unit): IMessageHandler = {
    val __obj = js.Dynamic.literal(processMessage = js.Any.fromFunction1(processMessage))
  
    __obj.asInstanceOf[IMessageHandler]
  }
}

