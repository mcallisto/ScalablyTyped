package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailOnDuplicatePaymentMethod extends js.Object {
  var failOnDuplicatePaymentMethod: js.UndefOr[scala.Boolean] = js.undefined
  var makeDefault: js.UndefOr[scala.Boolean] = js.undefined
  var verifyCard: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_FailOnDuplicatePaymentMethod {
  @scala.inline
  def apply(
    failOnDuplicatePaymentMethod: js.UndefOr[scala.Boolean] = js.undefined,
    makeDefault: js.UndefOr[scala.Boolean] = js.undefined,
    verifyCard: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_FailOnDuplicatePaymentMethod = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failOnDuplicatePaymentMethod)) __obj.updateDynamic("failOnDuplicatePaymentMethod")(failOnDuplicatePaymentMethod)
    if (!js.isUndefined(makeDefault)) __obj.updateDynamic("makeDefault")(makeDefault)
    if (!js.isUndefined(verifyCard)) __obj.updateDynamic("verifyCard")(verifyCard)
    __obj.asInstanceOf[Anon_FailOnDuplicatePaymentMethod]
  }
}

