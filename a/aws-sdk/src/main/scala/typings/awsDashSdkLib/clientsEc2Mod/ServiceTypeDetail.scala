package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceTypeDetail extends js.Object {
  /**
    * The type of service.
    */
  var ServiceType: js.UndefOr[ServiceType] = js.undefined
}

object ServiceTypeDetail {
  @scala.inline
  def apply(ServiceType: ServiceType = null): ServiceTypeDetail = {
    val __obj = js.Dynamic.literal()
    if (ServiceType != null) __obj.updateDynamic("ServiceType")(ServiceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceTypeDetail]
  }
}

