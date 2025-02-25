package typings
package atPulumiAwsLib.cloudfrontPublicKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudfront/publicKey", "PublicKey")
@js.native
class PublicKey protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a PublicKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: PublicKeyArgs) = this()
  def this(name: java.lang.String, args: PublicKeyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Internal value used by CloudFront to allow future updates to the public key configuration.
    */
  val callerReference: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * An optional comment about the public key.
    */
  val comment: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
    */
  val encodedKey: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The current version of the public key. For example: `E2QWRUHAPOMQZL`.
    */
  val etag: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name for the public key. Conflicts with `name`.
    */
  val namePrefix: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudfront/publicKey", "PublicKey")
@js.native
object PublicKey extends js.Object {
  /**
    * Get an existing PublicKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudfrontPublicKeyMod.PublicKey = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudfrontPublicKeyMod.PublicKeyState
  ): atPulumiAwsLib.cloudfrontPublicKeyMod.PublicKey = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudfrontPublicKeyMod.PublicKeyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudfrontPublicKeyMod.PublicKey = js.native
  /**
    * Returns true if the given object is an instance of PublicKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/publicKey.PublicKey */ scala.Boolean = js.native
}

