package typings
package atPulumiAwsLib.directconnectBgpPeerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/bgpPeer", "BgpPeer")
@js.native
class BgpPeer protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a BgpPeer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: BgpPeerArgs) = this()
  def this(name: java.lang.String, args: BgpPeerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon.
    * Required for IPv4 BGP peers on public virtual interfaces.
    */
  val amazonAddress: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The Direct Connect endpoint on which the BGP peer terminates.
    */
  val awsDevice: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  val bgpAsn: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * The authentication key for BGP configuration.
    */
  val bgpAuthKey: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the BGP peer.
    */
  val bgpPeerId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The Up/Down state of the BGP peer.
    */
  val bgpStatus: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic.
    * Required for IPv4 BGP peers on public virtual interfaces.
    */
  val customerAddress: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the Direct Connect virtual interface on which to create the BGP peer.
    */
  val virtualInterfaceId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/directconnect/bgpPeer", "BgpPeer")
@js.native
object BgpPeer extends js.Object {
  /**
    * Get an existing BgpPeer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectBgpPeerMod.BgpPeer = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectBgpPeerMod.BgpPeerState
  ): atPulumiAwsLib.directconnectBgpPeerMod.BgpPeer = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectBgpPeerMod.BgpPeerState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.directconnectBgpPeerMod.BgpPeer = js.native
  /**
    * Returns true if the given object is an instance of BgpPeer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/bgpPeer.BgpPeer */ scala.Boolean = js.native
}

