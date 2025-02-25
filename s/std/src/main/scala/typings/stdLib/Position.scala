package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The position of the concerned device at a given time. The position, represented by a Coordinates object, comprehends the 2D position of the device, on a spheroid representing the Earth, but also its altitude and its speed. */
trait Position extends js.Object {
  val coords: Coordinates
  val timestamp: scala.Double
}

object Position {
  @scala.inline
  def apply(coords: Coordinates, timestamp: scala.Double): Position = {
    val __obj = js.Dynamic.literal(coords = coords, timestamp = timestamp)
  
    __obj.asInstanceOf[Position]
  }
}

