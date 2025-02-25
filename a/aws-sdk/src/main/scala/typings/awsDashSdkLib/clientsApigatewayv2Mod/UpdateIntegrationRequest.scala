package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateIntegrationRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The connection ID.
    */
  var ConnectionId: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined
  /**
    * The type of the network connection to the integration endpoint. Currently the only
    valid value is INTERNET, for connections through the public routable
    internet.
    */
  var ConnectionType: js.UndefOr[ConnectionType] = js.undefined
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
    * Specifies the credentials required for the integration, if any. For AWS
    integrations, three options are available. To specify an IAM Role for API Gateway to
    assume, use the role's Amazon Resource Name (ARN). To require that the caller's
    identity be passed through from the request, specify the string
    arn:aws:iam::*:user/ *. To use resource-based permissions on supported
    AWS services, specify null.
    */
  var CredentialsArn: js.UndefOr[Arn] = js.undefined
  /**
    * The description of the integration
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  /**
    * The integration ID.
    */
  var IntegrationId: __string
  /**
    * Specifies the integration's HTTP method type.
    */
  var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
  /**
    * The integration type of an integration. One of the following:
    AWS: for integrating the route or method request with an AWS service
    action, including the Lambda function-invoking action. With the Lambda
    function-invoking action, this is referred to as the Lambda custom integration. With
    any other AWS service action, this is known as AWS integration.
    AWS_PROXY: for integrating the route or method request with the Lambda
    function-invoking action with the client request passed through as-is. This
    integration is also referred to as Lambda proxy integration.
    HTTP: for integrating the route or method request with an HTTP
    endpoint. This
    integration is also referred to as the HTTP custom integration.
    HTTP_PROXY: for integrating route or method request with an HTTP
    endpoint, with the client
    request passed through as-is. This is also referred to as HTTP proxy
    integration.
    MOCK: for integrating the route or method request with API Gateway as a
    "loopback" endpoint without invoking any backend.
    */
  var IntegrationType: js.UndefOr[IntegrationType] = js.undefined
  /**
    * For a Lambda proxy integration, this is the URI of the Lambda function.
    */
  var IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
  /**
    * Specifies the pass-through behavior for incoming requests based on the
    Content-Type header in the request, and the available mapping
    templates specified as the requestTemplates property on the
    Integration resource. There are three valid values:
    WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
    NEVER.
    WHEN_NO_MATCH passes the request body for unmapped content types through
    to the integration backend without transformation.
    NEVER rejects unmapped content types with an HTTP 415 Unsupported
    Media Type response.
    WHEN_NO_TEMPLATES allows pass-through when the integration has no
    content types mapped to templates. However, if there is at least one content type
    defined, unmapped content types will be rejected with the same HTTP 415
    Unsupported Media Type response.
    */
  var PassthroughBehavior: js.UndefOr[PassthroughBehavior] = js.undefined
  /**
    * A key-value map specifying request parameters that are passed from the method
    request to the backend. The key is an integration request parameter name and the
    associated value is a method request parameter value or static value that must be
    enclosed within single quotes and pre-encoded as required by the backend. The method
    request parameter value must match the pattern of
    method.request.{location}.{name}
    , where 
    {location}
    is querystring, path, or header; and 
    {name}
    must be a valid and unique method request parameter name.
    */
  var RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined
  /**
    * Represents a map of Velocity templates that are applied on the request payload
    based on the value of the Content-Type header sent by the client. The content type
    value is the key in this map, and the template (as a String) is the value.
    */
  var RequestTemplates: js.UndefOr[TemplateMap] = js.undefined
  /**
    * The template selection expression for the integration.
    */
  var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  /**
    * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000
    milliseconds or 29 seconds.
    */
  var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000] = js.undefined
}

object UpdateIntegrationRequest {
  @scala.inline
  def apply(
    ApiId: __string,
    IntegrationId: __string,
    ConnectionId: StringWithLengthBetween1And1024 = null,
    ConnectionType: ConnectionType = null,
    ContentHandlingStrategy: ContentHandlingStrategy = null,
    CredentialsArn: Arn = null,
    Description: StringWithLengthBetween0And1024 = null,
    IntegrationMethod: StringWithLengthBetween1And64 = null,
    IntegrationType: IntegrationType = null,
    IntegrationUri: UriWithLengthBetween1And2048 = null,
    PassthroughBehavior: PassthroughBehavior = null,
    RequestParameters: IntegrationParameters = null,
    RequestTemplates: TemplateMap = null,
    TemplateSelectionExpression: SelectionExpression = null,
    TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000] = js.undefined
  ): UpdateIntegrationRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, IntegrationId = IntegrationId)
    if (ConnectionId != null) __obj.updateDynamic("ConnectionId")(ConnectionId)
    if (ConnectionType != null) __obj.updateDynamic("ConnectionType")(ConnectionType.asInstanceOf[js.Any])
    if (ContentHandlingStrategy != null) __obj.updateDynamic("ContentHandlingStrategy")(ContentHandlingStrategy.asInstanceOf[js.Any])
    if (CredentialsArn != null) __obj.updateDynamic("CredentialsArn")(CredentialsArn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (IntegrationMethod != null) __obj.updateDynamic("IntegrationMethod")(IntegrationMethod)
    if (IntegrationType != null) __obj.updateDynamic("IntegrationType")(IntegrationType.asInstanceOf[js.Any])
    if (IntegrationUri != null) __obj.updateDynamic("IntegrationUri")(IntegrationUri)
    if (PassthroughBehavior != null) __obj.updateDynamic("PassthroughBehavior")(PassthroughBehavior.asInstanceOf[js.Any])
    if (RequestParameters != null) __obj.updateDynamic("RequestParameters")(RequestParameters)
    if (RequestTemplates != null) __obj.updateDynamic("RequestTemplates")(RequestTemplates)
    if (TemplateSelectionExpression != null) __obj.updateDynamic("TemplateSelectionExpression")(TemplateSelectionExpression)
    if (!js.isUndefined(TimeoutInMillis)) __obj.updateDynamic("TimeoutInMillis")(TimeoutInMillis)
    __obj.asInstanceOf[UpdateIntegrationRequest]
  }
}

