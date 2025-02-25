package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountAuthorizationDetailsRequest extends js.Object {
  /**
    * A list of entity types used to filter the results. Only the entities that match the types you specify are included in the output. Use the value LocalManagedPolicy to include customer managed policies. The format for this parameter is a comma-separated (if more than one) list of strings. Each string value in the list must be one of the valid values listed below.
    */
  var Filter: js.UndefOr[entityListType] = js.undefined
  /**
    * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
    */
  var Marker: js.UndefOr[markerType] = js.undefined
  /**
    * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
    */
  var MaxItems: js.UndefOr[maxItemsType] = js.undefined
}

object GetAccountAuthorizationDetailsRequest {
  @scala.inline
  def apply(
    Filter: entityListType = null,
    Marker: markerType = null,
    MaxItems: js.UndefOr[maxItemsType] = js.undefined
  ): GetAccountAuthorizationDetailsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems)
    __obj.asInstanceOf[GetAccountAuthorizationDetailsRequest]
  }
}

