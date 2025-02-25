package typings
package minecraftDashScriptingDashTypesDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to display a chat message to the specific player that is running the client script. The event data is the message to be displayed in plain text. Special formatting is supported the same way it would be if a player was sending the message.
  */
trait IDisplayChatParameters extends js.Object {
  /**
    * The chat message that will be displayed
    */
  var message: java.lang.String
}

object IDisplayChatParameters {
  @scala.inline
  def apply(message: java.lang.String): IDisplayChatParameters = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[IDisplayChatParameters]
  }
}

