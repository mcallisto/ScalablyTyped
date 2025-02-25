package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait layoutType extends js.Object

@JSGlobal("ej.FileExplorer.layoutType")
@js.native
object layoutType extends js.Object {
  ///Supports to display files in grid view
  @js.native
  sealed trait Grid
    extends ejDotWebDotAllLib.ejNs.FileExplorerNs.layoutType
  
  ///Supports to display files as large icons
  @js.native
  sealed trait LargeIcons
    extends ejDotWebDotAllLib.ejNs.FileExplorerNs.layoutType
  
  ///Supports to display files in tile view
  @js.native
  sealed trait Tile
    extends ejDotWebDotAllLib.ejNs.FileExplorerNs.layoutType
  
  /* 1 */ val Grid: Grid with scala.Double = js.native
  /* 2 */ val LargeIcons: LargeIcons with scala.Double = js.native
  /* 0 */ val Tile: Tile with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.FileExplorerNs.layoutType with scala.Double] = js.native
}

