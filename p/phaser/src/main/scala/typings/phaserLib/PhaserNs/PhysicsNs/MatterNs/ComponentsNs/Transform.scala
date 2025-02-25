package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for getting and setting the position, scale and rotation of a Game Object.
  */
@js.native
trait Transform extends js.Object {
  /**
    * Use `angle` to set or get rotation of the physics body associated to this GameObject. Unlike rotation, when using set the value can be in degrees, which will be converted to radians internally.
    */
  var angle: scala.Double = js.native
  /**
    * Use `rotation` to set or get the rotation of the physics body associated with this GameObject. The value when set must be in radians.
    */
  var rotation: scala.Double = js.native
  /**
    * The horizontal scale of this Game Object.
    */
  var scaleX: scala.Double = js.native
  /**
    * The vertical scale of this Game Object.
    */
  var scaleY: scala.Double = js.native
  /**
    * The x position of this Game Object.
    */
  var x: scala.Double = js.native
  /**
    * The y position of this Game Object.
    */
  var y: scala.Double = js.native
  /**
    * [description]
    * @param degrees [description] Default 0.
    */
  def setAngle(): this.type = js.native
  def setAngle(degrees: scala.Double): this.type = js.native
  /**
    * [description]
    */
  def setFixedRotation(): this.type = js.native
  /**
    * Sets the position of the physics body along x and y axes. Both the parameters to this function are optional and if not passed any they default to 0.
    * @param x The horizontal position of the body. Default 0.
    * @param y The vertical position of the body. Default x.
    */
  def setPosition(): this.type = js.native
  def setPosition(x: scala.Double): this.type = js.native
  def setPosition(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * [description]
    * @param radians [description] Default 0.
    */
  def setRotation(): this.type = js.native
  def setRotation(radians: scala.Double): this.type = js.native
  /**
    * Sets the scale of this Game Object.
    * @param x The horizontal scale of this Game Object. Default 1.
    * @param y The vertical scale of this Game Object. If not set it will use the x value. Default x.
    * @param point The point (Vector2) from which scaling will occur.
    */
  def setScale(): this.type = js.native
  def setScale(x: scala.Double): this.type = js.native
  def setScale(x: scala.Double, y: scala.Double): this.type = js.native
  def setScale(x: scala.Double, y: scala.Double, point: phaserLib.PhaserNs.MathNs.Vector2): this.type = js.native
}

