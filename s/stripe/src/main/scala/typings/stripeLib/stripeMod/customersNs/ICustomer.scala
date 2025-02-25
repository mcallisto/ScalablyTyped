package typings
package stripeLib.stripeMod.customersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Customer objects allow you to perform recurring charges and track multiple charges that are associated
  * with the same customer. The API allows you to create, delete, and update your customers. You can
  * retrieve individual customers as well as a list of all your customers.
  */
trait ICustomer
  extends stripeLib.stripeMod.IResourceObject {
  /**
    * Current balance, if any, being stored on the customer's account. If negative, the customer has credit to apply to
    * the next invoice. If positive, the customer has an amount owed that will be added to the next invoice. The balance
    * does not refer to any unpaid invoices; it solely takes into account amounts that have yet to be successfully applied
    * to any invoice. This balance is only taken into account for recurring charges.
    */
  var account_balance: js.UndefOr[scala.Double] = js.undefined
  var address: stripeLib.stripeMod.IAddress | scala.Null
  var cards: js.UndefOr[stripeLib.stripeMod.resourcesNs.CustomerCards] = js.undefined
  var created: scala.Double
  /**
    * The currency the customer can be charged in for recurring billing purposes (subscriptions, invoices, invoice items).
    */
  var currency: java.lang.String | scala.Null
  /**
    * ID of the default source attached to this customer. [Expandable]
    */
  var default_source: java.lang.String | stripeLib.stripeMod.IStripeSource | scala.Null
  /**
    * Whether or not the latest charge for the customer's latest invoice has failed
    */
  var delinquent: scala.Boolean
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Describes the current discount active on the customer, if there is one.
    */
  var discount: js.UndefOr[stripeLib.stripeMod.couponsNs.IDiscount] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var livemode: scala.Boolean
  var metadata: stripeLib.stripeMod.IMetadata
  /**
    * The customer’s full name or business name.
    */
  var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Value is 'customer'
    */
  @JSName("object")
  var object_ICustomer: stripeLib.stripeLibStrings.customer
  /**
    * The customer’s phone number.
    */
  var phone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Shipping information associated with the customer.
    */
  var shipping: stripeLib.stripeMod.IShippingInformation | scala.Null
  /**
    * The customer’s payment sources, if any
    */
  var sources: js.UndefOr[stripeLib.stripeMod.IList[stripeLib.stripeMod.IStripeSource]] = js.undefined
  /**
    * The customer's current subscriptions, if any
    */
  var subscriptions: ICustomerSubscriptions
}

object ICustomer {
  @scala.inline
  def apply(
    created: scala.Double,
    delinquent: scala.Boolean,
    id: java.lang.String,
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.IMetadata,
    `object`: stripeLib.stripeLibStrings.customer,
    subscriptions: ICustomerSubscriptions,
    account_balance: scala.Int | scala.Double = null,
    address: stripeLib.stripeMod.IAddress = null,
    cards: stripeLib.stripeMod.resourcesNs.CustomerCards = null,
    currency: java.lang.String = null,
    default_source: java.lang.String | stripeLib.stripeMod.IStripeSource = null,
    description: java.lang.String = null,
    discount: stripeLib.stripeMod.couponsNs.IDiscount = null,
    email: java.lang.String = null,
    name: java.lang.String = null,
    phone: java.lang.String = null,
    shipping: stripeLib.stripeMod.IShippingInformation = null,
    sources: stripeLib.stripeMod.IList[stripeLib.stripeMod.IStripeSource] = null
  ): ICustomer = {
    val __obj = js.Dynamic.literal(created = created, delinquent = delinquent, id = id, livemode = livemode, metadata = metadata, subscriptions = subscriptions)
    __obj.updateDynamic("object")(`object`)
    if (account_balance != null) __obj.updateDynamic("account_balance")(account_balance.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address)
    if (cards != null) __obj.updateDynamic("cards")(cards)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (default_source != null) __obj.updateDynamic("default_source")(default_source.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (discount != null) __obj.updateDynamic("discount")(discount)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    __obj.asInstanceOf[ICustomer]
  }
}

