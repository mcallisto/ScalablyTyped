package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWebhookResult extends js.Object {
  /**
    *  Webhook structure. 
    */
  var webhook: Webhook
}

object GetWebhookResult {
  @scala.inline
  def apply(webhook: Webhook): GetWebhookResult = {
    val __obj = js.Dynamic.literal(webhook = webhook)
  
    __obj.asInstanceOf[GetWebhookResult]
  }
}

