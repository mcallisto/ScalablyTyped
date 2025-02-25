package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC2InstanceCounts extends js.Object {
  /**
    * Actual number of active instances in the fleet.
    */
  var ACTIVE: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Ideal number of active instances in the fleet.
    */
  var DESIRED: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Number of active instances in the fleet that are not currently hosting a game session.
    */
  var IDLE: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Maximum value allowed for the fleet's instance count.
    */
  var MAXIMUM: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Minimum value allowed for the fleet's instance count.
    */
  var MINIMUM: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Number of instances in the fleet that are starting but not yet active.
    */
  var PENDING: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Number of instances in the fleet that are no longer active but haven't yet been terminated.
    */
  var TERMINATING: js.UndefOr[WholeNumber] = js.undefined
}

object EC2InstanceCounts {
  @scala.inline
  def apply(
    ACTIVE: js.UndefOr[WholeNumber] = js.undefined,
    DESIRED: js.UndefOr[WholeNumber] = js.undefined,
    IDLE: js.UndefOr[WholeNumber] = js.undefined,
    MAXIMUM: js.UndefOr[WholeNumber] = js.undefined,
    MINIMUM: js.UndefOr[WholeNumber] = js.undefined,
    PENDING: js.UndefOr[WholeNumber] = js.undefined,
    TERMINATING: js.UndefOr[WholeNumber] = js.undefined
  ): EC2InstanceCounts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ACTIVE)) __obj.updateDynamic("ACTIVE")(ACTIVE)
    if (!js.isUndefined(DESIRED)) __obj.updateDynamic("DESIRED")(DESIRED)
    if (!js.isUndefined(IDLE)) __obj.updateDynamic("IDLE")(IDLE)
    if (!js.isUndefined(MAXIMUM)) __obj.updateDynamic("MAXIMUM")(MAXIMUM)
    if (!js.isUndefined(MINIMUM)) __obj.updateDynamic("MINIMUM")(MINIMUM)
    if (!js.isUndefined(PENDING)) __obj.updateDynamic("PENDING")(PENDING)
    if (!js.isUndefined(TERMINATING)) __obj.updateDynamic("TERMINATING")(TERMINATING)
    __obj.asInstanceOf[EC2InstanceCounts]
  }
}

