package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.SwitchesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps extends CommonEnhancedSwitchProps[Checkbox] {
  var checkedIcon: js.UndefOr[reactLib.reactMod.ReactElement] = js.undefined
  var iconStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var inputStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var labelPosition: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.left | materialDashUiLib.materialDashUiLibStrings.right
  ] = js.undefined
  var labelStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var onCheck: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* checked */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var uncheckedIcon: js.UndefOr[reactLib.reactMod.ReactElement] = js.undefined
   // Normally an SvgIcon
  var valueLink: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.ReactLink[scala.Boolean]] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    CommonEnhancedSwitchProps: CommonEnhancedSwitchProps[Checkbox] = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    checkedIcon: reactLib.reactMod.ReactElement = null,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    iconStyle: reactLib.reactMod.CSSProperties = null,
    inputStyle: reactLib.reactMod.CSSProperties = null,
    labelPosition: materialDashUiLib.materialDashUiLibStrings.left | materialDashUiLib.materialDashUiLibStrings.right = null,
    labelStyle: reactLib.reactMod.CSSProperties = null,
    onCheck: (/* event */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], /* checked */ scala.Boolean) => scala.Unit = null,
    style: reactLib.reactMod.CSSProperties = null,
    uncheckedIcon: reactLib.reactMod.ReactElement = null,
    valueLink: materialDashUiLib.underscoreUnderscoreMaterialUINs.ReactLink[scala.Boolean] = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, CommonEnhancedSwitchProps)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (onCheck != null) __obj.updateDynamic("onCheck")(js.Any.fromFunction2(onCheck))
    if (style != null) __obj.updateDynamic("style")(style)
    if (uncheckedIcon != null) __obj.updateDynamic("uncheckedIcon")(uncheckedIcon)
    if (valueLink != null) __obj.updateDynamic("valueLink")(valueLink)
    __obj.asInstanceOf[CheckboxProps]
  }
}

