package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.CircleOverlay")
@js.native
class CircleOverlay protected () extends Overlay {
  def this(coordinate: Coordinate, radius: scala.Double) = this()
  def this(coordinate: Coordinate, radius: scala.Double, options: StylesOverlayOptions) = this()
  var coordinate: Coordinate = js.native
  @JSName("enabled")
  var enabled_CircleOverlay: scala.Boolean = js.native
  var radius: scala.Double = js.native
  @JSName("selected")
  var selected_CircleOverlay: scala.Boolean = js.native
  @JSName("visible")
  var visible_CircleOverlay: scala.Boolean = js.native
}

