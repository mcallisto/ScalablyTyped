package typings
package stripeLib.stripeMod.customersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceListOptions
  extends stripeLib.stripeMod.IListOptions {
  var `object`: stripeLib.stripeLibStrings.source
}

object ISourceListOptions {
  @scala.inline
  def apply(
    `object`: stripeLib.stripeLibStrings.source,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null
  ): ISourceListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[ISourceListOptions]
  }
}

