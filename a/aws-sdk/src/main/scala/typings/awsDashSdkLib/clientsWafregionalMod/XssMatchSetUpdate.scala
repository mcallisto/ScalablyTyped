package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XssMatchSetUpdate extends js.Object {
  /**
    * Specify INSERT to add an XssMatchSetUpdate to an XssMatchSet. Use DELETE to remove an XssMatchSetUpdate from an XssMatchSet.
    */
  var Action: ChangeAction
  /**
    * Specifies the part of a web request that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to inspect a header, the name of the header.
    */
  var XssMatchTuple: awsDashSdkLib.clientsWafregionalMod.XssMatchTuple
}

object XssMatchSetUpdate {
  @scala.inline
  def apply(Action: ChangeAction, XssMatchTuple: XssMatchTuple): XssMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], XssMatchTuple = XssMatchTuple)
  
    __obj.asInstanceOf[XssMatchSetUpdate]
  }
}

