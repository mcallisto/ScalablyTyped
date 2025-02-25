package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsMessage extends js.Object {
  /**
    *  A list of Event instances.
    */
  var Events: js.UndefOr[EventList] = js.undefined
  /**
    *  An optional pagination token provided by a previous Events request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords .
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object EventsMessage {
  @scala.inline
  def apply(Events: EventList = null, Marker: String = null): EventsMessage = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[EventsMessage]
  }
}

