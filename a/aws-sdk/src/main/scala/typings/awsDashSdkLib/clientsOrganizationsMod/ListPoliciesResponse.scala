package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPoliciesResponse extends js.Object {
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of policies that match the filter criteria in the request. The output list doesn't include the policy contents. To see the content for a policy, see DescribePolicy.
    */
  var Policies: js.UndefOr[Policies] = js.undefined
}

object ListPoliciesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Policies: Policies = null): ListPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Policies != null) __obj.updateDynamic("Policies")(Policies)
    __obj.asInstanceOf[ListPoliciesResponse]
  }
}

