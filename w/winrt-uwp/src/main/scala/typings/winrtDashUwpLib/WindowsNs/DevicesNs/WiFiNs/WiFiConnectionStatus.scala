package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiConnectionStatus extends js.Object

/** Status of the connection attempt. */
@JSGlobal("Windows.Devices.WiFi.WiFiConnectionStatus")
@js.native
object WiFiConnectionStatus extends js.Object {
  /** Connection failed because access to the network has been revoked. */
  @js.native
  sealed trait accessRevoked
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus
  
  /** Connection failed because an invalid credential was presented. */
  @js.native
  sealed trait invalidCredential
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus
  
  /** Connection failed because the network is not available. */
  @js.native
  sealed trait networkNotAvailable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus
  
  /** Connection succeeded. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus
  
  /** Connection failed because the connection attempt timed out. */
  @js.native
  sealed trait timeout
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus
  
  /** Connection failed for a reason other than those in this list. */
  @js.native
  sealed trait unspecifiedFailure
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus
  
  /** Connection failed because the authentication protocol is not supported. */
  @js.native
  sealed trait unsupportedAuthenticationProtocol
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus
  
  /* 2 */ val accessRevoked: accessRevoked with scala.Double = js.native
  /* 3 */ val invalidCredential: invalidCredential with scala.Double = js.native
  /* 4 */ val networkNotAvailable: networkNotAvailable with scala.Double = js.native
  /* 1 */ val success: success with scala.Double = js.native
  /* 5 */ val timeout: timeout with scala.Double = js.native
  /* 0 */ val unspecifiedFailure: unspecifiedFailure with scala.Double = js.native
  /* 6 */ val unsupportedAuthenticationProtocol: unsupportedAuthenticationProtocol with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiConnectionStatus with scala.Double
  ] = js.native
}

