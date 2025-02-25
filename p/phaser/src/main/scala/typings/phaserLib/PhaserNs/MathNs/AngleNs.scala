package typings
package phaserLib.PhaserNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Math.Angle")
@js.native
object AngleNs extends js.Object {
  /**
    * Find the angle of a segment from (x1, y1) -> (x2, y2).
    * @param x1 The x coordinate of the first point.
    * @param y1 The y coordinate of the first point.
    * @param x2 The x coordinate of the second point.
    * @param y2 The y coordinate of the second point.
    */
  def Between(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Double = js.native
  def BetweenPoints(point1: js.Object, point2: js.Object): scala.Double = js.native
  def BetweenPoints(point1: js.Object, point2: phaserLib.PhaserNs.GeomNs.Point): scala.Double = js.native
  def BetweenPoints(point1: phaserLib.PhaserNs.GeomNs.Point, point2: js.Object): scala.Double = js.native
  /**
    * Find the angle of a segment from (point1.x, point1.y) -> (point2.x, point2.y).
    * 
    * Calculates the angle of the vector from the first point to the second point.
    * @param point1 The first point.
    * @param point2 The second point.
    */
  def BetweenPoints(point1: phaserLib.PhaserNs.GeomNs.Point, point2: phaserLib.PhaserNs.GeomNs.Point): scala.Double = js.native
  def BetweenPointsY(point1: js.Object, point2: js.Object): scala.Double = js.native
  def BetweenPointsY(point1: js.Object, point2: phaserLib.PhaserNs.GeomNs.Point): scala.Double = js.native
  def BetweenPointsY(point1: phaserLib.PhaserNs.GeomNs.Point, point2: js.Object): scala.Double = js.native
  /**
    * Find the angle of a segment from (point1.x, point1.y) -> (point2.x, point2.y).
    * 
    * The difference between this method and {@link Phaser.Math.Angle.BetweenPoints} is that this assumes the y coordinate
    * travels down the screen.
    * @param point1 The first point.
    * @param point2 The second point.
    */
  def BetweenPointsY(point1: phaserLib.PhaserNs.GeomNs.Point, point2: phaserLib.PhaserNs.GeomNs.Point): scala.Double = js.native
  /**
    * Find the angle of a segment from (x1, y1) -> (x2, y2).
    * 
    * The difference between this method and {@link Phaser.Math.Angle.Between} is that this assumes the y coordinate
    * travels down the screen.
    * @param x1 The x coordinate of the first point.
    * @param y1 The y coordinate of the first point.
    * @param x2 The x coordinate of the second point.
    * @param y2 The y coordinate of the second point.
    */
  def BetweenY(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Double = js.native
  /**
    * Takes an angle in Phasers default clockwise format and converts it so that
    * 0 is North, 90 is West, 180 is South and 270 is East,
    * therefore running counter-clockwise instead of clockwise.
    * 
    * You can pass in the angle from a Game Object using:
    * 
    * ```javascript
    * var converted = CounterClockwise(gameobject.rotation);
    * ```
    * 
    * All values for this function are in radians.
    * @param angle The angle to convert, in radians.
    */
  def CounterClockwise(angle: scala.Double): scala.Double = js.native
  /**
    * Normalize an angle to the [0, 2pi] range.
    * @param angle The angle to normalize, in radians.
    */
  def Normalize(angle: scala.Double): scala.Double = js.native
  /**
    * Reverse the given angle.
    * @param angle The angle to reverse, in radians.
    */
  def Reverse(angle: scala.Double): scala.Double = js.native
  /**
    * Rotates `currentAngle` towards `targetAngle`, taking the shortest rotation distance. The `lerp` argument is the amount to rotate by in this call.
    * @param currentAngle The current angle, in radians.
    * @param targetAngle The target angle to rotate to, in radians.
    * @param lerp The lerp value to add to the current angle. Default 0.05.
    */
  def RotateTo(currentAngle: scala.Double, targetAngle: scala.Double): scala.Double = js.native
  def RotateTo(currentAngle: scala.Double, targetAngle: scala.Double, lerp: scala.Double): scala.Double = js.native
  /**
    * Gets the shortest angle between `angle1` and `angle2`.
    * 
    * Both angles must be in the range -180 to 180, which is the same clamped
    * range that `sprite.angle` uses, so you can pass in two sprite angles to
    * this method and get the shortest angle back between the two of them.
    * 
    * The angle returned will be in the same range. If the returned angle is
    * greater than 0 then it's a counter-clockwise rotation, if < 0 then it's
    * a clockwise rotation.
    * 
    * TODO: Wrap the angles in this function?
    * @param angle1 The first angle in the range -180 to 180.
    * @param angle2 The second angle in the range -180 to 180.
    */
  def ShortestBetween(angle1: scala.Double, angle2: scala.Double): scala.Double = js.native
  /**
    * Wrap an angle.
    * 
    * Wraps the angle to a value in the range of -PI to PI.
    * @param angle The angle to wrap, in radians.
    */
  def Wrap(angle: scala.Double): scala.Double = js.native
  /**
    * Wrap an angle in degrees.
    * 
    * Wraps the angle to a value in the range of -180 to 180.
    * @param angle The angle to wrap, in degrees.
    */
  def WrapDegrees(angle: scala.Double): scala.Double = js.native
}

