package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Velocity component.
  * Should be applied as a mixin.
  */
@js.native
trait Velocity extends js.Object {
  /**
    * Sets the maximum velocity this body can travel at.
    * @param x The maximum allowed horizontal velocity.
    * @param y The maximum allowed vertical velocity. If not given, defaults to the horizontal value. Default x.
    */
  def setMaxVelocity(x: scala.Double): this.type = js.native
  def setMaxVelocity(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Sets the horizontal and vertical velocities of the physics body.
    * @param x The horizontal velocity value.
    * @param y The vertical velocity value. If not given, defaults to the horizontal value. Default x.
    */
  def setVelocity(x: scala.Double): this.type = js.native
  def setVelocity(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Sets the horizontal velocity of the physics body.
    * @param x The horizontal velocity value.
    */
  def setVelocityX(x: scala.Double): this.type = js.native
  /**
    * Sets the vertical velocity of the physics body.
    * @param y The vertical velocity value.
    */
  def setVelocityY(y: scala.Double): this.type = js.native
}

