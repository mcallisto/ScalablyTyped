package typings
package snazzyDashInfoDashWindowLib.snazzyDashInfoDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeOffset extends js.Object {
  var bottom: js.UndefOr[scala.Double] = js.undefined
  var left: js.UndefOr[scala.Double] = js.undefined
  var right: js.UndefOr[scala.Double] = js.undefined
  var top: js.UndefOr[scala.Double] = js.undefined
}

object EdgeOffset {
  @scala.inline
  def apply(
    bottom: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): EdgeOffset = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeOffset]
  }
}

