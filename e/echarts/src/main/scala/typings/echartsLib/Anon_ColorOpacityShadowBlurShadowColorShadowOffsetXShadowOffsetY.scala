package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorOpacityShadowBlurShadowColorShadowOffsetXShadowOffsetY extends js.Object {
  /**
    * Line color.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for example
    * `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.radar.data.lineStyle)
    *
    *
    * @default
    * "#000"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.lineStyle.color
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not
    * be drawn when set to 0.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.lineStyle.opacity
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.radar.data.lineStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.lineStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.lineStyle.shadowColor
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.lineStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.lineStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  /**
    * line type.
    *
    * Options are:
    *
    * + `'solid'`
    * + `'dashed'`
    * + `'dotted'`
    *
    *
    * @default
    * "solid"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.lineStyle.type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * line width.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.lineStyle.width
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ColorOpacityShadowBlurShadowColorShadowOffsetXShadowOffsetY {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    shadowBlur: scala.Int | scala.Double = null,
    shadowColor: java.lang.String = null,
    shadowOffsetX: scala.Int | scala.Double = null,
    shadowOffsetY: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Anon_ColorOpacityShadowBlurShadowColorShadowOffsetXShadowOffsetY = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorOpacityShadowBlurShadowColorShadowOffsetXShadowOffsetY]
  }
}

