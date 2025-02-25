package typings
package awsDashSdkLib.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupMembershipsResponse extends js.Object {
  /**
    * The list of the members of the group.
    */
  var GroupMemberList: js.UndefOr[GroupMemberList] = js.undefined
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  /**
    * The http status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}

object ListGroupMembershipsResponse {
  @scala.inline
  def apply(
    GroupMemberList: GroupMemberList = null,
    NextToken: String = null,
    RequestId: String = null,
    Status: js.UndefOr[StatusCode] = js.undefined
  ): ListGroupMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupMemberList != null) __obj.updateDynamic("GroupMemberList")(GroupMemberList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[ListGroupMembershipsResponse]
  }
}

