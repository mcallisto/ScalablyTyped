package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRuleGroupResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the DeleteRuleGroup request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
}

object DeleteRuleGroupResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null): DeleteRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken)
    __obj.asInstanceOf[DeleteRuleGroupResponse]
  }
}

