package typings
package atJupyterlabDocregistryLib.libDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget because var conflicts: _disposed, _flags, _layout, _parent, id, layout, parent. Inlined context */ @JSImport("@jupyterlab/docregistry/lib/default", "DocumentWidget")
@js.native
class DocumentWidget[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */, U /* <: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel */] protected ()
  extends atJupyterlabApputilsLib.atJupyterlabApputilsMod.MainAreaWidget[T] {
  def this(options: atJupyterlabDocregistryLib.libDefaultMod.DocumentWidgetNs.IOptions[T, U]) = this()
  /**
    * Handle the dirty state of the context model.
    */
  var _handleDirtyState: js.Any = js.native
  /**
    * Handle a change to the context model state.
    */
  var _onModelStateChanged: js.Any = js.native
  /**
    * Handle a path change.
    */
  var _onPathChanged: js.Any = js.native
  val context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IContext[U] = js.native
}

