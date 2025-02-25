package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemConditionType extends js.Object

/** Specifies a system condition that must be in effect for a background task to run. If a background task with a system condition is triggered, the task will not run until the condition is met. */
@JSGlobal("Windows.ApplicationModel.Background.SystemConditionType")
@js.native
object SystemConditionType extends js.Object {
  /** Specifies that the background task can only run when the cost to do background work is low. */
  @js.native
  sealed trait backgroundWorkCostNotHigh
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  /** Specifies that the background task can only run when a free (non-metered) network connection is available. */
  @js.native
  sealed trait freeNetworkAvailable
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  /** Specifies that the background task can only run when the Internet is available. If a background task with the InternetAvailable condition is triggered, and the Internet is not available, the task will not run until the Internet is available again. */
  @js.native
  sealed trait internetAvailable
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  /** Specifies that the background task can only run when the Internet is not available. If a background task with the InternetNotAvailable condition is triggered, and the Internet is available, the task will not run until the Internet is unavailable. */
  @js.native
  sealed trait internetNotAvailable
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  /** Not a valid condition type. */
  @js.native
  sealed trait invalid
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  /** Specifies that the background task can only run when the user's session is connected. If a background task with the SessionConnected condition is triggered, and the user session is not logged in, the task will run when the user logs in. */
  @js.native
  sealed trait sessionConnected
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  /** Specifies that the background task can only run when the user's session is disconnected. If a background task with the SessionDisconnected condition is triggered, and the user is logged in, the task will run when the user logs out. */
  @js.native
  sealed trait sessionDisconnected
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  /** Specifies that background task can only run when the user is not present. If a background task with the UserNotPresent condition is triggered, and the user is present, the task will not run until the user becomes inactive. */
  @js.native
  sealed trait userNotPresent
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  /** Specifies that the background task can only run when the user is present. If a background task with the UserPresent condition is triggered, and the user is away, the task will not run until the user is present. */
  @js.native
  sealed trait userPresent
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  /* 8 */ val backgroundWorkCostNotHigh: backgroundWorkCostNotHigh with scala.Double = js.native
  /* 7 */ val freeNetworkAvailable: freeNetworkAvailable with scala.Double = js.native
  /* 3 */ val internetAvailable: internetAvailable with scala.Double = js.native
  /* 4 */ val internetNotAvailable: internetNotAvailable with scala.Double = js.native
  /* 0 */ val invalid: invalid with scala.Double = js.native
  /* 5 */ val sessionConnected: sessionConnected with scala.Double = js.native
  /* 6 */ val sessionDisconnected: sessionDisconnected with scala.Double = js.native
  /* 2 */ val userNotPresent: userNotPresent with scala.Double = js.native
  /* 1 */ val userPresent: userPresent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType with scala.Double
  ] = js.native
}

