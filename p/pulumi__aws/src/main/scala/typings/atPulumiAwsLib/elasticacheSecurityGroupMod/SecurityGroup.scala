package typings
package atPulumiAwsLib.elasticacheSecurityGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticache/securityGroup", "SecurityGroup")
@js.native
class SecurityGroup protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a SecurityGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: SecurityGroupArgs) = this()
  def this(name: java.lang.String, args: SecurityGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val description: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Name for the cache security group. This value is stored as a lowercase string.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * List of EC2 security group names to be
    * authorized for ingress to the cache security group
    */
  val securityGroupNames: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticache/securityGroup", "SecurityGroup")
@js.native
object SecurityGroup extends js.Object {
  /**
    * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticacheSecurityGroupMod.SecurityGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticacheSecurityGroupMod.SecurityGroupState
  ): atPulumiAwsLib.elasticacheSecurityGroupMod.SecurityGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticacheSecurityGroupMod.SecurityGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elasticacheSecurityGroupMod.SecurityGroup = js.native
  /**
    * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/securityGroup.SecurityGroup */ scala.Boolean = js.native
}

