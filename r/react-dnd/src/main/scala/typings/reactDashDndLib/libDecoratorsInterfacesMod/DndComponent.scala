package typings
package reactDashDndLib.libDecoratorsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DndComponent[Props]
  extends reactLib.reactMod.Component[Props, js.Object, js.Any] {
  def getDecoratedComponentInstance(): (reactLib.reactMod.Component[Props, js.Object, _]) | scala.Null = js.native
  def getHandlerId(): dndDashCoreLib.libInterfacesMod.Identifier = js.native
}

