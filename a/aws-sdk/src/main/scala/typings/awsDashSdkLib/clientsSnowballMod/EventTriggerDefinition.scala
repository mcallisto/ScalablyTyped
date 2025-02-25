package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTriggerDefinition extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for any local Amazon S3 resource that is an AWS Lambda function's event trigger associated with this job.
    */
  var EventResourceARN: js.UndefOr[ResourceARN] = js.undefined
}

object EventTriggerDefinition {
  @scala.inline
  def apply(EventResourceARN: ResourceARN = null): EventTriggerDefinition = {
    val __obj = js.Dynamic.literal()
    if (EventResourceARN != null) __obj.updateDynamic("EventResourceARN")(EventResourceARN)
    __obj.asInstanceOf[EventTriggerDefinition]
  }
}

