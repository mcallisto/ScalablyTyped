package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStackSetsInput extends js.Object {
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * If the previous paginated request didn't return all of the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call ListStackSets again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The status of the stack sets that you want to get summary information about.
    */
  var Status: js.UndefOr[StackSetStatus] = js.undefined
}

object ListStackSetsInput {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    Status: StackSetStatus = null
  ): ListStackSetsInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStackSetsInput]
  }
}

