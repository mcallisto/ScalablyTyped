package typings
package firebaseDashAdminLib.adminNs.messagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the server response from the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.messaging.Messaging#sendToDeviceGroup `sendToDeviceGroup()`}
  * method.
  *
  * See
  * [Send messages to device groups](/docs/cloud-messaging/send-message?authuser=0#send_messages_to_device_groups)
  * for code samples and detailed documentation.
  */
trait MessagingDeviceGroupResponse extends js.Object {
  /**
    * An array of registration tokens that failed to receive the message.
    */
  var failedRegistrationTokens: js.Array[java.lang.String]
  /**
    * The number of messages that could not be processed and resulted in an error.
    */
  var failureCount: scala.Double
  /**
    * The number of messages that could not be processed and resulted in an error.
    */
  var successCount: scala.Double
}

object MessagingDeviceGroupResponse {
  @scala.inline
  def apply(
    failedRegistrationTokens: js.Array[java.lang.String],
    failureCount: scala.Double,
    successCount: scala.Double
  ): MessagingDeviceGroupResponse = {
    val __obj = js.Dynamic.literal(failedRegistrationTokens = failedRegistrationTokens, failureCount = failureCount, successCount = successCount)
  
    __obj.asInstanceOf[MessagingDeviceGroupResponse]
  }
}

