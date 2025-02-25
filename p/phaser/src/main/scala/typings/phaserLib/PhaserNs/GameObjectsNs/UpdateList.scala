package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Update List plugin.
  * 
  * Update Lists belong to a Scene and maintain the list Game Objects to be updated every frame.
  * 
  * Some or all of these Game Objects may also be part of the Scene's [Display List]{@link Phaser.GameObjects.DisplayList}, for Rendering.
  */
@JSGlobal("Phaser.GameObjects.UpdateList")
@js.native
class UpdateList protected () extends js.Object {
  /**
    * 
    * @param scene The Scene that the Update List belongs to.
    */
  def this(scene: phaserLib.PhaserNs.Scene) = this()
  /**
    * The length of the list.
    */
  val length: phaserLib.integer = js.native
  /**
    * The Scene that the Update List belongs to.
    */
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * The Scene's Systems.
    */
  var systems: phaserLib.PhaserNs.ScenesNs.Systems = js.native
  /**
    * Add a Game Object to the Update List.
    * @param child The Game Object to add.
    */
  def add(child: GameObject): GameObject = js.native
  /**
    * The Scene that owns this plugin is being destroyed.
    * We need to shutdown and then kill off all external references.
    */
  def destroy(): scala.Unit = js.native
  /**
    * The pre-update step.
    * 
    * Handles Game Objects that are pending insertion to and removal from the list.
    */
  def preUpdate(): scala.Unit = js.native
  /**
    * Remove a Game Object from the list.
    * @param child The Game Object to remove from the list.
    */
  def remove(child: GameObject): GameObject = js.native
  /**
    * Remove all Game Objects from the list.
    */
  def removeAll(): UpdateList = js.native
  /**
    * The Scene that owns this plugin is shutting down.
    * We need to kill and reset all internal properties as well as stop listening to Scene events.
    */
  def shutdown(): scala.Unit = js.native
  /**
    * The update step.
    * 
    * Pre-updates every active Game Object in the list.
    * @param time The current timestamp.
    * @param delta The delta time elapsed since the last frame.
    */
  def update(time: scala.Double, delta: scala.Double): scala.Unit = js.native
}

