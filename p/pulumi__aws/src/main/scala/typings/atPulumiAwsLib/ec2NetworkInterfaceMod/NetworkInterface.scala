package typings
package atPulumiAwsLib.ec2NetworkInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/networkInterface", "NetworkInterface")
@js.native
class NetworkInterface protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a NetworkInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: NetworkInterfaceArgs) = this()
  def this(name: java.lang.String, args: NetworkInterfaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Block to define the attachment of the ENI. Documented below.
    */
  val attachments: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_AttachmentIdDeviceIndex]] = js.native
  /**
    * A description for the network interface.
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  val privateDnsName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val privateIp: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * List of private IPs to assign to the ENI.
    */
  val privateIps: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Number of secondary private IPs to assign to the ENI. The total number of private IPs will be 1 + private_ips_count, as a primary private IP will be assiged to an ENI by default.
    */
  val privateIpsCount: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * List of security group IDs to assign to the ENI.
    */
  val securityGroups: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Whether to enable source destination checking for the ENI. Default true.
    */
  val sourceDestCheck: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Subnet ID to create the ENI in.
    */
  val subnetId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/networkInterface", "NetworkInterface")
@js.native
object NetworkInterface extends js.Object {
  /**
    * Get an existing NetworkInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2NetworkInterfaceMod.NetworkInterface = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2NetworkInterfaceMod.NetworkInterfaceState
  ): atPulumiAwsLib.ec2NetworkInterfaceMod.NetworkInterface = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2NetworkInterfaceMod.NetworkInterfaceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2NetworkInterfaceMod.NetworkInterface = js.native
  /**
    * Returns true if the given object is an instance of NetworkInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkInterface.NetworkInterface */ scala.Boolean = js.native
}

