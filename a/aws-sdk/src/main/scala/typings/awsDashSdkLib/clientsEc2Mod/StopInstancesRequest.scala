package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopInstancesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Forces the instances to stop. The instances do not have an opportunity to flush file system caches or file system metadata. If you use this option, you must perform file system check and repair procedures. This option is not recommended for Windows instances. Default: false 
    */
  var Force: js.UndefOr[Boolean] = js.undefined
  /**
    * Hibernates the instance if the instance was enabled for hibernation at launch. If the instance cannot hibernate successfully, a normal shutdown occurs. For more information, see Hibernate Your Instance in the Amazon Elastic Compute Cloud User Guide.  Default: false 
    */
  var Hibernate: js.UndefOr[Boolean] = js.undefined
  /**
    * The IDs of the instances.
    */
  var InstanceIds: InstanceIdStringList
}

object StopInstancesRequest {
  @scala.inline
  def apply(
    InstanceIds: InstanceIdStringList,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Force: js.UndefOr[Boolean] = js.undefined,
    Hibernate: js.UndefOr[Boolean] = js.undefined
  ): StopInstancesRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force)
    if (!js.isUndefined(Hibernate)) __obj.updateDynamic("Hibernate")(Hibernate)
    __obj.asInstanceOf[StopInstancesRequest]
  }
}

