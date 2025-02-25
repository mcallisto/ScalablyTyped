package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterJobDefinitionRequest extends js.Object {
  /**
    * An object with various properties specific to single-node container-based jobs. If the job definition's type parameter is container, then you must specify either containerProperties or nodeProperties.
    */
  var containerProperties: js.UndefOr[ContainerProperties] = js.undefined
  /**
    * The name of the job definition to register. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
    */
  var jobDefinitionName: String
  /**
    * An object with various properties specific to multi-node parallel jobs. If you specify node properties for a job, it becomes a multi-node parallel job. For more information, see Multi-node Parallel Jobs in the AWS Batch User Guide. If the job definition's type parameter is container, then you must specify either containerProperties or nodeProperties.
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.undefined
  /**
    * Default parameter substitution placeholders to set in the job definition. Parameters are specified as a key-value pair mapping. Parameters in a SubmitJob request override any corresponding parameter defaults from the job definition.
    */
  var parameters: js.UndefOr[ParametersMap] = js.undefined
  /**
    * The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy that is specified during a SubmitJob operation overrides the retry strategy defined here. If a job is terminated due to a timeout, it is not retried. 
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
  /**
    * The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch terminates your jobs if they have not finished. If a job is terminated due to a timeout, it is not retried. The minimum value for the timeout is 60 seconds. Any timeout configuration that is specified during a SubmitJob operation overrides the timeout configuration defined here. For more information, see Job Timeouts in the Amazon Elastic Container Service Developer Guide.
    */
  var timeout: js.UndefOr[JobTimeout] = js.undefined
  /**
    * The type of job definition.
    */
  var `type`: JobDefinitionType
}

object RegisterJobDefinitionRequest {
  @scala.inline
  def apply(
    jobDefinitionName: String,
    `type`: JobDefinitionType,
    containerProperties: ContainerProperties = null,
    nodeProperties: NodeProperties = null,
    parameters: ParametersMap = null,
    retryStrategy: RetryStrategy = null,
    timeout: JobTimeout = null
  ): RegisterJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(jobDefinitionName = jobDefinitionName)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (containerProperties != null) __obj.updateDynamic("containerProperties")(containerProperties)
    if (nodeProperties != null) __obj.updateDynamic("nodeProperties")(nodeProperties)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (retryStrategy != null) __obj.updateDynamic("retryStrategy")(retryStrategy)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[RegisterJobDefinitionRequest]
  }
}

