package typings
package phaserLib.PhaserNs.CurvesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Elliptical Curve derived from the Base Curve class.
  * 
  * See https://en.wikipedia.org/wiki/Elliptic_curve for more details.
  */
@JSGlobal("Phaser.Curves.Ellipse")
@js.native
class Ellipse protected () extends Curve {
  /**
    * 
    * @param x The x coordinate of the ellipse, or an Ellipse Curve configuration object. Default 0.
    * @param y The y coordinate of the ellipse. Default 0.
    * @param xRadius The horizontal radius of ellipse. Default 0.
    * @param yRadius The vertical radius of ellipse. Default 0.
    * @param startAngle The start angle of the ellipse, in degrees. Default 0.
    * @param endAngle The end angle of the ellipse, in degrees. Default 360.
    * @param clockwise Sets if the the ellipse rotation is clockwise (true) or anti-clockwise (false) Default false.
    * @param rotation The rotation of the ellipse, in degrees. Default 0.
    */
  def this(x: js.UndefOr[scala.Double | phaserLib.PhaserNs.TypesNs.CurvesNs.EllipseCurveConfig], y: js.UndefOr[scala.Double], xRadius: js.UndefOr[scala.Double], yRadius: js.UndefOr[scala.Double], startAngle: js.UndefOr[phaserLib.integer], endAngle: js.UndefOr[phaserLib.integer], clockwise: js.UndefOr[scala.Boolean], rotation: js.UndefOr[phaserLib.integer]) = this()
  /**
    * The rotation of the ellipse, relative to the center, in degrees.
    */
  var angle: scala.Double = js.native
  /**
    * `true` if the ellipse rotation is clockwise or `false` if anti-clockwise.
    */
  var clockwise: scala.Boolean = js.native
  /**
    * The end angle of the ellipse in degrees.
    */
  var endAngle: scala.Double = js.native
  /**
    * The center point of the ellipse. Used for calculating rotation.
    */
  var p0: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * The rotation of the ellipse, relative to the center, in radians.
    */
  var rotation: scala.Double = js.native
  /**
    * The start angle of the ellipse in degrees.
    */
  var startAngle: scala.Double = js.native
  /**
    * The x coordinate of the center of the ellipse.
    */
  var x: scala.Double = js.native
  /**
    * The horizontal radius of the ellipse.
    */
  var xRadius: scala.Double = js.native
  /**
    * The y coordinate of the center of the ellipse.
    */
  var y: scala.Double = js.native
  /**
    * The vertical radius of the ellipse.
    */
  var yRadius: scala.Double = js.native
  /**
    * Get point at relative position in curve according to length.
    * @param t The position along the curve to return. Where 0 is the start and 1 is the end.
    * @param out A Vector2 object to store the result in. If not given will be created.
    */
  def getPoint[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](t: scala.Double): O = js.native
  def getPoint[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](t: scala.Double, out: O): O = js.native
  /**
    * [description]
    * @param divisions [description]
    */
  def getResolution(divisions: scala.Double): scala.Double = js.native
  /**
    * Sets if this curve extends clockwise or anti-clockwise.
    * @param value The clockwise state of this curve.
    */
  def setClockwise(value: scala.Boolean): Ellipse = js.native
  /**
    * Sets the end angle of this curve.
    * @param value The end angle of this curve, in radians.
    */
  def setEndAngle(value: scala.Double): Ellipse = js.native
  /**
    * Sets the height of this curve.
    * @param value The height of this curve.
    */
  def setHeight(value: scala.Double): Ellipse = js.native
  /**
    * Sets the rotation of this curve.
    * @param value The rotation of this curve, in radians.
    */
  def setRotation(value: scala.Double): Ellipse = js.native
  /**
    * Sets the start angle of this curve.
    * @param value The start angle of this curve, in radians.
    */
  def setStartAngle(value: scala.Double): Ellipse = js.native
  /**
    * Sets the width of this curve.
    * @param value The width of this curve.
    */
  def setWidth(value: scala.Double): Ellipse = js.native
  /**
    * Sets the horizontal radius of this curve.
    * @param value The horizontal radius of this curve.
    */
  def setXRadius(value: scala.Double): Ellipse = js.native
  /**
    * Sets the vertical radius of this curve.
    * @param value The vertical radius of this curve.
    */
  def setYRadius(value: scala.Double): Ellipse = js.native
  /**
    * JSON serialization of the curve.
    */
  def toJSON(): phaserLib.PhaserNs.TypesNs.CurvesNs.JSONEllipseCurve = js.native
}

/* static members */
@JSGlobal("Phaser.Curves.Ellipse")
@js.native
object Ellipse extends js.Object {
  /**
    * Creates a curve from the provided Ellipse Curve Configuration object.
    * @param data The JSON object containing this curve data.
    */
  def fromJSON(data: phaserLib.PhaserNs.TypesNs.CurvesNs.JSONEllipseCurve): phaserLib.PhaserNs.CurvesNs.Ellipse = js.native
}

