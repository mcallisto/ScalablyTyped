package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InviteAction extends js.Object {
  /**
    * The AWS account ID to invite.
    */
  var Principal: PrincipalString
}

object InviteAction {
  @scala.inline
  def apply(Principal: PrincipalString): InviteAction = {
    val __obj = js.Dynamic.literal(Principal = Principal)
  
    __obj.asInstanceOf[InviteAction]
  }
}

