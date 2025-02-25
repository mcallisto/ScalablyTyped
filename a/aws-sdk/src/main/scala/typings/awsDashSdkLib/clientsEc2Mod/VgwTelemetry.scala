package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgwTelemetry extends js.Object {
  /**
    * The number of accepted routes.
    */
  var AcceptedRouteCount: js.UndefOr[Integer] = js.undefined
  /**
    * The date and time of the last change in status.
    */
  var LastStatusChange: js.UndefOr[DateTime] = js.undefined
  /**
    * The Internet-routable IP address of the virtual private gateway's outside interface.
    */
  var OutsideIpAddress: js.UndefOr[String] = js.undefined
  /**
    * The status of the VPN tunnel.
    */
  var Status: js.UndefOr[TelemetryStatus] = js.undefined
  /**
    * If an error occurs, a description of the error.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}

object VgwTelemetry {
  @scala.inline
  def apply(
    AcceptedRouteCount: js.UndefOr[Integer] = js.undefined,
    LastStatusChange: DateTime = null,
    OutsideIpAddress: String = null,
    Status: TelemetryStatus = null,
    StatusMessage: String = null
  ): VgwTelemetry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AcceptedRouteCount)) __obj.updateDynamic("AcceptedRouteCount")(AcceptedRouteCount)
    if (LastStatusChange != null) __obj.updateDynamic("LastStatusChange")(LastStatusChange)
    if (OutsideIpAddress != null) __obj.updateDynamic("OutsideIpAddress")(OutsideIpAddress)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    __obj.asInstanceOf[VgwTelemetry]
  }
}

