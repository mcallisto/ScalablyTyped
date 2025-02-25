package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BarBorderColorBarBorderRadius extends js.Object {
  /**
    * The bodrder color of bar.
    *
    *
    * @default
    * '#000'
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.data.itemStyle.barBorderColor
    */
  var barBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The radius of rounded corner.
    * Its unit is px.
    * And it supports use array to respectively specify the
    * 4 corner radiuses.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.bar.data.itemStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.data.itemStyle.barBorderRadius
    */
  var barBorderRadius: js.UndefOr[js.Array[_] | scala.Double] = js.undefined
  /**
    * The bodrder width of bar. defaults to have no border.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.data.itemStyle.barBorderWidth
    */
  var barBorderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Bar color..
    *
    *
    * @default
    * "auto"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.data.itemStyle.color
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.data.itemStyle.emphasis
    */
  var emphasis: js.UndefOr[Anon_BarBorderColorBarBorderWidth] = js.undefined
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not
    * be drawn when set to 0.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.data.itemStyle.opacity
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.bar.data.itemStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.data.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.data.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.data.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.data.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BarBorderColorBarBorderRadius {
  @scala.inline
  def apply(
    barBorderColor: java.lang.String = null,
    barBorderRadius: js.Array[_] | scala.Double = null,
    barBorderWidth: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    emphasis: Anon_BarBorderColorBarBorderWidth = null,
    opacity: scala.Int | scala.Double = null,
    shadowBlur: scala.Int | scala.Double = null,
    shadowColor: java.lang.String = null,
    shadowOffsetX: scala.Int | scala.Double = null,
    shadowOffsetY: scala.Int | scala.Double = null
  ): Anon_BarBorderColorBarBorderRadius = {
    val __obj = js.Dynamic.literal()
    if (barBorderColor != null) __obj.updateDynamic("barBorderColor")(barBorderColor)
    if (barBorderRadius != null) __obj.updateDynamic("barBorderRadius")(barBorderRadius.asInstanceOf[js.Any])
    if (barBorderWidth != null) __obj.updateDynamic("barBorderWidth")(barBorderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BarBorderColorBarBorderRadius]
  }
}

