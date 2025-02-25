package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelSpotFleetRequestsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The IDs of the Spot Fleet requests.
    */
  var SpotFleetRequestIds: ValueStringList
  /**
    * Indicates whether to terminate instances for a Spot Fleet request if it is canceled successfully.
    */
  var TerminateInstances: Boolean
}

object CancelSpotFleetRequestsRequest {
  @scala.inline
  def apply(
    SpotFleetRequestIds: ValueStringList,
    TerminateInstances: Boolean,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): CancelSpotFleetRequestsRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestIds = SpotFleetRequestIds, TerminateInstances = TerminateInstances)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[CancelSpotFleetRequestsRequest]
  }
}

