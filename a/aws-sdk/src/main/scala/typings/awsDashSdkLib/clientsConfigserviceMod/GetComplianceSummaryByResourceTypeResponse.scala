package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetComplianceSummaryByResourceTypeResponse extends js.Object {
  /**
    * The number of resources that are compliant and the number that are noncompliant. If one or more resource types were provided with the request, the numbers are returned for each resource type. The maximum number returned is 100.
    */
  var ComplianceSummariesByResourceType: js.UndefOr[ComplianceSummariesByResourceType] = js.undefined
}

object GetComplianceSummaryByResourceTypeResponse {
  @scala.inline
  def apply(ComplianceSummariesByResourceType: ComplianceSummariesByResourceType = null): GetComplianceSummaryByResourceTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (ComplianceSummariesByResourceType != null) __obj.updateDynamic("ComplianceSummariesByResourceType")(ComplianceSummariesByResourceType)
    __obj.asInstanceOf[GetComplianceSummaryByResourceTypeResponse]
  }
}

