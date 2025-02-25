package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEnabledStandardsRequest extends js.Object {
  /**
    * The maximum number of results to return in the response.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * Paginates results. On your first call to the GetEnabledStandards operation, set the value of this parameter to NULL. For subsequent calls to the operation, fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of the standards subscription ARNs for the standards to retrieve.
    */
  var StandardsSubscriptionArns: js.UndefOr[StandardsSubscriptionArns] = js.undefined
}

object GetEnabledStandardsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    StandardsSubscriptionArns: StandardsSubscriptionArns = null
  ): GetEnabledStandardsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StandardsSubscriptionArns != null) __obj.updateDynamic("StandardsSubscriptionArns")(StandardsSubscriptionArns)
    __obj.asInstanceOf[GetEnabledStandardsRequest]
  }
}

