package typings
package antdDashMobileLib.esFlexPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexItemPropsType extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
}

object FlexItemPropsType {
  @scala.inline
  def apply(disabled: js.UndefOr[scala.Boolean] = js.undefined): FlexItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[FlexItemPropsType]
  }
}

