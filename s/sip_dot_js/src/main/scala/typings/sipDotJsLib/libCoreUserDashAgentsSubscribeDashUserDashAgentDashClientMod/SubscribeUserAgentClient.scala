package typings
package sipDotJsLib.libCoreUserDashAgentsSubscribeDashUserDashAgentDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sipDotJsLib.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest because var conflicts: delegate, message. Inlined waitNotifyStop */ @JSImport("sip.js/lib/core/user-agents/subscribe-user-agent-client", "SubscribeUserAgentClient")
@js.native
class SubscribeUserAgentClient protected ()
  extends sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashClientMod.UserAgentClient {
  def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage) = this()
  def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, delegate: sipDotJsLib.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequestDelegate) = this()
  /** Timer N Id. */
  var N: js.Any = js.native
  @JSName("delegate")
  var delegate_SubscribeUserAgentClient: js.UndefOr[sipDotJsLib.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequestDelegate] = js.native
  /** Dialog created upon receiving the first NOTIFY. */
  var dialog: js.Any = js.native
  /** Identifier of this user agent client. */
  var subscriberId: js.Any = js.native
  /** Subscription event being targeted. */
  var subscriptionEvent: js.Any = js.native
  /** When the subscription expires. Starts as requested expires and updated on 200 and NOTIFY. */
  var subscriptionExpires: js.Any = js.native
  /** The requested expires for the subscription. */
  var subscriptionExpiresRequested: js.Any = js.native
  /** Subscription state. */
  var subscriptionState: js.Any = js.native
  /**
    * To ensure that subscribers do not wait indefinitely for a
    * subscription to be established, a subscriber starts a Timer N, set to
    * 64*T1, when it sends a SUBSCRIBE request.  If this Timer N expires
    * prior to the receipt of a NOTIFY request, the subscriber considers
    * the subscription failed, and cleans up any state associated with the
    * subscription attempt.
    * https://tools.ietf.org/html/rfc6665#section-4.1.2.4
    */
  var timer_N: js.Any = js.native
  /**
    * Handle out of dialog NOTIFY assoicated with SUBSCRIBE request.
    * This is the first NOTIFY received after the SUBSCRIBE request.
    * @param uas User agent server handling the subscription creating NOTIFY.
    */
  def onNotify(uas: sipDotJsLib.libCoreUserDashAgentsNotifyDashUserDashAgentDashServerMod.NotifyUserAgentServer): scala.Unit = js.native
  def waitNotifyStart(): scala.Unit = js.native
  /** Stop waiting for an inital subscription creating NOTIFY. */
  def waitNotifyStop(): scala.Unit = js.native
}

