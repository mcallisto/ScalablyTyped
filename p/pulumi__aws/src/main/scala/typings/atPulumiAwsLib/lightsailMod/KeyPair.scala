package typings
package atPulumiAwsLib.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lightsail", "KeyPair")
@js.native
class KeyPair protected ()
  extends atPulumiAwsLib.lightsailKeyPairMod.KeyPair {
  /**
    * Create a KeyPair resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.lightsailKeyPairMod.KeyPairArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.lightsailKeyPairMod.KeyPairArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/lightsail", "KeyPair")
@js.native
object KeyPair extends js.Object {
  /**
    * Get an existing KeyPair resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lightsailKeyPairMod.KeyPair = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lightsailKeyPairMod.KeyPairState
  ): atPulumiAwsLib.lightsailKeyPairMod.KeyPair = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lightsailKeyPairMod.KeyPairState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.lightsailKeyPairMod.KeyPair = js.native
  /**
    * Returns true if the given object is an instance of KeyPair.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/keyPair.KeyPair */ scala.Boolean = js.native
}

