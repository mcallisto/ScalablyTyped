package typings
package paperLib.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Point")
@js.native
class Point protected ()
  extends paperLib.paperNs.Point {
  /**
    * Creates a Point object using the properties in the given object.
    * @param object - the object describing the point's properties
    */
  def this(`object`: js.Any) = this()
  /**
    * Creates a Point object using the coordinates of the given Point object.
    * @param point - the point to copy
    */
  def this(point: paperLib.paperNs.Point) = this()
  /**
    * Creates a Point object using the width and height values of the given Size object.
    * @param size - the size width and height to use
    */
  def this(size: paperLib.paperNs.Size) = this()
  /**
    * Creates a Point object using the numbers in the given array as coordinates.
    * @param array - an array of numbers to use as coordinates
    */
  def this(values: js.Array[scala.Double]) = this()
  /**
    * Creates a Point object with the given x and y coordinates.
    * @param x - the x coordinate
    * @param y - the y coordinate
    */
  def this(x: scala.Double, y: scala.Double) = this()
}

/* static members */
@JSImport("paper", "Point")
@js.native
object Point extends js.Object {
  /**
    * Returns a new point object with the largest x and y of the supplied points.
    * @param point1 -
    * @param point2 -
    */
  def max(point1: paperLib.paperNs.Point, point2: paperLib.paperNs.Point): paperLib.paperNs.Point = js.native
  /**
    * Returns a new point object with the smallest x and y of the supplied points.
    * @param point1 -
    * @param point2 -
    */
  def min(point1: paperLib.paperNs.Point, point2: paperLib.paperNs.Point): paperLib.paperNs.Point = js.native
  /**
    * Returns a point object with random x and y values between 0 and 1.
    */
  def random(): paperLib.paperNs.Point = js.native
}

