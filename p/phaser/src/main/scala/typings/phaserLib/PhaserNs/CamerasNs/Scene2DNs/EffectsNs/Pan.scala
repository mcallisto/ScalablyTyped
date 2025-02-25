package typings
package phaserLib.PhaserNs.CamerasNs.Scene2DNs.EffectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Camera Pan effect.
  * 
  * This effect will scroll the Camera so that the center of its viewport finishes at the given destination,
  * over the duration and with the ease specified.
  * 
  * Only the camera scroll is moved. None of the objects it is displaying are impacted, i.e. their positions do
  * not change.
  * 
  * The effect will dispatch several events on the Camera itself and you can also specify an `onUpdate` callback,
  * which is invoked each frame for the duration of the effect if required.
  */
@JSGlobal("Phaser.Cameras.Scene2D.Effects.Pan")
@js.native
class Pan protected () extends js.Object {
  /**
    * 
    * @param camera The camera this effect is acting upon.
    */
  def this(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera) = this()
  /**
    * The Camera this effect belongs to.
    */
  val camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  /**
    * The constantly updated value based on zoom.
    */
  var current: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * The destination scroll coordinates to pan the camera to.
    */
  var destination: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * The duration of the effect, in milliseconds.
    */
  val duration: phaserLib.integer = js.native
  /**
    * The ease function to use during the pan.
    */
  var ease: js.Function = js.native
  /**
    * Is this effect actively running?
    */
  val isRunning: scala.Boolean = js.native
  /**
    * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
    */
  var progress: scala.Double = js.native
  /**
    * The starting scroll coordinates to pan the camera from.
    */
  var source: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * Destroys this effect, releasing it from the Camera.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Called internally when the effect completes.
    */
  def effectComplete(): scala.Unit = js.native
  /**
    * Resets this camera effect.
    * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
    */
  def reset(): scala.Unit = js.native
  /**
    * This effect will scroll the Camera so that the center of its viewport finishes at the given destination,
    * over the duration and with the ease specified.
    * @param x The destination x coordinate to scroll the center of the Camera viewport to.
    * @param y The destination y coordinate to scroll the center of the Camera viewport to.
    * @param duration The duration of the effect in milliseconds. Default 1000.
    * @param ease The ease to use for the pan. Can be any of the Phaser Easing constants or a custom function. Default 'Linear'.
    * @param force Force the pan effect to start immediately, even if already running. Default false.
    * @param callback This callback will be invoked every frame for the duration of the effect.
    * It is sent four arguments: A reference to the camera, a progress amount between 0 and 1 indicating how complete the effect is,
    * the current camera scroll x coordinate and the current camera scroll y coordinate.
    * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
    */
  def start(x: scala.Double, y: scala.Double): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  def start(x: scala.Double, y: scala.Double, duration: phaserLib.integer): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  def start(x: scala.Double, y: scala.Double, duration: phaserLib.integer, ease: java.lang.String): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  def start(
    x: scala.Double,
    y: scala.Double,
    duration: phaserLib.integer,
    ease: java.lang.String,
    force: scala.Boolean
  ): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  def start(
    x: scala.Double,
    y: scala.Double,
    duration: phaserLib.integer,
    ease: java.lang.String,
    force: scala.Boolean,
    callback: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.CameraPanCallback
  ): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  def start(
    x: scala.Double,
    y: scala.Double,
    duration: phaserLib.integer,
    ease: java.lang.String,
    force: scala.Boolean,
    callback: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.CameraPanCallback,
    context: js.Any
  ): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  def start(x: scala.Double, y: scala.Double, duration: phaserLib.integer, ease: js.Function): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  def start(
    x: scala.Double,
    y: scala.Double,
    duration: phaserLib.integer,
    ease: js.Function,
    force: scala.Boolean
  ): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  def start(
    x: scala.Double,
    y: scala.Double,
    duration: phaserLib.integer,
    ease: js.Function,
    force: scala.Boolean,
    callback: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.CameraPanCallback
  ): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  def start(
    x: scala.Double,
    y: scala.Double,
    duration: phaserLib.integer,
    ease: js.Function,
    force: scala.Boolean,
    callback: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.CameraPanCallback,
    context: js.Any
  ): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  /**
    * The main update loop for this effect. Called automatically by the Camera.
    * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  def update(time: phaserLib.integer, delta: scala.Double): scala.Unit = js.native
}

