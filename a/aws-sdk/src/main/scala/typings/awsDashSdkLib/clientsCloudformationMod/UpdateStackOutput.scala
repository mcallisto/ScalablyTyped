package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateStackOutput extends js.Object {
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[StackId] = js.undefined
}

object UpdateStackOutput {
  @scala.inline
  def apply(StackId: StackId = null): UpdateStackOutput = {
    val __obj = js.Dynamic.literal()
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[UpdateStackOutput]
  }
}

