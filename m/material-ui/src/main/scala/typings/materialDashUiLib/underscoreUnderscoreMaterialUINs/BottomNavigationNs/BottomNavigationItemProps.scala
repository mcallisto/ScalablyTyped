package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.BottomNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomNavigationItemProps
  extends materialDashUiLib.underscoreUnderscoreMaterialUINs.SharedEnhancedButtonProps[BottomNavigationItem] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object BottomNavigationItemProps {
  @scala.inline
  def apply(
    centerRipple: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    containerElement: reactLib.reactMod.ReactNode | java.lang.String = null,
    disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[scala.Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined,
    focusRippleColor: java.lang.String = null,
    focusRippleOpacity: scala.Int | scala.Double = null,
    href: java.lang.String = null,
    icon: reactLib.reactMod.ReactNode = null,
    keyboardFocused: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNode = null,
    onBlur: reactLib.reactMod.FocusEventHandler[js.Object] = null,
    onClick: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onFocus: reactLib.reactMod.FocusEventHandler[js.Object] = null,
    onKeyDown: reactLib.reactMod.KeyboardEventHandler[js.Object] = null,
    onKeyUp: reactLib.reactMod.KeyboardEventHandler[js.Object] = null,
    onKeyboardFocus: (/* e */ reactLib.reactMod.FocusEvent[js.Object], /* isKeyboardFocused */ scala.Boolean) => scala.Unit = null,
    style: reactLib.reactMod.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    target: java.lang.String = null,
    touchRippleColor: java.lang.String = null,
    touchRippleOpacity: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): BottomNavigationItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (className != null) __obj.updateDynamic("className")(className)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor)
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor)
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BottomNavigationItemProps]
  }
}

