package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimulationJob extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the simulation job.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * A unique identifier for this SimulationJob request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The failure behavior the simulation job.  Continue  Restart the simulation job in the same host instance.  Fail  Stop the simulation job and terminate the instance.  
    */
  var failureBehavior: js.UndefOr[FailureBehavior] = js.undefined
  /**
    * The failure code of the simulation job if it failed.
    */
  var failureCode: js.UndefOr[SimulationJobErrorCode] = js.undefined
  /**
    * The reason why the simulation job failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.undefined
  /**
    * The IAM role that allows the simulation instance to call the AWS APIs that are specified in its associated policies on your behalf. This is how credentials are passed in to your simulation job. 
    */
  var iamRole: js.UndefOr[IamRole] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the simulation job was last started.
    */
  var lastStartedAt: js.UndefOr[LastStartedAt] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the simulation job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
  /**
    * The maximum simulation job duration in seconds. The value must be 8 days (691,200 seconds) or less.
    */
  var maxJobDurationInSeconds: js.UndefOr[JobDuration] = js.undefined
  /**
    * The name of the simulation job.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * Location for output files generated by the simulation job.
    */
  var outputLocation: js.UndefOr[OutputLocation] = js.undefined
  /**
    * A list of robot applications.
    */
  var robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined
  /**
    * A list of simulation applications.
    */
  var simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined
  /**
    * The simulation job execution duration in milliseconds.
    */
  var simulationTimeMillis: js.UndefOr[SimulationTimeMillis] = js.undefined
  /**
    * Status of the simulation job.
    */
  var status: js.UndefOr[SimulationJobStatus] = js.undefined
  /**
    * A map that contains tag keys and tag values that are attached to the simulation job.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  /**
    * VPC configuration information.
    */
  var vpcConfig: js.UndefOr[VPCConfigResponse] = js.undefined
}

object SimulationJob {
  @scala.inline
  def apply(
    arn: Arn = null,
    clientRequestToken: ClientRequestToken = null,
    failureBehavior: FailureBehavior = null,
    failureCode: SimulationJobErrorCode = null,
    failureReason: GenericString = null,
    iamRole: IamRole = null,
    lastStartedAt: LastStartedAt = null,
    lastUpdatedAt: LastUpdatedAt = null,
    maxJobDurationInSeconds: js.UndefOr[JobDuration] = js.undefined,
    name: Name = null,
    outputLocation: OutputLocation = null,
    robotApplications: RobotApplicationConfigs = null,
    simulationApplications: SimulationApplicationConfigs = null,
    simulationTimeMillis: js.UndefOr[SimulationTimeMillis] = js.undefined,
    status: SimulationJobStatus = null,
    tags: TagMap = null,
    vpcConfig: VPCConfigResponse = null
  ): SimulationJob = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (failureBehavior != null) __obj.updateDynamic("failureBehavior")(failureBehavior.asInstanceOf[js.Any])
    if (failureCode != null) __obj.updateDynamic("failureCode")(failureCode.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (iamRole != null) __obj.updateDynamic("iamRole")(iamRole)
    if (lastStartedAt != null) __obj.updateDynamic("lastStartedAt")(lastStartedAt)
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt)
    if (!js.isUndefined(maxJobDurationInSeconds)) __obj.updateDynamic("maxJobDurationInSeconds")(maxJobDurationInSeconds)
    if (name != null) __obj.updateDynamic("name")(name)
    if (outputLocation != null) __obj.updateDynamic("outputLocation")(outputLocation)
    if (robotApplications != null) __obj.updateDynamic("robotApplications")(robotApplications)
    if (simulationApplications != null) __obj.updateDynamic("simulationApplications")(simulationApplications)
    if (!js.isUndefined(simulationTimeMillis)) __obj.updateDynamic("simulationTimeMillis")(simulationTimeMillis)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig)
    __obj.asInstanceOf[SimulationJob]
  }
}

