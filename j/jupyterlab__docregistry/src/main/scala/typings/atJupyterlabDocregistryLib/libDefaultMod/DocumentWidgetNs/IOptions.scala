package typings
package atJupyterlabDocregistryLib.libDefaultMod.DocumentWidgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */, U /* <: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel */]
  extends atJupyterlabApputilsLib.libMainareawidgetMod.MainAreaWidgetNs.IOptions[T] {
  var context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IContext[U]
}

object IOptions {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */, U /* <: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel */](
    content: T,
    context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IContext[U],
    node: stdLib.HTMLElement = null,
    reveal: js.Promise[_] = null,
    toolbar: atJupyterlabApputilsLib.libToolbarMod.Toolbar[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget] = null
  ): IOptions[T, U] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], context = context)
    if (node != null) __obj.updateDynamic("node")(node)
    if (reveal != null) __obj.updateDynamic("reveal")(reveal)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[IOptions[T, U]]
  }
}

