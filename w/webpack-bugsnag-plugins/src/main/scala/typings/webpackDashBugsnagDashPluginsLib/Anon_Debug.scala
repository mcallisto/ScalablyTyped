package typings
package webpackDashBugsnagDashPluginsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var debug: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[js.Any] = js.undefined
  var info: js.UndefOr[js.Any] = js.undefined
  var warn: js.UndefOr[js.Any] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(debug: js.Any = null, error: js.Any = null, info: js.Any = null, warn: js.Any = null): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(debug)
    if (error != null) __obj.updateDynamic("error")(error)
    if (info != null) __obj.updateDynamic("info")(info)
    if (warn != null) __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Anon_Debug]
  }
}

