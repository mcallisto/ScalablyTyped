package typings
package atJupyterlabNotebookLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait INotebookModel extends js.Object {
  /**
    * The list of cells in the notebook.
    */
  val cells: atJupyterlabObservablesLib.libUndoablelistMod.IObservableUndoableList[atJupyterlabCellsLib.libModelMod.ICellModel]
  /**
    * The cell model factory for the notebook.
    */
  val contentFactory: atJupyterlabNotebookLib.libModelMod.NotebookModelNs.IContentFactory
  /**
    * The array of deleted cells since the notebook was last run.
    */
  val deletedCells: js.Array[java.lang.String]
  /**
    * The metadata associated with the notebook.
    */
  val metadata: atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSON
  /**
    * The major version number of the nbformat.
    */
  val nbformat: scala.Double
  /**
    * The minor version number of the nbformat.
    */
  val nbformatMinor: scala.Double
}

object INotebookModel {
  @scala.inline
  def apply(
    cells: atJupyterlabObservablesLib.libUndoablelistMod.IObservableUndoableList[atJupyterlabCellsLib.libModelMod.ICellModel],
    contentFactory: atJupyterlabNotebookLib.libModelMod.NotebookModelNs.IContentFactory,
    deletedCells: js.Array[java.lang.String],
    metadata: atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSON,
    nbformat: scala.Double,
    nbformatMinor: scala.Double
  ): INotebookModel = {
    val __obj = js.Dynamic.literal(cells = cells, contentFactory = contentFactory, deletedCells = deletedCells, metadata = metadata, nbformat = nbformat, nbformatMinor = nbformatMinor)
  
    __obj.asInstanceOf[INotebookModel]
  }
}

