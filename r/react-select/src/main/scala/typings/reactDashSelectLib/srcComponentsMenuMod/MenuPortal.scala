package typings
package reactDashSelectLib.srcComponentsMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/components/Menu", "MenuPortal")
@js.native
class MenuPortal[OptionType] ()
  extends reactLib.reactMod.Component[MenuPortalProps[OptionType], MenuPortalState, js.Any] {
  def getChildContext(): reactDashSelectLib.Anon_GetPortalPlacement = js.native
  // callback for occassions where the menu must "flip"
  def getPortalPlacement(state: MenuState): scala.Unit = js.native
}

/* static members */
@JSImport("react-select/src/components/Menu", "MenuPortal")
@js.native
object MenuPortal extends js.Object {
  var childContextTypes: reactDashSelectLib.Anon_GetPortalPlacement = js.native
}

