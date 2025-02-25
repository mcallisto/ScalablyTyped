package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplyListener extends js.Object {
  var chatId: scala.Double | java.lang.String
  var id: scala.Double
  var messageId: scala.Double | java.lang.String
  def callback(msg: Message): scala.Unit
}

object ReplyListener {
  @scala.inline
  def apply(
    callback: Message => scala.Unit,
    chatId: scala.Double | java.lang.String,
    id: scala.Double,
    messageId: scala.Double | java.lang.String
  ): ReplyListener = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), chatId = chatId.asInstanceOf[js.Any], id = id, messageId = messageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplyListener]
  }
}

