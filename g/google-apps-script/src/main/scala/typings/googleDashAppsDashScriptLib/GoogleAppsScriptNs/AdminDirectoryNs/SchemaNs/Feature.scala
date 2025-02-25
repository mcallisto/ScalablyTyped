package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  var etags: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Feature {
  @scala.inline
  def apply(etags: java.lang.String = null, kind: java.lang.String = null, name: java.lang.String = null): Feature = {
    val __obj = js.Dynamic.literal()
    if (etags != null) __obj.updateDynamic("etags")(etags)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Feature]
  }
}

