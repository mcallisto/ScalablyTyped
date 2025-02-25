package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMailboxDetailsResponse extends js.Object {
  /**
    * The maximum allowed mailbox size, in MB, for the specified user.
    */
  var MailboxQuota: js.UndefOr[MailboxQuota] = js.undefined
  /**
    * The current mailbox size, in MB, for the specified user.
    */
  var MailboxSize: js.UndefOr[MailboxSize] = js.undefined
}

object GetMailboxDetailsResponse {
  @scala.inline
  def apply(
    MailboxQuota: js.UndefOr[MailboxQuota] = js.undefined,
    MailboxSize: js.UndefOr[MailboxSize] = js.undefined
  ): GetMailboxDetailsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MailboxQuota)) __obj.updateDynamic("MailboxQuota")(MailboxQuota)
    if (!js.isUndefined(MailboxSize)) __obj.updateDynamic("MailboxSize")(MailboxSize)
    __obj.asInstanceOf[GetMailboxDetailsResponse]
  }
}

