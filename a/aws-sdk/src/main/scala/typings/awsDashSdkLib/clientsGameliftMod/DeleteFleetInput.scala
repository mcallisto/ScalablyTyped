package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFleetInput extends js.Object {
  /**
    * Unique identifier for a fleet to be deleted.
    */
  var FleetId: awsDashSdkLib.clientsGameliftMod.FleetId
}

object DeleteFleetInput {
  @scala.inline
  def apply(FleetId: FleetId): DeleteFleetInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId)
  
    __obj.asInstanceOf[DeleteFleetInput]
  }
}

