package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationAnimationDelay extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.animation
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports
    * callback function for different data to have different animation
    * effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter.markLine)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter.markLine)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback
    * function for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter.markLine)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter.markLine)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.animationEasing
    */
  var animationEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger
    * than threshold.
    *
    *
    * @default
    * 2000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.animationThreshold
    */
  var animationThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Data array of marking line.
    * Every array item can be an array of one or two values, representing
    * starting and ending point of the line, and every item is
    * an object.
    * Here are several ways to assign the positions of starting
    * and ending point.
    *
    * 1. Assign coordinate according to container with
    * [x](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.0.x)
    * ,
    * [y](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.0.y)
    * attribute, in which pixel values and percentage are supported.
    *
    * 2. Assign coordinate position with
    * [coord](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.0.coord)
    * attribute, in which `'min'`, `'max'`, `'average'` are supported
    * for each dimension.
    *
    * 3. Use
    * [type](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.0.type)
    * attribute to mark the maximum and minimum values in the series,
    * in which
    * [valueIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.0.valueIndex)
    * or
    * [valueDim](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.0.valueDim)
    * can be used to assign the dimension.
    *
    * 4.
    * You may also create a mark line in Cartesian coordinate at
    * a specific position in X or Y axis by assigning `xAxis` or
    * `yAxis`. See
    * [scatter-weight](https://ecomfe.github.io/echarts-examples/public/editor.html?c=scatter-weight)
    * for example.
    *
    * When multiple attributes exist, priority is as the above
    * order.
    *
    * You may also set the type of mark line through `type`, stating
    * whether it is for the maximum value or average value.
    * Likewise, dimensions can be assigned through `valueIndex`.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter.markLine)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data
    */
  var data: js.UndefOr[Anon_0] = js.undefined
  /**
    * Mark line text.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.label
    */
  var label: js.UndefOr[Anon_Emphasis] = js.undefined
  /**
    * Mark line style.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorCurveness] = js.undefined
  /**
    * Precison of marking line value, which is useful when displaying
    * average value mark line.
    *
    *
    * @default
    * 2
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.precision
    */
  var precision: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to
    * mouse events.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.silent
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Symbol type at the two ends of the mark line.
    * It can be an array for two ends, or assigned seperately.
    * See
    * [data.symbol](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.0.symbol)
    * for more format information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.symbol
    */
  var symbol: js.UndefOr[js.Array[_] | java.lang.String] = js.undefined
  /**
    * Symbol size at the two ends of the mark line.
    * It can be an array for two ends, or assigned seperately.
    *
    * **Attention:** You cannot assgin width and height seperately
    * as normal `symbolSize`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | scala.Double] = js.undefined
}

object Anon_AnimationAnimationDelay {
  @scala.inline
  def apply(
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    animationDelay: js.Function | scala.Double = null,
    animationDelayUpdate: js.Function | scala.Double = null,
    animationDuration: js.Function | scala.Double = null,
    animationDurationUpdate: js.Function | scala.Double = null,
    animationEasing: java.lang.String = null,
    animationEasingUpdate: java.lang.String = null,
    animationThreshold: scala.Int | scala.Double = null,
    data: Anon_0 = null,
    label: Anon_Emphasis = null,
    lineStyle: Anon_ColorCurveness = null,
    precision: scala.Int | scala.Double = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    symbol: js.Array[_] | java.lang.String = null,
    symbolSize: js.Array[_] | scala.Double = null
  ): Anon_AnimationAnimationDelay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate)
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (label != null) __obj.updateDynamic("label")(label)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnimationAnimationDelay]
  }
}

