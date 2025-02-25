package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderReturnLineItem")
@js.native
class OrderReturnLineItem () extends js.Object {
  /**
    * The base price for a single unit of the line item.
    */
  var base_price_money: js.UndefOr[Money] = js.native
  /**
    * The [CatalogItemVariation](#type-catalogitemvariation) id applied to this returned line item.
    */
  var catalog_object_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The gross return amount of money calculated as (item base price + modifiers price) * quantity.
    */
  var gross_return_money: js.UndefOr[Money] = js.native
  /**
    * The name of the line item.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * The note of the returned line item.
    */
  var note: js.UndefOr[java.lang.String] = js.native
  /**
    * The quantity returned, formatted as a decimal number. For example: "3".
    * Line items with a `quantity_unit` can have non-integer quantities. For example: "1.70000".
    */
  var quantity: java.lang.String = js.native
  /**
    * The unit and precision that this return line item's quantity is measured in.
    */
  var quantity_unit: js.UndefOr[OrderQuantityUnit] = js.native
  /**
    * A list of discounts applied to this line item. On read or retrieve, this list includes both item-level discounts
    * and any return-level discounts apportioned to this item.
    */
  var return_discounts: js.UndefOr[js.Array[OrderReturnDiscount]] = js.native
  /**
    * The [CatalogModifier](#type-catalogmodifier)s applied to this line item.
    */
  var return_modifiers: js.UndefOr[js.Array[OrderReturnLineItemModifier]] = js.native
  /**
    * A list of taxes applied to this line item. On read or retrieve, this list includes both item-level taxes and any
    * return-level taxes apportioned to this item.
    */
  var return_taxes: js.UndefOr[js.Array[OrderReturnTax]] = js.native
  /**
    * `uid` of the LineItem in the original sale Order.
    */
  var source_line_item_uid: js.UndefOr[java.lang.String] = js.native
  /**
    * The total discount amount of money to return for the line item.
    */
  var total_discount_money: js.UndefOr[Money] = js.native
  /**
    * The total amount of money to return for this line item.
    */
  var total_money: js.UndefOr[Money] = js.native
  /**
    * The total tax amount of money to return for the line item.
    */
  var total_tax_money: js.UndefOr[Money] = js.native
  /**
    * Unique identifier for this return line item entry. This is a read-only field.
    */
  var uid: js.UndefOr[java.lang.String] = js.native
  /**
    * The name of the variation applied to this returned line item.
    */
  var variation_name: js.UndefOr[java.lang.String] = js.native
  /**
    * The total price of all item variations returned in this line item.
    * Calculated as `base_price_money` multiplied by `quantity`. Does not include modifiers.
    */
  var variation_total_price_money: js.UndefOr[Money] = js.native
}

