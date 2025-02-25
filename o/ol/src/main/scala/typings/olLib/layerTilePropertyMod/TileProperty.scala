package typings
package olLib.layerTilePropertyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TileProperty extends js.Object

@JSImport("ol/layer/TileProperty", "TileProperty")
@js.native
object TileProperty extends js.Object {
  @js.native
  sealed trait PRELOAD
    extends olLib.layerTilePropertyMod.TileProperty
  
  @js.native
  sealed trait USE_INTERIM_TILES_ON_ERROR
    extends olLib.layerTilePropertyMod.TileProperty
  
}

