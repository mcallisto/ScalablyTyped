package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Toolbar/Toolbar.ToolbarClassKey>> */
trait PartialClassNameMapToolbarClassKey extends js.Object {
  var dense: js.UndefOr[java.lang.String] = js.undefined
  var gutters: js.UndefOr[java.lang.String] = js.undefined
  var regular: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapToolbarClassKey {
  @scala.inline
  def apply(
    dense: java.lang.String = null,
    gutters: java.lang.String = null,
    regular: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapToolbarClassKey = {
    val __obj = js.Dynamic.literal()
    if (dense != null) __obj.updateDynamic("dense")(dense)
    if (gutters != null) __obj.updateDynamic("gutters")(gutters)
    if (regular != null) __obj.updateDynamic("regular")(regular)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapToolbarClassKey]
  }
}

