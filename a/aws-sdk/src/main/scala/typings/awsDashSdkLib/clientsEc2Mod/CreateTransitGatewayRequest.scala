package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTransitGatewayRequest extends js.Object {
  /**
    * A description of the transit gateway.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The transit gateway options.
    */
  var Options: js.UndefOr[TransitGatewayRequestOptions] = js.undefined
  /**
    * The tags to apply to the transit gateway.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}

object CreateTransitGatewayRequest {
  @scala.inline
  def apply(
    Description: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Options: TransitGatewayRequestOptions = null,
    TagSpecifications: TagSpecificationList = null
  ): CreateTransitGatewayRequest = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications)
    __obj.asInstanceOf[CreateTransitGatewayRequest]
  }
}

