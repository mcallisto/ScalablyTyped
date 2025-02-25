package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatItemKind extends js.Object

/** Specifies the type of a chat item. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatItemKind")
@js.native
object ChatItemKind extends js.Object {
  /** A conversation */
  @js.native
  sealed trait conversation
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatItemKind
  
  /** A message */
  @js.native
  sealed trait message
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatItemKind
  
  /* 1 */ val conversation: conversation with scala.Double = js.native
  /* 0 */ val message: message with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatItemKind with scala.Double
  ] = js.native
}

