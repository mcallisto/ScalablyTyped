package typings
package sipDotJsLib.libCoreTransactionsNonDashInviteDashServerDashTransactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transactions/non-invite-server-transaction", "NonInviteServerTransaction")
@js.native
class NonInviteServerTransaction protected ()
  extends sipDotJsLib.libCoreTransactionsServerDashTransactionMod.ServerTransaction {
  /**
    * Constructor.
    * After construction the transaction will be in the "trying": state and the transaction
    * `id` will equal the branch parameter set in the Via header of the incoming request.
    * https://tools.ietf.org/html/rfc3261#section-17.2.2
    * @param request Incoming Non-INVITE request from the transport.
    * @param transport The transport.
    * @param user The transaction user.
    */
  def this(request: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, transport: sipDotJsLib.libCoreTransportMod.Transport, user: sipDotJsLib.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser) = this()
  var J: js.Any = js.native
  var lastResponse: js.Any = js.native
  var stateTransition: js.Any = js.native
  /**
    * The server transaction remains in this state until Timer J fires,
    * at which point it MUST transition to the "Terminated" state.
    * https://tools.ietf.org/html/rfc3261#section-17.2.2
    */
  var timer_J: js.Any = js.native
  /**
    * First, the procedures in [4] are followed, which attempt to deliver the response to a backup.
    * If those should all fail, based on the definition of failure in [4], the server transaction SHOULD
    * inform the TU that a failure has occurred, and SHOULD transition to the terminated state.
    * https://tools.ietf.org/html/rfc3261#section-17.2.4
    */
  /* protected */ def onTransportError(error: stdLib.Error): scala.Unit = js.native
}

