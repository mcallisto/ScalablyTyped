package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DevicePairingKinds extends js.Object

/** Indicates the action the user will need to take in order to complete the pairing or unpairing action. */
@JSGlobal("Windows.Devices.Enumeration.DevicePairingKinds")
@js.native
object DevicePairingKinds extends js.Object {
  /** The user needs to confirm they wish to perform the pairing or unpairing action. */
  @js.native
  sealed trait confirmOnly
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingKinds
  
  /** A pin is shown on both the device and the application, and the user needs to confirm that they match. */
  @js.native
  sealed trait confirmPinMatch
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingKinds
  
  /** A pin is displayed to the user that will need to be entered on the device. In this scenario, the application should Accept the pairing. The device has the authority to cancel the operation if the pin does not match. */
  @js.native
  sealed trait displayPin
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingKinds
  
  /** No action is required on the part of the user. In this case, the device object will attempt to pair without any verification. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingKinds
  
  /** A pin is shown on the target device and must be provided to the app. */
  @js.native
  sealed trait providePin
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingKinds
  
  /* 1 */ val confirmOnly: confirmOnly with scala.Double = js.native
  /* 4 */ val confirmPinMatch: confirmPinMatch with scala.Double = js.native
  /* 2 */ val displayPin: displayPin with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val providePin: providePin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingKinds with scala.Double
  ] = js.native
}

