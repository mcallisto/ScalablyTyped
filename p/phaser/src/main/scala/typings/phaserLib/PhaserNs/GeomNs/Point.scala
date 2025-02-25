package typings
package phaserLib.PhaserNs.GeomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a Point in 2D space, with an x and y component.
  */
@JSGlobal("Phaser.Geom.Point")
@js.native
/**
  * 
  * @param x The x coordinate of this Point. Default 0.
  * @param y The y coordinate of this Point. Default x.
  */
class Point () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  /**
    * The x coordinate of this Point.
    */
  var x: scala.Double = js.native
  /**
    * The y coordinate of this Point.
    */
  var y: scala.Double = js.native
  /**
    * Set the x and y coordinates of the point to the given values.
    * @param x The x coordinate of this Point. Default 0.
    * @param y The y coordinate of this Point. Default x.
    */
  def setTo(): Point = js.native
  def setTo(x: scala.Double): Point = js.native
  def setTo(x: scala.Double, y: scala.Double): Point = js.native
}

/* static members */
@JSGlobal("Phaser.Geom.Point")
@js.native
object Point extends js.Object {
  /**
    * Apply `Math.ceil()` to each coordinate of the given Point.
    * @param point The Point to ceil.
    */
  def Ceil[O /* <: phaserLib.PhaserNs.GeomNs.Point */](point: O): O = js.native
  /**
    * Clone the given Point.
    * @param source The source Point to clone.
    */
  def Clone(source: phaserLib.PhaserNs.GeomNs.Point): phaserLib.PhaserNs.GeomNs.Point = js.native
  /**
    * Copy the values of one Point to a destination Point.
    * @param source The source Point to copy the values from.
    * @param dest The destination Point to copy the values to.
    */
  def CopyFrom[O /* <: phaserLib.PhaserNs.GeomNs.Point */](source: phaserLib.PhaserNs.GeomNs.Point, dest: O): O = js.native
  /**
    * A comparison of two `Point` objects to see if they are equal.
    * @param point The original `Point` to compare against.
    * @param toCompare The second `Point` to compare.
    */
  def Equals(point: phaserLib.PhaserNs.GeomNs.Point, toCompare: phaserLib.PhaserNs.GeomNs.Point): scala.Boolean = js.native
  /**
    * Apply `Math.ceil()` to each coordinate of the given Point.
    * @param point The Point to floor.
    */
  def Floor[O /* <: phaserLib.PhaserNs.GeomNs.Point */](point: O): O = js.native
  /**
    * Get the centroid or geometric center of a plane figure (the arithmetic mean position of all the points in the figure).
    * Informally, it is the point at which a cutout of the shape could be perfectly balanced on the tip of a pin.
    * @param points [description]
    * @param out [description]
    */
  def GetCentroid[O /* <: phaserLib.PhaserNs.GeomNs.Point */](points: js.Array[phaserLib.PhaserNs.GeomNs.Point]): O = js.native
  def GetCentroid[O /* <: phaserLib.PhaserNs.GeomNs.Point */](points: js.Array[phaserLib.PhaserNs.GeomNs.Point], out: O): O = js.native
  /**
    * Calculate the magnitude of the point, which equivalent to the length of the line from the origin to this point.
    * @param point The point to calculate the magnitude for
    */
  def GetMagnitude(point: phaserLib.PhaserNs.GeomNs.Point): scala.Double = js.native
  /**
    * Calculates the square of magnitude of given point.(Can be used for fast magnitude calculation of point)
    * @param point Returns square of the magnitude/length of given point.
    */
  def GetMagnitudeSq(point: phaserLib.PhaserNs.GeomNs.Point): scala.Double = js.native
  /**
    * Calculates the Axis Aligned Bounding Box (or aabb) from an array of points.
    * @param points [description]
    * @param out [description]
    */
  def GetRectangleFromPoints[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](points: js.Array[phaserLib.PhaserNs.GeomNs.Point]): O = js.native
  def GetRectangleFromPoints[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](points: js.Array[phaserLib.PhaserNs.GeomNs.Point], out: O): O = js.native
  /**
    * [description]
    * @param pointA The starting `Point` for the interpolation.
    * @param pointB The target `Point` for the interpolation.
    * @param t The amount to interpolate between the two points. Generally, a value between 0 (returns the starting `Point`) and 1 (returns the target `Point`). If omitted, 0 is used. Default 0.
    * @param out An optional `Point` object whose `x` and `y` values will be set to the result of the interpolation (can also be any object with `x` and `y` properties). If omitted, a new `Point` created and returned.
    */
  def Interpolate[O /* <: phaserLib.PhaserNs.GeomNs.Point */](pointA: phaserLib.PhaserNs.GeomNs.Point, pointB: phaserLib.PhaserNs.GeomNs.Point): O = js.native
  def Interpolate[O /* <: phaserLib.PhaserNs.GeomNs.Point */](pointA: phaserLib.PhaserNs.GeomNs.Point, pointB: phaserLib.PhaserNs.GeomNs.Point, t: scala.Double): O = js.native
  def Interpolate[O /* <: phaserLib.PhaserNs.GeomNs.Point */](
    pointA: phaserLib.PhaserNs.GeomNs.Point,
    pointB: phaserLib.PhaserNs.GeomNs.Point,
    t: scala.Double,
    out: O
  ): O = js.native
  /**
    * Swaps the X and the Y coordinate of a point.
    * @param point The Point to modify.
    */
  def Invert[O /* <: phaserLib.PhaserNs.GeomNs.Point */](point: O): O = js.native
  /**
    * Inverts a Point's coordinates.
    * @param point The Point to invert.
    * @param out The Point to return the inverted coordinates in.
    */
  def Negative[O /* <: phaserLib.PhaserNs.GeomNs.Point */](point: phaserLib.PhaserNs.GeomNs.Point): O = js.native
  def Negative[O /* <: phaserLib.PhaserNs.GeomNs.Point */](point: phaserLib.PhaserNs.GeomNs.Point, out: O): O = js.native
  /**
    * [description]
    * @param pointA [description]
    * @param pointB [description]
    * @param out [description]
    */
  def Project[O /* <: phaserLib.PhaserNs.GeomNs.Point */](pointA: phaserLib.PhaserNs.GeomNs.Point, pointB: phaserLib.PhaserNs.GeomNs.Point): O = js.native
  def Project[O /* <: phaserLib.PhaserNs.GeomNs.Point */](pointA: phaserLib.PhaserNs.GeomNs.Point, pointB: phaserLib.PhaserNs.GeomNs.Point, out: O): O = js.native
  /**
    * [description]
    * @param pointA [description]
    * @param pointB [description]
    * @param out [description]
    */
  def ProjectUnit[O /* <: phaserLib.PhaserNs.GeomNs.Point */](pointA: phaserLib.PhaserNs.GeomNs.Point, pointB: phaserLib.PhaserNs.GeomNs.Point): O = js.native
  def ProjectUnit[O /* <: phaserLib.PhaserNs.GeomNs.Point */](pointA: phaserLib.PhaserNs.GeomNs.Point, pointB: phaserLib.PhaserNs.GeomNs.Point, out: O): O = js.native
  /**
    * Changes the magnitude (length) of a two-dimensional vector without changing its direction.
    * @param point The Point to treat as the end point of the vector.
    * @param magnitude The new magnitude of the vector.
    */
  def SetMagnitude[O /* <: phaserLib.PhaserNs.GeomNs.Point */](point: O, magnitude: scala.Double): O = js.native
}

