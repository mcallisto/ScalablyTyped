package typings
package atPulumiAwsLib.dynamodbGlobalTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dynamodb/globalTable", "GlobalTable")
@js.native
class GlobalTable protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a GlobalTable resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: GlobalTableArgs) = this()
  def this(name: java.lang.String, args: GlobalTableArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the DynamoDB Global Table
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the global table. Must match underlying DynamoDB Table names in all regions.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
    */
  val replicas: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_RegionName]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/dynamodb/globalTable", "GlobalTable")
@js.native
object GlobalTable extends js.Object {
  /**
    * Get an existing GlobalTable resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.dynamodbGlobalTableMod.GlobalTable = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.dynamodbGlobalTableMod.GlobalTableState
  ): atPulumiAwsLib.dynamodbGlobalTableMod.GlobalTable = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.dynamodbGlobalTableMod.GlobalTableState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.dynamodbGlobalTableMod.GlobalTable = js.native
  /**
    * Returns true if the given object is an instance of GlobalTable.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/globalTable.GlobalTable */ scala.Boolean = js.native
}

