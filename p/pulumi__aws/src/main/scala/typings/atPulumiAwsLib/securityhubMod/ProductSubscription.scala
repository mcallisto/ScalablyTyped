package typings
package atPulumiAwsLib.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/securityhub", "ProductSubscription")
@js.native
class ProductSubscription protected ()
  extends atPulumiAwsLib.securityhubProductSubscriptionMod.ProductSubscription {
  /**
    * Create a ProductSubscription resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.securityhubProductSubscriptionMod.ProductSubscriptionArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.securityhubProductSubscriptionMod.ProductSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/securityhub", "ProductSubscription")
@js.native
object ProductSubscription extends js.Object {
  /**
    * Get an existing ProductSubscription resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.securityhubProductSubscriptionMod.ProductSubscription = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.securityhubProductSubscriptionMod.ProductSubscriptionState
  ): atPulumiAwsLib.securityhubProductSubscriptionMod.ProductSubscription = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.securityhubProductSubscriptionMod.ProductSubscriptionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.securityhubProductSubscriptionMod.ProductSubscription = js.native
  /**
    * Returns true if the given object is an instance of ProductSubscription.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/productSubscription.ProductSubscription */ scala.Boolean = js.native
}

