package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegendItem extends js.Object {
  var fillStyle: js.UndefOr[java.lang.String] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var lineCap: js.UndefOr[
    chartDotJsLib.chartDotJsLibStrings.butt | chartDotJsLib.chartDotJsLibStrings.round | chartDotJsLib.chartDotJsLibStrings.square
  ] = js.undefined
  var lineDash: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var lineDashOffset: js.UndefOr[scala.Double] = js.undefined
  var lineJoin: js.UndefOr[
    chartDotJsLib.chartDotJsLibStrings.bevel | chartDotJsLib.chartDotJsLibStrings.round | chartDotJsLib.chartDotJsLibStrings.miter
  ] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var pointStyle: js.UndefOr[PointStyle] = js.undefined
  var strokeStyle: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ChartLegendItem {
  @scala.inline
  def apply(
    fillStyle: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    lineCap: chartDotJsLib.chartDotJsLibStrings.butt | chartDotJsLib.chartDotJsLibStrings.round | chartDotJsLib.chartDotJsLibStrings.square = null,
    lineDash: js.Array[scala.Double] = null,
    lineDashOffset: scala.Int | scala.Double = null,
    lineJoin: chartDotJsLib.chartDotJsLibStrings.bevel | chartDotJsLib.chartDotJsLibStrings.round | chartDotJsLib.chartDotJsLibStrings.miter = null,
    lineWidth: scala.Int | scala.Double = null,
    pointStyle: PointStyle = null,
    strokeStyle: java.lang.String = null,
    text: java.lang.String = null
  ): ChartLegendItem = {
    val __obj = js.Dynamic.literal()
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineDash != null) __obj.updateDynamic("lineDash")(lineDash)
    if (lineDashOffset != null) __obj.updateDynamic("lineDashOffset")(lineDashOffset.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (pointStyle != null) __obj.updateDynamic("pointStyle")(pointStyle)
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ChartLegendItem]
  }
}

