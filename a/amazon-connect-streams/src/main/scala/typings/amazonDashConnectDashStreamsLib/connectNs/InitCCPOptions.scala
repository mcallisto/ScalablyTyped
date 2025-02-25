package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitCCPOptions extends js.Object {
  /*
    * The URL for the Connect CCP.
    */
  var ccpUrl: java.lang.String
  /*
    * Whether to display the login view.
    */
  var loginPopup: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * Options specifying softphone configuration.
    */
  var softphone: js.UndefOr[SoftPhoneOptions] = js.undefined
}

object InitCCPOptions {
  @scala.inline
  def apply(
    ccpUrl: java.lang.String,
    loginPopup: js.UndefOr[scala.Boolean] = js.undefined,
    softphone: SoftPhoneOptions = null
  ): InitCCPOptions = {
    val __obj = js.Dynamic.literal(ccpUrl = ccpUrl)
    if (!js.isUndefined(loginPopup)) __obj.updateDynamic("loginPopup")(loginPopup)
    if (softphone != null) __obj.updateDynamic("softphone")(softphone)
    __obj.asInstanceOf[InitCCPOptions]
  }
}

