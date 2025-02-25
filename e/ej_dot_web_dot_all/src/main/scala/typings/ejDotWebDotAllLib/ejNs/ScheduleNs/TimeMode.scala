package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeMode extends js.Object

@JSGlobal("ej.Schedule.TimeMode")
@js.native
object TimeMode extends js.Object {
  ///Sets 12 hour time mode to Scheduler
  @js.native
  sealed trait Hour12
    extends ejDotWebDotAllLib.ejNs.ScheduleNs.TimeMode
  
  ///Sets 24 hour time mode to Scheduler
  @js.native
  sealed trait Hour24
    extends ejDotWebDotAllLib.ejNs.ScheduleNs.TimeMode
  
  /* 0 */ val Hour12: Hour12 with scala.Double = js.native
  /* 1 */ val Hour24: Hour24 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ScheduleNs.TimeMode with scala.Double] = js.native
}

