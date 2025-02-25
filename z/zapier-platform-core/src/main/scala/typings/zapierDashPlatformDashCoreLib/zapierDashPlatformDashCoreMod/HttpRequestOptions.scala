package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequestOptions extends js.Object {
  var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
  var body: js.UndefOr[java.lang.String | nodeLib.Buffer | stdLib.ReadableStream[_] | js.Object] = js.undefined
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var follow: js.UndefOr[scala.Double] = js.undefined
  var form: js.UndefOr[js.Object] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var json: js.UndefOr[js.Object | js.Array[_]] = js.undefined
  var method: js.UndefOr[HttpMethod] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var redirect: js.UndefOr[
    zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.manual | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.error | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.follow
  ] = js.undefined
  var removeMissingValuesFrom: js.UndefOr[zapierDashPlatformDashCoreLib.Anon_Body] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object HttpRequestOptions {
  @scala.inline
  def apply(
    agent: nodeLib.httpMod.Agent = null,
    body: java.lang.String | nodeLib.Buffer | stdLib.ReadableStream[_] | js.Object = null,
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    follow: scala.Int | scala.Double = null,
    form: js.Object = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    json: js.Object | js.Array[_] = null,
    method: HttpMethod = null,
    params: js.Object = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    redirect: zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.manual | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.error | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.follow = null,
    removeMissingValuesFrom: zapierDashPlatformDashCoreLib.Anon_Body = null,
    size: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    url: java.lang.String = null
  ): HttpRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (removeMissingValuesFrom != null) __obj.updateDynamic("removeMissingValuesFrom")(removeMissingValuesFrom)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[HttpRequestOptions]
  }
}

