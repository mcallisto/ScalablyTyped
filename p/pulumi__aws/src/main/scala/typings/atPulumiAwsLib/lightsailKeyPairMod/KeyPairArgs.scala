package typings
package atPulumiAwsLib.lightsailKeyPairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPairArgs extends js.Object {
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * An optional PGP key to encrypt the resulting private
    * key material. Only used when creating a new key pair
    */
  val pgpKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The public key material. This public key will be
    * imported into Lightsail
    */
  val publicKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object KeyPairArgs {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    pgpKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    publicKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): KeyPairArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (pgpKey != null) __obj.updateDynamic("pgpKey")(pgpKey.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairArgs]
  }
}

