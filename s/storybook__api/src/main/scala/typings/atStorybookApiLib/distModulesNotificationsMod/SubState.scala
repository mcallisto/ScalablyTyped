package typings
package atStorybookApiLib.distModulesNotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubState extends js.Object {
  var notifications: js.Array[Notification]
}

object SubState {
  @scala.inline
  def apply(notifications: js.Array[Notification]): SubState = {
    val __obj = js.Dynamic.literal(notifications = notifications)
  
    __obj.asInstanceOf[SubState]
  }
}

