package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignedLicense extends js.Object {
  /** A collection of the unique identifiers for plans that have been disabled. */
  var disabledPlans: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The unique identifier for the SKU. */
  var skuId: js.UndefOr[java.lang.String] = js.undefined
}

object AssignedLicense {
  @scala.inline
  def apply(disabledPlans: js.Array[java.lang.String] = null, skuId: java.lang.String = null): AssignedLicense = {
    val __obj = js.Dynamic.literal()
    if (disabledPlans != null) __obj.updateDynamic("disabledPlans")(disabledPlans)
    if (skuId != null) __obj.updateDynamic("skuId")(skuId)
    __obj.asInstanceOf[AssignedLicense]
  }
}

