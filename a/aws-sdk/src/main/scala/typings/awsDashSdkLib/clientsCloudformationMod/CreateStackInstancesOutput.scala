package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStackInstancesOutput extends js.Object {
  /**
    * The unique identifier for this stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
}

object CreateStackInstancesOutput {
  @scala.inline
  def apply(OperationId: ClientRequestToken = null): CreateStackInstancesOutput = {
    val __obj = js.Dynamic.literal()
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId)
    __obj.asInstanceOf[CreateStackInstancesOutput]
  }
}

