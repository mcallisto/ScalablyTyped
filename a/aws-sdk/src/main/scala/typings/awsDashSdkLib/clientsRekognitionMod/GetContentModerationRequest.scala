package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContentModerationRequest extends js.Object {
  /**
    * The identifier for the content moderation job. Use JobId to identify the job in a subsequent call to GetContentModeration.
    */
  var JobId: awsDashSdkLib.clientsRekognitionMod.JobId
  /**
    * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition returns a pagination token in the response. You can use this pagination token to retrieve the next set of content moderation labels.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * Sort to use for elements in the ModerationLabelDetections array. Use TIMESTAMP to sort array elements by the time labels are detected. Use NAME to alphabetically group elements for a label together. Within each label group, the array element are sorted by detection confidence. The default sort is by TIMESTAMP.
    */
  var SortBy: js.UndefOr[ContentModerationSortBy] = js.undefined
}

object GetContentModerationRequest {
  @scala.inline
  def apply(
    JobId: JobId,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: PaginationToken = null,
    SortBy: ContentModerationSortBy = null
  ): GetContentModerationRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContentModerationRequest]
  }
}

