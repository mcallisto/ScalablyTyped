package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Menu.MenuClassKey>> */
trait PartialStyleRulesMenuClassKey extends js.Object {
  var paper: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesMenuClassKey {
  @scala.inline
  def apply(paper: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null): PartialStyleRulesMenuClassKey = {
    val __obj = js.Dynamic.literal()
    if (paper != null) __obj.updateDynamic("paper")(paper)
    __obj.asInstanceOf[PartialStyleRulesMenuClassKey]
  }
}

