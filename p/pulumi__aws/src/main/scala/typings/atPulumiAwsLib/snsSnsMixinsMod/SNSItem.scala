package typings
package atPulumiAwsLib.snsSnsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SNSItem extends js.Object {
  var Message: java.lang.String
  var MessageAttributes: org.scalablytyped.runtime.StringDictionary[SNSMessageAttribute]
  var MessageId: java.lang.String
  var Signature: java.lang.String
  var SignatureVersion: java.lang.String
  var SigningCertUrl: java.lang.String
  var Subject: java.lang.String
  var Timestamp: java.lang.String
  var TopicArn: java.lang.String
  var Type: java.lang.String
  var UnsubscribeUrl: java.lang.String
}

object SNSItem {
  @scala.inline
  def apply(
    Message: java.lang.String,
    MessageAttributes: org.scalablytyped.runtime.StringDictionary[SNSMessageAttribute],
    MessageId: java.lang.String,
    Signature: java.lang.String,
    SignatureVersion: java.lang.String,
    SigningCertUrl: java.lang.String,
    Subject: java.lang.String,
    Timestamp: java.lang.String,
    TopicArn: java.lang.String,
    Type: java.lang.String,
    UnsubscribeUrl: java.lang.String
  ): SNSItem = {
    val __obj = js.Dynamic.literal(Message = Message, MessageAttributes = MessageAttributes, MessageId = MessageId, Signature = Signature, SignatureVersion = SignatureVersion, SigningCertUrl = SigningCertUrl, Subject = Subject, Timestamp = Timestamp, TopicArn = TopicArn, Type = Type, UnsubscribeUrl = UnsubscribeUrl)
  
    __obj.asInstanceOf[SNSItem]
  }
}

