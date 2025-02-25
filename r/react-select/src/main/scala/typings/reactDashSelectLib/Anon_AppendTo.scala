package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppendTo extends js.Object {
  var appendTo: stdLib.HTMLElement
  var children: reactLib.reactMod.ReactNode
   // ideally Menu<MenuProps>
  var controlElement: stdLib.HTMLElement
  var menuPlacement: reactDashSelectLib.srcTypesMod.MenuPlacement
  var menuPosition: reactDashSelectLib.srcTypesMod.MenuPosition
}

object Anon_AppendTo {
  @scala.inline
  def apply(
    appendTo: stdLib.HTMLElement,
    children: reactLib.reactMod.ReactNode,
    controlElement: stdLib.HTMLElement,
    menuPlacement: reactDashSelectLib.srcTypesMod.MenuPlacement,
    menuPosition: reactDashSelectLib.srcTypesMod.MenuPosition
  ): Anon_AppendTo = {
    val __obj = js.Dynamic.literal(appendTo = appendTo, children = children.asInstanceOf[js.Any], controlElement = controlElement, menuPlacement = menuPlacement, menuPosition = menuPosition)
  
    __obj.asInstanceOf[Anon_AppendTo]
  }
}

