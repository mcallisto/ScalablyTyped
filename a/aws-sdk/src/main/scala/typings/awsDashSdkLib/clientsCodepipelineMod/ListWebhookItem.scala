package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWebhookItem extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the webhook.
    */
  var arn: js.UndefOr[WebhookArn] = js.undefined
  /**
    * The detail returned for each webhook, such as the webhook authentication type and filter rules.
    */
  var definition: WebhookDefinition
  /**
    * The number code of the error.
    */
  var errorCode: js.UndefOr[WebhookErrorCode] = js.undefined
  /**
    * The text of the error message about the webhook.
    */
  var errorMessage: js.UndefOr[WebhookErrorMessage] = js.undefined
  /**
    * The date and time a webhook was last successfully triggered, in timestamp format.
    */
  var lastTriggered: js.UndefOr[WebhookLastTriggered] = js.undefined
  /**
    * Specifies the tags applied to the webhook.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * A unique URL generated by CodePipeline. When a POST request is made to this URL, the defined pipeline is started as long as the body of the post request satisfies the defined authentication and filtering conditions. Deleting and re-creating a webhook will make the old URL invalid and generate a new URL.
    */
  var url: WebhookUrl
}

object ListWebhookItem {
  @scala.inline
  def apply(
    definition: WebhookDefinition,
    url: WebhookUrl,
    arn: WebhookArn = null,
    errorCode: WebhookErrorCode = null,
    errorMessage: WebhookErrorMessage = null,
    lastTriggered: WebhookLastTriggered = null,
    tags: TagList = null
  ): ListWebhookItem = {
    val __obj = js.Dynamic.literal(definition = definition, url = url)
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (lastTriggered != null) __obj.updateDynamic("lastTriggered")(lastTriggered)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ListWebhookItem]
  }
}

