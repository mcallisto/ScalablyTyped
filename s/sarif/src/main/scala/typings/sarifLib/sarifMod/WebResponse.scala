package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResponse extends js.Object {
  /**
    * The body of the response.
    */
  var body: js.UndefOr[ArtifactContent] = js.undefined
  /**
    * The response headers.
    */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * The index within the run.webResponses array of the response object associated with this result.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies whether a response was received from the server.
    */
  var noResponseReceived: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Key/value pairs that provide additional information about the response.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The response protocol. Example: 'http'.
    */
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The response reason. Example: 'Not found'.
    */
  var reasonPhrase: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The response status code. Example: 451.
    */
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  /**
    * The response version. Example: '1.1'.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object WebResponse {
  @scala.inline
  def apply(
    body: ArtifactContent = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    index: scala.Int | scala.Double = null,
    noResponseReceived: js.UndefOr[scala.Boolean] = js.undefined,
    properties: PropertyBag = null,
    protocol: java.lang.String = null,
    reasonPhrase: java.lang.String = null,
    statusCode: scala.Int | scala.Double = null,
    version: java.lang.String = null
  ): WebResponse = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(noResponseReceived)) __obj.updateDynamic("noResponseReceived")(noResponseReceived)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (reasonPhrase != null) __obj.updateDynamic("reasonPhrase")(reasonPhrase)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[WebResponse]
  }
}

