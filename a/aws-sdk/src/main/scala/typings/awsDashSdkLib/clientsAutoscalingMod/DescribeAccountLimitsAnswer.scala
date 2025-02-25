package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccountLimitsAnswer extends js.Object {
  /**
    * The maximum number of groups allowed for your AWS account. The default limit is 200 per region.
    */
  var MaxNumberOfAutoScalingGroups: js.UndefOr[MaxNumberOfAutoScalingGroups] = js.undefined
  /**
    * The maximum number of launch configurations allowed for your AWS account. The default limit is 200 per region.
    */
  var MaxNumberOfLaunchConfigurations: js.UndefOr[MaxNumberOfLaunchConfigurations] = js.undefined
  /**
    * The current number of groups for your AWS account.
    */
  var NumberOfAutoScalingGroups: js.UndefOr[NumberOfAutoScalingGroups] = js.undefined
  /**
    * The current number of launch configurations for your AWS account.
    */
  var NumberOfLaunchConfigurations: js.UndefOr[NumberOfLaunchConfigurations] = js.undefined
}

object DescribeAccountLimitsAnswer {
  @scala.inline
  def apply(
    MaxNumberOfAutoScalingGroups: js.UndefOr[MaxNumberOfAutoScalingGroups] = js.undefined,
    MaxNumberOfLaunchConfigurations: js.UndefOr[MaxNumberOfLaunchConfigurations] = js.undefined,
    NumberOfAutoScalingGroups: js.UndefOr[NumberOfAutoScalingGroups] = js.undefined,
    NumberOfLaunchConfigurations: js.UndefOr[NumberOfLaunchConfigurations] = js.undefined
  ): DescribeAccountLimitsAnswer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxNumberOfAutoScalingGroups)) __obj.updateDynamic("MaxNumberOfAutoScalingGroups")(MaxNumberOfAutoScalingGroups)
    if (!js.isUndefined(MaxNumberOfLaunchConfigurations)) __obj.updateDynamic("MaxNumberOfLaunchConfigurations")(MaxNumberOfLaunchConfigurations)
    if (!js.isUndefined(NumberOfAutoScalingGroups)) __obj.updateDynamic("NumberOfAutoScalingGroups")(NumberOfAutoScalingGroups)
    if (!js.isUndefined(NumberOfLaunchConfigurations)) __obj.updateDynamic("NumberOfLaunchConfigurations")(NumberOfLaunchConfigurations)
    __obj.asInstanceOf[DescribeAccountLimitsAnswer]
  }
}

