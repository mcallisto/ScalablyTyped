package typings
package twilioDashSyncLib.libInterfacesServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notifications extends js.Object {
  var connectionState: js.Any
  def updateToken(token: java.lang.String): js.Promise[Notifications]
}

object Notifications {
  @scala.inline
  def apply(connectionState: js.Any, updateToken: java.lang.String => js.Promise[Notifications]): Notifications = {
    val __obj = js.Dynamic.literal(connectionState = connectionState, updateToken = js.Any.fromFunction1(updateToken))
  
    __obj.asInstanceOf[Notifications]
  }
}

