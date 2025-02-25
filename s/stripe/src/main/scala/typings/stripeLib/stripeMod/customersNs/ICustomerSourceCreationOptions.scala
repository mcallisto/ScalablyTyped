package typings
package stripeLib.stripeMod.customersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomerSourceCreationOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  /**
    * When adding a card to a customer, the parameter name is source. When
    * adding to an account, the parameter name is external_account. The
    * value can either be a token, like the ones returned by our Stripe.js, or a
    * dictionary containing a user’s credit card details (with the options shown
    * below). Stripe will automatically validate the card.
    */
  var source: java.lang.String | stripeLib.stripeMod.cardsNs.ICardSourceCreationOptions
}

object ICustomerSourceCreationOptions {
  @scala.inline
  def apply(
    source: java.lang.String | stripeLib.stripeMod.cardsNs.ICardSourceCreationOptions,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null
  ): ICustomerSourceCreationOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[ICustomerSourceCreationOptions]
  }
}

