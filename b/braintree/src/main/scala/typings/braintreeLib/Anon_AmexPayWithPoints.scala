package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmexPayWithPoints extends js.Object {
  var AmexPayWithPoints: Anon_IneligibleCard
  var CardTypeIndicators: Anon_Commercial
  var Dispute: Anon_Chargeback
}

object Anon_AmexPayWithPoints {
  @scala.inline
  def apply(
    AmexPayWithPoints: Anon_IneligibleCard,
    CardTypeIndicators: Anon_Commercial,
    Dispute: Anon_Chargeback
  ): Anon_AmexPayWithPoints = {
    val __obj = js.Dynamic.literal(AmexPayWithPoints = AmexPayWithPoints, CardTypeIndicators = CardTypeIndicators, Dispute = Dispute)
  
    __obj.asInstanceOf[Anon_AmexPayWithPoints]
  }
}

