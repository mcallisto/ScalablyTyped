package typings
package materialDashUiLib.internalOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps
  extends reactLib.reactMod.Props[Overlay] {
  var autoLockScrolling: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[js.Object]] = js.undefined
  var show: scala.Boolean
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var transitionEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object OverlayProps {
  @scala.inline
  def apply(
    show: scala.Boolean,
    autoLockScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    key: reactLib.reactMod.Key = null,
    onClick: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    ref: reactLib.reactMod.LegacyRef[Overlay] = null,
    style: reactLib.reactMod.CSSProperties = null,
    transitionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): OverlayProps = {
    val __obj = js.Dynamic.literal(show = show)
    if (!js.isUndefined(autoLockScrolling)) __obj.updateDynamic("autoLockScrolling")(autoLockScrolling)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(transitionEnabled)) __obj.updateDynamic("transitionEnabled")(transitionEnabled)
    __obj.asInstanceOf[OverlayProps]
  }
}

