package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedEnhancedButtonProps[T] extends js.Object {
  var centerRipple: js.UndefOr[scala.Boolean] = js.undefined
  var containerElement: js.UndefOr[reactLib.reactMod.ReactNode | java.lang.String] = js.undefined
  var disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disableKeyboardFocus: js.UndefOr[scala.Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined
  var focusRippleColor: js.UndefOr[java.lang.String] = js.undefined
  var focusRippleOpacity: js.UndefOr[scala.Double] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var keyboardFocused: js.UndefOr[scala.Boolean] = js.undefined
  var onBlur: js.UndefOr[reactLib.reactMod.FocusEventHandler[js.Object]] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[js.Object]] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.FocusEventHandler[js.Object]] = js.undefined
  var onKeyDown: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[js.Object]] = js.undefined
  var onKeyUp: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[js.Object]] = js.undefined
  var onKeyboardFocus: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.FocusEvent[js.Object], 
      /* isKeyboardFocused */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var touchRippleColor: js.UndefOr[java.lang.String] = js.undefined
  var touchRippleOpacity: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SharedEnhancedButtonProps {
  @scala.inline
  def apply[T](
    centerRipple: js.UndefOr[scala.Boolean] = js.undefined,
    containerElement: reactLib.reactMod.ReactNode | java.lang.String = null,
    disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[scala.Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined,
    focusRippleColor: java.lang.String = null,
    focusRippleOpacity: scala.Int | scala.Double = null,
    href: java.lang.String = null,
    keyboardFocused: js.UndefOr[scala.Boolean] = js.undefined,
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
  ): SharedEnhancedButtonProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor)
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused)
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
    __obj.asInstanceOf[SharedEnhancedButtonProps[T]]
  }
}

