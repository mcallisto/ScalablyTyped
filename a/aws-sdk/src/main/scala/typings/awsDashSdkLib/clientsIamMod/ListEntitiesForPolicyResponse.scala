package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEntitiesForPolicyResponse extends js.Object {
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.undefined
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.undefined
  /**
    * A list of IAM groups that the policy is attached to.
    */
  var PolicyGroups: js.UndefOr[PolicyGroupListType] = js.undefined
  /**
    * A list of IAM roles that the policy is attached to.
    */
  var PolicyRoles: js.UndefOr[PolicyRoleListType] = js.undefined
  /**
    * A list of IAM users that the policy is attached to.
    */
  var PolicyUsers: js.UndefOr[PolicyUserListType] = js.undefined
}

object ListEntitiesForPolicyResponse {
  @scala.inline
  def apply(
    IsTruncated: js.UndefOr[booleanType] = js.undefined,
    Marker: responseMarkerType = null,
    PolicyGroups: PolicyGroupListType = null,
    PolicyRoles: PolicyRoleListType = null,
    PolicyUsers: PolicyUserListType = null
  ): ListEntitiesForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (PolicyGroups != null) __obj.updateDynamic("PolicyGroups")(PolicyGroups)
    if (PolicyRoles != null) __obj.updateDynamic("PolicyRoles")(PolicyRoles)
    if (PolicyUsers != null) __obj.updateDynamic("PolicyUsers")(PolicyUsers)
    __obj.asInstanceOf[ListEntitiesForPolicyResponse]
  }
}

