package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeInfoProperties extends js.Object {
  /**
    * The name of the field containing the end time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField)
    */
  var endField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The time extent defines the start time and end time for all data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent)
    *
    * @default null
    */
  var fullTimeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  /**
    * The time interval defines the granularity of the temporal data and allows you to visualize the data at specified intervals using the [time slider widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html). Usually temporal data is collected at regular intervals such as every hour or every day.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#interval)
    */
  var interval: js.UndefOr[TimeIntervalProperties] = js.undefined
  /**
    * The name of the field containing the start time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField)
    */
  var startField: js.UndefOr[java.lang.String] = js.undefined
}

object TimeInfoProperties {
  @scala.inline
  def apply(
    endField: java.lang.String = null,
    fullTimeExtent: TimeExtentProperties = null,
    interval: TimeIntervalProperties = null,
    startField: java.lang.String = null
  ): TimeInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (endField != null) __obj.updateDynamic("endField")(endField)
    if (fullTimeExtent != null) __obj.updateDynamic("fullTimeExtent")(fullTimeExtent)
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (startField != null) __obj.updateDynamic("startField")(startField)
    __obj.asInstanceOf[TimeInfoProperties]
  }
}

