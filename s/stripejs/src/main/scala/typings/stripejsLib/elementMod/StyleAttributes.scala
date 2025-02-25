package typings
package stripejsLib.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleAttributes extends js.Object {
  var `:-webkit-autofill`: js.UndefOr[StyleAttributes] = js.undefined
  var `::-ms-clear`: js.UndefOr[MSClearAttributes] = js.undefined
  var `::placeholder`: js.UndefOr[StyleAttributes] = js.undefined
  var `::selection`: js.UndefOr[StyleAttributes] = js.undefined
  var `:disabled`: js.UndefOr[StyleAttributes] = js.undefined
  var `:focus`: js.UndefOr[StyleAttributes] = js.undefined
  var `:hover`: js.UndefOr[StyleAttributes] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  var fontSmoothing: js.UndefOr[java.lang.String] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var fontVariant: js.UndefOr[js.Any] = js.undefined
  var iconColor: js.UndefOr[java.lang.String] = js.undefined
  var letterSpacing: js.UndefOr[java.lang.String] = js.undefined
  var lineHeight: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Add padding to the element
    * NOTE: Only available for the `idealBank` Element
    */
  var padding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Align text inside the element
    * NOTE: Only available for the `cardNumber`, `cardExpiry`, and `cardCvc` Elements
    */
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  var textDecoration: js.UndefOr[java.lang.String] = js.undefined
  var textShadow: js.UndefOr[java.lang.String] = js.undefined
  var textTransform: js.UndefOr[java.lang.String] = js.undefined
}

object StyleAttributes {
  @scala.inline
  def apply(
    `:-webkit-autofill`: StyleAttributes = null,
    `::-ms-clear`: MSClearAttributes = null,
    `::placeholder`: StyleAttributes = null,
    `::selection`: StyleAttributes = null,
    `:disabled`: StyleAttributes = null,
    `:focus`: StyleAttributes = null,
    `:hover`: StyleAttributes = null,
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: java.lang.String = null,
    fontSmoothing: java.lang.String = null,
    fontStyle: java.lang.String = null,
    fontVariant: js.Any = null,
    iconColor: java.lang.String = null,
    letterSpacing: java.lang.String = null,
    lineHeight: java.lang.String = null,
    padding: java.lang.String = null,
    textAlign: java.lang.String = null,
    textDecoration: java.lang.String = null,
    textShadow: java.lang.String = null,
    textTransform: java.lang.String = null
  ): StyleAttributes = {
    val __obj = js.Dynamic.literal()
    if (`:-webkit-autofill` != null) __obj.updateDynamic(":-webkit-autofill")(`:-webkit-autofill`)
    if (`::-ms-clear` != null) __obj.updateDynamic("::-ms-clear")(`::-ms-clear`)
    if (`::placeholder` != null) __obj.updateDynamic("::placeholder")(`::placeholder`)
    if (`::selection` != null) __obj.updateDynamic("::selection")(`::selection`)
    if (`:disabled` != null) __obj.updateDynamic(":disabled")(`:disabled`)
    if (`:focus` != null) __obj.updateDynamic(":focus")(`:focus`)
    if (`:hover` != null) __obj.updateDynamic(":hover")(`:hover`)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (fontSmoothing != null) __obj.updateDynamic("fontSmoothing")(fontSmoothing)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant)
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor)
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    if (textShadow != null) __obj.updateDynamic("textShadow")(textShadow)
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform)
    __obj.asInstanceOf[StyleAttributes]
  }
}

