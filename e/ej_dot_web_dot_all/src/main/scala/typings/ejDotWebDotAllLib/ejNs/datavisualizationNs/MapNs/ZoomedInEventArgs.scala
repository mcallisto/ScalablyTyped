package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomedInEventArgs extends js.Object {
  /** Event parameters from map
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  /** Returns zoom level value for which the map is zoomed.
    */
  var zoomLevel: js.UndefOr[js.Any] = js.undefined
}

object ZoomedInEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null, zoomLevel: js.Any = null): ZoomedInEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (zoomLevel != null) __obj.updateDynamic("zoomLevel")(zoomLevel)
    __obj.asInstanceOf[ZoomedInEventArgs]
  }
}

