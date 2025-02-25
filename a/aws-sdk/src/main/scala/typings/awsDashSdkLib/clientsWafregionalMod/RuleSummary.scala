package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleSummary extends js.Object {
  /**
    * A friendly name or description of the Rule. You can't change the name of a Rule after you create it.
    */
  var Name: ResourceName
  /**
    * A unique identifier for a Rule. You use RuleId to get more information about a Rule (see GetRule), update a Rule (see UpdateRule), insert a Rule into a WebACL or delete one from a WebACL (see UpdateWebACL), or delete a Rule from AWS WAF (see DeleteRule).  RuleId is returned by CreateRule and by ListRules.
    */
  var RuleId: ResourceId
}

object RuleSummary {
  @scala.inline
  def apply(Name: ResourceName, RuleId: ResourceId): RuleSummary = {
    val __obj = js.Dynamic.literal(Name = Name, RuleId = RuleId)
  
    __obj.asInstanceOf[RuleSummary]
  }
}

