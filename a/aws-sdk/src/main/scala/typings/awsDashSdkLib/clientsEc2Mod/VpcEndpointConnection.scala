package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointConnection extends js.Object {
  /**
    * The date and time the VPC endpoint was created.
    */
  var CreationTimestamp: js.UndefOr[MillisecondDateTime] = js.undefined
  /**
    * The DNS entries for the VPC endpoint.
    */
  var DnsEntries: js.UndefOr[DnsEntrySet] = js.undefined
  /**
    * The Amazon Resource Names (ARNs) of the network load balancers for the service.
    */
  var NetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The ID of the service to which the endpoint is connected.
    */
  var ServiceId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.undefined
  /**
    * The AWS account ID of the owner of the VPC endpoint.
    */
  var VpcEndpointOwner: js.UndefOr[String] = js.undefined
  /**
    * The state of the VPC endpoint.
    */
  var VpcEndpointState: js.UndefOr[State] = js.undefined
}

object VpcEndpointConnection {
  @scala.inline
  def apply(
    CreationTimestamp: MillisecondDateTime = null,
    DnsEntries: DnsEntrySet = null,
    NetworkLoadBalancerArns: ValueStringList = null,
    ServiceId: String = null,
    VpcEndpointId: String = null,
    VpcEndpointOwner: String = null,
    VpcEndpointState: State = null
  ): VpcEndpointConnection = {
    val __obj = js.Dynamic.literal()
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp)
    if (DnsEntries != null) __obj.updateDynamic("DnsEntries")(DnsEntries)
    if (NetworkLoadBalancerArns != null) __obj.updateDynamic("NetworkLoadBalancerArns")(NetworkLoadBalancerArns)
    if (ServiceId != null) __obj.updateDynamic("ServiceId")(ServiceId)
    if (VpcEndpointId != null) __obj.updateDynamic("VpcEndpointId")(VpcEndpointId)
    if (VpcEndpointOwner != null) __obj.updateDynamic("VpcEndpointOwner")(VpcEndpointOwner)
    if (VpcEndpointState != null) __obj.updateDynamic("VpcEndpointState")(VpcEndpointState.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointConnection]
  }
}

