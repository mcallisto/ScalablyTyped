package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTagsRequest extends js.Object {
  /**
    * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
  /**
    * The value that you want to search for.
    */
  var SearchString: js.UndefOr[SearchString] = js.undefined
  /**
    * The key of the tag that you want to return values for.
    */
  var TagKey: js.UndefOr[TagKey] = js.undefined
  /**
    * The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01.
    */
  var TimePeriod: DateInterval
}

object GetTagsRequest {
  @scala.inline
  def apply(
    TimePeriod: DateInterval,
    NextPageToken: NextPageToken = null,
    SearchString: SearchString = null,
    TagKey: TagKey = null
  ): GetTagsRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod)
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (SearchString != null) __obj.updateDynamic("SearchString")(SearchString)
    if (TagKey != null) __obj.updateDynamic("TagKey")(TagKey)
    __obj.asInstanceOf[GetTagsRequest]
  }
}

