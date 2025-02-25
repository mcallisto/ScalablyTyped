package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInventoryEntriesRequest extends js.Object {
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[InventoryFilterList] = js.undefined
  /**
    * The instance ID for which you want inventory information.
    */
  var InstanceId: awsDashSdkLib.clientsSsmMod.InstanceId
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The type of inventory item for which you want information.
    */
  var TypeName: InventoryItemTypeName
}

object ListInventoryEntriesRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    TypeName: InventoryItemTypeName,
    Filters: InventoryFilterList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListInventoryEntriesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, TypeName = TypeName)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListInventoryEntriesRequest]
  }
}

