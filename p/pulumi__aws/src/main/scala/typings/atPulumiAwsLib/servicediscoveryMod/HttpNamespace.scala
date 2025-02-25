package typings
package atPulumiAwsLib.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicediscovery", "HttpNamespace")
@js.native
class HttpNamespace protected ()
  extends atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespace {
  /**
    * Create a HttpNamespace resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespaceArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/servicediscovery", "HttpNamespace")
@js.native
object HttpNamespace extends js.Object {
  /**
    * Get an existing HttpNamespace resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespace = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespaceState
  ): atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespace = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespaceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespace = js.native
  /**
    * Returns true if the given object is an instance of HttpNamespace.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/httpNamespace.HttpNamespace */ scala.Boolean = js.native
}

