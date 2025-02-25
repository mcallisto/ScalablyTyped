package typings
package sipDotJsLib.libCoreUserDashAgentsInviteDashUserDashAgentDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sipDotJsLib.libCoreMessagesMethodsInviteMod.IncomingInviteRequest because var conflicts: delegate, message. Inlined  */ @JSImport("sip.js/lib/core/user-agents/invite-user-agent-server", "InviteUserAgentServer")
@js.native
class InviteUserAgentServer protected ()
  extends sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashServerMod.UserAgentServer {
  def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
  def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  /** The confirmed dialog, if any. */
  var confirmedDialog: js.Any = js.native
  /** The early dialog, if any. */
  var earlyDialog: js.Any = js.native
}

