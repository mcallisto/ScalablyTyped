package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SNSTopicPublishAction extends js.Object {
  /**
    * The ARN of the Amazon SNS target to which the message is sent.
    */
  var targetArn: AmazonResourceName
}

object SNSTopicPublishAction {
  @scala.inline
  def apply(targetArn: AmazonResourceName): SNSTopicPublishAction = {
    val __obj = js.Dynamic.literal(targetArn = targetArn)
  
    __obj.asInstanceOf[SNSTopicPublishAction]
  }
}

