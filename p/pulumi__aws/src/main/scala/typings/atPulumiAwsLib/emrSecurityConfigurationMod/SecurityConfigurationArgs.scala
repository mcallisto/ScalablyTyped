package typings
package atPulumiAwsLib.emrSecurityConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityConfigurationArgs extends js.Object {
  /**
    * A JSON formatted Security Configuration
    */
  val configuration: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The Name of the EMR Security Configuration
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object SecurityConfigurationArgs {
  @scala.inline
  def apply(
    configuration: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): SecurityConfigurationArgs = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfigurationArgs]
  }
}

