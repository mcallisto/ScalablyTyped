package typings
package kendoDashUiLib.kendoNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatrixOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object MatrixOptions {
  @scala.inline
  def apply(name: java.lang.String = null): MatrixOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MatrixOptions]
  }
}

