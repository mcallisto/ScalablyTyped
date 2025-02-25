package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTaskResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the task.
    */
  var TaskArn: js.UndefOr[TaskArn] = js.undefined
}

object CreateTaskResponse {
  @scala.inline
  def apply(TaskArn: TaskArn = null): CreateTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn)
    __obj.asInstanceOf[CreateTaskResponse]
  }
}

