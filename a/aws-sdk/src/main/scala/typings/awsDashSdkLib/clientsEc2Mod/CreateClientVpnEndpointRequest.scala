package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClientVpnEndpointRequest extends js.Object {
  /**
    * Information about the authentication method to be used to authenticate clients.
    */
  var AuthenticationOptions: ClientVpnAuthenticationRequestList
  /**
    * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
    */
  var ClientCidrBlock: String
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the client connection logging options. If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream. The following information is logged:   Client connection requests   Client connection results (successful and unsuccessful)   Reasons for unsuccessful client connection requests   Client connection termination time  
    */
  var ConnectionLogOptions: awsDashSdkLib.clientsEc2Mod.ConnectionLogOptions
  /**
    * A brief description of the Client VPN endpoint.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN endpoint is used as the DNS server.
    */
  var DnsServers: js.UndefOr[ValueStringList] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ARN of the server certificate. For more information, see the AWS Certificate Manager User Guide.
    */
  var ServerCertificateArn: String
  /**
    * The tags to apply to the Client VPN endpoint during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  /**
    * The transport protocol to be used by the VPN session. Default value: udp 
    */
  var TransportProtocol: js.UndefOr[TransportProtocol] = js.undefined
}

object CreateClientVpnEndpointRequest {
  @scala.inline
  def apply(
    AuthenticationOptions: ClientVpnAuthenticationRequestList,
    ClientCidrBlock: String,
    ConnectionLogOptions: ConnectionLogOptions,
    ServerCertificateArn: String,
    ClientToken: String = null,
    Description: String = null,
    DnsServers: ValueStringList = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    TagSpecifications: TagSpecificationList = null,
    TransportProtocol: TransportProtocol = null
  ): CreateClientVpnEndpointRequest = {
    val __obj = js.Dynamic.literal(AuthenticationOptions = AuthenticationOptions, ClientCidrBlock = ClientCidrBlock, ConnectionLogOptions = ConnectionLogOptions, ServerCertificateArn = ServerCertificateArn)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DnsServers != null) __obj.updateDynamic("DnsServers")(DnsServers)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications)
    if (TransportProtocol != null) __obj.updateDynamic("TransportProtocol")(TransportProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientVpnEndpointRequest]
  }
}

