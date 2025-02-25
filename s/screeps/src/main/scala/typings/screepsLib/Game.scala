package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The main global game object containing all the gameplay information.
  */
@js.native
trait Game extends js.Object {
  /**
    * A hash containing all your construction sites with their id as hash keys.
    */
  var constructionSites: org.scalablytyped.runtime.StringDictionary[ConstructionSite[BuildableStructureConstant]] = js.native
  /**
    * An object containing information about your CPU usage.
    */
  var cpu: CPU = js.native
  /**
    * A hash containing all your creeps with creep names as hash keys.
    */
  var creeps: org.scalablytyped.runtime.StringDictionary[Creep] = js.native
  /**
    * A hash containing all your flags with flag names as hash keys.
    */
  var flags: org.scalablytyped.runtime.StringDictionary[Flag] = js.native
  /**
    * Your Global Control Level.
    */
  var gcl: GlobalControlLevel = js.native
  /**
    * Your clobal Power Level
    */
  var gpl: GlobalPowerLevel = js.native
  /**
    * A global object representing world GameMap.
    */
  var map: GameMap = js.native
  /**
    * A global object representing the in-game market.
    */
  var market: Market = js.native
  /**
    * A hash containing all your power creeps with their names as hash keys. Even power creeps not spawned in the world can be accessed here.
    */
  var powerCreeps: org.scalablytyped.runtime.StringDictionary[PowerCreep] = js.native
  /**
    * An object with your global resources that are bound to the account, like subscription tokens. Each object key is a resource constant, values are resources amounts.
    */
  var resources: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * A hash containing all the rooms available to you with room names as hash keys.
    * A room is visible if you have a creep or an owned structure in it.
    */
  var rooms: org.scalablytyped.runtime.StringDictionary[Room] = js.native
  /**
    * An object describing the world shard where your script is currently being executed in.
    */
  var shard: Shard = js.native
  /**
    * A hash containing all your spawns with spawn names as hash keys.
    */
  var spawns: org.scalablytyped.runtime.StringDictionary[StructureSpawn] = js.native
  /**
    * A hash containing all your structures with structure id as hash keys.
    */
  var structures: org.scalablytyped.runtime.StringDictionary[Structure[StructureConstant]] = js.native
  /**
    * System game tick counter. It is automatically incremented on every tick.
    */
  var time: scala.Double = js.native
  def getObjectById[T](): T | scala.Null = js.native
  /**
    * Get an object with the specified unique ID. It may be a game object of any type. Only objects from the rooms which are visible to you can be accessed.
    * @param id The unique identifier.
    * @returns an object instance or null if it cannot be found.
    */
  def getObjectById[T](id: java.lang.String): T | scala.Null = js.native
  /**
    * Send a custom message at your profile email.
    *
    * This way, you can set up notifications to yourself on any occasion within the game.
    *
    * You can schedule up to 20 notifications during one game tick. Not available in the Simulation Room.
    * @param message Custom text which will be sent in the message. Maximum length is 1000 characters.
    * @param groupInterval If set to 0 (default), the notification will be scheduled immediately.
    * Otherwise, it will be grouped with other notifications and mailed out later using the specified time in minutes.
    */
  def notify(message: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def notify(message: java.lang.String, groupInterval: scala.Double): js.UndefOr[scala.Nothing] = js.native
}

