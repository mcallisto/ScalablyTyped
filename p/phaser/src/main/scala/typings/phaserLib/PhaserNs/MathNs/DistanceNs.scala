package typings
package phaserLib.PhaserNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Math.Distance")
@js.native
object DistanceNs extends js.Object {
  /**
    * Calculate the distance between two sets of coordinates (points).
    * @param x1 The x coordinate of the first point.
    * @param y1 The y coordinate of the first point.
    * @param x2 The x coordinate of the second point.
    * @param y2 The y coordinate of the second point.
    */
  def Between(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Double = js.native
  /**
    * Calculate the distance between two sets of coordinates (points) to the power of `pow`.
    * @param x1 The x coordinate of the first point.
    * @param y1 The y coordinate of the first point.
    * @param x2 The x coordinate of the second point.
    * @param y2 The y coordinate of the second point.
    * @param pow The exponent.
    */
  def Power(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, pow: scala.Double): scala.Double = js.native
  /**
    * Calculate the distance between two sets of coordinates (points), squared.
    * @param x1 The x coordinate of the first point.
    * @param y1 The y coordinate of the first point.
    * @param x2 The x coordinate of the second point.
    * @param y2 The y coordinate of the second point.
    */
  def Squared(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Double = js.native
}

