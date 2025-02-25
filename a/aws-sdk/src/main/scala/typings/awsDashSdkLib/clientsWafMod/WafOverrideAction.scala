package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WafOverrideAction extends js.Object {
  /**
    *  COUNT overrides the action specified by the individual rule within a RuleGroup . If set to NONE, the rule's action will take place.
    */
  var Type: WafOverrideActionType
}

object WafOverrideAction {
  @scala.inline
  def apply(Type: WafOverrideActionType): WafOverrideAction = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WafOverrideAction]
  }
}

