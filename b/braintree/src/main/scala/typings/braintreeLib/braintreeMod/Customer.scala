package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "Customer")
@js.native
class Customer () extends js.Object {
  var addresses: js.UndefOr[js.Array[Address]] = js.native
  var androidPayCards: js.UndefOr[js.Array[AndroidPayCard]] = js.native
  var applePayCards: js.UndefOr[js.Array[ApplePayCard]] = js.native
  var company: js.UndefOr[java.lang.String] = js.native
  var createdAt: stdLib.Date = js.native
  var creditCards: js.UndefOr[js.Array[CreditCard]] = js.native
  var customFields: js.UndefOr[js.Any] = js.native
  var email: js.UndefOr[java.lang.String] = js.native
  var fax: js.UndefOr[java.lang.String] = js.native
  var firstName: js.UndefOr[java.lang.String] = js.native
  var id: java.lang.String = js.native
  var lastName: js.UndefOr[java.lang.String] = js.native
  var masterpassCards: js.UndefOr[js.Array[MasterpassCard]] = js.native
  var paymentMethods: js.UndefOr[js.Array[PaymentMethod]] = js.native
  var paypalAccounts: js.UndefOr[js.Array[PayPalAccount]] = js.native
  var phone: js.UndefOr[java.lang.String] = js.native
  var samsungPayCards: js.UndefOr[js.Array[SamsungPayCard]] = js.native
  var updatedAt: stdLib.Date = js.native
  var venmoAccounts: js.UndefOr[js.Array[VenmoAccount]] = js.native
  var visaCheckoutCards: js.UndefOr[js.Array[VisaCheckoutCard]] = js.native
  var website: js.UndefOr[java.lang.String] = js.native
}

