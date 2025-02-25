package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface of the Gamepad API represents hardware in the controller designed to provide haptic feedback to the user (if available), most commonly vibration hardware. */
trait GamepadHapticActuator extends js.Object {
  val `type`: GamepadHapticActuatorType
  def pulse(value: scala.Double, duration: scala.Double): js.Promise[scala.Boolean]
}

@JSGlobal("GamepadHapticActuator")
@js.native
class GamepadHapticActuatorCls () extends GamepadHapticActuator {
  /* CompleteClass */
  override val `type`: GamepadHapticActuatorType = js.native
  /* CompleteClass */
  override def pulse(value: scala.Double, duration: scala.Double): js.Promise[scala.Boolean] = js.native
}

@JSGlobal("GamepadHapticActuator")
@js.native
object GamepadHapticActuator
  extends org.scalablytyped.runtime.Instantiable0[GamepadHapticActuator]

