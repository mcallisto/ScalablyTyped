package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDevicesResponse extends js.Object {
  var devices: js.Array[UserDevice]
}

object UserDevicesResponse {
  @scala.inline
  def apply(devices: js.Array[UserDevice]): UserDevicesResponse = {
    val __obj = js.Dynamic.literal(devices = devices)
  
    __obj.asInstanceOf[UserDevicesResponse]
  }
}

