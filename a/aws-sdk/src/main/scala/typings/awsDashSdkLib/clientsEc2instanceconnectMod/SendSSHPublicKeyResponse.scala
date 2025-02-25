package typings
package awsDashSdkLib.clientsEc2instanceconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendSSHPublicKeyResponse extends js.Object {
  /**
    * The request ID as logged by EC2 Connect. Please provide this when contacting AWS Support.
    */
  var RequestId: js.UndefOr[RequestId] = js.undefined
  /**
    * Indicates request success.
    */
  var Success: js.UndefOr[Success] = js.undefined
}

object SendSSHPublicKeyResponse {
  @scala.inline
  def apply(RequestId: RequestId = null, Success: js.UndefOr[Success] = js.undefined): SendSSHPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (!js.isUndefined(Success)) __obj.updateDynamic("Success")(Success)
    __obj.asInstanceOf[SendSSHPublicKeyResponse]
  }
}

