package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexGrowProps extends js.Object {
  var flexGrow: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.GlobalsNumber]] = js.undefined
}

object FlexGrowProps {
  @scala.inline
  def apply(flexGrow: ResponsiveValue[csstypeLib.csstypeMod.GlobalsNumber] = null): FlexGrowProps = {
    val __obj = js.Dynamic.literal()
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexGrowProps]
  }
}

