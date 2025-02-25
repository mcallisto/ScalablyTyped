package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstancePatchStatesRequest extends js.Object {
  /**
    * The ID of the instance whose patch state information should be retrieved.
    */
  var InstanceIds: InstanceIdList
  /**
    * The maximum number of instances to return (per page).
    */
  var MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeInstancePatchStatesRequest {
  @scala.inline
  def apply(
    InstanceIds: InstanceIdList,
    MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeInstancePatchStatesRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInstancePatchStatesRequest]
  }
}

