package typings
package atPulumiAwsLib.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appmesh", "VirtualNode")
@js.native
class VirtualNode protected ()
  extends atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNode {
  /**
    * Create a VirtualNode resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNodeArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNodeArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/appmesh", "VirtualNode")
@js.native
object VirtualNode extends js.Object {
  /**
    * Get an existing VirtualNode resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNode = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNodeState
  ): atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNode = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNodeState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNode = js.native
  /**
    * Returns true if the given object is an instance of VirtualNode.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualNode.VirtualNode */ scala.Boolean = js.native
}

