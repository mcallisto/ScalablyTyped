package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclineInvitationsResponse extends js.Object {
  /**
    * A list of account ID and email address pairs of the AWS accounts that weren't processed.
    */
  var UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
}

object DeclineInvitationsResponse {
  @scala.inline
  def apply(UnprocessedAccounts: ResultList = null): DeclineInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (UnprocessedAccounts != null) __obj.updateDynamic("UnprocessedAccounts")(UnprocessedAccounts)
    __obj.asInstanceOf[DeclineInvitationsResponse]
  }
}

