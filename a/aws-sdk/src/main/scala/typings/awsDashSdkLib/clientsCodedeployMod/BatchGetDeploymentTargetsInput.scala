package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetDeploymentTargetsInput extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  /**
    *  The unique IDs of the deployment targets. The compute platform of the deployment determines the type of the targets and their formats. The maximum number of deployment target IDs you can specify is 25.    For deployments that use the EC2/On-premises compute platform, the target IDs are EC2 or on-premises instances IDs, and their target type is instanceTarget.     For deployments that use the AWS Lambda compute platform, the target IDs are the names of Lambda functions, and their target type is instanceTarget.     For deployments that use the Amazon ECS compute platform, the target IDs are pairs of Amazon ECS clusters and services specified using the format &lt;clustername&gt;:&lt;servicename&gt;. Their target type is ecsTarget.   
    */
  var targetIds: js.UndefOr[TargetIdList] = js.undefined
}

object BatchGetDeploymentTargetsInput {
  @scala.inline
  def apply(deploymentId: DeploymentId = null, targetIds: TargetIdList = null): BatchGetDeploymentTargetsInput = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    if (targetIds != null) __obj.updateDynamic("targetIds")(targetIds)
    __obj.asInstanceOf[BatchGetDeploymentTargetsInput]
  }
}

