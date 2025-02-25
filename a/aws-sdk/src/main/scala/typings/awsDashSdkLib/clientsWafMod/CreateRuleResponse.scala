package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRuleResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  /**
    * The Rule returned in the CreateRule response.
    */
  var Rule: js.UndefOr[Rule] = js.undefined
}

object CreateRuleResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, Rule: Rule = null): CreateRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken)
    if (Rule != null) __obj.updateDynamic("Rule")(Rule)
    __obj.asInstanceOf[CreateRuleResponse]
  }
}

