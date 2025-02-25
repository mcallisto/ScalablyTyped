package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenGetPortalPlacement extends js.Object {
  /** The children to be rendered. */
  var children: reactLib.reactMod.ReactElement
  /** Props to be passed to the menu wrapper. */
  var innerProps: js.Object
  /** Set the maximum height of the menu. */
  var maxMenuHeight: scala.Double
  /** Set whether the menu should be at the top, at the bottom. The auto options sets it to bottom. */
  var menuPlacement: reactDashSelectLib.srcTypesMod.MenuPlacement
  /* The CSS position value of the menu, when "fixed" extra layout management is required */
  var menuPosition: reactDashSelectLib.srcTypesMod.MenuPosition
  /** Set whether the page should scroll to show the menu. */
  var menuShouldScrollIntoView: scala.Boolean
  /** Set the minimum height of the menu. */
  var minMenuHeight: scala.Double
  /** Callback to update the portal after possible flip. */
  def getPortalPlacement(state: reactDashSelectLib.srcComponentsMenuMod.MenuState): scala.Unit
}

object Anon_ChildrenGetPortalPlacement {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactElement,
    getPortalPlacement: reactDashSelectLib.srcComponentsMenuMod.MenuState => scala.Unit,
    innerProps: js.Object,
    maxMenuHeight: scala.Double,
    menuPlacement: reactDashSelectLib.srcTypesMod.MenuPlacement,
    menuPosition: reactDashSelectLib.srcTypesMod.MenuPosition,
    menuShouldScrollIntoView: scala.Boolean,
    minMenuHeight: scala.Double
  ): Anon_ChildrenGetPortalPlacement = {
    val __obj = js.Dynamic.literal(children = children, getPortalPlacement = js.Any.fromFunction1(getPortalPlacement), innerProps = innerProps, maxMenuHeight = maxMenuHeight, menuPlacement = menuPlacement, menuPosition = menuPosition, menuShouldScrollIntoView = menuShouldScrollIntoView, minMenuHeight = minMenuHeight)
  
    __obj.asInstanceOf[Anon_ChildrenGetPortalPlacement]
  }
}

