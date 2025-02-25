package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCustomerGatewayRequest extends js.Object {
  /**
    * The ID of the customer gateway.
    */
  var CustomerGatewayId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}

object DeleteCustomerGatewayRequest {
  @scala.inline
  def apply(CustomerGatewayId: String, DryRun: js.UndefOr[Boolean] = js.undefined): DeleteCustomerGatewayRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayId = CustomerGatewayId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteCustomerGatewayRequest]
  }
}

