package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBuiltInVariableResponse extends js.Object {
  var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.undefined
}

object CreateBuiltInVariableResponse {
  @scala.inline
  def apply(builtInVariable: js.Array[BuiltInVariable] = null): CreateBuiltInVariableResponse = {
    val __obj = js.Dynamic.literal()
    if (builtInVariable != null) __obj.updateDynamic("builtInVariable")(builtInVariable)
    __obj.asInstanceOf[CreateBuiltInVariableResponse]
  }
}

