package typings
package atJupyterlabCompleterLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/widget", "Completer")
@js.native
class Completer protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a text completer menu widget.
    */
  def this(options: atJupyterlabCompleterLib.libWidgetMod.CompleterNs.IOptions) = this()
  var _activeIndex: js.Any = js.native
  /**
    * Cycle through the available completer items.
    *
    * #### Notes
    * When the user cycles all the way `down` to the last index, subsequent
    * `down` cycles will remain on the last index. When the user cycles `up` to
    * the first item, subsequent `up` cycles will remain on the first cycle.
    */
  var _cycle: js.Any = js.native
  var _editor: js.Any = js.native
  /**
    * Handle keydown events for the widget.
    */
  var _evtKeydown: js.Any = js.native
  /**
    * Handle mousedown events for the widget.
    */
  var _evtMousedown: js.Any = js.native
  /**
    * Handle scroll events for the widget
    */
  var _evtScroll: js.Any = js.native
  var _model: js.Any = js.native
  /**
    * Populate the completer up to the longest initial subset of items.
    *
    * @returns `true` if a subset match was found and populated.
    */
  var _populateSubset: js.Any = js.native
  var _renderer: js.Any = js.native
  var _resetFlag: js.Any = js.native
  var _selected: js.Any = js.native
  /**
    * Set the visible dimensions of the widget.
    */
  var _setGeometry: js.Any = js.native
  var _visibilityChanged: js.Any = js.native
  /**
    * The editor used by the completion widget.
    */
  var editor: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any) | scala.Null = js.native
  /**
    * The model used by the completer widget.
    */
  var model: atJupyterlabCompleterLib.libWidgetMod.CompleterNs.IModel | scala.Null = js.native
  /**
    * A signal emitted when a selection is made from the completer menu.
    */
  val selected: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, java.lang.String] = js.native
  /**
    * A signal emitted when the completer widget's visibility changes.
    *
    * #### Notes
    * This signal is useful when there are multiple floating widgets that may
    * contend with the same space and ought to be mutually exclusive.
    */
  val visibilityChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * Handle the DOM events for the widget.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the dock panel's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
  /**
    * Handle model state changes.
    */
  /* protected */ def onModelStateChanged(): scala.Unit = js.native
  /**
    * Reset the widget.
    */
  def reset(): scala.Unit = js.native
  /**
    * Emit the selected signal for the current active item and reset.
    */
  def selectActive(): scala.Unit = js.native
}

