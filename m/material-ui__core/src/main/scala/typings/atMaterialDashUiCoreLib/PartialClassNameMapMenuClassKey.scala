package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Menu/Menu.MenuClassKey>> */
trait PartialClassNameMapMenuClassKey extends js.Object {
  var paper: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapMenuClassKey {
  @scala.inline
  def apply(paper: java.lang.String = null): PartialClassNameMapMenuClassKey = {
    val __obj = js.Dynamic.literal()
    if (paper != null) __obj.updateDynamic("paper")(paper)
    __obj.asInstanceOf[PartialClassNameMapMenuClassKey]
  }
}

