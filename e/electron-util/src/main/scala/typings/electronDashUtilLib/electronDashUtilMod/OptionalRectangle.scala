package typings
package electronDashUtilLib.electronDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalRectangle extends js.Object {
  /**
  	The height of the rectangle (must be an integer).
  	*/
  val height: js.UndefOr[scala.Double] = js.undefined
  /**
  	The width of the rectangle (must be an integer).
  	*/
  val width: js.UndefOr[scala.Double] = js.undefined
  /**
  	The x coordinate of the origin of the rectangle (must be an integer).
  	*/
  val x: js.UndefOr[scala.Double] = js.undefined
  /**
  	The y coordinate of the origin of the rectangle (must be an integer).
  	*/
  val y: js.UndefOr[scala.Double] = js.undefined
}

object OptionalRectangle {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): OptionalRectangle = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalRectangle]
  }
}

