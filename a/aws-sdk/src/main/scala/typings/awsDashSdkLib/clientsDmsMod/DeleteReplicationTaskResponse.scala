package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteReplicationTaskResponse extends js.Object {
  /**
    * The deleted replication task.
    */
  var ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
}

object DeleteReplicationTaskResponse {
  @scala.inline
  def apply(ReplicationTask: ReplicationTask = null): DeleteReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationTask != null) __obj.updateDynamic("ReplicationTask")(ReplicationTask)
    __obj.asInstanceOf[DeleteReplicationTaskResponse]
  }
}

