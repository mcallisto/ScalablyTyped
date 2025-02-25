package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePipelineNotificationsRequest extends js.Object {
  /**
    * The identifier of the pipeline for which you want to change notification settings.
    */
  var Id: awsDashSdkLib.clientsElastictranscoderMod.Id
  /**
    * The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status.  To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.     Progressing: The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has started to process jobs that are added to this pipeline. This is the ARN that Amazon SNS returned when you created the topic.    Complete: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing a job. This is the ARN that Amazon SNS returned when you created the topic.    Warning: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition. This is the ARN that Amazon SNS returned when you created the topic.    Error: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition. This is the ARN that Amazon SNS returned when you created the topic.  
    */
  var Notifications: awsDashSdkLib.clientsElastictranscoderMod.Notifications
}

object UpdatePipelineNotificationsRequest {
  @scala.inline
  def apply(Id: Id, Notifications: Notifications): UpdatePipelineNotificationsRequest = {
    val __obj = js.Dynamic.literal(Id = Id, Notifications = Notifications)
  
    __obj.asInstanceOf[UpdatePipelineNotificationsRequest]
  }
}

