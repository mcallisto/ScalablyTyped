package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateOptions extends RegistrationOptions {
  var inverse: js.UndefOr[js.Function2[/* total */ js.Any, /* dropped */ js.Any, _]] = js.undefined
  var result: js.UndefOr[js.Function1[/* total */ js.Any, _]] = js.undefined
  var start: js.UndefOr[js.Any] = js.undefined
  def step(total: js.Any, next: js.Any): js.Any
}

object AggregateOptions {
  @scala.inline
  def apply(
    step: (js.Any, js.Any) => js.Any,
    deterministic: js.UndefOr[scala.Boolean] = js.undefined,
    inverse: (/* total */ js.Any, /* dropped */ js.Any) => _ = null,
    result: /* total */ js.Any => _ = null,
    safeIntegers: js.UndefOr[scala.Boolean] = js.undefined,
    start: js.Any = null,
    varargs: js.UndefOr[scala.Boolean] = js.undefined
  ): AggregateOptions = {
    val __obj = js.Dynamic.literal(step = js.Any.fromFunction2(step))
    if (!js.isUndefined(deterministic)) __obj.updateDynamic("deterministic")(deterministic)
    if (inverse != null) __obj.updateDynamic("inverse")(js.Any.fromFunction2(inverse))
    if (result != null) __obj.updateDynamic("result")(js.Any.fromFunction1(result))
    if (!js.isUndefined(safeIntegers)) __obj.updateDynamic("safeIntegers")(safeIntegers)
    if (start != null) __obj.updateDynamic("start")(start)
    if (!js.isUndefined(varargs)) __obj.updateDynamic("varargs")(varargs)
    __obj.asInstanceOf[AggregateOptions]
  }
}

