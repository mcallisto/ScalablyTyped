package typings
package muicssLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaProps
  extends reactLib.reactMod.TextareaHTMLAttributes[stdLib.HTMLTextAreaElement] {
  var floatingLabel: js.UndefOr[scala.Boolean] = js.undefined
  var hint: js.UndefOr[java.lang.String] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.Ref[stdLib.HTMLTextAreaElement]] = js.undefined
  var invalid: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onLabelClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement]] = js.undefined
}

object TextareaProps {
  @scala.inline
  def apply(
    TextareaHTMLAttributes: reactLib.reactMod.TextareaHTMLAttributes[stdLib.HTMLTextAreaElement] = null,
    floatingLabel: js.UndefOr[scala.Boolean] = js.undefined,
    hint: java.lang.String = null,
    inputRef: reactLib.reactMod.Ref[stdLib.HTMLTextAreaElement] = null,
    invalid: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNode = null,
    onLabelClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement] = null
  ): TextareaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, TextareaHTMLAttributes)
    if (!js.isUndefined(floatingLabel)) __obj.updateDynamic("floatingLabel")(floatingLabel)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (!js.isUndefined(invalid)) __obj.updateDynamic("invalid")(invalid)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onLabelClick != null) __obj.updateDynamic("onLabelClick")(onLabelClick)
    __obj.asInstanceOf[TextareaProps]
  }
}

