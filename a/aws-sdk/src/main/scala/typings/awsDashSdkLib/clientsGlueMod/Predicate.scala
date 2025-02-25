package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Predicate extends js.Object {
  /**
    * A list of the conditions that determine when the trigger will fire.
    */
  var Conditions: js.UndefOr[ConditionList] = js.undefined
  /**
    * An optional field if only one condition is listed. If multiple conditions are listed, then this field is required.
    */
  var Logical: js.UndefOr[Logical] = js.undefined
}

object Predicate {
  @scala.inline
  def apply(Conditions: ConditionList = null, Logical: Logical = null): Predicate = {
    val __obj = js.Dynamic.literal()
    if (Conditions != null) __obj.updateDynamic("Conditions")(Conditions)
    if (Logical != null) __obj.updateDynamic("Logical")(Logical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Predicate]
  }
}

