package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartContentModerationRequest extends js.Object {
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartContentModeration requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * Unique identifier you specify to identify the job in the completion status published to the Amazon Simple Notification Service topic. 
    */
  var JobTag: js.UndefOr[JobTag] = js.undefined
  /**
    * Specifies the minimum confidence that Amazon Rekognition must have in order to return a moderated content label. Confidence represents how certain Amazon Rekognition is that the moderated content is correctly identified. 0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition doesn't return any moderated content labels with a confidence level lower than this specified value. If you don't specify MinConfidence, GetContentModeration returns labels with confidence values greater than or equal to 50 percent.
    */
  var MinConfidence: js.UndefOr[Percent] = js.undefined
  /**
    * The Amazon SNS topic ARN that you want Amazon Rekognition Video to publish the completion status of the content moderation analysis to.
    */
  var NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
  /**
    * The video in which you want to moderate content. The video must be stored in an Amazon S3 bucket.
    */
  var Video: awsDashSdkLib.clientsRekognitionMod.Video
}

object StartContentModerationRequest {
  @scala.inline
  def apply(
    Video: Video,
    ClientRequestToken: ClientRequestToken = null,
    JobTag: JobTag = null,
    MinConfidence: js.UndefOr[Percent] = js.undefined,
    NotificationChannel: NotificationChannel = null
  ): StartContentModerationRequest = {
    val __obj = js.Dynamic.literal(Video = Video)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (JobTag != null) __obj.updateDynamic("JobTag")(JobTag)
    if (!js.isUndefined(MinConfidence)) __obj.updateDynamic("MinConfidence")(MinConfidence)
    if (NotificationChannel != null) __obj.updateDynamic("NotificationChannel")(NotificationChannel)
    __obj.asInstanceOf[StartContentModerationRequest]
  }
}

