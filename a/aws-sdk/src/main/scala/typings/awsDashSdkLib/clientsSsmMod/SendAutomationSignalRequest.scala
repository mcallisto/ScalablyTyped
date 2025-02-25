package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAutomationSignalRequest extends js.Object {
  /**
    * The unique identifier for an existing Automation execution that you want to send the signal to.
    */
  var AutomationExecutionId: awsDashSdkLib.clientsSsmMod.AutomationExecutionId
  /**
    * The data sent with the signal. The data schema depends on the type of signal used in the request. For Approve and Reject signal types, the payload is an optional comment that you can send with the signal type. For example:  Comment="Looks good"  For StartStep and Resume signal types, you must send the name of the Automation step to start or resume as the payload. For example:  StepName="step1"  For the StopStep signal type, you must send the step execution ID as the payload. For example:  StepExecutionId="97fff367-fc5a-4299-aed8-0123456789ab" 
    */
  var Payload: js.UndefOr[AutomationParameterMap] = js.undefined
  /**
    * The type of signal to send to an Automation execution. 
    */
  var SignalType: awsDashSdkLib.clientsSsmMod.SignalType
}

object SendAutomationSignalRequest {
  @scala.inline
  def apply(
    AutomationExecutionId: AutomationExecutionId,
    SignalType: SignalType,
    Payload: AutomationParameterMap = null
  ): SendAutomationSignalRequest = {
    val __obj = js.Dynamic.literal(AutomationExecutionId = AutomationExecutionId, SignalType = SignalType.asInstanceOf[js.Any])
    if (Payload != null) __obj.updateDynamic("Payload")(Payload)
    __obj.asInstanceOf[SendAutomationSignalRequest]
  }
}

