package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EdgeGestureKind extends js.Object

/** Specifies the type of user input that triggered the edge gesture event. */
@JSGlobal("Windows.UI.Input.EdgeGestureKind")
@js.native
object EdgeGestureKind extends js.Object {
  /** The user entered the Win+Z key sequence on the keyboard. */
  @js.native
  sealed trait keyboard
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.EdgeGestureKind
  
  /** The user performed a right mouse click. */
  @js.native
  sealed trait mouse
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.EdgeGestureKind
  
  /** The user made a swipe gesture on a touch-enabled screen. */
  @js.native
  sealed trait touch
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.EdgeGestureKind
  
  /* 1 */ val keyboard: keyboard with scala.Double = js.native
  /* 2 */ val mouse: mouse with scala.Double = js.native
  /* 0 */ val touch: touch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.InputNs.EdgeGestureKind with scala.Double] = js.native
}

