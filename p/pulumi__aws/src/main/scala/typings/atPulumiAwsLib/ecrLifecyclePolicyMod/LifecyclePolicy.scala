package typings
package atPulumiAwsLib.ecrLifecyclePolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ecr/lifecyclePolicy", "LifecyclePolicy")
@js.native
class LifecyclePolicy protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a LifecyclePolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: LifecyclePolicyArgs) = this()
  def this(name: java.lang.String, args: LifecyclePolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val policy: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The registry ID where the repository was created.
    */
  val registryId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Name of the repository to apply the policy.
    */
  val repository: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ecr/lifecyclePolicy", "LifecyclePolicy")
@js.native
object LifecyclePolicy extends js.Object {
  /**
    * Get an existing LifecyclePolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicyState
  ): atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
  /**
    * Returns true if the given object is an instance of LifecyclePolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/lifecyclePolicy.LifecyclePolicy */ scala.Boolean = js.native
}

