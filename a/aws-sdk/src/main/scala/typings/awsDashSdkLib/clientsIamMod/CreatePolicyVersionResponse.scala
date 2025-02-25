package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePolicyVersionResponse extends js.Object {
  /**
    * A structure containing details about the new policy version.
    */
  var PolicyVersion: js.UndefOr[PolicyVersion] = js.undefined
}

object CreatePolicyVersionResponse {
  @scala.inline
  def apply(PolicyVersion: PolicyVersion = null): CreatePolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (PolicyVersion != null) __obj.updateDynamic("PolicyVersion")(PolicyVersion)
    __obj.asInstanceOf[CreatePolicyVersionResponse]
  }
}

