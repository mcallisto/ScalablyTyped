package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableEbsEncryptionByDefaultRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation. 
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}

object EnableEbsEncryptionByDefaultRequest {
  @scala.inline
  def apply(DryRun: js.UndefOr[Boolean] = js.undefined): EnableEbsEncryptionByDefaultRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[EnableEbsEncryptionByDefaultRequest]
  }
}

