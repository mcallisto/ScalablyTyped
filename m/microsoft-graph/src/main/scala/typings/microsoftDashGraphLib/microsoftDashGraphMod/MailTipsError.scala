package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailTipsError extends js.Object {
  /** The error code. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** The error message. */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object MailTipsError {
  @scala.inline
  def apply(code: java.lang.String = null, message: java.lang.String = null): MailTipsError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[MailTipsError]
  }
}

