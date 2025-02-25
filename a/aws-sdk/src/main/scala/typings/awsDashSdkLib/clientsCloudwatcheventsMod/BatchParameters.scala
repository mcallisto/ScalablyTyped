package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchParameters extends js.Object {
  /**
    * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the target is an AWS Batch job.
    */
  var ArrayProperties: js.UndefOr[BatchArrayProperties] = js.undefined
  /**
    * The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition must already exist.
    */
  var JobDefinition: String
  /**
    * The name to use for this execution of the job, if the target is an AWS Batch job.
    */
  var JobName: String
  /**
    * The retry strategy to use for failed jobs, if the target is an AWS Batch job. The retry strategy is the number of times to retry the failed job execution. Valid values are 1–10. When you specify a retry strategy here, it overrides the retry strategy defined in the job definition.
    */
  var RetryStrategy: js.UndefOr[BatchRetryStrategy] = js.undefined
}

object BatchParameters {
  @scala.inline
  def apply(
    JobDefinition: String,
    JobName: String,
    ArrayProperties: BatchArrayProperties = null,
    RetryStrategy: BatchRetryStrategy = null
  ): BatchParameters = {
    val __obj = js.Dynamic.literal(JobDefinition = JobDefinition, JobName = JobName)
    if (ArrayProperties != null) __obj.updateDynamic("ArrayProperties")(ArrayProperties)
    if (RetryStrategy != null) __obj.updateDynamic("RetryStrategy")(RetryStrategy)
    __obj.asInstanceOf[BatchParameters]
  }
}

