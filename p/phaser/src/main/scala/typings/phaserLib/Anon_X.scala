package typings
package phaserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X extends js.Object {
  /**
    * The x coordinate of the Graphics.
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y coordinate of the Graphics.
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Anon_X {
  @scala.inline
  def apply(x: scala.Int | scala.Double = null, y: scala.Int | scala.Double = null): Anon_X = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_X]
  }
}

