package typings
package atPulumiAwsLib.mqConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationArgs extends js.Object {
  /**
    * The broker configuration in XML format.
    * See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html)
    * for supported parameters and format of the XML.
    */
  val data: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The description of the configuration.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of broker engine.
    */
  val engineType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The version of the broker engine.
    */
  val engineVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the configuration
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object ConfigurationArgs {
  @scala.inline
  def apply(
    data: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    engineType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    engineVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): ConfigurationArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationArgs]
  }
}

