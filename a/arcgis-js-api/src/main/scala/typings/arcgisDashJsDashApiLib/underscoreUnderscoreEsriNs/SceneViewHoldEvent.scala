package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewHoldEvent extends js.Object {
  var button: scala.Double
  var buttons: scala.Double
  var mapPoint: Point
  var native: js.Any
  var stopPropagation: js.Function
  var timestamp: scala.Double
  var `type`: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object SceneViewHoldEvent {
  @scala.inline
  def apply(
    button: scala.Double,
    buttons: scala.Double,
    mapPoint: Point,
    native: js.Any,
    stopPropagation: js.Function,
    timestamp: scala.Double,
    `type`: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): SceneViewHoldEvent = {
    val __obj = js.Dynamic.literal(button = button, buttons = buttons, mapPoint = mapPoint, native = native, stopPropagation = stopPropagation, timestamp = timestamp, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SceneViewHoldEvent]
  }
}

