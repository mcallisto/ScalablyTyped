package typings
package atJupyterlabNotebookLib.libPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@jupyterlab/notebook/lib/panel", "NotebookPanel")
@js.native
class NotebookPanel protected () extends js.Object {
  /**
    * Construct a new notebook panel.
    */
  def this(options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentWidget.IOptions<Notebook, INotebookModel> */ js.Any) = this()
  var _activated: js.Any = js.native
  /**
    * Handle a change in the kernel by updating the document metadata.
    */
  var _onKernelChanged: js.Any = js.native
  /**
    * Update the kernel language.
    */
  var _updateLanguage: js.Any = js.native
  /**
    * Update the kernel spec.
    */
  var _updateSpec: js.Any = js.native
  /**
    * A signal emitted when the panel has been activated.
    */
  val activated: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * The notebook used by the widget.
    */
  val content: atJupyterlabNotebookLib.libWidgetMod.Notebook = js.native
  /**
    * The content factory for the notebook.
    *
    * TODO: deprecate this in favor of the .content attribute
    *
    */
  val contentFactory: atJupyterlabNotebookLib.libWidgetMod.NotebookNs.IContentFactory = js.native
  /**
    * The model for the widget.
    */
  val model: atJupyterlabNotebookLib.libModelMod.INotebookModel = js.native
  /**
    * The rendermime instance for the notebook.
    *
    * TODO: deprecate this in favor of the .content attribute
    *
    */
  val rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry = js.native
  /**
    * The client session used by the panel.
    */
  val session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession = js.native
  /**
    * Dispose of the resources used by the widget.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Handle `'activate-request'` messages.
    */
  /* protected */ def onActivateRequest(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
}

