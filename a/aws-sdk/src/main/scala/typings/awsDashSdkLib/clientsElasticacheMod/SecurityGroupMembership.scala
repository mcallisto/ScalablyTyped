package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroupMembership extends js.Object {
  /**
    * The identifier of the cache security group.
    */
  var SecurityGroupId: js.UndefOr[String] = js.undefined
  /**
    * The status of the cache security group membership. The status changes whenever a cache security group is modified, or when the cache security groups assigned to a cluster are modified.
    */
  var Status: js.UndefOr[String] = js.undefined
}

object SecurityGroupMembership {
  @scala.inline
  def apply(SecurityGroupId: String = null, Status: String = null): SecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupId != null) __obj.updateDynamic("SecurityGroupId")(SecurityGroupId)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[SecurityGroupMembership]
  }
}

