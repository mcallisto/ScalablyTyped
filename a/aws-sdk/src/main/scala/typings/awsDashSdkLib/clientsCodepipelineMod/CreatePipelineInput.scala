package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePipelineInput extends js.Object {
  /**
    * Represents the structure of actions and stages to be performed in the pipeline. 
    */
  var pipeline: PipelineDeclaration
  /**
    * The tags for the pipeline.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreatePipelineInput {
  @scala.inline
  def apply(pipeline: PipelineDeclaration, tags: TagList = null): CreatePipelineInput = {
    val __obj = js.Dynamic.literal(pipeline = pipeline)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreatePipelineInput]
  }
}

