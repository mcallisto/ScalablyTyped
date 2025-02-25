package typings
package atPulumiAwsLib.cloudwatchDashboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  val dashboardArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
    */
  val dashboardBody: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the dashboard.
    */
  val dashboardName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object DashboardState {
  @scala.inline
  def apply(
    dashboardArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dashboardBody: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dashboardName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): DashboardState = {
    val __obj = js.Dynamic.literal()
    if (dashboardArn != null) __obj.updateDynamic("dashboardArn")(dashboardArn.asInstanceOf[js.Any])
    if (dashboardBody != null) __obj.updateDynamic("dashboardBody")(dashboardBody.asInstanceOf[js.Any])
    if (dashboardName != null) __obj.updateDynamic("dashboardName")(dashboardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardState]
  }
}

