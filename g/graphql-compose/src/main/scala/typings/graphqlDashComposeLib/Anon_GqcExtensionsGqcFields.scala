package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GqcExtensionsGqcFields extends js.Object {
  var _gqcExtensions: js.UndefOr[graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions] = js.undefined
  var _gqcFields: js.UndefOr[graphqlDashComposeLib.esmInputTypeComposerMod.ComposeInputFieldConfigMap] = js.undefined
}

object Anon_GqcExtensionsGqcFields {
  @scala.inline
  def apply(
    _gqcExtensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = null,
    _gqcFields: graphqlDashComposeLib.esmInputTypeComposerMod.ComposeInputFieldConfigMap = null
  ): Anon_GqcExtensionsGqcFields = {
    val __obj = js.Dynamic.literal()
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions)
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields)
    __obj.asInstanceOf[Anon_GqcExtensionsGqcFields]
  }
}

