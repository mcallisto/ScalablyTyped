package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Run extends js.Object {
  /**
    * The runId of a workflow execution. This ID is generated by the service and can be used to uniquely identify the workflow execution within a domain.
    */
  var runId: js.UndefOr[WorkflowRunId] = js.undefined
}

object Run {
  @scala.inline
  def apply(runId: WorkflowRunId = null): Run = {
    val __obj = js.Dynamic.literal()
    if (runId != null) __obj.updateDynamic("runId")(runId)
    __obj.asInstanceOf[Run]
  }
}

