package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Max extends js.Object {
  /**
    * Maximum scaling
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.scaleLimit.max
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum scaling
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.scaleLimit.min
    */
  var min: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Max {
  @scala.inline
  def apply(max: scala.Int | scala.Double = null, min: scala.Int | scala.Double = null): Anon_Max = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Max]
  }
}

