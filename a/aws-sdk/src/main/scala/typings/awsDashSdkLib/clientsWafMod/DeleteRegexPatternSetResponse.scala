package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRegexPatternSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the DeleteRegexPatternSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
}

object DeleteRegexPatternSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null): DeleteRegexPatternSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken)
    __obj.asInstanceOf[DeleteRegexPatternSetResponse]
  }
}

