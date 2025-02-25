package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDevicesRequest extends js.Object {
  /**
    * The access tokens for the request to list devices.
    */
  var AccessToken: TokenModelType
  /**
    * The limit of the device request.
    */
  var Limit: js.UndefOr[QueryLimitType] = js.undefined
  /**
    * The pagination token for the list request.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
}

object ListDevicesRequest {
  @scala.inline
  def apply(
    AccessToken: TokenModelType,
    Limit: js.UndefOr[QueryLimitType] = js.undefined,
    PaginationToken: SearchPaginationTokenType = null
  ): ListDevicesRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    __obj.asInstanceOf[ListDevicesRequest]
  }
}

