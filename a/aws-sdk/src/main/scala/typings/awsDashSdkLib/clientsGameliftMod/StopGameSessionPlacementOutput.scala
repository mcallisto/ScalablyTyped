package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopGameSessionPlacementOutput extends js.Object {
  /**
    * Object that describes the canceled game session placement, with CANCELLED status and an end time stamp. 
    */
  var GameSessionPlacement: js.UndefOr[GameSessionPlacement] = js.undefined
}

object StopGameSessionPlacementOutput {
  @scala.inline
  def apply(GameSessionPlacement: GameSessionPlacement = null): StopGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSessionPlacement != null) __obj.updateDynamic("GameSessionPlacement")(GameSessionPlacement)
    __obj.asInstanceOf[StopGameSessionPlacementOutput]
  }
}

