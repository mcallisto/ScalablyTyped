package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInsightsRequest extends js.Object {
  /**
    * The ARNs of the insights that you want to describe.
    */
  var InsightArns: js.UndefOr[ArnList] = js.undefined
  /**
    * The maximum number of items that you want in the response.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * Paginates results. On your first call to the GetInsights operation, set the value of this parameter to NULL. For subsequent calls to the operation, fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object GetInsightsRequest {
  @scala.inline
  def apply(
    InsightArns: ArnList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): GetInsightsRequest = {
    val __obj = js.Dynamic.literal()
    if (InsightArns != null) __obj.updateDynamic("InsightArns")(InsightArns)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetInsightsRequest]
  }
}

