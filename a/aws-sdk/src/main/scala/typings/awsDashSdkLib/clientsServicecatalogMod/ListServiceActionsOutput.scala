package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServiceActionsOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * An object containing information about the service actions associated with the provisioning artifact.
    */
  var ServiceActionSummaries: js.UndefOr[ServiceActionSummaries] = js.undefined
}

object ListServiceActionsOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, ServiceActionSummaries: ServiceActionSummaries = null): ListServiceActionsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (ServiceActionSummaries != null) __obj.updateDynamic("ServiceActionSummaries")(ServiceActionSummaries)
    __obj.asInstanceOf[ListServiceActionsOutput]
  }
}

