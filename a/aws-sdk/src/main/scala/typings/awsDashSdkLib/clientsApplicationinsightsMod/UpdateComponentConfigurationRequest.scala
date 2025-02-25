package typings
package awsDashSdkLib.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateComponentConfigurationRequest extends js.Object {
  /**
    * The configuration settings of the component. The value is the escaped JSON of the configuration. For more information about the JSON format, see Working with JSON. You can send a request to DescribeComponentConfigurationRecommendation to see the recommended configuration for a component.
    */
  var ComponentConfiguration: js.UndefOr[ComponentConfiguration] = js.undefined
  /**
    * The name of the component.
    */
  var ComponentName: awsDashSdkLib.clientsApplicationinsightsMod.ComponentName
  /**
    * Indicates whether the application component is monitored.
    */
  var Monitor: js.UndefOr[Monitor] = js.undefined
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: awsDashSdkLib.clientsApplicationinsightsMod.ResourceGroupName
  /**
    * The tier of the application component. Supported tiers include DOT_NET_WORKER, DOT_NET_WEB_TIER, SQL_SERVER, and DEFAULT.
    */
  var Tier: js.UndefOr[Tier] = js.undefined
}

object UpdateComponentConfigurationRequest {
  @scala.inline
  def apply(
    ComponentName: ComponentName,
    ResourceGroupName: ResourceGroupName,
    ComponentConfiguration: ComponentConfiguration = null,
    Monitor: js.UndefOr[Monitor] = js.undefined,
    Tier: Tier = null
  ): UpdateComponentConfigurationRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName, ResourceGroupName = ResourceGroupName)
    if (ComponentConfiguration != null) __obj.updateDynamic("ComponentConfiguration")(ComponentConfiguration)
    if (!js.isUndefined(Monitor)) __obj.updateDynamic("Monitor")(Monitor)
    if (Tier != null) __obj.updateDynamic("Tier")(Tier)
    __obj.asInstanceOf[UpdateComponentConfigurationRequest]
  }
}

