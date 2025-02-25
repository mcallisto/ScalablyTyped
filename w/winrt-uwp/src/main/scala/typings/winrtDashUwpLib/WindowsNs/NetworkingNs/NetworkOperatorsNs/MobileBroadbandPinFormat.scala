package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandPinFormat extends js.Object

/** Describes the possible formats for a mobile broadband PIN. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinFormat")
@js.native
object MobileBroadbandPinFormat extends js.Object {
  /** The PIN is alphanumeric. */
  @js.native
  sealed trait alphanumeric
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinFormat
  
  /** The PIN is numeric. */
  @js.native
  sealed trait numeric
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinFormat
  
  /** No PIN format has been defined. This is normally not used. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinFormat
  
  /* 2 */ val alphanumeric: alphanumeric with scala.Double = js.native
  /* 1 */ val numeric: numeric with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinFormat with scala.Double
  ] = js.native
}

