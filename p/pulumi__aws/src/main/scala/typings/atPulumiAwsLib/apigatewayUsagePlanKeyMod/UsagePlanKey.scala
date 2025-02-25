package typings
package atPulumiAwsLib.apigatewayUsagePlanKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/usagePlanKey", "UsagePlanKey")
@js.native
class UsagePlanKey protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a UsagePlanKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: UsagePlanKeyArgs) = this()
  def this(name: java.lang.String, args: UsagePlanKeyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The identifier of the API key resource.
    */
  val keyId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The type of the API key resource. Currently, the valid key type is API_KEY.
    */
  val keyType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of a usage plan key.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The Id of the usage plan resource representing to associate the key to.
    */
  val usagePlanId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The value of a usage plan key.
    */
  val value: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/usagePlanKey", "UsagePlanKey")
@js.native
object UsagePlanKey extends js.Object {
  /**
    * Get an existing UsagePlanKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayUsagePlanKeyMod.UsagePlanKey = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayUsagePlanKeyMod.UsagePlanKeyState
  ): atPulumiAwsLib.apigatewayUsagePlanKeyMod.UsagePlanKey = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayUsagePlanKeyMod.UsagePlanKeyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayUsagePlanKeyMod.UsagePlanKey = js.native
  /**
    * Returns true if the given object is an instance of UsagePlanKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/usagePlanKey.UsagePlanKey */ scala.Boolean = js.native
}

