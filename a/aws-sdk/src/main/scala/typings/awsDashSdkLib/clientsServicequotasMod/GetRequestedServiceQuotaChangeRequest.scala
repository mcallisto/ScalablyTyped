package typings
package awsDashSdkLib.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRequestedServiceQuotaChangeRequest extends js.Object {
  /**
    * Identifies the quota increase request.
    */
  var RequestId: awsDashSdkLib.clientsServicequotasMod.RequestId
}

object GetRequestedServiceQuotaChangeRequest {
  @scala.inline
  def apply(RequestId: RequestId): GetRequestedServiceQuotaChangeRequest = {
    val __obj = js.Dynamic.literal(RequestId = RequestId)
  
    __obj.asInstanceOf[GetRequestedServiceQuotaChangeRequest]
  }
}

