package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllTextRequest extends js.Object {
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
  var replaceText: js.UndefOr[java.lang.String] = js.undefined
}

object ReplaceAllTextRequest {
  @scala.inline
  def apply(containsText: SubstringMatchCriteria = null, replaceText: java.lang.String = null): ReplaceAllTextRequest = {
    val __obj = js.Dynamic.literal()
    if (containsText != null) __obj.updateDynamic("containsText")(containsText)
    if (replaceText != null) __obj.updateDynamic("replaceText")(replaceText)
    __obj.asInstanceOf[ReplaceAllTextRequest]
  }
}

