package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  /**
    * The padding on the bottom of the chart.
    */
  var bottom: js.UndefOr[scala.Double] = js.undefined
  /**
    * The padding on the left of the chart.
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    * The padding on the right of the chart.
    */
  var right: js.UndefOr[scala.Double] = js.undefined
  /**
    * The padding on the top of the chart.
    */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    bottom: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

