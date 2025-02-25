package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryOptions extends js.Object {
  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is Require, messages are only delivered if a TLS connection can be established. If the value is Optional, messages can be delivered in plain text if a TLS connection can't be established.
    */
  var TlsPolicy: js.UndefOr[TlsPolicy] = js.undefined
}

object DeliveryOptions {
  @scala.inline
  def apply(TlsPolicy: TlsPolicy = null): DeliveryOptions = {
    val __obj = js.Dynamic.literal()
    if (TlsPolicy != null) __obj.updateDynamic("TlsPolicy")(TlsPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryOptions]
  }
}

