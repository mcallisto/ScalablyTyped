package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HotspotAuthenticationResponseCode extends js.Object

/** Defines values used to indicate status of connection authentication with a mobile hotspot. Provides the response code from the WISPr server for an authentication attempt. */
@JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode")
@js.native
object HotspotAuthenticationResponseCode extends js.Object {
  /** An internal error occurred in the access gateway. */
  @js.native
  sealed trait accessGatewayInternalError
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.HotspotAuthenticationResponseCode
  
  /** The authentication request was aborted. */
  @js.native
  sealed trait loginAborted
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.HotspotAuthenticationResponseCode
  
  /** Hotspot authentication failed. */
  @js.native
  sealed trait loginFailed
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.HotspotAuthenticationResponseCode
  
  /** Hotspot authentication successful. */
  @js.native
  sealed trait loginSucceeded
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.HotspotAuthenticationResponseCode
  
  /** An error occurred that requires contacting the network administrator. */
  @js.native
  sealed trait networkAdministratorError
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.HotspotAuthenticationResponseCode
  
  /** No response returned. */
  @js.native
  sealed trait noError
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.HotspotAuthenticationResponseCode
  
  /** No response from authentication server. */
  @js.native
  sealed trait radiusServerError
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.HotspotAuthenticationResponseCode
  
  /* 6 */ val accessGatewayInternalError: accessGatewayInternalError with scala.Double = js.native
  /* 5 */ val loginAborted: loginAborted with scala.Double = js.native
  /* 2 */ val loginFailed: loginFailed with scala.Double = js.native
  /* 1 */ val loginSucceeded: loginSucceeded with scala.Double = js.native
  /* 4 */ val networkAdministratorError: networkAdministratorError with scala.Double = js.native
  /* 0 */ val noError: noError with scala.Double = js.native
  /* 3 */ val radiusServerError: radiusServerError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.HotspotAuthenticationResponseCode with scala.Double
  ] = js.native
}

