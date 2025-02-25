package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountSettings extends js.Object {
  /**
    * Setting that stops or starts remote control of shared screens during meetings.
    */
  var DisableRemoteControl: js.UndefOr[Boolean] = js.undefined
  /**
    * Setting that allows meeting participants to choose the Call me at a phone number option. For more information, see Join a Meeting without the Amazon Chime App.
    */
  var EnableDialOut: js.UndefOr[Boolean] = js.undefined
}

object AccountSettings {
  @scala.inline
  def apply(
    DisableRemoteControl: js.UndefOr[Boolean] = js.undefined,
    EnableDialOut: js.UndefOr[Boolean] = js.undefined
  ): AccountSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DisableRemoteControl)) __obj.updateDynamic("DisableRemoteControl")(DisableRemoteControl)
    if (!js.isUndefined(EnableDialOut)) __obj.updateDynamic("EnableDialOut")(EnableDialOut)
    __obj.asInstanceOf[AccountSettings]
  }
}

