package typings
package atPulumiAwsLib.cfgRecorderStatusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg/recorderStatus", "RecorderStatus")
@js.native
class RecorderStatus protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a RecorderStatus resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: RecorderStatusArgs) = this()
  def this(name: java.lang.String, args: RecorderStatusArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Whether the configuration recorder should be enabled or disabled.
    */
  val isEnabled: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * The name of the recorder
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cfg/recorderStatus", "RecorderStatus")
@js.native
object RecorderStatus extends js.Object {
  /**
    * Get an existing RecorderStatus resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cfgRecorderStatusMod.RecorderStatus = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cfgRecorderStatusMod.RecorderStatusState
  ): atPulumiAwsLib.cfgRecorderStatusMod.RecorderStatus = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cfgRecorderStatusMod.RecorderStatusState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cfgRecorderStatusMod.RecorderStatus = js.native
  /**
    * Returns true if the given object is an instance of RecorderStatus.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/recorderStatus.RecorderStatus */ scala.Boolean = js.native
}

