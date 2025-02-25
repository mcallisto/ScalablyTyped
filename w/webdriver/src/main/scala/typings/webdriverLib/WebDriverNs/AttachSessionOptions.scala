package typings
package webdriverLib.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachSessionOptions extends Options {
  var isW3C: js.UndefOr[scala.Boolean] = js.undefined
  var sessionId: java.lang.String
}

object AttachSessionOptions {
  @scala.inline
  def apply(
    sessionId: java.lang.String,
    capabilities: DesiredCapabilities = null,
    connectionRetryCount: scala.Int | scala.Double = null,
    connectionRetryTimeout: scala.Int | scala.Double = null,
    hostname: java.lang.String = null,
    isW3C: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    logLevel: WebDriverLogTypes = null,
    logOutput: java.lang.String | nodeLib.NodeJSNs.WritableStream = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    protocol: java.lang.String = null,
    queryParams: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    user: java.lang.String = null
  ): AttachSessionOptions = {
    val __obj = js.Dynamic.literal(sessionId = sessionId)
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities)
    if (connectionRetryCount != null) __obj.updateDynamic("connectionRetryCount")(connectionRetryCount.asInstanceOf[js.Any])
    if (connectionRetryTimeout != null) __obj.updateDynamic("connectionRetryTimeout")(connectionRetryTimeout.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (!js.isUndefined(isW3C)) __obj.updateDynamic("isW3C")(isW3C)
    if (key != null) __obj.updateDynamic("key")(key)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (logOutput != null) __obj.updateDynamic("logOutput")(logOutput.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[AttachSessionOptions]
  }
}

