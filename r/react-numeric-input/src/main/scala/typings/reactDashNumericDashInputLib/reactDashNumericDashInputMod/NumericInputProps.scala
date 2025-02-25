package typings
package reactDashNumericDashInputLib.reactDashNumericDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.InputHTMLAttributes<std.HTMLInputElement>, 'min' | 'max' | 'step' | 'onChange' | 'defaultValue' | 'onInvalid' | 'style'> ]: react.react.InputHTMLAttributes<std.HTMLInputElement>[P]} */ trait NumericInputProps extends js.Object {
  var addLabelText: js.UndefOr[java.lang.String] = js.undefined
  var componentClass: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var format: js.UndefOr[js.Function1[/* value */ scala.Double | scala.Null, java.lang.String]] = js.undefined
  var max: js.UndefOr[BoundsFunctionProp] = js.undefined
  var min: js.UndefOr[BoundsFunctionProp] = js.undefined
  var mobile: js.UndefOr[
    scala.Boolean | reactDashNumericDashInputLib.reactDashNumericDashInputLibStrings.auto | (js.Function1[/* component */ NumericInput, scala.Boolean])
  ] = js.undefined
  var noStyle: js.UndefOr[scala.Boolean] = js.undefined
  var noValidate: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var onBlur: js.UndefOr[
    reactLib.reactMod.FocusEventHandler[stdLib.HTMLDivElement | stdLib.HTMLInputElement]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* value */ scala.Double | scala.Null, 
      /* stringValue */ java.lang.String, 
      /* input */ stdLib.HTMLInputElement, 
      scala.Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[
    reactLib.reactMod.FocusEventHandler[stdLib.HTMLDivElement | stdLib.HTMLInputElement]
  ] = js.undefined
  var onInput: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLInputElement]] = js.undefined
  var onInvalid: js.UndefOr[
    js.Function3[
      /* error */ java.lang.String, 
      /* value */ scala.Double | scala.Null, 
      /* stringValue */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var onKeyDown: js.UndefOr[
    reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLDivElement | stdLib.HTMLInputElement]
  ] = js.undefined
  var onSelect: js.UndefOr[reactLib.reactMod.ReactEventHandler[stdLib.HTMLInputElement]] = js.undefined
  var onValid: js.UndefOr[
    js.Function2[
      /* value */ scala.Double | scala.Null, 
      /* stringValue */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var parse: js.UndefOr[js.Function1[/* stringValue */ java.lang.String, scala.Double | scala.Null]] = js.undefined
  var precision: js.UndefOr[
    scala.Double | (js.Function1[/* component */ NumericInput, js.UndefOr[scala.Double | scala.Null]])
  ] = js.undefined
  var snap: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[
    scala.Double | (js.Function2[
      /* component */ NumericInput, 
      /* direction */ java.lang.String, 
      js.UndefOr[scala.Double]
    ])
  ] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.CSSProperties] | scala.Boolean
  ] = js.undefined
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object NumericInputProps {
  @scala.inline
  def apply(
    addLabelText: java.lang.String = null,
    componentClass: java.lang.String = null,
    defaultValue: scala.Double | java.lang.String = null,
    format: /* value */ scala.Double | scala.Null => java.lang.String = null,
    max: BoundsFunctionProp = null,
    min: BoundsFunctionProp = null,
    mobile: scala.Boolean | reactDashNumericDashInputLib.reactDashNumericDashInputLibStrings.auto | (js.Function1[/* component */ NumericInput, scala.Boolean]) = null,
    noStyle: js.UndefOr[scala.Boolean] = js.undefined,
    noValidate: scala.Boolean | java.lang.String = null,
    onBlur: reactLib.reactMod.FocusEventHandler[stdLib.HTMLDivElement | stdLib.HTMLInputElement] = null,
    onChange: (/* value */ scala.Double | scala.Null, /* stringValue */ java.lang.String, /* input */ stdLib.HTMLInputElement) => scala.Unit = null,
    onFocus: reactLib.reactMod.FocusEventHandler[stdLib.HTMLDivElement | stdLib.HTMLInputElement] = null,
    onInput: reactLib.reactMod.FormEventHandler[stdLib.HTMLInputElement] = null,
    onInvalid: (/* error */ java.lang.String, /* value */ scala.Double | scala.Null, /* stringValue */ java.lang.String) => scala.Unit = null,
    onKeyDown: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLDivElement | stdLib.HTMLInputElement] = null,
    onSelect: reactLib.reactMod.ReactEventHandler[stdLib.HTMLInputElement] = null,
    onValid: (/* value */ scala.Double | scala.Null, /* stringValue */ java.lang.String) => scala.Unit = null,
    parse: /* stringValue */ java.lang.String => scala.Double | scala.Null = null,
    precision: scala.Double | (js.Function1[/* component */ NumericInput, js.UndefOr[scala.Double | scala.Null]]) = null,
    snap: js.UndefOr[scala.Boolean] = js.undefined,
    step: scala.Double | (js.Function2[
      /* component */ NumericInput, 
      /* direction */ java.lang.String, 
      js.UndefOr[scala.Double]
    ]) = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    style: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.CSSProperties] | scala.Boolean = null,
    value: scala.Double | java.lang.String = null
  ): NumericInputProps = {
    val __obj = js.Dynamic.literal()
    if (addLabelText != null) __obj.updateDynamic("addLabelText")(addLabelText)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (!js.isUndefined(noStyle)) __obj.updateDynamic("noStyle")(noStyle)
    if (noValidate != null) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onInput != null) __obj.updateDynamic("onInput")(onInput)
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction3(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onValid != null) __obj.updateDynamic("onValid")(js.Any.fromFunction2(onValid))
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction1(parse))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericInputProps]
  }
}

