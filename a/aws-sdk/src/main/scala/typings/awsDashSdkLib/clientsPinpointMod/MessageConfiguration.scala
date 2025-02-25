package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageConfiguration extends js.Object {
  /**
    * The message that the campaign sends through the ADM (Amazon Device Messaging) channel. This message overrides the default message.
    */
  var ADMMessage: js.UndefOr[Message] = js.undefined
  /**
    * The message that the campaign sends through the APNs (Apple Push Notification service) channel. This message overrides the default message.
    */
  var APNSMessage: js.UndefOr[Message] = js.undefined
  /**
    * The message that the campaign sends through the Baidu (Baidu Cloud Push) channel. This message overrides the default message.
    */
  var BaiduMessage: js.UndefOr[Message] = js.undefined
  /**
    * The default message that the campaign sends through all the channels that are configured for the campaign.
    */
  var DefaultMessage: js.UndefOr[Message] = js.undefined
  /**
    * The message that the campaign sends through the email channel.
    */
  var EmailMessage: js.UndefOr[CampaignEmailMessage] = js.undefined
  /**
    * The message that the campaign sends through the GCM channel, which enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message overrides the default message.
    */
  var GCMMessage: js.UndefOr[Message] = js.undefined
  /**
    * The message that the campaign sends through the SMS channel.
    */
  var SMSMessage: js.UndefOr[CampaignSmsMessage] = js.undefined
}

object MessageConfiguration {
  @scala.inline
  def apply(
    ADMMessage: Message = null,
    APNSMessage: Message = null,
    BaiduMessage: Message = null,
    DefaultMessage: Message = null,
    EmailMessage: CampaignEmailMessage = null,
    GCMMessage: Message = null,
    SMSMessage: CampaignSmsMessage = null
  ): MessageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ADMMessage != null) __obj.updateDynamic("ADMMessage")(ADMMessage)
    if (APNSMessage != null) __obj.updateDynamic("APNSMessage")(APNSMessage)
    if (BaiduMessage != null) __obj.updateDynamic("BaiduMessage")(BaiduMessage)
    if (DefaultMessage != null) __obj.updateDynamic("DefaultMessage")(DefaultMessage)
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage)
    if (GCMMessage != null) __obj.updateDynamic("GCMMessage")(GCMMessage)
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage)
    __obj.asInstanceOf[MessageConfiguration]
  }
}

