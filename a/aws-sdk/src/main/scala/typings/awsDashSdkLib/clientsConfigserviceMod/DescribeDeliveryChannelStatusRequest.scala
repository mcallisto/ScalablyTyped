package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDeliveryChannelStatusRequest extends js.Object {
  /**
    * A list of delivery channel names.
    */
  var DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined
}

object DescribeDeliveryChannelStatusRequest {
  @scala.inline
  def apply(DeliveryChannelNames: DeliveryChannelNameList = null): DescribeDeliveryChannelStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (DeliveryChannelNames != null) __obj.updateDynamic("DeliveryChannelNames")(DeliveryChannelNames)
    __obj.asInstanceOf[DescribeDeliveryChannelStatusRequest]
  }
}

