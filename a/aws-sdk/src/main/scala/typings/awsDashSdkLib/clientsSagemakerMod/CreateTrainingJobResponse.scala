package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTrainingJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: awsDashSdkLib.clientsSagemakerMod.TrainingJobArn
}

object CreateTrainingJobResponse {
  @scala.inline
  def apply(TrainingJobArn: TrainingJobArn): CreateTrainingJobResponse = {
    val __obj = js.Dynamic.literal(TrainingJobArn = TrainingJobArn)
  
    __obj.asInstanceOf[CreateTrainingJobResponse]
  }
}

