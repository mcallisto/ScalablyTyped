package typings
package pingLib.pingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PingConfig extends js.Object {
  /**
    * Additional arguments. Default `[]`
    */
  var extra: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    *  Exit after sending number of `ECHO_REQUEST`. Default `1`
    */
  var min_reply: js.UndefOr[scala.Double] = js.undefined
  /**
    * Map IP address to hostname or not. Default `true`
    */
  var numeric: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Source address for sending the ping.
    */
  var sourceAddr: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Time duration, in seconds, for ping command to exit. Default `2` on Mac/Linux, `5` on Windows.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Ping via ipv6 or not. Default `false`
    */
  var v6: js.UndefOr[scala.Boolean] = js.undefined
}

object PingConfig {
  @scala.inline
  def apply(
    extra: js.Array[java.lang.String] = null,
    min_reply: scala.Int | scala.Double = null,
    numeric: js.UndefOr[scala.Boolean] = js.undefined,
    sourceAddr: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    v6: js.UndefOr[scala.Boolean] = js.undefined
  ): PingConfig = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (min_reply != null) __obj.updateDynamic("min_reply")(min_reply.asInstanceOf[js.Any])
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric)
    if (sourceAddr != null) __obj.updateDynamic("sourceAddr")(sourceAddr)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(v6)) __obj.updateDynamic("v6")(v6)
    __obj.asInstanceOf[PingConfig]
  }
}

