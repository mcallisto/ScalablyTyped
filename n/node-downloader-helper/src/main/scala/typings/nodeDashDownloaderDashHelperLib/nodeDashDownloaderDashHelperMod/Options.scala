package typings
package nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
   // Custom HTTP Header ex: Authorization, User-Agent
  var fileName: js.UndefOr[java.lang.String] = js.undefined
   // Custom filename when saved
  var forceResume: js.UndefOr[scala.Boolean] = js.undefined
   // Request Method Verb
  var headers: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders] = js.undefined
   // if true it will override the file, otherwise will append '(number)' to the end of file
  var httpRequestOptions: js.UndefOr[nodeLib.httpMod.RequestOptions] = js.undefined
   // Override the http request options
  var httpsRequestOptions: js.UndefOr[nodeLib.httpsMod.RequestOptions] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
   // If the server does not return the "accept-ranges" header, can be force if it does support it
  var `override`: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fileName: java.lang.String = null,
    forceResume: js.UndefOr[scala.Boolean] = js.undefined,
    headers: nodeLib.httpMod.OutgoingHttpHeaders = null,
    httpRequestOptions: nodeLib.httpMod.RequestOptions = null,
    httpsRequestOptions: nodeLib.httpsMod.RequestOptions = null,
    method: java.lang.String = null,
    `override`: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (!js.isUndefined(forceResume)) __obj.updateDynamic("forceResume")(forceResume)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (httpRequestOptions != null) __obj.updateDynamic("httpRequestOptions")(httpRequestOptions)
    if (httpsRequestOptions != null) __obj.updateDynamic("httpsRequestOptions")(httpsRequestOptions)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`)
    __obj.asInstanceOf[Options]
  }
}

