package typings
package atJupyterlabNotebookLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@jupyterlab/notebook/lib/model", "NotebookModel")
@js.native
/**
  * Construct a new notebook model.
  */
class NotebookModel () extends INotebookModel {
  def this(options: atJupyterlabNotebookLib.libModelMod.NotebookModelNs.IOptions) = this()
  var _cells: js.Any = js.native
  var _deletedCells: js.Any = js.native
  /**
    * Make sure we have the required metadata fields.
    */
  var _ensureMetadata: js.Any = js.native
  var _nbformat: js.Any = js.native
  var _nbformatMinor: js.Any = js.native
  /**
    * Handle a change in the cells list.
    */
  var _onCellsChanged: js.Any = js.native
  /**
    * The list of cells in the notebook.
    */
  /* CompleteClass */
  override val cells: atJupyterlabObservablesLib.libUndoablelistMod.IObservableUndoableList[atJupyterlabCellsLib.libModelMod.ICellModel] = js.native
  /**
    * The cell model factory for the notebook.
    */
  /* CompleteClass */
  override val contentFactory: atJupyterlabNotebookLib.libModelMod.NotebookModelNs.IContentFactory = js.native
  /**
    * The default kernel language of the document.
    */
  val defaultKernelLanguage: java.lang.String = js.native
  /**
    * The default kernel name of the document.
    */
  val defaultKernelName: java.lang.String = js.native
  /**
    * The array of deleted cells since the notebook was last run.
    */
  /* CompleteClass */
  override val deletedCells: js.Array[java.lang.String] = js.native
  /**
    * The metadata associated with the notebook.
    */
  /* CompleteClass */
  override val metadata: atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSON = js.native
  /**
    * The major version number of the nbformat.
    */
  /* CompleteClass */
  override val nbformat: scala.Double = js.native
  /**
    * The minor version number of the nbformat.
    */
  /* CompleteClass */
  override val nbformatMinor: scala.Double = js.native
  /**
    * Dispose of the resources held by the model.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromJSON(value: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.INotebookContent): scala.Unit = js.native
  /**
    * Deserialize the model from a string.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromString(value: java.lang.String): scala.Unit = js.native
  /**
    * Initialize the model with its current state.
    */
  def initialize(): scala.Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.INotebookContent = js.native
}

