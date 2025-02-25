package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZoomTransitionMode extends js.Object

/** Defines the zoom transition modes. */
@JSGlobal("Windows.Media.Devices.ZoomTransitionMode")
@js.native
object ZoomTransitionMode extends js.Object {
  /** The default zoom transition mode for the device. Can be Direct or Smooth, depending on the device. */
  @js.native
  sealed trait auto
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ZoomTransitionMode
  
  /** The zoom transition is instantaneous. */
  @js.native
  sealed trait direct
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ZoomTransitionMode
  
  /** The zoom transition is smooth. */
  @js.native
  sealed trait smooth
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ZoomTransitionMode
  
  /* 0 */ val auto: auto with scala.Double = js.native
  /* 1 */ val direct: direct with scala.Double = js.native
  /* 2 */ val smooth: smooth with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ZoomTransitionMode with scala.Double] = js.native
}

