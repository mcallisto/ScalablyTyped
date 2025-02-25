package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionGroupMembership extends js.Object {
  /**
    * The name of the option group that the instance belongs to.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  /**
    * The status of the DB instance's option group membership. Valid values are: in-sync, pending-apply, pending-removal, pending-maintenance-apply, pending-maintenance-removal, applying, removing, and failed.
    */
  var Status: js.UndefOr[String] = js.undefined
}

object OptionGroupMembership {
  @scala.inline
  def apply(OptionGroupName: String = null, Status: String = null): OptionGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[OptionGroupMembership]
  }
}

