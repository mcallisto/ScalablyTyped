package typings
package atBlueprintjsTableLib.libEsmHeadersRowHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowHeaderProps
  extends atBlueprintjsTableLib.libEsmHeadersHeaderMod.IHeaderProps
     with IRowHeights
     with atBlueprintjsTableLib.libEsmCommonGridMod.IRowIndices {
  /**
    * A callback invoked when user is done resizing the column
    */
  var onRowHeightChanged: atBlueprintjsTableLib.libEsmInteractionsResizableMod.IIndexedResizeCallback = js.native
  /**
    * Renders the cell for each row header
    */
  var rowHeaderCellRenderer: js.UndefOr[IRowHeaderRenderer] = js.native
}

