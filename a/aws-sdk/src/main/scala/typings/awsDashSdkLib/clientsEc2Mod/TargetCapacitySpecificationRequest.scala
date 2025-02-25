package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetCapacitySpecificationRequest extends js.Object {
  /**
    * The default TotalTargetCapacity, which is either Spot or On-Demand.
    */
  var DefaultTargetCapacityType: js.UndefOr[DefaultTargetCapacityType] = js.undefined
  /**
    * The number of On-Demand units to request.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.undefined
  /**
    * The number of Spot units to request.
    */
  var SpotTargetCapacity: js.UndefOr[Integer] = js.undefined
  /**
    * The number of units to request, filled using DefaultTargetCapacityType.
    */
  var TotalTargetCapacity: Integer
}

object TargetCapacitySpecificationRequest {
  @scala.inline
  def apply(
    TotalTargetCapacity: Integer,
    DefaultTargetCapacityType: DefaultTargetCapacityType = null,
    OnDemandTargetCapacity: js.UndefOr[Integer] = js.undefined,
    SpotTargetCapacity: js.UndefOr[Integer] = js.undefined
  ): TargetCapacitySpecificationRequest = {
    val __obj = js.Dynamic.literal(TotalTargetCapacity = TotalTargetCapacity)
    if (DefaultTargetCapacityType != null) __obj.updateDynamic("DefaultTargetCapacityType")(DefaultTargetCapacityType.asInstanceOf[js.Any])
    if (!js.isUndefined(OnDemandTargetCapacity)) __obj.updateDynamic("OnDemandTargetCapacity")(OnDemandTargetCapacity)
    if (!js.isUndefined(SpotTargetCapacity)) __obj.updateDynamic("SpotTargetCapacity")(SpotTargetCapacity)
    __obj.asInstanceOf[TargetCapacitySpecificationRequest]
  }
}

