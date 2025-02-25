package typings
package awsDashSdkLib.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDiscoveredResourcesRequest extends js.Object {
  /**
    * The maximum number of results returned per page.
    */
  var MaxResults: js.UndefOr[MaxResultsResources] = js.undefined
  /**
    * The name of the MigrationTask.
    */
  var MigrationTaskName: awsDashSdkLib.clientsMigrationhubMod.MigrationTaskName
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * The name of the ProgressUpdateStream.
    */
  var ProgressUpdateStream: awsDashSdkLib.clientsMigrationhubMod.ProgressUpdateStream
}

object ListDiscoveredResourcesRequest {
  @scala.inline
  def apply(
    MigrationTaskName: MigrationTaskName,
    ProgressUpdateStream: ProgressUpdateStream,
    MaxResults: js.UndefOr[MaxResultsResources] = js.undefined,
    NextToken: Token = null
  ): ListDiscoveredResourcesRequest = {
    val __obj = js.Dynamic.literal(MigrationTaskName = MigrationTaskName, ProgressUpdateStream = ProgressUpdateStream)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDiscoveredResourcesRequest]
  }
}

