package typings
package ipifyLib.ipifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Custom API endpoint.
  		@default 'https://api6.ipify.org'
  		*/
  val endpoint: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Use the IPv6 API endpoint. The IPv6 endpoint will return an IPv6 address if available, IPv4 address otherwise.
  		Setting the `endpoint` option will override this.
  		@default true
  		*/
  val useIPv6: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(endpoint: java.lang.String = null, useIPv6: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (!js.isUndefined(useIPv6)) __obj.updateDynamic("useIPv6")(useIPv6)
    __obj.asInstanceOf[Options]
  }
}

