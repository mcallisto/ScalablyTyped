package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an array of damages and how the entity reacts to them - including whether the entity ignores that damage or not. Currently Minecraft triggers can't be properly serialized so any existing triggers will be completely replaced when applyComponentChanges().
  */
trait IDamageSensorComponent extends js.Object {
  /**
    * Type of damage that triggers this set of events
    */
  var cause: java.lang.String
  /**
    * If true, the damage dealt to the entity will take away health from it, set to false to make the entity ignore that damage
    * @default true
    */
  var deals_damage: scala.Boolean
  /**
    * List of triggers with the events to call when taking this specific kind of damage, allows specifying filters for entity definitions and events
    */
  var on_damage: js.Array[minecraftDashScriptingDashTypesDashSharedLib.MinecraftTrigger]
}

object IDamageSensorComponent {
  @scala.inline
  def apply(
    cause: java.lang.String,
    deals_damage: scala.Boolean,
    on_damage: js.Array[minecraftDashScriptingDashTypesDashSharedLib.MinecraftTrigger]
  ): IDamageSensorComponent = {
    val __obj = js.Dynamic.literal(cause = cause, deals_damage = deals_damage, on_damage = on_damage)
  
    __obj.asInstanceOf[IDamageSensorComponent]
  }
}

