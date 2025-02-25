package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps
  extends GridGapProps[TLengthStyledSystem]
     with GridColumnGapProps[TLengthStyledSystem]
     with GridRowGapProps[TLengthStyledSystem]
     with GridColumnProps
     with GridRowProps
     with GridAutoFlowProps
     with GridAutoColumnsProps[TLengthStyledSystem]
     with GridAutoRowsProps[TLengthStyledSystem]
     with GridTemplateColumnsProps[TLengthStyledSystem]
     with GridTemplateRowsProps[TLengthStyledSystem]
     with GridTemplateAreasProps
     with GridAreaProps

object GridProps {
  @scala.inline
  def apply(
    gridArea: ResponsiveValue[csstypeLib.csstypeMod.GridAreaProperty] = null,
    gridAutoColumns: ResponsiveValue[csstypeLib.csstypeMod.GridAutoColumnsProperty[TLengthStyledSystem]] = null,
    gridAutoFlow: ResponsiveValue[csstypeLib.csstypeMod.GridAutoFlowProperty] = null,
    gridAutoRows: ResponsiveValue[csstypeLib.csstypeMod.GridAutoRowsProperty[TLengthStyledSystem]] = null,
    gridColumn: ResponsiveValue[csstypeLib.csstypeMod.GridColumnProperty] = null,
    gridColumnGap: ResponsiveValue[csstypeLib.csstypeMod.GridColumnGapProperty[TLengthStyledSystem]] = null,
    gridGap: ResponsiveValue[csstypeLib.csstypeMod.GridGapProperty[TLengthStyledSystem]] = null,
    gridRow: ResponsiveValue[csstypeLib.csstypeMod.GridRowProperty] = null,
    gridRowGap: ResponsiveValue[csstypeLib.csstypeMod.GridRowGapProperty[TLengthStyledSystem]] = null,
    gridTemplateAreas: ResponsiveValue[csstypeLib.csstypeMod.GridTemplateAreasProperty] = null,
    gridTemplateColumns: ResponsiveValue[csstypeLib.csstypeMod.GridTemplateColumnsProperty[TLengthStyledSystem]] = null,
    gridTemplateRows: ResponsiveValue[csstypeLib.csstypeMod.GridTemplateRowsProperty[TLengthStyledSystem]] = null
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (gridAutoColumns != null) __obj.updateDynamic("gridAutoColumns")(gridAutoColumns.asInstanceOf[js.Any])
    if (gridAutoFlow != null) __obj.updateDynamic("gridAutoFlow")(gridAutoFlow.asInstanceOf[js.Any])
    if (gridAutoRows != null) __obj.updateDynamic("gridAutoRows")(gridAutoRows.asInstanceOf[js.Any])
    if (gridColumn != null) __obj.updateDynamic("gridColumn")(gridColumn.asInstanceOf[js.Any])
    if (gridColumnGap != null) __obj.updateDynamic("gridColumnGap")(gridColumnGap.asInstanceOf[js.Any])
    if (gridGap != null) __obj.updateDynamic("gridGap")(gridGap.asInstanceOf[js.Any])
    if (gridRow != null) __obj.updateDynamic("gridRow")(gridRow.asInstanceOf[js.Any])
    if (gridRowGap != null) __obj.updateDynamic("gridRowGap")(gridRowGap.asInstanceOf[js.Any])
    if (gridTemplateAreas != null) __obj.updateDynamic("gridTemplateAreas")(gridTemplateAreas.asInstanceOf[js.Any])
    if (gridTemplateColumns != null) __obj.updateDynamic("gridTemplateColumns")(gridTemplateColumns.asInstanceOf[js.Any])
    if (gridTemplateRows != null) __obj.updateDynamic("gridTemplateRows")(gridTemplateRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
}

