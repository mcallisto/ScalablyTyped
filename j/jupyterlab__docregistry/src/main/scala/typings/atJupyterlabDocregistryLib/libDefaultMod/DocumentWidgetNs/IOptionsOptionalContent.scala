package typings
package atJupyterlabDocregistryLib.libDefaultMod.DocumentWidgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptionsOptionalContent[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */, U /* <: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel */]
  extends atJupyterlabApputilsLib.libMainareawidgetMod.MainAreaWidgetNs.IOptionsOptionalContent[T] {
  var context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IContext[U]
}

object IOptionsOptionalContent {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */, U /* <: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel */](
    context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IContext[U],
    content: T = null,
    node: stdLib.HTMLElement = null,
    reveal: js.Promise[_] = null,
    toolbar: atJupyterlabApputilsLib.libToolbarMod.Toolbar[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget] = null
  ): IOptionsOptionalContent[T, U] = {
    val __obj = js.Dynamic.literal(context = context)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (reveal != null) __obj.updateDynamic("reveal")(reveal)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[IOptionsOptionalContent[T, U]]
  }
}

