package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDeploymentGroupOutput extends js.Object {
  /**
    * If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling group, AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the Amazon EC2 instances in the Auto Scaling group. If the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event hooks from the Amazon EC2 instances in the Auto Scaling group.
    */
  var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.undefined
}

object DeleteDeploymentGroupOutput {
  @scala.inline
  def apply(hooksNotCleanedUp: AutoScalingGroupList = null): DeleteDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (hooksNotCleanedUp != null) __obj.updateDynamic("hooksNotCleanedUp")(hooksNotCleanedUp)
    __obj.asInstanceOf[DeleteDeploymentGroupOutput]
  }
}

