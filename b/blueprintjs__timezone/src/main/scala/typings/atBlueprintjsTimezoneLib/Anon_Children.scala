package typings
package atBlueprintjsTimezoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNode = null): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

