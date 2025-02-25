package typings
package atPulumiAwsLib.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codedeploy", "DeploymentConfig")
@js.native
class DeploymentConfig protected ()
  extends atPulumiAwsLib.codedeployDeploymentConfigMod.DeploymentConfig {
  /**
    * Create a DeploymentConfig resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.codedeployDeploymentConfigMod.DeploymentConfigArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.codedeployDeploymentConfigMod.DeploymentConfigArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/codedeploy", "DeploymentConfig")
@js.native
object DeploymentConfig extends js.Object {
  /**
    * Get an existing DeploymentConfig resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.codedeployDeploymentConfigMod.DeploymentConfig = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codedeployDeploymentConfigMod.DeploymentConfigState
  ): atPulumiAwsLib.codedeployDeploymentConfigMod.DeploymentConfig = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codedeployDeploymentConfigMod.DeploymentConfigState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.codedeployDeploymentConfigMod.DeploymentConfig = js.native
  /**
    * Returns true if the given object is an instance of DeploymentConfig.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentConfig.DeploymentConfig */ scala.Boolean = js.native
}

