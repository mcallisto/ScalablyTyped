package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryTime extends js.Object {
  var cutoffTime: js.UndefOr[CutoffTime] = js.undefined
  var holidayCutoffs: js.UndefOr[js.Array[HolidayCutoff]] = js.undefined
  var maxHandlingTimeInDays: js.UndefOr[scala.Double] = js.undefined
  var maxTransitTimeInDays: js.UndefOr[scala.Double] = js.undefined
  var minHandlingTimeInDays: js.UndefOr[scala.Double] = js.undefined
  var minTransitTimeInDays: js.UndefOr[scala.Double] = js.undefined
  var transitTimeTable: js.UndefOr[TransitTable] = js.undefined
}

object DeliveryTime {
  @scala.inline
  def apply(
    cutoffTime: CutoffTime = null,
    holidayCutoffs: js.Array[HolidayCutoff] = null,
    maxHandlingTimeInDays: scala.Int | scala.Double = null,
    maxTransitTimeInDays: scala.Int | scala.Double = null,
    minHandlingTimeInDays: scala.Int | scala.Double = null,
    minTransitTimeInDays: scala.Int | scala.Double = null,
    transitTimeTable: TransitTable = null
  ): DeliveryTime = {
    val __obj = js.Dynamic.literal()
    if (cutoffTime != null) __obj.updateDynamic("cutoffTime")(cutoffTime)
    if (holidayCutoffs != null) __obj.updateDynamic("holidayCutoffs")(holidayCutoffs)
    if (maxHandlingTimeInDays != null) __obj.updateDynamic("maxHandlingTimeInDays")(maxHandlingTimeInDays.asInstanceOf[js.Any])
    if (maxTransitTimeInDays != null) __obj.updateDynamic("maxTransitTimeInDays")(maxTransitTimeInDays.asInstanceOf[js.Any])
    if (minHandlingTimeInDays != null) __obj.updateDynamic("minHandlingTimeInDays")(minHandlingTimeInDays.asInstanceOf[js.Any])
    if (minTransitTimeInDays != null) __obj.updateDynamic("minTransitTimeInDays")(minTransitTimeInDays.asInstanceOf[js.Any])
    if (transitTimeTable != null) __obj.updateDynamic("transitTimeTable")(transitTimeTable)
    __obj.asInstanceOf[DeliveryTime]
  }
}

