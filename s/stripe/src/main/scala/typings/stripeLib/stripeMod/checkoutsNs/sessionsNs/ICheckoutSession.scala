package typings
package stripeLib.stripeMod.checkoutsNs.sessionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckoutSession extends js.Object {
  /**
    * Whether or not billing address was collected
    */
  var billing_address_collection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL the customer will be redirected to upon cancellation
    */
  var cancel_url: java.lang.String
  /**
    * Unique reference to session
    */
  var client_reference_id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * ID of customer
    */
  var customer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Email address of customer
    */
  var customer_email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The line items purchased
    */
  var display_items: js.Array[ICheckoutLineItems]
  /**
    * Unique ID for checkout session to pass to `redirectToCheckout` in Stripe.js
    */
  var id: java.lang.String
  /**
    * If the object is in live mode or not
    */
  var livemode: scala.Boolean
  /**
    * Language tag of the checkout session
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /**
    * String of object type. Is always 'checkout.session'
    */
  var `object`: java.lang.String
  /**
    * ID of payment intent created
    */
  var payment_intent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Array of accepted payment methods
    */
  var payment_method_types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * ID of subscription if one was created
    */
  var subscription: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL to redirect to upon success
    */
  var success_url: java.lang.String
}

object ICheckoutSession {
  @scala.inline
  def apply(
    cancel_url: java.lang.String,
    display_items: js.Array[ICheckoutLineItems],
    id: java.lang.String,
    livemode: scala.Boolean,
    `object`: java.lang.String,
    success_url: java.lang.String,
    billing_address_collection: java.lang.String = null,
    client_reference_id: java.lang.String = null,
    customer: java.lang.String = null,
    customer_email: java.lang.String = null,
    locale: java.lang.String = null,
    payment_intent: java.lang.String = null,
    payment_method_types: js.Array[java.lang.String] = null,
    subscription: java.lang.String = null
  ): ICheckoutSession = {
    val __obj = js.Dynamic.literal(cancel_url = cancel_url, display_items = display_items, id = id, livemode = livemode, success_url = success_url)
    __obj.updateDynamic("object")(`object`)
    if (billing_address_collection != null) __obj.updateDynamic("billing_address_collection")(billing_address_collection)
    if (client_reference_id != null) __obj.updateDynamic("client_reference_id")(client_reference_id)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (customer_email != null) __obj.updateDynamic("customer_email")(customer_email)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (payment_intent != null) __obj.updateDynamic("payment_intent")(payment_intent)
    if (payment_method_types != null) __obj.updateDynamic("payment_method_types")(payment_method_types)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    __obj.asInstanceOf[ICheckoutSession]
  }
}

