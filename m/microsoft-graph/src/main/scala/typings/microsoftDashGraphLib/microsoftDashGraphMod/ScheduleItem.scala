package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleItem extends js.Object {
  /** The date, time, and time zone that the corresponding event ends. */
  var end: js.UndefOr[DateTimeTimeZone] = js.undefined
  /** The sensitivity of the corresponding event. True if the event is marked private, false otherwise. Optional. */
  var isPrivate: js.UndefOr[scala.Boolean] = js.undefined
  /** The location where the corresponding event is held or attended from. Optional. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** The date, time, and time zone that the corresponding event starts. */
  var start: js.UndefOr[DateTimeTimeZone] = js.undefined
  /** The availability status of the user or resource during the corresponding event. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown. */
  var status: js.UndefOr[FreeBusyStatus] = js.undefined
  /** The corresponding event's subject line. Optional. */
  var subject: js.UndefOr[java.lang.String] = js.undefined
}

object ScheduleItem {
  @scala.inline
  def apply(
    end: DateTimeTimeZone = null,
    isPrivate: js.UndefOr[scala.Boolean] = js.undefined,
    location: java.lang.String = null,
    start: DateTimeTimeZone = null,
    status: FreeBusyStatus = null,
    subject: java.lang.String = null
  ): ScheduleItem = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(isPrivate)) __obj.updateDynamic("isPrivate")(isPrivate)
    if (location != null) __obj.updateDynamic("location")(location)
    if (start != null) __obj.updateDynamic("start")(start)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[ScheduleItem]
  }
}

