package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaiduChannelRequest extends js.Object {
  /**
    * The API key that you received from the Baidu Cloud Push service to communicate with the service.
    */
  var ApiKey: __string
  /**
    * Specifies whether to enable the Baidu channel for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    * The secret key that you received from the Baidu Cloud Push service to communicate with the service.
    */
  var SecretKey: __string
}

object BaiduChannelRequest {
  @scala.inline
  def apply(ApiKey: __string, SecretKey: __string, Enabled: js.UndefOr[__boolean] = js.undefined): BaiduChannelRequest = {
    val __obj = js.Dynamic.literal(ApiKey = ApiKey, SecretKey = SecretKey)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[BaiduChannelRequest]
  }
}

