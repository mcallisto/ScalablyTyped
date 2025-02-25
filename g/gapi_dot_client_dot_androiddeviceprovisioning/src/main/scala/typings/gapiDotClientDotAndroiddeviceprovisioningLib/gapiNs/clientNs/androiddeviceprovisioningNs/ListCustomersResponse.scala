package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCustomersResponse extends js.Object {
  /** List of customers related to this partner. */
  var customers: js.UndefOr[js.Array[Company]] = js.undefined
}

object ListCustomersResponse {
  @scala.inline
  def apply(customers: js.Array[Company] = null): ListCustomersResponse = {
    val __obj = js.Dynamic.literal()
    if (customers != null) __obj.updateDynamic("customers")(customers)
    __obj.asInstanceOf[ListCustomersResponse]
  }
}

