package typings
package atJupyterlabNotebookLib.libModelfactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@jupyterlab/notebook/lib/modelfactory", "NotebookModelFactory")
@js.native
class NotebookModelFactory protected () extends js.Object {
  /**
    * Construct a new notebook model factory.
    */
  def this(options: atJupyterlabNotebookLib.libModelfactoryMod.NotebookModelFactoryNs.IOptions) = this()
  var _disposed: js.Any = js.native
  /**
    * The content model factory used by the NotebookModelFactory.
    */
  val contentFactory: atJupyterlabNotebookLib.libModelMod.NotebookModelNs.IContentFactory = js.native
  /**
    * The content type of the file.
    */
  val contentType: atJupyterlabServicesLib.libContentsMod.ContentsNs.ContentType = js.native
  /**
    * The format of the file.
    */
  val fileFormat: atJupyterlabServicesLib.libContentsMod.ContentsNs.FileFormat = js.native
  /**
    * Get whether the model factory has been disposed.
    */
  val isDisposed: scala.Boolean = js.native
  /**
    * The name of the model.
    */
  val name: java.lang.String = js.native
  /**
    * Create a new model for a given path.
    *
    * @param languagePreference - An optional kernel language preference.
    *
    * @returns A new document model.
    */
  def createNew(): atJupyterlabNotebookLib.libModelMod.INotebookModel = js.native
  def createNew(languagePreference: java.lang.String): atJupyterlabNotebookLib.libModelMod.INotebookModel = js.native
  def createNew(languagePreference: java.lang.String, modelDB: atJupyterlabObservablesLib.libModeldbMod.IModelDB): atJupyterlabNotebookLib.libModelMod.INotebookModel = js.native
  /**
    * Dispose of the model factory.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Get the preferred kernel language given a path.
    */
  def preferredLanguage(path: java.lang.String): java.lang.String = js.native
}

