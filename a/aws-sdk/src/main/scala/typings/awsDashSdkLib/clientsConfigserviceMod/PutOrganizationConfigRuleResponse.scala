package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutOrganizationConfigRuleResponse extends js.Object {
  var OrganizationConfigRuleArn: js.UndefOr[StringWithCharLimit256] = js.undefined
}

object PutOrganizationConfigRuleResponse {
  @scala.inline
  def apply(OrganizationConfigRuleArn: StringWithCharLimit256 = null): PutOrganizationConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (OrganizationConfigRuleArn != null) __obj.updateDynamic("OrganizationConfigRuleArn")(OrganizationConfigRuleArn)
    __obj.asInstanceOf[PutOrganizationConfigRuleResponse]
  }
}

