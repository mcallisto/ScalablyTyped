package typings
package atPulumiAwsLib.cloudwatchLogGroupMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogGroupEvent extends js.Object {
  var awslogs: atPulumiAwsLib.Anon_Data
}

object LogGroupEvent {
  @scala.inline
  def apply(awslogs: atPulumiAwsLib.Anon_Data): LogGroupEvent = {
    val __obj = js.Dynamic.literal(awslogs = awslogs)
  
    __obj.asInstanceOf[LogGroupEvent]
  }
}

