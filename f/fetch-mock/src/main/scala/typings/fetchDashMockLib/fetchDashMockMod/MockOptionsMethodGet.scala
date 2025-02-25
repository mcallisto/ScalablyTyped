package typings
package fetchDashMockLib.fetchDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockOptionsMethodGet extends MockOptions {
  @JSName("method")
  var method_MockOptionsMethodGet: js.UndefOr[fetchDashMockLib.fetchDashMockLibStrings.GET] = js.undefined
}

object MockOptionsMethodGet {
  @scala.inline
  def apply(
    functionMatcher: MockMatcherFunction = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double] = null,
    includeContentLength: js.UndefOr[scala.Boolean] = js.undefined,
    matcher: MockMatcher = null,
    method: fetchDashMockLib.fetchDashMockLibStrings.GET = null,
    name: java.lang.String = null,
    overwriteRoutes: js.UndefOr[scala.Boolean] = js.undefined,
    params: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    query: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    repeat: scala.Int | scala.Double = null,
    response: MockResponse | MockResponseFunction = null,
    sendAsJson: js.UndefOr[scala.Boolean] = js.undefined
  ): MockOptionsMethodGet = {
    val __obj = js.Dynamic.literal()
    if (functionMatcher != null) __obj.updateDynamic("functionMatcher")(functionMatcher)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(includeContentLength)) __obj.updateDynamic("includeContentLength")(includeContentLength)
    if (matcher != null) __obj.updateDynamic("matcher")(matcher.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(overwriteRoutes)) __obj.updateDynamic("overwriteRoutes")(overwriteRoutes)
    if (params != null) __obj.updateDynamic("params")(params)
    if (query != null) __obj.updateDynamic("query")(query)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (!js.isUndefined(sendAsJson)) __obj.updateDynamic("sendAsJson")(sendAsJson)
    __obj.asInstanceOf[MockOptionsMethodGet]
  }
}

