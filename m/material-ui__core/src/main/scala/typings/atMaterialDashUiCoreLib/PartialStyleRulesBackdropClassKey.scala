package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Backdrop.BackdropClassKey>> */
trait PartialStyleRulesBackdropClassKey extends js.Object {
  var invisible: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesBackdropClassKey {
  @scala.inline
  def apply(
    invisible: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
  ): PartialStyleRulesBackdropClassKey = {
    val __obj = js.Dynamic.literal()
    if (invisible != null) __obj.updateDynamic("invisible")(invisible)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesBackdropClassKey]
  }
}

