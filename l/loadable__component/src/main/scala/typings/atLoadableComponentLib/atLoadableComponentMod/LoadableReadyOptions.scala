package typings
package atLoadableComponentLib.atLoadableComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadableReadyOptions extends js.Object {
  var namespace: js.UndefOr[java.lang.String] = js.undefined
}

object LoadableReadyOptions {
  @scala.inline
  def apply(namespace: java.lang.String = null): LoadableReadyOptions = {
    val __obj = js.Dynamic.literal()
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    __obj.asInstanceOf[LoadableReadyOptions]
  }
}

