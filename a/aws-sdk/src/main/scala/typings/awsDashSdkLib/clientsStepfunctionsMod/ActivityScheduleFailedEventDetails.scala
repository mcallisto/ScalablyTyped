package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityScheduleFailedEventDetails extends js.Object {
  /**
    * A more detailed explanation of the cause of the failure.
    */
  var cause: js.UndefOr[SensitiveCause] = js.undefined
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.undefined
}

object ActivityScheduleFailedEventDetails {
  @scala.inline
  def apply(cause: SensitiveCause = null, error: SensitiveError = null): ActivityScheduleFailedEventDetails = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[ActivityScheduleFailedEventDetails]
  }
}

