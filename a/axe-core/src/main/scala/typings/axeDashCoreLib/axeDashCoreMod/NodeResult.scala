package typings
package axeDashCoreLib.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeResult extends js.Object {
  var all: js.Array[CheckResult]
  var any: js.Array[CheckResult]
  var failureSummary: js.UndefOr[java.lang.String] = js.undefined
  var html: java.lang.String
  var impact: js.UndefOr[ImpactValue] = js.undefined
  var none: js.Array[CheckResult]
  var target: js.Array[java.lang.String]
}

object NodeResult {
  @scala.inline
  def apply(
    all: js.Array[CheckResult],
    any: js.Array[CheckResult],
    html: java.lang.String,
    none: js.Array[CheckResult],
    target: js.Array[java.lang.String],
    failureSummary: java.lang.String = null,
    impact: ImpactValue = null
  ): NodeResult = {
    val __obj = js.Dynamic.literal(all = all, any = any, html = html, none = none, target = target)
    if (failureSummary != null) __obj.updateDynamic("failureSummary")(failureSummary)
    if (impact != null) __obj.updateDynamic("impact")(impact)
    __obj.asInstanceOf[NodeResult]
  }
}

