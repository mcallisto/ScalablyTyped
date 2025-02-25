package typings
package sipDotJsLib.libCoreDialogsSubscriptionDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/dialogs/subscription-dialog", "SubscriptionDialog")
@js.native
class SubscriptionDialog protected ()
  extends sipDotJsLib.libCoreDialogsDialogMod.Dialog
     with sipDotJsLib.libCoreSubscriptionSubscriptionMod.Subscription {
  def this(subscriptionEvent: java.lang.String, subscriptionExpires: scala.Double, subscriptionState: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState, core: sipDotJsLib.libCoreUserDashAgentDashCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState) = this()
  def this(subscriptionEvent: java.lang.String, subscriptionExpires: scala.Double, subscriptionState: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState, core: sipDotJsLib.libCoreUserDashAgentDashCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState, delegate: sipDotJsLib.libCoreSubscriptionSubscriptionDashDelegateMod.SubscriptionDelegate) = this()
  var N: js.Any = js.native
  var _autoRefresh: js.Any = js.native
  var _subscriptionEvent: js.Any = js.native
  var _subscriptionExpires: js.Any = js.native
  var _subscriptionExpiresInitial: js.Any = js.native
  var _subscriptionExpiresLastSet: js.Any = js.native
  var _subscriptionRefresh: js.Any = js.native
  var _subscriptionRefreshLastSet: js.Any = js.native
  var _subscriptionState: js.Any = js.native
  /** The subscription id. */
  /* InferMemberOverrides */
  override val id: java.lang.String = js.native
  var logger: js.Any = js.native
  /**
    * Handle in dialog NOTIFY requests.
    * This does not include the first NOTIFY which created the dialog.
    * @param message The incoming NOTIFY request message.
    */
  var onNotify: js.Any = js.native
  var onRefresh: js.Any = js.native
  var onTerminated: js.Any = js.native
  var refreshTimer: js.Any = js.native
  var refreshTimerClear: js.Any = js.native
  var refreshTimerSet: js.Any = js.native
  var stateTransition: js.Any = js.native
  val subscriptionEvent: java.lang.String = js.native
  val subscriptionExpiresInitial: scala.Double = js.native
  /** Number of seconds until subscription auto refresh. */
  val subscriptionRefresh: js.UndefOr[scala.Double] = js.native
  /**
    * When refreshing a subscription, a subscriber starts Timer N, set to
    * 64*T1, when it sends the SUBSCRIBE request.  If this Timer N expires
    * prior to the receipt of a NOTIFY request, the subscriber considers
    * the subscription terminated.  If the subscriber receives a success
    * response to the SUBSCRIBE request that indicates that no NOTIFY
    * request will be generated -- such as the 204 response defined for use
    * with the optional extension described in [RFC5839] -- then it MUST
    * cancel Timer N.
    * https://tools.ietf.org/html/rfc6665#section-4.1.2.2
    */
  var timer_N: js.Any = js.native
  /** Destructor. */
  /* InferMemberOverrides */
  override def dispose(): scala.Unit = js.native
  /**
    * 4.4.1.  Dialog Creation and Termination
    * A subscription is destroyed after a notifier sends a NOTIFY request
    * with a "Subscription-State" of "terminated", or in certain error
    * situations described elsewhere in this document.
    * https://tools.ietf.org/html/rfc6665#section-4.4.1
    */
  def terminate(): scala.Unit = js.native
}

/* static members */
@JSImport("sip.js/lib/core/dialogs/subscription-dialog", "SubscriptionDialog")
@js.native
object SubscriptionDialog extends js.Object {
  /**
    * When a UAC receives a response that establishes a dialog, it
    * constructs the state of the dialog.  This state MUST be maintained
    * for the duration of the dialog.
    * https://tools.ietf.org/html/rfc3261#section-12.1.2
    * @param outgoingRequestMessage Outgoing request message for dialog.
    * @param incomingResponseMessage Incoming response message creating dialog.
    */
  def initialDialogStateForSubscription(
    outgoingSubscribeRequestMessage: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage,
    incomingNotifyRequestMessage: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage
  ): sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState = js.native
}

