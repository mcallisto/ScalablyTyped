package typings
package stripeLib.stripeMod.subscriptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionUpdateOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  /**
    * A positive decimal (with at most two decimal places) between 1 and 100. This represents the percentage of the subscription invoice
    * subtotal that will be transferred to the application owner’s Stripe account. The request must be made with an OAuth key in order
    * to set an application fee percentage. For more information, see the application fees documentation.
    */
  var application_fee_percent: js.UndefOr[scala.Double] = js.undefined
  /**
    * Either "charge_automatically", or "send_invoice". When charging automatically, Stripe will attempt to pay this subscription at the end of the
    * cycle using the default source attached to the customer. When sending an invoice, Stripe will email your customer an invoice with payment
    * instructions.
    */
  var billing: js.UndefOr[SubscriptionBilling] = js.undefined
  /**
    * String, unchanged (default) or now. This allows you to reset the billing cycle of a subscription.
    */
  var billing_cycle_anchor: js.UndefOr[stripeLib.stripeLibStrings.unchanged | stripeLib.stripeLibStrings.now] = js.undefined
  /**
    * Boolean indicating whether this subscription should cancel at the end of the current period.
    */
  var cancel_at_period_end: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The code of the coupon to apply to this subscription. A coupon applied to a subscription will only affect invoices created for that
    * particular subscription.  Passing null will remove any coupon previously applied to a subscription.
    */
  var coupon: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Number of days a customer has to pay invoices generated by this subscription. Only valid for subscriptions where billing=send_invoice.
    */
  var days_until_due: js.UndefOr[scala.Double] = js.undefined
  /**
    * List of subscription items, each with an attached plan.
    */
  var items: js.UndefOr[js.Array[ISubscriptionUpdateItem]] = js.undefined
  /**
    * Boolean (default true). Used to prevent Stripe Invoicing from automatically paying the subscription when the term changes.
    * This can be set to false when used with services like Avalara that need to augment an invoice before the subscription is paid.
    *
    * Using this flag requires contacting Stripe support in order to have the account whitelisted.
    */
  var pay_immediately: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated Use items property instead.
    */
  var plan: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Flag telling us whether to prorate switching plans during a billing cycle.
    */
  var prorate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used to apply exactly the
    * same proration that was previewed with upcoming invoice endpoint. It can also be used to implement custom proration logic, such as
    * prorating by day instead of by second, by providing the time that you wish to use for proration calculations.
    */
  var proration_date: js.UndefOr[scala.Double] = js.undefined
  /**
    * The quantity you'd like to apply to the subscription you're creating. For example, if your plan is £10/user/month, and your customer
    * has 5 users, you could pass 5 as the quantity to have the customer charged £50 (5 x £10) monthly. If you update a subscription but
    * don't change the plan ID (e.g. changing only the trial_end), the subscription will inherit the old subscription's quantity attribute
    * unless you pass a new quantity parameter. If you update a subscription and change the plan ID, the new subscription will not inherit
    * the quantity attribute and will default to 1 unless you pass a quantity parameter.
    */
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[java.lang.String | stripeLib.stripeMod.cardsNs.ICardSourceCreationOptions] = js.undefined
  /**
    * A positive decimal (with at most two decimal places) between 1 and 100. This represents the percentage of the subscription invoice
    * subtotal that will be calculated and added as tax to the final amount each billing period. For example, a plan which charges $10/month
    * with a tax_percent of 20.0 will charge $12 per invoice.
    */
  var tax_percent: js.UndefOr[scala.Double] = js.undefined
  /**
    * Unix timestamp representing the end of the trial period the customer will get before being charged for the first time. If set, trial_end
    * will override the default trial period of the plan the customer is being subscribed to. The special value now can be provided to end the
    * customer's trial immediately.
    */
  var trial_end: js.UndefOr[scala.Double | stripeLib.stripeLibStrings.now] = js.undefined
}

object ISubscriptionUpdateOptions {
  @scala.inline
  def apply(
    application_fee_percent: scala.Int | scala.Double = null,
    billing: SubscriptionBilling = null,
    billing_cycle_anchor: stripeLib.stripeLibStrings.unchanged | stripeLib.stripeLibStrings.now = null,
    cancel_at_period_end: js.UndefOr[scala.Boolean] = js.undefined,
    coupon: java.lang.String = null,
    days_until_due: scala.Int | scala.Double = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    items: js.Array[ISubscriptionUpdateItem] = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null,
    pay_immediately: js.UndefOr[scala.Boolean] = js.undefined,
    plan: java.lang.String = null,
    prorate: js.UndefOr[scala.Boolean] = js.undefined,
    proration_date: scala.Int | scala.Double = null,
    quantity: scala.Int | scala.Double = null,
    source: java.lang.String | stripeLib.stripeMod.cardsNs.ICardSourceCreationOptions = null,
    tax_percent: scala.Int | scala.Double = null,
    trial_end: scala.Double | stripeLib.stripeLibStrings.now = null
  ): ISubscriptionUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (application_fee_percent != null) __obj.updateDynamic("application_fee_percent")(application_fee_percent.asInstanceOf[js.Any])
    if (billing != null) __obj.updateDynamic("billing")(billing)
    if (billing_cycle_anchor != null) __obj.updateDynamic("billing_cycle_anchor")(billing_cycle_anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel_at_period_end)) __obj.updateDynamic("cancel_at_period_end")(cancel_at_period_end)
    if (coupon != null) __obj.updateDynamic("coupon")(coupon)
    if (days_until_due != null) __obj.updateDynamic("days_until_due")(days_until_due.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (items != null) __obj.updateDynamic("items")(items)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (!js.isUndefined(pay_immediately)) __obj.updateDynamic("pay_immediately")(pay_immediately)
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (!js.isUndefined(prorate)) __obj.updateDynamic("prorate")(prorate)
    if (proration_date != null) __obj.updateDynamic("proration_date")(proration_date.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (tax_percent != null) __obj.updateDynamic("tax_percent")(tax_percent.asInstanceOf[js.Any])
    if (trial_end != null) __obj.updateDynamic("trial_end")(trial_end.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionUpdateOptions]
  }
}

