package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetIpAddressTypeOutput extends js.Object {
  /**
    * The IP address type.
    */
  var IpAddressType: js.UndefOr[IpAddressType] = js.undefined
}

object SetIpAddressTypeOutput {
  @scala.inline
  def apply(IpAddressType: IpAddressType = null): SetIpAddressTypeOutput = {
    val __obj = js.Dynamic.literal()
    if (IpAddressType != null) __obj.updateDynamic("IpAddressType")(IpAddressType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIpAddressTypeOutput]
  }
}

