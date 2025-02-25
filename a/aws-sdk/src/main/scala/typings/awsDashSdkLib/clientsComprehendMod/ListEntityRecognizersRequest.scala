package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEntityRecognizersRequest extends js.Object {
  /**
    * Filters the list of entities returned. You can filter on Status, SubmitTimeBefore, or SubmitTimeAfter. You can only set one filter at a time.
    */
  var Filter: js.UndefOr[EntityRecognizerFilter] = js.undefined
  /**
    *  The maximum number of results to return on each page. The default is 100.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListEntityRecognizersRequest {
  @scala.inline
  def apply(
    Filter: EntityRecognizerFilter = null,
    MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
    NextToken: String = null
  ): ListEntityRecognizersRequest = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListEntityRecognizersRequest]
  }
}

