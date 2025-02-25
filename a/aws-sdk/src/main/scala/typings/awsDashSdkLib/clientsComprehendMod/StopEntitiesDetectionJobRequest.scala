package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopEntitiesDetectionJobRequest extends js.Object {
  /**
    * The identifier of the entities detection job to stop.
    */
  var JobId: awsDashSdkLib.clientsComprehendMod.JobId
}

object StopEntitiesDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): StopEntitiesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
  
    __obj.asInstanceOf[StopEntitiesDetectionJobRequest]
  }
}

