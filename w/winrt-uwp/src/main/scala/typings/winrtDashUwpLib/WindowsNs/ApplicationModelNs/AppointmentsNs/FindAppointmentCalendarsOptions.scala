package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FindAppointmentCalendarsOptions extends js.Object

/** Specifies additional options when querying for appointment calendars. */
@JSGlobal("Windows.ApplicationModel.Appointments.FindAppointmentCalendarsOptions")
@js.native
object FindAppointmentCalendarsOptions extends js.Object {
  /** Include appointment calendars that are hidden. */
  @js.native
  sealed trait includeHidden
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.FindAppointmentCalendarsOptions
  
  /** No additional options. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.FindAppointmentCalendarsOptions
  
  /* 1 */ val includeHidden: includeHidden with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.FindAppointmentCalendarsOptions with scala.Double
  ] = js.native
}

