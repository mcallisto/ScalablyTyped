package typings
package atJupyterlabApputilsLib.libMainareawidgetMod.MainAreaWidgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a main area widget.
  */
trait IOptions[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */]
  extends atPhosphorWidgetsLib.libWidgetMod.WidgetNs.IOptions {
  /**
    * The child widget to wrap.
    */
  var content: T
  /**
    * An optional promise for when the content is ready to be revealed.
    */
  var reveal: js.UndefOr[js.Promise[_]] = js.undefined
  /**
    * The toolbar to use for the widget.  Defaults to an empty toolbar.
    */
  var toolbar: js.UndefOr[
    atJupyterlabApputilsLib.libToolbarMod.Toolbar[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget]
  ] = js.undefined
}

object IOptions {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](
    content: T,
    node: stdLib.HTMLElement = null,
    reveal: js.Promise[_] = null,
    toolbar: atJupyterlabApputilsLib.libToolbarMod.Toolbar[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget] = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (reveal != null) __obj.updateDynamic("reveal")(reveal)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[IOptions[T]]
  }
}

