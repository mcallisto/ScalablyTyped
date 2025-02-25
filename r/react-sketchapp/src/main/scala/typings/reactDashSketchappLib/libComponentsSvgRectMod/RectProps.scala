package typings
package reactDashSketchappLib.libComponentsSvgRectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectProps
  extends reactDashSketchappLib.libComponentsSvgPropsMod.PathProps {
  var height: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
  var rx: js.UndefOr[reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp] = js.undefined
  var ry: js.UndefOr[reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp] = js.undefined
  var width: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
  @JSName("x")
  var x_RectProps: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
  @JSName("y")
  var y_RectProps: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
}

object RectProps {
  @scala.inline
  def apply(
    height: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    width: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    x: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    y: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    clipPath: java.lang.String = null,
    clipRule: reactDashSketchappLib.reactDashSketchappLibStrings.evenodd | reactDashSketchappLib.reactDashSketchappLibStrings.nonzero = null,
    fill: java.lang.String = null,
    fillOpacity: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    fillRule: reactDashSketchappLib.reactDashSketchappLibStrings.evenodd | reactDashSketchappLib.reactDashSketchappLibStrings.nonzero = null,
    name: java.lang.String = null,
    origin: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    originX: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    originY: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    rotate: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    rotation: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    rx: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    ry: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    scale: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    scaleX: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    scaleY: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    skew: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    skewX: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    skewY: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    stroke: java.lang.String = null,
    strokeDasharray: reactDashSketchappLib.libComponentsSvgPropsMod.NumberArrayProp = null,
    strokeDashoffset: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    strokeLinecap: reactDashSketchappLib.reactDashSketchappLibStrings.butt | reactDashSketchappLib.reactDashSketchappLibStrings.square | reactDashSketchappLib.reactDashSketchappLibStrings.round = null,
    strokeLinejoin: reactDashSketchappLib.reactDashSketchappLibStrings.miter | reactDashSketchappLib.reactDashSketchappLibStrings.bevel | reactDashSketchappLib.reactDashSketchappLibStrings.round = null,
    strokeMiterlimit: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    strokeOpacity: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    strokeWidth: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    transform: js.Object | java.lang.String = null,
    translate: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    translateX: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    translateY: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null
  ): RectProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath)
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    if (originY != null) __obj.updateDynamic("originY")(originY.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (skew != null) __obj.updateDynamic("skew")(skew.asInstanceOf[js.Any])
    if (skewX != null) __obj.updateDynamic("skewX")(skewX.asInstanceOf[js.Any])
    if (skewY != null) __obj.updateDynamic("skewY")(skewY.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectProps]
  }
}

