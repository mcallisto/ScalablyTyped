package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletionTaskFailureReasonType extends js.Object {
  /**
    * A short description of the reason that the service-linked role deletion failed.
    */
  var Reason: js.UndefOr[ReasonType] = js.undefined
  /**
    * A list of objects that contains details about the service-linked role deletion failure, if that information is returned by the service. If the service-linked role has active sessions or if any resources that were used by the role have not been deleted from the linked service, the role can't be deleted. This parameter includes a list of the resources that are associated with the role and the Region in which the resources are being used.
    */
  var RoleUsageList: js.UndefOr[RoleUsageListType] = js.undefined
}

object DeletionTaskFailureReasonType {
  @scala.inline
  def apply(Reason: ReasonType = null, RoleUsageList: RoleUsageListType = null): DeletionTaskFailureReasonType = {
    val __obj = js.Dynamic.literal()
    if (Reason != null) __obj.updateDynamic("Reason")(Reason)
    if (RoleUsageList != null) __obj.updateDynamic("RoleUsageList")(RoleUsageList)
    __obj.asInstanceOf[DeletionTaskFailureReasonType]
  }
}

