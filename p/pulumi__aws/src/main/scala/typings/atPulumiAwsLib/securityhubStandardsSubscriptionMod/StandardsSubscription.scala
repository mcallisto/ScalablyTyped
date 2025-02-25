package typings
package atPulumiAwsLib.securityhubStandardsSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/securityhub/standardsSubscription", "StandardsSubscription")
@js.native
class StandardsSubscription protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a StandardsSubscription resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: StandardsSubscriptionArgs) = this()
  def this(name: java.lang.String, args: StandardsSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of a standard - see below.
    */
  val standardsArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/securityhub/standardsSubscription", "StandardsSubscription")
@js.native
object StandardsSubscription extends js.Object {
  /**
    * Get an existing StandardsSubscription resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.securityhubStandardsSubscriptionMod.StandardsSubscription = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.securityhubStandardsSubscriptionMod.StandardsSubscriptionState
  ): atPulumiAwsLib.securityhubStandardsSubscriptionMod.StandardsSubscription = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.securityhubStandardsSubscriptionMod.StandardsSubscriptionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.securityhubStandardsSubscriptionMod.StandardsSubscription = js.native
  /**
    * Returns true if the given object is an instance of StandardsSubscription.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/standardsSubscription.StandardsSubscription */ scala.Boolean = js.native
}

