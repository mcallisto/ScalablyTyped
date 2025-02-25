package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectStackDriftOutput extends js.Object {
  /**
    * The ID of the drift detection results of this operation.  AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run. However, the number of drift results AWS CloudFormation retains for any given stack, and for how long, may vary. 
    */
  var StackDriftDetectionId: awsDashSdkLib.clientsCloudformationMod.StackDriftDetectionId
}

object DetectStackDriftOutput {
  @scala.inline
  def apply(StackDriftDetectionId: StackDriftDetectionId): DetectStackDriftOutput = {
    val __obj = js.Dynamic.literal(StackDriftDetectionId = StackDriftDetectionId)
  
    __obj.asInstanceOf[DetectStackDriftOutput]
  }
}

