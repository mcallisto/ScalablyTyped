package typings
package antdDashMobileLib.libInputDashItemPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputItemPropsType extends js.Object {
  var clear: js.UndefOr[scala.Boolean] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var extra: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var labelNumber: js.UndefOr[scala.Double] = js.undefined
  var labelPosition: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.left | antdDashMobileLib.antdDashMobileLibStrings.top
  ] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var moneyKeyboardAlign: js.UndefOr[java.lang.String] = js.undefined
  var moneyKeyboardHeader: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var moneyKeyboardWrapProps: js.UndefOr[js.Object] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onBlur: js.UndefOr[InputEventHandler] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[InputEventHandler] = js.undefined
  var onVirtualKeyboardConfirm: js.UndefOr[InputEventHandler] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var textAlign: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.left | antdDashMobileLib.antdDashMobileLibStrings.center
  ] = js.undefined
  var `type`: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.text | antdDashMobileLib.antdDashMobileLibStrings.bankCard | antdDashMobileLib.antdDashMobileLibStrings.phone | antdDashMobileLib.antdDashMobileLibStrings.password | antdDashMobileLib.antdDashMobileLibStrings.number | antdDashMobileLib.antdDashMobileLibStrings.digit | antdDashMobileLib.antdDashMobileLibStrings.money
  ] = js.undefined
  var updatePlaceholder: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object InputItemPropsType {
  @scala.inline
  def apply(
    clear: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    extra: reactLib.reactMod.ReactNode = null,
    labelNumber: scala.Int | scala.Double = null,
    labelPosition: antdDashMobileLib.antdDashMobileLibStrings.left | antdDashMobileLib.antdDashMobileLibStrings.top = null,
    locale: js.Object = null,
    maxLength: scala.Int | scala.Double = null,
    moneyKeyboardAlign: java.lang.String = null,
    moneyKeyboardHeader: reactLib.reactMod.ReactNode = null,
    moneyKeyboardWrapProps: js.Object = null,
    name: java.lang.String = null,
    onBlur: InputEventHandler = null,
    onChange: /* value */ java.lang.String => scala.Unit = null,
    onFocus: InputEventHandler = null,
    onVirtualKeyboardConfirm: InputEventHandler = null,
    placeholder: java.lang.String = null,
    textAlign: antdDashMobileLib.antdDashMobileLibStrings.left | antdDashMobileLib.antdDashMobileLibStrings.center = null,
    `type`: antdDashMobileLib.antdDashMobileLibStrings.text | antdDashMobileLib.antdDashMobileLibStrings.bankCard | antdDashMobileLib.antdDashMobileLibStrings.phone | antdDashMobileLib.antdDashMobileLibStrings.password | antdDashMobileLib.antdDashMobileLibStrings.number | antdDashMobileLib.antdDashMobileLibStrings.digit | antdDashMobileLib.antdDashMobileLibStrings.money = null,
    updatePlaceholder: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
  ): InputItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (labelNumber != null) __obj.updateDynamic("labelNumber")(labelNumber.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (moneyKeyboardAlign != null) __obj.updateDynamic("moneyKeyboardAlign")(moneyKeyboardAlign)
    if (moneyKeyboardHeader != null) __obj.updateDynamic("moneyKeyboardHeader")(moneyKeyboardHeader.asInstanceOf[js.Any])
    if (moneyKeyboardWrapProps != null) __obj.updateDynamic("moneyKeyboardWrapProps")(moneyKeyboardWrapProps)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onVirtualKeyboardConfirm != null) __obj.updateDynamic("onVirtualKeyboardConfirm")(onVirtualKeyboardConfirm)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(updatePlaceholder)) __obj.updateDynamic("updatePlaceholder")(updatePlaceholder)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[InputItemPropsType]
  }
}

