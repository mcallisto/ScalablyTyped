package typings
package awsDashSdkLib.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProblemsRequest extends js.Object {
  /**
    * The time when the problem ended, in epoch seconds. If not specified, problems within the past seven days are returned.
    */
  var EndTime: js.UndefOr[EndTime] = js.undefined
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[MaxEntities] = js.undefined
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[ResourceGroupName] = js.undefined
  /**
    * The time when the problem was detected, in epoch seconds. If you don't specify a time frame for the request, problems within the past seven days are returned.
    */
  var StartTime: js.UndefOr[StartTime] = js.undefined
}

object ListProblemsRequest {
  @scala.inline
  def apply(
    EndTime: EndTime = null,
    MaxResults: js.UndefOr[MaxEntities] = js.undefined,
    NextToken: PaginationToken = null,
    ResourceGroupName: ResourceGroupName = null,
    StartTime: StartTime = null
  ): ListProblemsRequest = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ResourceGroupName != null) __obj.updateDynamic("ResourceGroupName")(ResourceGroupName)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    __obj.asInstanceOf[ListProblemsRequest]
  }
}

