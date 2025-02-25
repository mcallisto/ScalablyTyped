package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Effects extends js.Object {
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  var effects: js.Array[Anon_Amplifier]
  /**
    * The filter group that defines the conditions for using this item to heal the entity
    */
  var filters: js.UndefOr[minecraftDashScriptingDashTypesDashSharedLib.MinecraftFilter] = js.undefined
  /**
    * The amount of health this entity gains when fed this item
    * @default 1
    */
  var heal_amount: scala.Double
  /**
    * Item identifier that can be used to heal this entity
    */
  var item: java.lang.String
}

object Anon_Effects {
  @scala.inline
  def apply(
    effects: js.Array[Anon_Amplifier],
    heal_amount: scala.Double,
    item: java.lang.String,
    filters: minecraftDashScriptingDashTypesDashSharedLib.MinecraftFilter = null
  ): Anon_Effects = {
    val __obj = js.Dynamic.literal(effects = effects, heal_amount = heal_amount, item = item)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[Anon_Effects]
  }
}

