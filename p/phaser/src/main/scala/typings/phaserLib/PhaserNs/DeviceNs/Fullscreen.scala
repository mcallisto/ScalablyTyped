package typings
package phaserLib.PhaserNs.DeviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the full screen support of the browser running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.fullscreen` from within any Scene.
  */
trait Fullscreen extends js.Object {
  /**
    * Does the browser support the Full Screen API?
    */
  var available: scala.Boolean
  /**
    * If the browser supports the Full Screen API this holds the call you need to use to cancel it.
    */
  var cancel: java.lang.String
  /**
    * Does the browser support access to the Keyboard during Full Screen mode?
    */
  var keyboard: scala.Boolean
  /**
    * If the browser supports the Full Screen API this holds the call you need to use to activate it.
    */
  var request: java.lang.String
}

object Fullscreen {
  @scala.inline
  def apply(
    available: scala.Boolean,
    cancel: java.lang.String,
    keyboard: scala.Boolean,
    request: java.lang.String
  ): Fullscreen = {
    val __obj = js.Dynamic.literal(available = available, cancel = cancel, keyboard = keyboard, request = request)
  
    __obj.asInstanceOf[Fullscreen]
  }
}

