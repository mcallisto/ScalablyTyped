package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowIdentity extends js.Object {
  /**
    * The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.
    */
  var Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined
  /**
    * A description of the maintenance window.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  /**
    * The duration of the maintenance window in hours.
    */
  var Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined
  /**
    * Indicates whether the maintenance window is enabled.
    */
  var Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined
  /**
    * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become inactive.
    */
  var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  /**
    * The name of the maintenance window.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * The next time the maintenance window will actually run, taking into account any specified times for the maintenance window to become active or inactive.
    */
  var NextExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  /**
    * The schedule of the maintenance window in the form of a cron or rate expression.
    */
  var Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined
  /**
    * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format.
    */
  var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined
  /**
    * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become active.
    */
  var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  /**
    * The ID of the maintenance window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
}

object MaintenanceWindowIdentity {
  @scala.inline
  def apply(
    Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
    Description: MaintenanceWindowDescription = null,
    Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
    Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
    EndDate: MaintenanceWindowStringDateTime = null,
    Name: MaintenanceWindowName = null,
    NextExecutionTime: MaintenanceWindowStringDateTime = null,
    Schedule: MaintenanceWindowSchedule = null,
    ScheduleTimezone: MaintenanceWindowTimezone = null,
    StartDate: MaintenanceWindowStringDateTime = null,
    WindowId: MaintenanceWindowId = null
  ): MaintenanceWindowIdentity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Cutoff)) __obj.updateDynamic("Cutoff")(Cutoff)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NextExecutionTime != null) __obj.updateDynamic("NextExecutionTime")(NextExecutionTime)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (ScheduleTimezone != null) __obj.updateDynamic("ScheduleTimezone")(ScheduleTimezone)
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate)
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    __obj.asInstanceOf[MaintenanceWindowIdentity]
  }
}

