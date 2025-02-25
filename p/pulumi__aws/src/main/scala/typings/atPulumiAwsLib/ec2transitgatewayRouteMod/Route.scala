package typings
package atPulumiAwsLib.ec2transitgatewayRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2transitgateway/route", "Route")
@js.native
class Route protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Route resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: RouteArgs) = this()
  def this(name: java.lang.String, args: RouteArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Indicates whether to drop traffic that matches this route (default to `false`).
    */
  val blackhole: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
    */
  val destinationCidrBlock: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
    */
  val transitGatewayAttachmentId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2transitgateway/route", "Route")
@js.native
object Route extends js.Object {
  /**
    * Get an existing Route resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2transitgatewayRouteMod.Route = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2transitgatewayRouteMod.RouteState
  ): atPulumiAwsLib.ec2transitgatewayRouteMod.Route = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2transitgatewayRouteMod.RouteState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2transitgatewayRouteMod.Route = js.native
  /**
    * Returns true if the given object is an instance of Route.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/route.Route */ scala.Boolean = js.native
}

