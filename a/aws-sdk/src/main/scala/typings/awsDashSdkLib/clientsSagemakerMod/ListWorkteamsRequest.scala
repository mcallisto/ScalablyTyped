package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWorkteamsRequest extends js.Object {
  /**
    * The maximum number of work teams to return in each page of the response.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A string in the work team's name. This filter returns only work teams whose name contains the specified string.
    */
  var NameContains: js.UndefOr[WorkteamName] = js.undefined
  /**
    * If the result of the previous ListWorkteams request was truncated, the response includes a NextToken. To retrieve the next set of labeling jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The field to sort results by. The default is CreationTime.
    */
  var SortBy: js.UndefOr[ListWorkteamsSortByOptions] = js.undefined
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[SortOrder] = js.undefined
}

object ListWorkteamsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NameContains: WorkteamName = null,
    NextToken: NextToken = null,
    SortBy: ListWorkteamsSortByOptions = null,
    SortOrder: SortOrder = null
  ): ListWorkteamsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkteamsRequest]
  }
}

