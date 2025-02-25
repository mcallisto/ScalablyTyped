package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFlowExecutionMessagesRequest extends js.Object {
  /**
    * The ID of the flow execution.
    */
  var flowExecutionId: FlowExecutionId
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListFlowExecutionMessagesRequest {
  @scala.inline
  def apply(
    flowExecutionId: FlowExecutionId,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): ListFlowExecutionMessagesRequest = {
    val __obj = js.Dynamic.literal(flowExecutionId = flowExecutionId)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListFlowExecutionMessagesRequest]
  }
}

