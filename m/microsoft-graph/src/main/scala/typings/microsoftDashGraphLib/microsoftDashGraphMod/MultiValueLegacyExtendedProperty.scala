package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiValueLegacyExtendedProperty extends Entity {
  /** A collection of property values. */
  var value: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object MultiValueLegacyExtendedProperty {
  @scala.inline
  def apply(id: java.lang.String = null, value: js.Array[java.lang.String] = null): MultiValueLegacyExtendedProperty = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MultiValueLegacyExtendedProperty]
  }
}

