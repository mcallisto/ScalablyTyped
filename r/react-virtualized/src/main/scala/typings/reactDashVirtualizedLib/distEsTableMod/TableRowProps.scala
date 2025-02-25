package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowProps extends js.Object {
  var className: java.lang.String
  var columns: js.Array[_]
  var index: scala.Double
  var isScrolling: scala.Boolean
  var onRowClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, scala.Unit]] = js.undefined
  var onRowDoubleClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, scala.Unit]] = js.undefined
  var onRowMouseOut: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, scala.Unit]] = js.undefined
  var onRowMouseOver: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, scala.Unit]] = js.undefined
  var onRowRightClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, scala.Unit]] = js.undefined
  var rowData: js.Any
  var style: js.Any
}

object TableRowProps {
  @scala.inline
  def apply(
    className: java.lang.String,
    columns: js.Array[_],
    index: scala.Double,
    isScrolling: scala.Boolean,
    rowData: js.Any,
    style: js.Any,
    onRowClick: /* params */ RowMouseEventHandlerParams => scala.Unit = null,
    onRowDoubleClick: /* params */ RowMouseEventHandlerParams => scala.Unit = null,
    onRowMouseOut: /* params */ RowMouseEventHandlerParams => scala.Unit = null,
    onRowMouseOver: /* params */ RowMouseEventHandlerParams => scala.Unit = null,
    onRowRightClick: /* params */ RowMouseEventHandlerParams => scala.Unit = null
  ): TableRowProps = {
    val __obj = js.Dynamic.literal(className = className, columns = columns, index = index, isScrolling = isScrolling, rowData = rowData, style = style)
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction1(onRowClick))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction1(onRowDoubleClick))
    if (onRowMouseOut != null) __obj.updateDynamic("onRowMouseOut")(js.Any.fromFunction1(onRowMouseOut))
    if (onRowMouseOver != null) __obj.updateDynamic("onRowMouseOver")(js.Any.fromFunction1(onRowMouseOver))
    if (onRowRightClick != null) __obj.updateDynamic("onRowRightClick")(js.Any.fromFunction1(onRowRightClick))
    __obj.asInstanceOf[TableRowProps]
  }
}

