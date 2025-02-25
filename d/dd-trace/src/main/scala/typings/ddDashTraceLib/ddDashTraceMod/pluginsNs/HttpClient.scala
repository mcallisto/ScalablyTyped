package typings
package ddDashTraceLib.ddDashTraceMod.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait HttpClient extends Http {
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[ddDashTraceLib.Anon_ReqRequest] = js.undefined
  /**
    * Use the remote endpoint host as the service name instead of the default.
    *
    * @default false
    */
  var splitByDomain: js.UndefOr[scala.Boolean] = js.undefined
}

object HttpClient {
  @scala.inline
  def apply(
    analytics: scala.Boolean | ddDashTraceLib.Anon_Enabled = null,
    blacklist: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]) | (js.Array[
      java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])
    ]) = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    headers: js.Array[java.lang.String] = null,
    hooks: ddDashTraceLib.Anon_ReqRequest = null,
    service: java.lang.String = null,
    splitByDomain: js.UndefOr[scala.Boolean] = js.undefined,
    validateStatus: /* code */ scala.Double => scala.Boolean = null,
    whitelist: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]) | (js.Array[
      java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])
    ]) = null
  ): HttpClient = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    if (service != null) __obj.updateDynamic("service")(service)
    if (!js.isUndefined(splitByDomain)) __obj.updateDynamic("splitByDomain")(splitByDomain)
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(js.Any.fromFunction1(validateStatus))
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpClient]
  }
}

