package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficRoutingConfig extends js.Object {
  /**
    * A configuration that shifts traffic from one version of a Lambda function to another in two increments. The original and target Lambda function versions are specified in the deployment's AppSpec file.
    */
  var timeBasedCanary: js.UndefOr[TimeBasedCanary] = js.undefined
  /**
    * A configuration that shifts traffic from one version of a Lambda function to another in equal increments, with an equal number of minutes between each increment. The original and target Lambda function versions are specified in the deployment's AppSpec file.
    */
  var timeBasedLinear: js.UndefOr[TimeBasedLinear] = js.undefined
  /**
    * The type of traffic shifting (TimeBasedCanary or TimeBasedLinear) used by a deployment configuration .
    */
  var `type`: js.UndefOr[TrafficRoutingType] = js.undefined
}

object TrafficRoutingConfig {
  @scala.inline
  def apply(
    timeBasedCanary: TimeBasedCanary = null,
    timeBasedLinear: TimeBasedLinear = null,
    `type`: TrafficRoutingType = null
  ): TrafficRoutingConfig = {
    val __obj = js.Dynamic.literal()
    if (timeBasedCanary != null) __obj.updateDynamic("timeBasedCanary")(timeBasedCanary)
    if (timeBasedLinear != null) __obj.updateDynamic("timeBasedLinear")(timeBasedLinear)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficRoutingConfig]
  }
}

