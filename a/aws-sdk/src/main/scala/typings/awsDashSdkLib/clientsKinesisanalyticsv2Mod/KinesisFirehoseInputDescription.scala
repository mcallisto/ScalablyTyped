package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisFirehoseInputDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the delivery stream.
    */
  var ResourceARN: awsDashSdkLib.clientsKinesisanalyticsv2Mod.ResourceARN
  /**
    * The ARN of the IAM role that Kinesis Data Analytics assumes to access the stream.  Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var RoleARN: js.UndefOr[RoleARN] = js.undefined
}

object KinesisFirehoseInputDescription {
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN = null): KinesisFirehoseInputDescription = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    __obj.asInstanceOf[KinesisFirehoseInputDescription]
  }
}

