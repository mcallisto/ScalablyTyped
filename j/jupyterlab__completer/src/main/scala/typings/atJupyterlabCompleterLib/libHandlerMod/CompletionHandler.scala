package typings
package atJupyterlabCompleterLib.libHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/handler", "CompletionHandler")
@js.native
class CompletionHandler protected ()
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * Construct a new completion handler for a widget.
    */
  def this(options: atJupyterlabCompleterLib.libHandlerMod.CompletionHandlerNs.IOptions) = this()
  var _connector: js.Any = js.native
  var _editor: js.Any = js.native
  var _enabled: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * Make a completion request.
    */
  var _makeRequest: js.Any = js.native
  /**
    * Receive a completion reply from the connector.
    *
    * @param state - The state of the editor when completion request was made.
    *
    * @param reply - The API response returned for a completion request.
    */
  var _onReply: js.Any = js.native
  var _pending: js.Any = js.native
  /**
    * The completer widget managed by the handler.
    */
  val completer: atJupyterlabCompleterLib.libWidgetMod.Completer = js.native
  /**
    * The data connector used to populate completion requests.
    *
    * #### Notes
    * The only method of this connector that will ever be called is `fetch`, so
    * it is acceptable for the other methods to be simple functions that return
    * rejected promises.
    */
  var connector: atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[
    atJupyterlabCompleterLib.libHandlerMod.CompletionHandlerNs.IReply, 
    scala.Unit, 
    atJupyterlabCompleterLib.libHandlerMod.CompletionHandlerNs.IRequest
  ] = js.native
  /**
    * The editor used by the completion handler.
    */
  var editor: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any) | scala.Null = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Get the state of the text editor at the given position.
    */
  /* protected */ def getState(
    editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any,
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IPosition */ js.Any
  ): atJupyterlabCompleterLib.libWidgetMod.CompleterNs.ITextState = js.native
  /**
    * Invoke the handler and launch a completer.
    */
  def invoke(): scala.Unit = js.native
  /**
    * Handle a completion selected signal from the completion widget.
    */
  /* protected */ def onCompletionSelected(completer: atJupyterlabCompleterLib.libWidgetMod.Completer, value: java.lang.String): scala.Unit = js.native
  /**
    * Handle `invoke-request` messages.
    */
  /* protected */ def onInvokeRequest(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  /**
    * Handle selection changed signal from an editor.
    *
    * #### Notes
    * If a sub-class reimplements this method, then that class must either call
    * its super method or it must take responsibility for adding and removing
    * the completer completable class to the editor host node.
    *
    * Despite the fact that the editor widget adds a class whenever there is a
    * primary selection, this method checks independently for two reasons:
    *
    * 1. The editor widget connects to the same signal to add that class, so
    *    there is no guarantee that the class will be added before this method
    *    is invoked so simply checking for the CSS class's existence is not an
    *    option. Secondarily, checking the editor state should be faster than
    *    querying the DOM in either case.
    * 2. Because this method adds a class that indicates whether completer
    *    functionality ought to be enabled, relying on the behavior of the
    *    `jp-mod-has-primary-selection` to filter out any editors that have
    *    a selection means the semantic meaning of `jp-mod-completer-enabled`
    *    is obscured because there may be cases where the enabled class is added
    *    even though the completer is not available.
    */
  /* protected */ def onSelectionsChanged(): scala.Unit = js.native
  /**
    * Handle a text changed signal from an editor.
    */
  /* protected */ def onTextChanged(): scala.Unit = js.native
  /**
    * Handle a visibility change signal from a completer widget.
    */
  /* protected */ def onVisibilityChanged(completer: atJupyterlabCompleterLib.libWidgetMod.Completer): scala.Unit = js.native
  /**
    * Process a message sent to the completion handler.
    */
  def processMessage(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
}

