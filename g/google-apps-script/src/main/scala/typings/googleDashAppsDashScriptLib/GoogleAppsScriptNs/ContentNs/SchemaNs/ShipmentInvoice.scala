package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShipmentInvoice extends js.Object {
  var invoiceSummary: js.UndefOr[InvoiceSummary] = js.undefined
  var lineItemInvoices: js.UndefOr[js.Array[ShipmentInvoiceLineItemInvoice]] = js.undefined
  var shipmentGroupId: js.UndefOr[java.lang.String] = js.undefined
}

object ShipmentInvoice {
  @scala.inline
  def apply(
    invoiceSummary: InvoiceSummary = null,
    lineItemInvoices: js.Array[ShipmentInvoiceLineItemInvoice] = null,
    shipmentGroupId: java.lang.String = null
  ): ShipmentInvoice = {
    val __obj = js.Dynamic.literal()
    if (invoiceSummary != null) __obj.updateDynamic("invoiceSummary")(invoiceSummary)
    if (lineItemInvoices != null) __obj.updateDynamic("lineItemInvoices")(lineItemInvoices)
    if (shipmentGroupId != null) __obj.updateDynamic("shipmentGroupId")(shipmentGroupId)
    __obj.asInstanceOf[ShipmentInvoice]
  }
}

