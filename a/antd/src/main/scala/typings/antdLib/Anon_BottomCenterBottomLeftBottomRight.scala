package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomCenterBottomLeftBottomRight extends js.Object {
  var placement: js.UndefOr[
    antdLib.antdLibStrings.bottomRight | antdLib.antdLibStrings.topLeft | antdLib.antdLibStrings.topCenter | antdLib.antdLibStrings.topRight | antdLib.antdLibStrings.bottomLeft | antdLib.antdLibStrings.bottomCenter
  ] = js.undefined
  var `type`: antdLib.libDropdownDropdownDashButtonMod.DropdownButtonType
}

object Anon_BottomCenterBottomLeftBottomRight {
  @scala.inline
  def apply(
    `type`: antdLib.libDropdownDropdownDashButtonMod.DropdownButtonType,
    placement: antdLib.antdLibStrings.bottomRight | antdLib.antdLibStrings.topLeft | antdLib.antdLibStrings.topCenter | antdLib.antdLibStrings.topRight | antdLib.antdLibStrings.bottomLeft | antdLib.antdLibStrings.bottomCenter = null
  ): Anon_BottomCenterBottomLeftBottomRight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BottomCenterBottomLeftBottomRight]
  }
}

