package typings
package antdLib.esTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalCellProps
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
}

object AdditionalCellProps {
  @scala.inline
  def apply(
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null
  ): AdditionalCellProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[AdditionalCellProps]
  }
}

