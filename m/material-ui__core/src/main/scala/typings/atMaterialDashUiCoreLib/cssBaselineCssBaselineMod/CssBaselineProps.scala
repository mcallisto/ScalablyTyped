package typings
package atMaterialDashUiCoreLib.cssBaselineCssBaselineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssBaselineProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactElement] = js.undefined
}

object CssBaselineProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactElement = null): CssBaselineProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[CssBaselineProps]
  }
}

