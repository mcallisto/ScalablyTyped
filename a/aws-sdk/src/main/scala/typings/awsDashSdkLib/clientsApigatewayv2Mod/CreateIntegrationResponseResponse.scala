package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIntegrationResponseResponse extends js.Object {
  /**
    * Specifies how to handle response payload content type conversions. Supported
    values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the
    following behaviors:
    CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded
    string to the corresponding binary blob.
    CONVERT_TO_TEXT: Converts a response payload from a binary blob to a
    Base64-encoded string.If this property is not defined, the response payload will be passed through from
    the integration response to the route response or method response without
    modification.
    */
  var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined
  /**
    * The integration response ID.
    */
  var IntegrationResponseId: js.UndefOr[Id] = js.undefined
  /**
    * The integration response key.
    */
  var IntegrationResponseKey: js.UndefOr[SelectionKey] = js.undefined
  /**
    * A key-value map specifying response parameters that are passed to the method
    response from the backend. The key is a method response header parameter name and the
    mapped value is an integration response header value, a static value enclosed within
    a pair of single quotes, or a JSON expression from the integration response body. The
    mapping key must match the pattern of method.response.header.{name}, where name is a
    valid and unique header name. The mapped non-static value must match the pattern of
    integration.response.header.{name} or integration.response.body.{JSON-expression},
    where name is a valid and unique response header name and JSON-expression is a valid
    JSON expression without the $ prefix.
    */
  var ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined
  /**
    * The collection of response templates for the integration response as a
    string-to-string map of key-value pairs. Response templates are represented as a
    key/value map, with a content-type as the key and a template as the value.
    */
  var ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined
  /**
    * The template selection expressions for the integration response.
    */
  var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
}

object CreateIntegrationResponseResponse {
  @scala.inline
  def apply(
    ContentHandlingStrategy: ContentHandlingStrategy = null,
    IntegrationResponseId: Id = null,
    IntegrationResponseKey: SelectionKey = null,
    ResponseParameters: IntegrationParameters = null,
    ResponseTemplates: TemplateMap = null,
    TemplateSelectionExpression: SelectionExpression = null
  ): CreateIntegrationResponseResponse = {
    val __obj = js.Dynamic.literal()
    if (ContentHandlingStrategy != null) __obj.updateDynamic("ContentHandlingStrategy")(ContentHandlingStrategy.asInstanceOf[js.Any])
    if (IntegrationResponseId != null) __obj.updateDynamic("IntegrationResponseId")(IntegrationResponseId)
    if (IntegrationResponseKey != null) __obj.updateDynamic("IntegrationResponseKey")(IntegrationResponseKey)
    if (ResponseParameters != null) __obj.updateDynamic("ResponseParameters")(ResponseParameters)
    if (ResponseTemplates != null) __obj.updateDynamic("ResponseTemplates")(ResponseTemplates)
    if (TemplateSelectionExpression != null) __obj.updateDynamic("TemplateSelectionExpression")(TemplateSelectionExpression)
    __obj.asInstanceOf[CreateIntegrationResponseResponse]
  }
}

