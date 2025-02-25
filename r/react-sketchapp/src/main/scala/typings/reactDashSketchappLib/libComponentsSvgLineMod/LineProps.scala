package typings
package reactDashSketchappLib.libComponentsSvgLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProps
  extends reactDashSketchappLib.libComponentsSvgPropsMod.PathProps {
  var x1: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
  var x2: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
  var y1: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
  var y2: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
}

object LineProps {
  @scala.inline
  def apply(
    x1: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    x2: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    y1: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    y2: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
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
    translateY: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    x: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    y: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null
  ): LineProps = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
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
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProps]
  }
}

