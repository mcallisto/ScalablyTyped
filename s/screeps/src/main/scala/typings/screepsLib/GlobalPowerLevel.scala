package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalPowerLevel extends js.Object {
  /**
    * The current level.
    */
  var level: scala.Double
  /**
    * The current progress to the next level.
    */
  var progress: scala.Double
  /**
    * The progress required to reach the next level.
    */
  var progressTotal: scala.Double
}

object GlobalPowerLevel {
  @scala.inline
  def apply(level: scala.Double, progress: scala.Double, progressTotal: scala.Double): GlobalPowerLevel = {
    val __obj = js.Dynamic.literal(level = level, progress = progress, progressTotal = progressTotal)
  
    __obj.asInstanceOf[GlobalPowerLevel]
  }
}

