package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEventTrackersRequest extends js.Object {
  /**
    * The ARN of a dataset group used to filter the response.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * The maximum number of event trackers to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token returned from the previous call to ListEventTrackers for getting the next set of event trackers (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListEventTrackersRequest {
  @scala.inline
  def apply(
    datasetGroupArn: Arn = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): ListEventTrackersRequest = {
    val __obj = js.Dynamic.literal()
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListEventTrackersRequest]
  }
}

