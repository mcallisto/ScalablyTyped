package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the immovable properties of an Arcade Physics Body.
  */
@js.native
trait Immovable extends js.Object {
  /**
    * Sets Whether this Body can be moved by collisions with another Body.
    * @param value Sets if this body can be moved by collisions with another Body. Default true.
    */
  def setImmovable(): this.type = js.native
  def setImmovable(value: scala.Boolean): this.type = js.native
}

