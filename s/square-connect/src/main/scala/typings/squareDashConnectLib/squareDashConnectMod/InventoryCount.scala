package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "InventoryCount")
@js.native
class InventoryCount () extends js.Object {
  /**
    * A read-only timestamp in RFC 3339 format that indicates when Square received the most recent physical count or
    * adjustment that had an affect on the estimated count.
    */
  var calculated_at: js.UndefOr[java.lang.String] = js.native
  /**
    * The Square generated ID of the [CatalogObject](#type-catalogobject) being tracked.
    */
  var catalog_object_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The [CatalogObjectType](#type-catalogobjecttype) of the [CatalogObject](#type-catalogobject) being tracked.
    * Tracking is only supported for the `ITEM_VARIATION` type.
    */
  var catalog_object_type: js.UndefOr[java.lang.String] = js.native
  /**
    * The Square ID of the [Location](#type-location) where the related quantity of items are being tracked.
    */
  var location_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The number of items in the count as a decimal string. Can support up to 5 digits after the decimal point.
    * @important The Point of Sale app and Dashboard do not currently support decimal quantities.
    * If a Point of Sale app or Dashboard attempts to read a decimal quantity on inventory counts or adjustments,
    * the quantity will be rounded down to the nearest integer. For example, `2.5` will become `2`, and `-2.5` will become `-3`.
    * Read [Decimal Quantities (BETA)](/more-apis/inventory/overview#decimal-quantities-beta) for more information.
    */
  var quantity: js.UndefOr[java.lang.String] = js.native
  /**
    * The current [InventoryState](#type-inventorystate) for the related quantity of items.
    * See [InventoryState](#type-inventorystate) for possible values.
    */
  var state: js.UndefOr[squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum] = js.native
}

