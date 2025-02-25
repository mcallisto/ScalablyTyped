package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResendConfirmationCodeResponse extends js.Object {
  /**
    * The code delivery details returned by the server in response to the request to resend the confirmation code.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
}

object ResendConfirmationCodeResponse {
  @scala.inline
  def apply(CodeDeliveryDetails: CodeDeliveryDetailsType = null): ResendConfirmationCodeResponse = {
    val __obj = js.Dynamic.literal()
    if (CodeDeliveryDetails != null) __obj.updateDynamic("CodeDeliveryDetails")(CodeDeliveryDetails)
    __obj.asInstanceOf[ResendConfirmationCodeResponse]
  }
}

