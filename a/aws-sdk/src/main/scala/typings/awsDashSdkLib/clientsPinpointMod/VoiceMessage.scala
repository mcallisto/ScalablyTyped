package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceMessage extends js.Object {
  /**
    * The text script for the voice message.
    */
  var Body: js.UndefOr[__string] = js.undefined
  /**
    * The language to use when delivering the message. For a list of supported languages, see the Amazon Polly Developer Guide.
    */
  var LanguageCode: js.UndefOr[__string] = js.undefined
  /**
    * The phone number from the pool or messaging service to send the message from. Although it isn't required, we recommend that you specify the phone number in E.164 format to ensure prompt and accurate delivery.
    */
  var OriginationNumber: js.UndefOr[__string] = js.undefined
  /**
    * The default message variables to use in the voice message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
  /**
    * The name of the voice to use when delivering the message. For a list of supported voices, see the Amazon Polly Developer Guide.
    */
  var VoiceId: js.UndefOr[__string] = js.undefined
}

object VoiceMessage {
  @scala.inline
  def apply(
    Body: __string = null,
    LanguageCode: __string = null,
    OriginationNumber: __string = null,
    Substitutions: MapOfListOf__string = null,
    VoiceId: __string = null
  ): VoiceMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode)
    if (OriginationNumber != null) __obj.updateDynamic("OriginationNumber")(OriginationNumber)
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions)
    if (VoiceId != null) __obj.updateDynamic("VoiceId")(VoiceId)
    __obj.asInstanceOf[VoiceMessage]
  }
}

