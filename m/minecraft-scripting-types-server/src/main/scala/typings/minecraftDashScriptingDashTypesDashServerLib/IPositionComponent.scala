package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This component allows you to control an entity's current position in the world. Once applied the entity will be teleported to the new position specified.
  */
trait IPositionComponent extends js.Object {
  /**
    * Position along the X-Axis (east-west) of the entity
    * @default 0.0
    */
  var x: scala.Double
  /**
    * Position along the Y-Axis (height) of the entity
    * @default 0.0
    */
  var y: scala.Double
  /**
    * Position along the Z-Axis (north-south) of the entity
    * @default 0.0
    */
  var z: scala.Double
}

object IPositionComponent {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double, z: scala.Double): IPositionComponent = {
    val __obj = js.Dynamic.literal(x = x, y = y, z = z)
  
    __obj.asInstanceOf[IPositionComponent]
  }
}

