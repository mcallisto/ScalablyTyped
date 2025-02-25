package typings
package revealLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/hakimel/reveal.js/#dependencies
trait RevealDependency extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var condition: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var src: java.lang.String
}

object RevealDependency {
  @scala.inline
  def apply(
    src: java.lang.String,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    callback: () => scala.Unit = null,
    condition: () => scala.Boolean = null
  ): RevealDependency = {
    val __obj = js.Dynamic.literal(src = src)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction0(condition))
    __obj.asInstanceOf[RevealDependency]
  }
}

