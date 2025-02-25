package typings
package atBlueprintjsTableLib.libEsmColumnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnProps
  extends atBlueprintjsTableLib.libEsmHeadersColumnHeaderCellMod.IColumnNameProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * An instance of `ICellRenderer`, a function that takes a row and column
    * index, and returns a `Cell` React element.
    */
  var cellRenderer: js.UndefOr[atBlueprintjsTableLib.libEsmCellCellMod.ICellRenderer] = js.undefined
  /**
    * An instance of `IColumnHeaderRenderer`, a function that takes a column
    * index and returns a `ColumnHeaderCell` React element.
    */
  var columnHeaderCellRenderer: js.UndefOr[atBlueprintjsTableLib.libEsmHeadersColumnHeaderMod.IColumnHeaderRenderer] = js.undefined
  /**
    * A unique ID, similar to React's `key`. This is used, for example, to
    * maintain the width of a column between re-ordering and rendering. If no
    * IDs are provided, widths will be persisted across renders using a
    * column's index only. Columns widths can also be persisted outside the
    * `Table` component, then passed in with the `columnWidths` prop.
    */
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Set this prop to specify whether to render the loading state of the
    * column header and cells in this column. Column-level `loadingOptions`
    * override `Table`-level `loadingOptions`. For example, if you set
    * `loadingOptions=[ TableLoadingOption.CELLS ]` on `Table` and
    * `loadingOptions=[ ColumnLoadingOption.HEADER ]` on a `Column`, the cells
    * in that column will _not_ show their loading state.
    */
  var loadingOptions: js.UndefOr[js.Array[atBlueprintjsTableLib.libEsmRegionsMod.ColumnLoadingOption]] = js.undefined
}

object IColumnProps {
  @scala.inline
  def apply(
    cellRenderer: atBlueprintjsTableLib.libEsmCellCellMod.ICellRenderer = null,
    className: java.lang.String = null,
    columnHeaderCellRenderer: atBlueprintjsTableLib.libEsmHeadersColumnHeaderMod.IColumnHeaderRenderer = null,
    id: java.lang.String | scala.Double = null,
    loadingOptions: js.Array[atBlueprintjsTableLib.libEsmRegionsMod.ColumnLoadingOption] = null,
    name: java.lang.String = null,
    nameRenderer: (/* name */ java.lang.String, /* index */ js.UndefOr[scala.Double]) => reactLib.reactMod.ReactElement = null
  ): IColumnProps = {
    val __obj = js.Dynamic.literal()
    if (cellRenderer != null) __obj.updateDynamic("cellRenderer")(cellRenderer)
    if (className != null) __obj.updateDynamic("className")(className)
    if (columnHeaderCellRenderer != null) __obj.updateDynamic("columnHeaderCellRenderer")(columnHeaderCellRenderer)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loadingOptions != null) __obj.updateDynamic("loadingOptions")(loadingOptions)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nameRenderer != null) __obj.updateDynamic("nameRenderer")(js.Any.fromFunction2(nameRenderer))
    __obj.asInstanceOf[IColumnProps]
  }
}

