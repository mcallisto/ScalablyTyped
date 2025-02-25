package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFlowLogsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters.    deliver-log-status - The status of the logs delivery (SUCCESS | FAILED).    log-destination-type - The type of destination to which the flow log publishes data. Possible destination types include cloud-watch-logs and S3.    flow-log-id - The ID of the flow log.    log-group-name - The name of the log group.    resource-id - The ID of the VPC, subnet, or network interface.    traffic-type - The type of traffic (ACCEPT | REJECT | ALL).  
    */
  var Filter: js.UndefOr[FilterList] = js.undefined
  /**
    * One or more flow log IDs. Constraint: Maximum of 1000 flow log IDs.
    */
  var FlowLogIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeFlowLogsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filter: FilterList = null,
    FlowLogIds: ValueStringList = null,
    MaxResults: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null
  ): DescribeFlowLogsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (FlowLogIds != null) __obj.updateDynamic("FlowLogIds")(FlowLogIds)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeFlowLogsRequest]
  }
}

