package typings
package awsDashSdkLib.clientsIotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartNextPendingJobExecutionRequest extends js.Object {
  /**
    * A collection of name/value pairs that describe the status of the job execution. If not specified, the statusDetails are unchanged.
    */
  var statusDetails: js.UndefOr[DetailsMap] = js.undefined
  /**
    * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not set to a terminal state before this timer expires, or before the timer is reset (by calling UpdateJobExecution, setting the status to IN_PROGRESS and specifying a new timeout value in field stepTimeoutInMinutes) the job execution status will be automatically set to TIMED_OUT. Note that setting this timeout has no effect on that job execution timeout which may have been specified when the job was created (CreateJob using field timeoutConfig).
    */
  var stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes] = js.undefined
  /**
    * The name of the thing associated with the device.
    */
  var thingName: ThingName
}

object StartNextPendingJobExecutionRequest {
  @scala.inline
  def apply(
    thingName: ThingName,
    statusDetails: DetailsMap = null,
    stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes] = js.undefined
  ): StartNextPendingJobExecutionRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName)
    if (statusDetails != null) __obj.updateDynamic("statusDetails")(statusDetails)
    if (!js.isUndefined(stepTimeoutInMinutes)) __obj.updateDynamic("stepTimeoutInMinutes")(stepTimeoutInMinutes)
    __obj.asInstanceOf[StartNextPendingJobExecutionRequest]
  }
}

