package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventItemResponse extends js.Object {
  /**
    * A custom message that's returned in the response as a result of processing the event.
    */
  var Message: js.UndefOr[__string] = js.undefined
  /**
    * The status code that's returned in the response as a result of processing the event. Possible values are: 202, for events that were accepted; and, 400, for events that weren't valid.
    */
  var StatusCode: js.UndefOr[__integer] = js.undefined
}

object EventItemResponse {
  @scala.inline
  def apply(Message: __string = null, StatusCode: js.UndefOr[__integer] = js.undefined): EventItemResponse = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (!js.isUndefined(StatusCode)) __obj.updateDynamic("StatusCode")(StatusCode)
    __obj.asInstanceOf[EventItemResponse]
  }
}

