package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderCustomer extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var explicitMarketingPreference: js.UndefOr[scala.Boolean] = js.undefined
  var fullName: js.UndefOr[java.lang.String] = js.undefined
  var marketingRightsInfo: js.UndefOr[OrderCustomerMarketingRightsInfo] = js.undefined
}

object OrderCustomer {
  @scala.inline
  def apply(
    email: java.lang.String = null,
    explicitMarketingPreference: js.UndefOr[scala.Boolean] = js.undefined,
    fullName: java.lang.String = null,
    marketingRightsInfo: OrderCustomerMarketingRightsInfo = null
  ): OrderCustomer = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(explicitMarketingPreference)) __obj.updateDynamic("explicitMarketingPreference")(explicitMarketingPreference)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    if (marketingRightsInfo != null) __obj.updateDynamic("marketingRightsInfo")(marketingRightsInfo)
    __obj.asInstanceOf[OrderCustomer]
  }
}

