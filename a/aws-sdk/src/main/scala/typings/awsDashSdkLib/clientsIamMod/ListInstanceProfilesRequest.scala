package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInstanceProfilesRequest extends js.Object {
  /**
    * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
    */
  var Marker: js.UndefOr[markerType] = js.undefined
  /**
    * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
    */
  var MaxItems: js.UndefOr[maxItemsType] = js.undefined
  /**
    *  The path prefix for filtering the results. For example, the prefix /application_abc/component_xyz/ gets all instance profiles whose path starts with /application_abc/component_xyz/. This parameter is optional. If it is not included, it defaults to a slash (/), listing all instance profiles. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var PathPrefix: js.UndefOr[pathPrefixType] = js.undefined
}

object ListInstanceProfilesRequest {
  @scala.inline
  def apply(
    Marker: markerType = null,
    MaxItems: js.UndefOr[maxItemsType] = js.undefined,
    PathPrefix: pathPrefixType = null
  ): ListInstanceProfilesRequest = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems)
    if (PathPrefix != null) __obj.updateDynamic("PathPrefix")(PathPrefix)
    __obj.asInstanceOf[ListInstanceProfilesRequest]
  }
}

