package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMSChannelResponse extends js.Object {
  /**
    * The unique identifier for the application that the SMS channel applies to.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The date and time, in ISO 8601 format, when the SMS channel was enabled.
    */
  var CreationDate: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether the SMS channel is enabled for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[__boolean] = js.undefined
  /**
    * (Deprecated) An identifier for the SMS channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether the SMS channel is archived.
    */
  var IsArchived: js.UndefOr[__boolean] = js.undefined
  /**
    * The user who last modified the SMS channel.
    */
  var LastModifiedBy: js.UndefOr[__string] = js.undefined
  /**
    * The date and time, in ISO 8601 format, when the SMS channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
  /**
    * The type of messaging or notification platform for the channel. For the SMS channel, this value is SMS.
    */
  var Platform: __string
  /**
    * The maximum number of promotional messages that you can send through the SMS channel each second.
    */
  var PromotionalMessagesPerSecond: js.UndefOr[__integer] = js.undefined
  /**
    * The identity that displays on recipients' devices when they receive messages from the SMS channel.
    */
  var SenderId: js.UndefOr[__string] = js.undefined
  /**
    * The registered short code to use when you send messages through the SMS channel.
    */
  var ShortCode: js.UndefOr[__string] = js.undefined
  /**
    * The maximum number of transactional messages that you can send through the SMS channel each second.
    */
  var TransactionalMessagesPerSecond: js.UndefOr[__integer] = js.undefined
  /**
    * The current version of the SMS channel.
    */
  var Version: js.UndefOr[__integer] = js.undefined
}

object SMSChannelResponse {
  @scala.inline
  def apply(
    Platform: __string,
    ApplicationId: __string = null,
    CreationDate: __string = null,
    Enabled: js.UndefOr[__boolean] = js.undefined,
    HasCredential: js.UndefOr[__boolean] = js.undefined,
    Id: __string = null,
    IsArchived: js.UndefOr[__boolean] = js.undefined,
    LastModifiedBy: __string = null,
    LastModifiedDate: __string = null,
    PromotionalMessagesPerSecond: js.UndefOr[__integer] = js.undefined,
    SenderId: __string = null,
    ShortCode: __string = null,
    TransactionalMessagesPerSecond: js.UndefOr[__integer] = js.undefined,
    Version: js.UndefOr[__integer] = js.undefined
  ): SMSChannelResponse = {
    val __obj = js.Dynamic.literal(Platform = Platform)
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived)
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (!js.isUndefined(PromotionalMessagesPerSecond)) __obj.updateDynamic("PromotionalMessagesPerSecond")(PromotionalMessagesPerSecond)
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId)
    if (ShortCode != null) __obj.updateDynamic("ShortCode")(ShortCode)
    if (!js.isUndefined(TransactionalMessagesPerSecond)) __obj.updateDynamic("TransactionalMessagesPerSecond")(TransactionalMessagesPerSecond)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[SMSChannelResponse]
  }
}

