package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "BraintreeGateway")
@js.native
class BraintreeGateway protected () extends js.Object {
  def this(config: GatewayConfig) = this()
  var addOn: AddOnGateway = js.native
  var address: AddressGateway = js.native
  var clientToken: ClientTokenGateway = js.native
  var config: js.Any = js.native
  var creditCard: CreditCardGateway = js.native
  var creditCardVerification: CreditCardVerificationGateway = js.native
  var customer: CustomerGateway = js.native
  var discount: DiscountGateway = js.native
  var dispute: DisputeGateway = js.native
  var merchantAccountGateway: MerchantAccountGateway = js.native
  var paymentMethod: PaymentMethodGateway = js.native
  var paymentMethodNonce: PaymentMethodNonceGateway = js.native
  var plan: PlanGateway = js.native
  var settlementBatchSummary: SettlementBatchSummaryGateway = js.native
  var subscription: SubscriptionGateway = js.native
  var testing: TestingGateway = js.native
  var transaction: TransactionGateway = js.native
  var transactionLineItem: TransactionLineItemGateway = js.native
}

