package typings
package reactDashVirtualizedLib.distEsCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Outer height of Collection is set to "auto". This property should only be
    * used in conjunction with the WindowScroller HOC.
    */
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Number of cells in Collection.
    */
  var cellCount: scala.Double
  /**
    * Responsible for rendering a group of cells given their indices.
    * Should implement the following interface: ({
    *   cellSizeAndPositionGetter:Function,
    *   indices: Array<number>,
    *   cellRenderer: Function
    * }): Array<PropTypes.node>
    */
  var cellGroupRenderer: js.UndefOr[CollectionCellGroupRenderer] = js.undefined
  /**
    * Responsible for rendering a cell given an row and column index.
    * Should implement the following interface: ({ index: number, key: string, style: object }): PropTypes.element
    */
  var cellRenderer: CollectionCellRenderer
  /**
    * Callback responsible for returning size and offset/position information for a given cell (index).
    * ({ index: number }): { height: number, width: number, x: number, y: number }
    */
  var cellSizeAndPositionGetter: CollectionCellSizeAndPositionGetter
  /**
    * Optional custom CSS class name to attach to root Collection element.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  var height: scala.Double
  var horizontalOverscanSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional custom id to attach to root Collection element.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  var noContentRenderer: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  /**
    * Callback invoked whenever the scroll offset changes within the inner
    * scrollable region: ({ clientHeight, clientWidth, scrollHeight, scrollLeft, scrollTop, scrollWidth }): void
    */
  var onScroll: js.UndefOr[js.Function1[/* params */ reactDashVirtualizedLib.distEsGridMod.ScrollParams, _]] = js.undefined
  /**
    * Callback invoked with information about the section of the Collection
    * that was just rendered: ({ indices: Array<number> }): void
    */
  var onSectionRendered: js.UndefOr[
    js.Function1[/* params */ reactDashVirtualizedLib.distEsGridMod.SectionRenderedParams, _]
  ] = js.undefined
  /**
    * Horizontal offset
    */
  var scrollLeft: js.UndefOr[scala.Double] = js.undefined
  /**
    * Controls the alignment of scrolled-to-cells. The default ("auto") scrolls
    * the least amount possible to ensure that the specified cell is fully
    * visible. Use "start" to always align cells to the top/left of the
    * Collection and "end" to align them bottom/right. Use "center" to align
    * specified cell in the middle of container.
    */
  var scrollToAlignment: js.UndefOr[reactDashVirtualizedLib.reactDashVirtualizedMod.Alignment] = js.undefined
  var scrollToCell: js.UndefOr[scala.Double] = js.undefined
  /**
    * Vertical Offset
    */
  var scrollTop: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optionally override the size of the sections a Collection's cells are split into.
    */
  var sectionSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional custom inline style to attach to root Collection element.
    */
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var verticalOverscanSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Width of Collection; this property determines the number of visible
    * (vs virtualized) columns.
    */
  var width: scala.Double
}

object CollectionProps {
  @scala.inline
  def apply(
    cellCount: scala.Double,
    cellRenderer: CollectionCellRenderer,
    cellSizeAndPositionGetter: CollectionCellSizeAndPositionGetter,
    height: scala.Double,
    width: scala.Double,
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `aria-label`: java.lang.String = null,
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    cellGroupRenderer: CollectionCellGroupRenderer = null,
    className: java.lang.String = null,
    horizontalOverscanSize: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    noContentRenderer: () => reactLib.reactMod.Global.JSXNs.Element = null,
    onScroll: /* params */ reactDashVirtualizedLib.distEsGridMod.ScrollParams => _ = null,
    onSectionRendered: /* params */ reactDashVirtualizedLib.distEsGridMod.SectionRenderedParams => _ = null,
    scrollLeft: scala.Int | scala.Double = null,
    scrollToAlignment: reactDashVirtualizedLib.reactDashVirtualizedMod.Alignment = null,
    scrollToCell: scala.Int | scala.Double = null,
    scrollTop: scala.Int | scala.Double = null,
    sectionSize: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    verticalOverscanSize: scala.Int | scala.Double = null
  ): CollectionProps = {
    val __obj = js.Dynamic.literal(cellCount = cellCount, cellRenderer = cellRenderer, cellSizeAndPositionGetter = cellSizeAndPositionGetter, height = height, width = width)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (cellGroupRenderer != null) __obj.updateDynamic("cellGroupRenderer")(cellGroupRenderer)
    if (className != null) __obj.updateDynamic("className")(className)
    if (horizontalOverscanSize != null) __obj.updateDynamic("horizontalOverscanSize")(horizontalOverscanSize.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (noContentRenderer != null) __obj.updateDynamic("noContentRenderer")(js.Any.fromFunction0(noContentRenderer))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSectionRendered != null) __obj.updateDynamic("onSectionRendered")(js.Any.fromFunction1(onSectionRendered))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment)
    if (scrollToCell != null) __obj.updateDynamic("scrollToCell")(scrollToCell.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (sectionSize != null) __obj.updateDynamic("sectionSize")(sectionSize.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (verticalOverscanSize != null) __obj.updateDynamic("verticalOverscanSize")(verticalOverscanSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionProps]
  }
}

