package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportJobsResponse extends js.Object {
  /**
    * An array of responses, one for each export job that's associated with the application (Export Jobs resource) or segment (Segment Export Jobs resource).
    */
  var Item: ListOfExportJobResponse
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ExportJobsResponse {
  @scala.inline
  def apply(Item: ListOfExportJobResponse, NextToken: __string = null): ExportJobsResponse = {
    val __obj = js.Dynamic.literal(Item = Item)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ExportJobsResponse]
  }
}

