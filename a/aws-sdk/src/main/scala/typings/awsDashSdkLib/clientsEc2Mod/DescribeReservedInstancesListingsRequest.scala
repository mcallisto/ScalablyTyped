package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReservedInstancesListingsRequest extends js.Object {
  /**
    * One or more filters.    reserved-instances-id - The ID of the Reserved Instances.    reserved-instances-listing-id - The ID of the Reserved Instances listing.    status - The status of the Reserved Instance listing (pending | active | cancelled | closed).    status-message - The reason for the status.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * One or more Reserved Instance IDs.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.undefined
  /**
    * One or more Reserved Instance listing IDs.
    */
  var ReservedInstancesListingId: js.UndefOr[String] = js.undefined
}

object DescribeReservedInstancesListingsRequest {
  @scala.inline
  def apply(
    Filters: FilterList = null,
    ReservedInstancesId: String = null,
    ReservedInstancesListingId: String = null
  ): DescribeReservedInstancesListingsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (ReservedInstancesId != null) __obj.updateDynamic("ReservedInstancesId")(ReservedInstancesId)
    if (ReservedInstancesListingId != null) __obj.updateDynamic("ReservedInstancesListingId")(ReservedInstancesListingId)
    __obj.asInstanceOf[DescribeReservedInstancesListingsRequest]
  }
}

