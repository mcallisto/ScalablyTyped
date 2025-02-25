package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeploymentInput extends js.Object {
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName
  /**
    * Configuration information for an automatic rollback that is added when a deployment is created.
    */
  var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined
  /**
    * The name of a deployment configuration associated with the IAM user or AWS account. If not specified, the value configured in the deployment group is used as the default. If the deployment group does not have a deployment configuration associated with it, CodeDeployDefault.OneAtATime is used by default.
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined
  /**
    * The name of the deployment group.
    */
  var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined
  /**
    * A comment about the deployment.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't part of the previous successful deployment. The fileExistsBehavior parameter takes any of the following values:   DISALLOW: The deployment fails. This is also the default behavior if no option is specified.   OVERWRITE: The version of the file from the application revision currently being deployed replaces the version already on the instance.   RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.  
    */
  var fileExistsBehavior: js.UndefOr[FileExistsBehavior] = js.undefined
  /**
    *  If true, then if an ApplicationStop, BeforeBlockTraffic, or AfterBlockTraffic deployment lifecycle event to an instance fails, then the deployment continues to the next deployment lifecycle event. For example, if ApplicationStop fails, the deployment continues with DownloadBundle. If BeforeBlockTraffic fails, the deployment continues with BlockTraffic. If AfterBlockTraffic fails, the deployment continues with ApplicationStop.   If false or not specified, then if a lifecycle event fails during a deployment to an instance, that deployment fails. If deployment to that instance is part of an overall deployment and the number of healthy hosts is not less than the minimum number of healthy hosts, then a deployment to the next instance is attempted.   During a deployment, the AWS CodeDeploy agent runs the scripts specified for ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic in the AppSpec file from the previous successful deployment. (All other scripts are run from the AppSpec file in the current deployment.) If one of these scripts contains an error and does not run successfully, the deployment can fail.   If the cause of the failure is a script from the last successful deployment that will never run successfully, create a new deployment and use ignoreApplicationStopFailures to specify that the ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic failures should be ignored. 
    */
  var ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.undefined
  /**
    *  The type and location of the revision to deploy. 
    */
  var revision: js.UndefOr[RevisionLocation] = js.undefined
  /**
    *  Information about the instances that belong to the replacement environment in a blue/green deployment. 
    */
  var targetInstances: js.UndefOr[TargetInstances] = js.undefined
  /**
    *  Indicates whether to deploy to all instances or only to instances that are not running the latest application revision. 
    */
  var updateOutdatedInstancesOnly: js.UndefOr[Boolean] = js.undefined
}

object CreateDeploymentInput {
  @scala.inline
  def apply(
    applicationName: ApplicationName,
    autoRollbackConfiguration: AutoRollbackConfiguration = null,
    deploymentConfigName: DeploymentConfigName = null,
    deploymentGroupName: DeploymentGroupName = null,
    description: Description = null,
    fileExistsBehavior: FileExistsBehavior = null,
    ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.undefined,
    revision: RevisionLocation = null,
    targetInstances: TargetInstances = null,
    updateOutdatedInstancesOnly: js.UndefOr[Boolean] = js.undefined
  ): CreateDeploymentInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName)
    if (autoRollbackConfiguration != null) __obj.updateDynamic("autoRollbackConfiguration")(autoRollbackConfiguration)
    if (deploymentConfigName != null) __obj.updateDynamic("deploymentConfigName")(deploymentConfigName)
    if (deploymentGroupName != null) __obj.updateDynamic("deploymentGroupName")(deploymentGroupName)
    if (description != null) __obj.updateDynamic("description")(description)
    if (fileExistsBehavior != null) __obj.updateDynamic("fileExistsBehavior")(fileExistsBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreApplicationStopFailures)) __obj.updateDynamic("ignoreApplicationStopFailures")(ignoreApplicationStopFailures)
    if (revision != null) __obj.updateDynamic("revision")(revision)
    if (targetInstances != null) __obj.updateDynamic("targetInstances")(targetInstances)
    if (!js.isUndefined(updateOutdatedInstancesOnly)) __obj.updateDynamic("updateOutdatedInstancesOnly")(updateOutdatedInstancesOnly)
    __obj.asInstanceOf[CreateDeploymentInput]
  }
}

