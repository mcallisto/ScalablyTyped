package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDomainEntryResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the request operation.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object UpdateDomainEntryResult {
  @scala.inline
  def apply(operations: OperationList = null): UpdateDomainEntryResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[UpdateDomainEntryResult]
  }
}

