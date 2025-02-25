package typings
package antdLib.libListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps[T] extends js.Object {
  var bordered: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dataSource: js.UndefOr[js.Array[T]] = js.undefined
  var extra: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var footer: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var grid: js.UndefOr[ListGridType] = js.undefined
  var header: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var itemLayout: js.UndefOr[ListItemLayout] = js.undefined
  var loadMore: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var loading: js.UndefOr[scala.Boolean | antdLib.libSpinMod.SpinProps] = js.undefined
  var locale: js.UndefOr[ListLocale] = js.undefined
  var pagination: js.UndefOr[
    antdLib.libPaginationPaginationMod.PaginationConfig | antdLib.antdLibNumbers.`false`
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var renderItem: js.UndefOr[
    js.Function2[/* item */ T, /* index */ scala.Double, reactLib.reactMod.ReactNode]
  ] = js.undefined
  var rowKey: js.UndefOr[(js.Function1[/* item */ T, java.lang.String]) | java.lang.String] = js.undefined
  var size: js.UndefOr[ListSize] = js.undefined
  var split: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object ListProps {
  @scala.inline
  def apply[T](
    bordered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    dataSource: js.Array[T] = null,
    extra: reactLib.reactMod.ReactNode = null,
    footer: reactLib.reactMod.ReactNode = null,
    grid: ListGridType = null,
    header: reactLib.reactMod.ReactNode = null,
    id: java.lang.String = null,
    itemLayout: ListItemLayout = null,
    loadMore: reactLib.reactMod.ReactNode = null,
    loading: scala.Boolean | antdLib.libSpinMod.SpinProps = null,
    locale: ListLocale = null,
    pagination: antdLib.libPaginationPaginationMod.PaginationConfig | antdLib.antdLibNumbers.`false` = null,
    prefixCls: java.lang.String = null,
    renderItem: (/* item */ T, /* index */ scala.Double) => reactLib.reactMod.ReactNode = null,
    rowKey: (js.Function1[/* item */ T, java.lang.String]) | java.lang.String = null,
    size: ListSize = null,
    split: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
  ): ListProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemLayout != null) __obj.updateDynamic("itemLayout")(itemLayout)
    if (loadMore != null) __obj.updateDynamic("loadMore")(loadMore.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2(renderItem))
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ListProps[T]]
  }
}

