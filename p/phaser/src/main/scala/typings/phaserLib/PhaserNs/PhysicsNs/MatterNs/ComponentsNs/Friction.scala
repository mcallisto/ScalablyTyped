package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains methods for changing the friction of a Game Object's Matter Body. Should be used a mixin, not called directly.
  */
@js.native
trait Friction extends js.Object {
  /**
    * Sets new friction values for this Game Object's Matter Body.
    * @param value The new friction of the body, between 0 and 1, where 0 allows the Body to slide indefinitely, while 1 allows it to stop almost immediately after a force is applied.
    * @param air If provided, the new air resistance of the Body. The higher the value, the faster the Body will slow as it moves through space. 0 means the body has no air resistance.
    * @param fstatic If provided, the new static friction of the Body. The higher the value (e.g. 10), the more force it will take to initially get the Body moving when it is nearly stationary. 0 means the body will never "stick" when it is nearly stationary.
    */
  def setFriction(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def setFriction(value: scala.Double, air: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def setFriction(value: scala.Double, air: scala.Double, fstatic: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets a new air resistance for this Game Object's Matter Body. A value of 0 means the Body will never slow as it moves through space. The higher the value, the faster a Body slows when moving through space.
    * @param value The new air resistance for the Body.
    */
  def setFrictionAir(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets a new static friction for this Game Object's Matter Body. A value of 0 means the Body will never "stick" when it is nearly stationary. The higher the value (e.g. 10), the more force it will take to initially get the Body moving when it is nearly stationary.
    * @param value The new static friction for the Body.
    */
  def setFrictionStatic(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
}

