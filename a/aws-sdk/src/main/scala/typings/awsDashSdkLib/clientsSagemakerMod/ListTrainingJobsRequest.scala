package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTrainingJobsRequest extends js.Object {
  /**
    * A filter that returns only training jobs created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
  /**
    * A filter that returns only training jobs created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
  /**
    * A filter that returns only training jobs modified after the specified time (timestamp).
    */
  var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined
  /**
    * A filter that returns only training jobs modified before the specified time (timestamp).
    */
  var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined
  /**
    * The maximum number of training jobs to return in the response.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A string in the training job name. This filter returns only training jobs whose name contains the specified string.
    */
  var NameContains: js.UndefOr[NameContains] = js.undefined
  /**
    * If the result of the previous ListTrainingJobs request was truncated, the response includes a NextToken. To retrieve the next set of training jobs, use the token in the next request. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The field to sort results by. The default is CreationTime.
    */
  var SortBy: js.UndefOr[SortBy] = js.undefined
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[SortOrder] = js.undefined
  /**
    * A filter that retrieves only training jobs with a specific status.
    */
  var StatusEquals: js.UndefOr[TrainingJobStatus] = js.undefined
}

object ListTrainingJobsRequest {
  @scala.inline
  def apply(
    CreationTimeAfter: Timestamp = null,
    CreationTimeBefore: Timestamp = null,
    LastModifiedTimeAfter: Timestamp = null,
    LastModifiedTimeBefore: Timestamp = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NameContains: NameContains = null,
    NextToken: NextToken = null,
    SortBy: SortBy = null,
    SortOrder: SortOrder = null,
    StatusEquals: TrainingJobStatus = null
  ): ListTrainingJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter)
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore)
    if (LastModifiedTimeAfter != null) __obj.updateDynamic("LastModifiedTimeAfter")(LastModifiedTimeAfter)
    if (LastModifiedTimeBefore != null) __obj.updateDynamic("LastModifiedTimeBefore")(LastModifiedTimeBefore)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (StatusEquals != null) __obj.updateDynamic("StatusEquals")(StatusEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrainingJobsRequest]
  }
}

