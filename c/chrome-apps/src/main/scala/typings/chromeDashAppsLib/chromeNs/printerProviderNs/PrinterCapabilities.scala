package typings
package chromeDashAppsLib.chromeNs.printerProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrinterCapabilities extends js.Object {
  /** Device capabilities in CDD format. */
  var capabilities: js.Any
}

object PrinterCapabilities {
  @scala.inline
  def apply(capabilities: js.Any): PrinterCapabilities = {
    val __obj = js.Dynamic.literal(capabilities = capabilities)
  
    __obj.asInstanceOf[PrinterCapabilities]
  }
}

