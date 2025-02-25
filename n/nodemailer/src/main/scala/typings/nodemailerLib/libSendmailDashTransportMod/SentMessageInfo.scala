package typings
package nodemailerLib.libSendmailDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMessageInfo extends js.Object {
  var envelope: nodemailerLib.libMimeDashNodeMod.Envelope
  var messageId: java.lang.String
  var response: java.lang.String
}

object SentMessageInfo {
  @scala.inline
  def apply(
    envelope: nodemailerLib.libMimeDashNodeMod.Envelope,
    messageId: java.lang.String,
    response: java.lang.String
  ): SentMessageInfo = {
    val __obj = js.Dynamic.literal(envelope = envelope, messageId = messageId, response = response)
  
    __obj.asInstanceOf[SentMessageInfo]
  }
}

