package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConfigurationSetResponse extends js.Object {
  /**
    * The name of the configuration set.
    */
  var ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined
  /**
    * An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
    */
  var DeliveryOptions: js.UndefOr[DeliveryOptions] = js.undefined
  /**
    * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the emails that you send that use the configuration set.
    */
  var ReputationOptions: js.UndefOr[ReputationOptions] = js.undefined
  /**
    * An object that defines whether or not Amazon Pinpoint can send email that you send using the configuration set.
    */
  var SendingOptions: js.UndefOr[SendingOptions] = js.undefined
  /**
    * An array of objects that define the tags (keys and values) that are associated with the configuration set.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * An object that defines the open and click tracking options for emails that you send using the configuration set.
    */
  var TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined
}

object GetConfigurationSetResponse {
  @scala.inline
  def apply(
    ConfigurationSetName: ConfigurationSetName = null,
    DeliveryOptions: DeliveryOptions = null,
    ReputationOptions: ReputationOptions = null,
    SendingOptions: SendingOptions = null,
    Tags: TagList = null,
    TrackingOptions: TrackingOptions = null
  ): GetConfigurationSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationSetName != null) __obj.updateDynamic("ConfigurationSetName")(ConfigurationSetName)
    if (DeliveryOptions != null) __obj.updateDynamic("DeliveryOptions")(DeliveryOptions)
    if (ReputationOptions != null) __obj.updateDynamic("ReputationOptions")(ReputationOptions)
    if (SendingOptions != null) __obj.updateDynamic("SendingOptions")(SendingOptions)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TrackingOptions != null) __obj.updateDynamic("TrackingOptions")(TrackingOptions)
    __obj.asInstanceOf[GetConfigurationSetResponse]
  }
}

