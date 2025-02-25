package typings
package antdDashMobileLib.esDrawerPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var onOpenChange: js.UndefOr[js.Function1[/* isOpen */ scala.Boolean, scala.Unit]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.left | antdDashMobileLib.antdDashMobileLibStrings.right | antdDashMobileLib.antdDashMobileLibStrings.top | antdDashMobileLib.antdDashMobileLibStrings.bottom
  ] = js.undefined
  var sidebar: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(
    onOpenChange: /* isOpen */ scala.Boolean => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    position: antdDashMobileLib.antdDashMobileLibStrings.left | antdDashMobileLib.antdDashMobileLibStrings.right | antdDashMobileLib.antdDashMobileLibStrings.top | antdDashMobileLib.antdDashMobileLibStrings.bottom = null,
    sidebar: reactLib.reactMod.ReactNode = null
  ): DrawerProps = {
    val __obj = js.Dynamic.literal()
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerProps]
  }
}

