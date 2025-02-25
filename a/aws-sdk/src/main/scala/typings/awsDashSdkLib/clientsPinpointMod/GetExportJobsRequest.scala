package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExportJobsRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  /**
    * The maximum number of items to include on each page in a paginated response.
    */
  var PageSize: js.UndefOr[__string] = js.undefined
  /**
    * The NextToken string that specifies which page of results to return in a paginated response.
    */
  var Token: js.UndefOr[__string] = js.undefined
}

object GetExportJobsRequest {
  @scala.inline
  def apply(ApplicationId: __string, PageSize: __string = null, Token: __string = null): GetExportJobsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId)
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize)
    if (Token != null) __obj.updateDynamic("Token")(Token)
    __obj.asInstanceOf[GetExportJobsRequest]
  }
}

