package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    * The ID you wish to assign to the message. Each "messageId" must be unique within each batch sent.
    */
  var messageId: MessageId
  /**
    * The payload of the message. This may be a JSON string or a Base64-encoded string representing binary data (in which case you must decode it by means of a pipeline activity).
    */
  var payload: MessagePayload
}

object Message {
  @scala.inline
  def apply(messageId: MessageId, payload: MessagePayload): Message = {
    val __obj = js.Dynamic.literal(messageId = messageId, payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Message]
  }
}

