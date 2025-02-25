package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTopicAttributesInput extends js.Object {
  /**
    * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the SetTopicAttributes action uses:    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    DisplayName – The display name to use for a topic with SMS subscriptions.    Policy – The policy that defines who can access your topic. By default, only the topic owner can publish or subscribe to the topic.   The following attribute applies only to server-side-encryption:    KmsMasterKeyId - The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK. For more information, see Key Terms. For more examples, see KeyId in the AWS Key Management Service API Reference.   
    */
  var AttributeName: attributeName
  /**
    * The new value for the attribute.
    */
  var AttributeValue: js.UndefOr[attributeValue] = js.undefined
  /**
    * The ARN of the topic to modify.
    */
  var TopicArn: topicARN
}

object SetTopicAttributesInput {
  @scala.inline
  def apply(AttributeName: attributeName, TopicArn: topicARN, AttributeValue: attributeValue = null): SetTopicAttributesInput = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName, TopicArn = TopicArn)
    if (AttributeValue != null) __obj.updateDynamic("AttributeValue")(AttributeValue)
    __obj.asInstanceOf[SetTopicAttributesInput]
  }
}

