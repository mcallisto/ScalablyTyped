package typings
package atPulumiAwsLib.cfgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg", "DeliveryChannel")
@js.native
class DeliveryChannel protected ()
  extends atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannel {
  /**
    * Create a DeliveryChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannelArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannelArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cfg", "DeliveryChannel")
@js.native
object DeliveryChannel extends js.Object {
  /**
    * Get an existing DeliveryChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannelState
  ): atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannelState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannel = js.native
  /**
    * Returns true if the given object is an instance of DeliveryChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/deliveryChannel.DeliveryChannel */ scala.Boolean = js.native
}

