package typings
package firebaseDashAdminLib.adminNs.messagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the server response from the legacy
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.messaging.Messaging#sendToTopic `sendToTopic()`} method.
  *
  * See
  * [Send to a topic](/docs/cloud-messaging/admin/send-messages#send_to_a_topic)
  * for code samples and detailed documentation.
  */
trait MessagingTopicResponse extends js.Object {
  /**
    * The message ID for a successfully received request which FCM will attempt to
    * deliver to all subscribed devices.
    */
  var messageId: scala.Double
}

object MessagingTopicResponse {
  @scala.inline
  def apply(messageId: scala.Double): MessagingTopicResponse = {
    val __obj = js.Dynamic.literal(messageId = messageId)
  
    __obj.asInstanceOf[MessagingTopicResponse]
  }
}

