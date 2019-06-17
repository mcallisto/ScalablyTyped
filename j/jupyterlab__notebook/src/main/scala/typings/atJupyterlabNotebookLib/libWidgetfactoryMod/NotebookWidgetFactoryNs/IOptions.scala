package typings
package atJupyterlabNotebookLib.libWidgetfactoryMod.NotebookWidgetFactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to construct a `NotebookWidgetFactory`.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait IOptions[T /* <: atJupyterlabNotebookLib.libPanelMod.NotebookPanel */] extends js.Object {
  /**
    * A notebook panel content factory.
    */
  var contentFactory: atJupyterlabNotebookLib.libPanelMod.NotebookPanelNs.IContentFactory
  /**
    * The notebook cell editor configuration.
    */
  var editorConfig: js.UndefOr[atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.IEditorConfig] = js.undefined
  /**
    * The service used to look up mime types.
    */
  var mimeTypeService: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService */ js.Any
  var rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply[T /* <: atJupyterlabNotebookLib.libPanelMod.NotebookPanel */](
    contentFactory: atJupyterlabNotebookLib.libPanelMod.NotebookPanelNs.IContentFactory,
    mimeTypeService: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService */ js.Any,
    rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry,
    editorConfig: atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.IEditorConfig = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(contentFactory = contentFactory, mimeTypeService = mimeTypeService, rendermime = rendermime)
    if (editorConfig != null) __obj.updateDynamic("editorConfig")(editorConfig)
    __obj.asInstanceOf[IOptions[T]]
  }
}

