package typings
package atJupyterlabCellsLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/widget", "RawCell")
@js.native
class RawCell protected () extends Cell {
  /**
    * Construct a raw cell widget.
    */
  def this(options: atJupyterlabCellsLib.libWidgetMod.CellNs.IOptions) = this()
  /**
    * The model used by the widget.
    */
  @JSName("model")
  val model_RawCell: atJupyterlabCellsLib.libModelMod.IRawCellModel = js.native
}

