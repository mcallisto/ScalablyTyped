package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "MerchantAccount")
@js.native
class MerchantAccount () extends js.Object {
  var business: js.UndefOr[MerchantBusiness] = js.native
  var currencyIsoCode: java.lang.String = js.native
  var default: scala.Boolean = js.native
  var funding: MerchantFunding = js.native
  var id: java.lang.String = js.native
  var individual: MerchantIndividual = js.native
  var masterMerchantAccount: js.UndefOr[MerchantAccount] = js.native
  var status: MerchantAccountStatus = js.native
}

