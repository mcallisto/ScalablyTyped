package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartGatewayOutput extends js.Object {
  var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
}

object StartGatewayOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null): StartGatewayOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    __obj.asInstanceOf[StartGatewayOutput]
  }
}

