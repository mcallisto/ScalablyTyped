package typings
package atPopmotionPopcornLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point2D extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object Point2D {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Point2D = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Point2D]
  }
}

