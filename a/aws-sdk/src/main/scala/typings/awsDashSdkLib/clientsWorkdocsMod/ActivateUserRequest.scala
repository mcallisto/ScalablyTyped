package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivateUserRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The ID of the user.
    */
  var UserId: IdType
}

object ActivateUserRequest {
  @scala.inline
  def apply(UserId: IdType, AuthenticationToken: AuthenticationHeaderType = null): ActivateUserRequest = {
    val __obj = js.Dynamic.literal(UserId = UserId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    __obj.asInstanceOf[ActivateUserRequest]
  }
}

