package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateChapCredentialsOutput extends js.Object {
  /**
    * The iSCSI initiator that connects to the target. This is the same initiator name specified in the request.
    */
  var InitiatorName: js.UndefOr[IqnName] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the target. This is the same target specified in the request.
    */
  var TargetARN: js.UndefOr[TargetARN] = js.undefined
}

object UpdateChapCredentialsOutput {
  @scala.inline
  def apply(InitiatorName: IqnName = null, TargetARN: TargetARN = null): UpdateChapCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    if (InitiatorName != null) __obj.updateDynamic("InitiatorName")(InitiatorName)
    if (TargetARN != null) __obj.updateDynamic("TargetARN")(TargetARN)
    __obj.asInstanceOf[UpdateChapCredentialsOutput]
  }
}

