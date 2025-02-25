package typings
package atPulumiAwsLib.ec2PlacementGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/placementGroup", "PlacementGroup")
@js.native
class PlacementGroup protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a PlacementGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: PlacementGroupArgs) = this()
  def this(name: java.lang.String, args: PlacementGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The name of the placement group.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The placement strategy.
    */
  val strategy: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.ec2PlacementStrategyMod.PlacementStrategy] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/placementGroup", "PlacementGroup")
@js.native
object PlacementGroup extends js.Object {
  /**
    * Get an existing PlacementGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2PlacementGroupMod.PlacementGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2PlacementGroupMod.PlacementGroupState
  ): atPulumiAwsLib.ec2PlacementGroupMod.PlacementGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2PlacementGroupMod.PlacementGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2PlacementGroupMod.PlacementGroup = js.native
  /**
    * Returns true if the given object is an instance of PlacementGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/placementGroup.PlacementGroup */ scala.Boolean = js.native
}

