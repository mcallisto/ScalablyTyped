package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProperties extends js.Object {
  var nestingLevels: js.UndefOr[js.Array[NestingLevel]] = js.undefined
}

object ListProperties {
  @scala.inline
  def apply(nestingLevels: js.Array[NestingLevel] = null): ListProperties = {
    val __obj = js.Dynamic.literal()
    if (nestingLevels != null) __obj.updateDynamic("nestingLevels")(nestingLevels)
    __obj.asInstanceOf[ListProperties]
  }
}

