package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDisableStandardsRequest extends js.Object {
  /**
    * The ARNs of the standards subscriptions to disable.
    */
  var StandardsSubscriptionArns: awsDashSdkLib.clientsSecurityhubMod.StandardsSubscriptionArns
}

object BatchDisableStandardsRequest {
  @scala.inline
  def apply(StandardsSubscriptionArns: StandardsSubscriptionArns): BatchDisableStandardsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionArns = StandardsSubscriptionArns)
  
    __obj.asInstanceOf[BatchDisableStandardsRequest]
  }
}

