package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchStatus extends js.Object {
  /**
    * The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).
    */
  var ApprovalDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The compliance severity level for a patch.
    */
  var ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined
  /**
    * The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
    */
  var DeploymentStatus: js.UndefOr[PatchDeploymentStatus] = js.undefined
}

object PatchStatus {
  @scala.inline
  def apply(
    ApprovalDate: DateTime = null,
    ComplianceLevel: PatchComplianceLevel = null,
    DeploymentStatus: PatchDeploymentStatus = null
  ): PatchStatus = {
    val __obj = js.Dynamic.literal()
    if (ApprovalDate != null) __obj.updateDynamic("ApprovalDate")(ApprovalDate)
    if (ComplianceLevel != null) __obj.updateDynamic("ComplianceLevel")(ComplianceLevel.asInstanceOf[js.Any])
    if (DeploymentStatus != null) __obj.updateDynamic("DeploymentStatus")(DeploymentStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchStatus]
  }
}

