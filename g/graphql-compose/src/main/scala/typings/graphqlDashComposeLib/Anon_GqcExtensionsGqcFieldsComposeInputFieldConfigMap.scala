package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GqcExtensionsGqcFieldsComposeInputFieldConfigMap extends js.Object {
  var _gqcExtensions: js.UndefOr[graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions] = js.undefined
  var _gqcFields: js.UndefOr[graphqlDashComposeLib.libInputTypeComposerMod.ComposeInputFieldConfigMap] = js.undefined
}

object Anon_GqcExtensionsGqcFieldsComposeInputFieldConfigMap {
  @scala.inline
  def apply(
    _gqcExtensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions = null,
    _gqcFields: graphqlDashComposeLib.libInputTypeComposerMod.ComposeInputFieldConfigMap = null
  ): Anon_GqcExtensionsGqcFieldsComposeInputFieldConfigMap = {
    val __obj = js.Dynamic.literal()
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions)
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields)
    __obj.asInstanceOf[Anon_GqcExtensionsGqcFieldsComposeInputFieldConfigMap]
  }
}

