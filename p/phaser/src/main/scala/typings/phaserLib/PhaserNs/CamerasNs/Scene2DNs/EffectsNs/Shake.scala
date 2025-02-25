package typings
package phaserLib.PhaserNs.CamerasNs.Scene2DNs.EffectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Camera Shake effect.
  * 
  * This effect will shake the camera viewport by a random amount, bounded by the specified intensity, each frame.
  * 
  * Only the camera viewport is moved. None of the objects it is displaying are impacted, i.e. their positions do
  * not change.
  * 
  * The effect will dispatch several events on the Camera itself and you can also specify an `onUpdate` callback,
  * which is invoked each frame for the duration of the effect if required.
  */
@JSGlobal("Phaser.Cameras.Scene2D.Effects.Shake")
@js.native
class Shake protected () extends js.Object {
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
    * The duration of the effect, in milliseconds.
    */
  val duration: phaserLib.integer = js.native
  /**
    * The intensity of the effect. Use small float values. The default when the effect starts is 0.05.
    * This is a Vector2 object, allowing you to control the shake intensity independently across x and y.
    * You can modify this value while the effect is active to create more varied shake effects.
    */
  var intensity: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * Is this effect actively running?
    */
  val isRunning: scala.Boolean = js.native
  /**
    * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
    */
  var progress: scala.Double = js.native
  /**
    * Destroys this effect, releasing it from the Camera.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Called internally when the effect completes.
    */
  def effectComplete(): scala.Unit = js.native
  /**
    * The pre-render step for this effect. Called automatically by the Camera.
    */
  def preRender(): scala.Unit = js.native
  /**
    * Resets this camera effect.
    * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
    */
  def reset(): scala.Unit = js.native
  /**
    * Shakes the Camera by the given intensity over the duration specified.
    * @param duration The duration of the effect in milliseconds. Default 100.
    * @param intensity The intensity of the shake. Default 0.05.
    * @param force Force the shake effect to start immediately, even if already running. Default false.
    * @param callback This callback will be invoked every frame for the duration of the effect.
    * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
    * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
    */
  def start(): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  def start(duration: phaserLib.integer): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  def start(duration: phaserLib.integer, intensity: scala.Double): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  def start(duration: phaserLib.integer, intensity: scala.Double, force: scala.Boolean): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  def start(
    duration: phaserLib.integer,
    intensity: scala.Double,
    force: scala.Boolean,
    callback: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.CameraShakeCallback
  ): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  def start(
    duration: phaserLib.integer,
    intensity: scala.Double,
    force: scala.Boolean,
    callback: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.CameraShakeCallback,
    context: js.Any
  ): phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  /**
    * The main update loop for this effect. Called automatically by the Camera.
    * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  def update(time: phaserLib.integer, delta: scala.Double): scala.Unit = js.native
}

