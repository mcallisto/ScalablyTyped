package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessedUpdateAction extends js.Object {
  /**
    * The ID of the replication group
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.undefined
  /**
    * The status of the update action on the Redis cluster
    */
  var UpdateActionStatus: js.UndefOr[UpdateActionStatus] = js.undefined
}

object ProcessedUpdateAction {
  @scala.inline
  def apply(
    ReplicationGroupId: String = null,
    ServiceUpdateName: String = null,
    UpdateActionStatus: UpdateActionStatus = null
  ): ProcessedUpdateAction = {
    val __obj = js.Dynamic.literal()
    if (ReplicationGroupId != null) __obj.updateDynamic("ReplicationGroupId")(ReplicationGroupId)
    if (ServiceUpdateName != null) __obj.updateDynamic("ServiceUpdateName")(ServiceUpdateName)
    if (UpdateActionStatus != null) __obj.updateDynamic("UpdateActionStatus")(UpdateActionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessedUpdateAction]
  }
}

