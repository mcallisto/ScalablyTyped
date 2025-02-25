package typings
package atPulumiAwsLib.ssmMaintenanceWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowArgs extends js.Object {
  /**
    * Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
    */
  val allowUnassociatedTargets: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
    */
  val cutoff: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * The duration of the Maintenance Window in hours.
    */
  val duration: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * Whether the maintenance window is enabled. Default: `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to no longer run the maintenance window.
    */
  val endDate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the maintenance window.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The schedule of the Maintenance Window in the form of a [cron](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-cron.html) or rate expression.
    */
  val schedule: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Timezone for schedule in [Internet Assigned Numbers Authority (IANA) Time Zone Database format](https://www.iana.org/time-zones). For example: `America/Los_Angeles`, `etc/UTC`, or `Asia/Seoul`.
    */
  val scheduleTimezone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to begin the maintenance window.
    */
  val startDate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object MaintenanceWindowArgs {
  @scala.inline
  def apply(
    cutoff: atPulumiPulumiLib.outputMod.Input[scala.Double],
    duration: atPulumiPulumiLib.outputMod.Input[scala.Double],
    schedule: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    allowUnassociatedTargets: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    endDate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    scheduleTimezone: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    startDate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): MaintenanceWindowArgs = {
    val __obj = js.Dynamic.literal(cutoff = cutoff.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    if (allowUnassociatedTargets != null) __obj.updateDynamic("allowUnassociatedTargets")(allowUnassociatedTargets.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scheduleTimezone != null) __obj.updateDynamic("scheduleTimezone")(scheduleTimezone.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowArgs]
  }
}

