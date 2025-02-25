package typings
package atPulumiAwsLib.ec2VpnGatewayRoutePropagationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpnGatewayRoutePropagation", "VpnGatewayRoutePropagation")
@js.native
class VpnGatewayRoutePropagation protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a VpnGatewayRoutePropagation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VpnGatewayRoutePropagationArgs) = this()
  def this(name: java.lang.String, args: VpnGatewayRoutePropagationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The id of the `aws_route_table` to propagate routes into.
    */
  val routeTableId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The id of the `aws_vpn_gateway` to propagate routes from.
    */
  val vpnGatewayId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpnGatewayRoutePropagation", "VpnGatewayRoutePropagation")
@js.native
object VpnGatewayRoutePropagation extends js.Object {
  /**
    * Get an existing VpnGatewayRoutePropagation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpnGatewayRoutePropagationMod.VpnGatewayRoutePropagation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpnGatewayRoutePropagationMod.VpnGatewayRoutePropagationState
  ): atPulumiAwsLib.ec2VpnGatewayRoutePropagationMod.VpnGatewayRoutePropagation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpnGatewayRoutePropagationMod.VpnGatewayRoutePropagationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2VpnGatewayRoutePropagationMod.VpnGatewayRoutePropagation = js.native
  /**
    * Returns true if the given object is an instance of VpnGatewayRoutePropagation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnGatewayRoutePropagation.VpnGatewayRoutePropagation */ scala.Boolean = js.native
}

