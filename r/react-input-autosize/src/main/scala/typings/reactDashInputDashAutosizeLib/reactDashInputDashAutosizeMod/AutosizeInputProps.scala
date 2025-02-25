package typings
package reactDashInputDashAutosizeLib.reactDashInputDashAutosizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutosizeInputProps
  extends reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement]
     with reactLib.reactMod.ClassAttributes[stdLib.HTMLInputElement] {
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  var inputRef: js.UndefOr[js.Function1[/* instance */ stdLib.HTMLInputElement | scala.Null, scala.Unit]] = js.undefined
  var inputStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var minWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var onAutosize: js.UndefOr[js.Function1[/* inputWidth */ java.lang.String | scala.Double, scala.Unit]] = js.undefined
  var placeholderIsMinWidth: js.UndefOr[scala.Boolean] = js.undefined
}

object AutosizeInputProps {
  @scala.inline
  def apply(
    ClassAttributes: reactLib.reactMod.ClassAttributes[stdLib.HTMLInputElement] = null,
    InputHTMLAttributes: reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] = null,
    inputClassName: java.lang.String = null,
    inputRef: /* instance */ stdLib.HTMLInputElement | scala.Null => scala.Unit = null,
    inputStyle: reactLib.reactMod.CSSProperties = null,
    minWidth: java.lang.String | scala.Double = null,
    onAutosize: /* inputWidth */ java.lang.String | scala.Double => scala.Unit = null,
    placeholderIsMinWidth: js.UndefOr[scala.Boolean] = js.undefined
  ): AutosizeInputProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onAutosize != null) __obj.updateDynamic("onAutosize")(js.Any.fromFunction1(onAutosize))
    if (!js.isUndefined(placeholderIsMinWidth)) __obj.updateDynamic("placeholderIsMinWidth")(placeholderIsMinWidth)
    __obj.asInstanceOf[AutosizeInputProps]
  }
}

