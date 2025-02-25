package typings
package antdLib.esMenuMenuItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var level: js.UndefOr[scala.Double] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* param */ antdLib.esMenuMod.ClickParam, scala.Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ antdLib.Anon_DomEvent, scala.Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ antdLib.Anon_DomEvent, scala.Unit]] = js.undefined
  var rootPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    level: scala.Int | scala.Double = null,
    onClick: /* param */ antdLib.esMenuMod.ClickParam => scala.Unit = null,
    onMouseEnter: /* e */ antdLib.Anon_DomEvent => scala.Unit = null,
    onMouseLeave: /* e */ antdLib.Anon_DomEvent => scala.Unit = null,
    rootPrefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    title: reactLib.reactMod.ReactNode = null
  ): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemProps]
  }
}

