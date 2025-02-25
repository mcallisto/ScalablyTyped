package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  /**
    * The filter expression defining the parameters to include traces.
    */
  var FilterExpression: js.UndefOr[String] = js.undefined
  /**
    * The ARN of the group generated based on the GroupName.
    */
  var GroupARN: js.UndefOr[String] = js.undefined
  /**
    * The unique case-sensitive name of the group.
    */
  var GroupName: js.UndefOr[String] = js.undefined
}

object Group {
  @scala.inline
  def apply(FilterExpression: String = null, GroupARN: String = null, GroupName: String = null): Group = {
    val __obj = js.Dynamic.literal()
    if (FilterExpression != null) __obj.updateDynamic("FilterExpression")(FilterExpression)
    if (GroupARN != null) __obj.updateDynamic("GroupARN")(GroupARN)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    __obj.asInstanceOf[Group]
  }
}

