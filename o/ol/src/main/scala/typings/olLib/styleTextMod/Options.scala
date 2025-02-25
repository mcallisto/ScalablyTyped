package typings
package olLib.styleTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var backgroundFill: js.UndefOr[olLib.styleFillMod.default] = js.undefined
  var backgroundStroke: js.UndefOr[olLib.styleStrokeMod.default] = js.undefined
  var fill: js.UndefOr[olLib.styleFillMod.default] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var maxAngle: js.UndefOr[scala.Double] = js.undefined
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  var offsetY: js.UndefOr[scala.Double] = js.undefined
  var overflow: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var placement: js.UndefOr[olLib.styleTextPlacementMod.TextPlacement | java.lang.String] = js.undefined
  var rotateWithView: js.UndefOr[scala.Boolean] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var stroke: js.UndefOr[olLib.styleStrokeMod.default] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  var textBaseline: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    backgroundFill: olLib.styleFillMod.default = null,
    backgroundStroke: olLib.styleStrokeMod.default = null,
    fill: olLib.styleFillMod.default = null,
    font: java.lang.String = null,
    maxAngle: scala.Int | scala.Double = null,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null,
    overflow: js.UndefOr[scala.Boolean] = js.undefined,
    padding: js.Array[scala.Double] = null,
    placement: olLib.styleTextPlacementMod.TextPlacement | java.lang.String = null,
    rotateWithView: js.UndefOr[scala.Boolean] = js.undefined,
    rotation: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    stroke: olLib.styleStrokeMod.default = null,
    text: java.lang.String = null,
    textAlign: java.lang.String = null,
    textBaseline: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (backgroundFill != null) __obj.updateDynamic("backgroundFill")(backgroundFill)
    if (backgroundStroke != null) __obj.updateDynamic("backgroundStroke")(backgroundStroke)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (maxAngle != null) __obj.updateDynamic("maxAngle")(maxAngle.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateWithView)) __obj.updateDynamic("rotateWithView")(rotateWithView)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textBaseline != null) __obj.updateDynamic("textBaseline")(textBaseline)
    __obj.asInstanceOf[Options]
  }
}

