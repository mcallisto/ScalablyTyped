package typings
package atMaterialDashUiCoreLib.selectSelectInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectInputProps extends js.Object {
  var IconComponent: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var MenuProps: js.UndefOr[atMaterialDashUiCoreLib.PartialMenuProps] = js.undefined
  var SelectDisplayProps: js.UndefOr[reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement]] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var autoWidth: scala.Boolean
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var inputRef: js.UndefOr[
    js.Function1[
      /* ref */ stdLib.HTMLSelectElement | atMaterialDashUiCoreLib.Anon_NodeValue, 
      scala.Unit
    ]
  ] = js.undefined
  var multiple: scala.Boolean
  var name: js.UndefOr[java.lang.String] = js.undefined
  var native: scala.Boolean
  var onBlur: js.UndefOr[reactLib.reactMod.FocusEventHandler[_]] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLSelectElement], 
      /* child */ reactLib.reactMod.ReactNode, 
      scala.Unit
    ]
  ] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* event */ reactLib.reactMod.ChangeEvent[js.Object], scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.FocusEventHandler[_]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* event */ reactLib.reactMod.ChangeEvent[js.Object], scala.Unit]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var renderValue: js.UndefOr[
    js.Function1[
      /* value */ java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double | scala.Boolean]), 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var value: java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double | scala.Boolean])
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled
  ] = js.undefined
}

object SelectInputProps {
  @scala.inline
  def apply(
    autoWidth: scala.Boolean,
    multiple: scala.Boolean,
    native: scala.Boolean,
    value: java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double | scala.Boolean]),
    IconComponent: reactLib.reactMod.ReactType[_] = null,
    MenuProps: atMaterialDashUiCoreLib.PartialMenuProps = null,
    SelectDisplayProps: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    inputRef: /* ref */ stdLib.HTMLSelectElement | atMaterialDashUiCoreLib.Anon_NodeValue => scala.Unit = null,
    name: java.lang.String = null,
    onBlur: reactLib.reactMod.FocusEventHandler[_] = null,
    onChange: (/* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLSelectElement], /* child */ reactLib.reactMod.ReactNode) => scala.Unit = null,
    onClose: /* event */ reactLib.reactMod.ChangeEvent[js.Object] => scala.Unit = null,
    onFocus: reactLib.reactMod.FocusEventHandler[_] = null,
    onOpen: /* event */ reactLib.reactMod.ChangeEvent[js.Object] => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    renderValue: /* value */ java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double | scala.Boolean]) => reactLib.reactMod.ReactNode = null,
    tabIndex: scala.Int | scala.Double = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled = null
  ): SelectInputProps = {
    val __obj = js.Dynamic.literal(autoWidth = autoWidth, multiple = multiple, native = native, value = value.asInstanceOf[js.Any])
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (MenuProps != null) __obj.updateDynamic("MenuProps")(MenuProps)
    if (SelectDisplayProps != null) __obj.updateDynamic("SelectDisplayProps")(SelectDisplayProps)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (renderValue != null) __obj.updateDynamic("renderValue")(js.Any.fromFunction1(renderValue))
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectInputProps]
  }
}

