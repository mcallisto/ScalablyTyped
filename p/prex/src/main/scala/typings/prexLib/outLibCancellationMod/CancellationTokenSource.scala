package typings
package prexLib.outLibCancellationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/cancellation", "CancellationTokenSource")
@js.native
/**
  * Initializes a new instance of a CancellationTokenSource.
  *
  * @param linkedTokens An optional iterable of tokens to which to link this source.
  */
class CancellationTokenSource ()
  extends atEsfxCancelableLib.distMod.CancelableSource {
  def this(linkedTokens: stdLib.Iterable[CancellationToken | atEsfxCancelableLib.distMod.Cancelable]) = this()
  /**
    * Executes the provided callback.
    *
    * @param callback The callback to execute.
    */
  var _executeCallback: js.Any = js.native
  var _linkingRegistrations: js.Any = js.native
  var _registrations: js.Any = js.native
  var _state: js.Any = js.native
  var _token: js.Any = js.native
  /**
    * Unlinks the source from any linked tokens.
    */
  var _unlink: js.Any = js.native
  /**
    * Gets a CancellationToken linked to this source.
    */
  val token: CancellationToken = js.native
  /**
    * Cancels the source, evaluating any registered callbacks. If any callback raises an exception,
    * the exception is propagated to a host specific unhanedle exception mechanism.
    */
  def cancel(): scala.Unit = js.native
  /**
    * Closes the source, preventing the possibility of future cancellation.
    */
  def close(): scala.Unit = js.native
}

