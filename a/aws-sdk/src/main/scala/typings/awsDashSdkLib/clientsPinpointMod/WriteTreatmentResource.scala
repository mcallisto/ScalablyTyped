package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteTreatmentResource extends js.Object {
  /**
    * The message configuration settings for the treatment.
    */
  var MessageConfiguration: js.UndefOr[MessageConfiguration] = js.undefined
  /**
    * The schedule settings for the treatment.
    */
  var Schedule: js.UndefOr[Schedule] = js.undefined
  /**
    * The allocated percentage of users (segment members) to send the treatment to.
    */
  var SizePercent: __integer
  /**
    * The custom description of the treatment.
    */
  var TreatmentDescription: js.UndefOr[__string] = js.undefined
  /**
    * The custom name of the treatment. A treatment is a variation of a campaign that's used for A/B testing of a campaign.
    */
  var TreatmentName: js.UndefOr[__string] = js.undefined
}

object WriteTreatmentResource {
  @scala.inline
  def apply(
    SizePercent: __integer,
    MessageConfiguration: MessageConfiguration = null,
    Schedule: Schedule = null,
    TreatmentDescription: __string = null,
    TreatmentName: __string = null
  ): WriteTreatmentResource = {
    val __obj = js.Dynamic.literal(SizePercent = SizePercent)
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription)
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName)
    __obj.asInstanceOf[WriteTreatmentResource]
  }
}

