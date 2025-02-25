package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFaceSearchRequest extends js.Object {
  /**
    * The job identifer for the search request. You get the job identifier from an initial call to StartFaceSearch.
    */
  var JobId: awsDashSdkLib.clientsRekognitionMod.JobId
  /**
    * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * If the previous response was incomplete (because there is more search results to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of search results. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * Sort to use for grouping faces in the response. Use TIMESTAMP to group faces by the time that they are recognized. Use INDEX to sort by recognized faces. 
    */
  var SortBy: js.UndefOr[FaceSearchSortBy] = js.undefined
}

object GetFaceSearchRequest {
  @scala.inline
  def apply(
    JobId: JobId,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: PaginationToken = null,
    SortBy: FaceSearchSortBy = null
  ): GetFaceSearchRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFaceSearchRequest]
  }
}

