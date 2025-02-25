package typings
package antdLib.esBreadcrumbBreadcrumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ Route, 
      /* params */ js.Any, 
      /* routes */ js.Array[Route], 
      /* paths */ js.Array[java.lang.String], 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var routes: js.UndefOr[js.Array[Route]] = js.undefined
  var separator: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    itemRender: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[java.lang.String]) => reactLib.reactMod.ReactNode = null,
    params: js.Any = null,
    prefixCls: java.lang.String = null,
    routes: js.Array[Route] = null,
    separator: reactLib.reactMod.ReactNode = null,
    style: reactLib.reactMod.CSSProperties = null
  ): BreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction4(itemRender))
    if (params != null) __obj.updateDynamic("params")(params)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

