package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeElasticGpusRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The Elastic Graphics accelerator IDs.
    */
  var ElasticGpuIds: js.UndefOr[ElasticGpuIdSet] = js.undefined
  /**
    * The filters.    availability-zone - The Availability Zone in which the Elastic Graphics accelerator resides.    elastic-gpu-health - The status of the Elastic Graphics accelerator (OK | IMPAIRED).    elastic-gpu-state - The state of the Elastic Graphics accelerator (ATTACHED).    elastic-gpu-type - The type of Elastic Graphics accelerator; for example, eg1.medium.    instance-id - The ID of the instance to which the Elastic Graphics accelerator is associated.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. This value can be between 5 and 1000.
    */
  var MaxResults: js.UndefOr[DescribeElasticGpusMaxResults] = js.undefined
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeElasticGpusRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    ElasticGpuIds: ElasticGpuIdSet = null,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[DescribeElasticGpusMaxResults] = js.undefined,
    NextToken: String = null
  ): DescribeElasticGpusRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (ElasticGpuIds != null) __obj.updateDynamic("ElasticGpuIds")(ElasticGpuIds)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeElasticGpusRequest]
  }
}

