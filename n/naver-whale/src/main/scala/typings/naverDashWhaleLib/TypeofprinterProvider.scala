package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofprinterProvider extends js.Object {
  var onGetCapabilityRequested: chromeLib.chromeNs.printerProviderNs.CapabilityRequestedEvent
  var onGetPrintersRequested: chromeLib.chromeNs.printerProviderNs.PrinterRequestedEvent
  var onGetUsbPrinterInfoRequested: chromeLib.chromeNs.printerProviderNs.PrinterInfoRequestedEvent
  var onPrintRequested: chromeLib.chromeNs.printerProviderNs.PrintRequestedEvent
}

object TypeofprinterProvider {
  @scala.inline
  def apply(
    onGetCapabilityRequested: chromeLib.chromeNs.printerProviderNs.CapabilityRequestedEvent,
    onGetPrintersRequested: chromeLib.chromeNs.printerProviderNs.PrinterRequestedEvent,
    onGetUsbPrinterInfoRequested: chromeLib.chromeNs.printerProviderNs.PrinterInfoRequestedEvent,
    onPrintRequested: chromeLib.chromeNs.printerProviderNs.PrintRequestedEvent
  ): TypeofprinterProvider = {
    val __obj = js.Dynamic.literal(onGetCapabilityRequested = onGetCapabilityRequested, onGetPrintersRequested = onGetPrintersRequested, onGetUsbPrinterInfoRequested = onGetUsbPrinterInfoRequested, onPrintRequested = onPrintRequested)
  
    __obj.asInstanceOf[TypeofprinterProvider]
  }
}

