package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthCheckCustomConfig extends js.Object {
  /**
    * The number of 30-second intervals that you want Cloud Map to wait after receiving an UpdateInstanceCustomHealthStatus request before it changes the health status of a service instance. For example, suppose you specify a value of 2 for FailureTheshold, and then your application sends an UpdateInstanceCustomHealthStatus request. Cloud Map waits for approximately 60 seconds (2 x 30) before changing the status of the service instance based on that request. Sending a second or subsequent UpdateInstanceCustomHealthStatus request with the same value before FailureThreshold x 30 seconds has passed doesn't accelerate the change. Cloud Map still waits FailureThreshold x 30 seconds after the first request to make the change.
    */
  var FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined
}

object HealthCheckCustomConfig {
  @scala.inline
  def apply(FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined): HealthCheckCustomConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FailureThreshold)) __obj.updateDynamic("FailureThreshold")(FailureThreshold)
    __obj.asInstanceOf[HealthCheckCustomConfig]
  }
}

