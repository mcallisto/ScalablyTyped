package typings
package antdLib.esTypographyBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditConfig extends js.Object {
  var editing: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var onStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object EditConfig {
  @scala.inline
  def apply(
    editing: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* value */ java.lang.String => scala.Unit = null,
    onStart: () => scala.Unit = null
  ): EditConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction0(onStart))
    __obj.asInstanceOf[EditConfig]
  }
}

