package typings
package wouterLib.wouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var children: js.Array[reactLib.reactMod.ReactElement]
  var location: js.UndefOr[java.lang.String] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(children: js.Array[reactLib.reactMod.ReactElement], location: java.lang.String = null): SwitchProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[SwitchProps]
  }
}

