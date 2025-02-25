package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQueueResponse extends js.Object {
  /**
    * You can use queues to manage the resources that are available to your AWS account for running multiple transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the default queue. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
    */
  var Queue: js.UndefOr[Queue] = js.undefined
}

object CreateQueueResponse {
  @scala.inline
  def apply(Queue: Queue = null): CreateQueueResponse = {
    val __obj = js.Dynamic.literal()
    if (Queue != null) __obj.updateDynamic("Queue")(Queue)
    __obj.asInstanceOf[CreateQueueResponse]
  }
}

