package typings
package atPulumiAwsLib.cloudfrontPublicKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyArgs extends js.Object {
  /**
    * An optional comment about the public key.
    */
  val comment: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
    */
  val encodedKey: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name for the public key. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object PublicKeyArgs {
  @scala.inline
  def apply(
    encodedKey: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    comment: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): PublicKeyArgs = {
    val __obj = js.Dynamic.literal(encodedKey = encodedKey.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyArgs]
  }
}

