package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPipelineOutput extends js.Object {
  /**
    * Represents the pipeline metadata information returned as part of the output of a GetPipeline action.
    */
  var metadata: js.UndefOr[PipelineMetadata] = js.undefined
  /**
    * Represents the structure of actions and stages to be performed in the pipeline. 
    */
  var pipeline: js.UndefOr[PipelineDeclaration] = js.undefined
}

object GetPipelineOutput {
  @scala.inline
  def apply(metadata: PipelineMetadata = null, pipeline: PipelineDeclaration = null): GetPipelineOutput = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline)
    __obj.asInstanceOf[GetPipelineOutput]
  }
}

