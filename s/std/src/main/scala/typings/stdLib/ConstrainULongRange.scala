package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstrainULongRange extends ULongRange {
  var exact: js.UndefOr[scala.Double] = js.undefined
  var ideal: js.UndefOr[scala.Double] = js.undefined
}

object ConstrainULongRange {
  @scala.inline
  def apply(
    exact: scala.Int | scala.Double = null,
    ideal: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): ConstrainULongRange = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainULongRange]
  }
}

