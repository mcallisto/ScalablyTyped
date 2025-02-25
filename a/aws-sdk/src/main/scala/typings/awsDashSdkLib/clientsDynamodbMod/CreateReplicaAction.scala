package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReplicaAction extends js.Object {
  /**
    * The region of the replica to be added.
    */
  var RegionName: awsDashSdkLib.clientsDynamodbMod.RegionName
}

object CreateReplicaAction {
  @scala.inline
  def apply(RegionName: RegionName): CreateReplicaAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName)
  
    __obj.asInstanceOf[CreateReplicaAction]
  }
}

