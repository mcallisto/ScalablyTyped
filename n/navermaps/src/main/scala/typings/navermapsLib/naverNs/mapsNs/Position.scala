package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSGlobal("naver.maps.Position")
@js.native
object Position extends js.Object {
  @js.native
  sealed trait BOTTOM_CENTER
    extends navermapsLib.naverNs.mapsNs.Position
  
  @js.native
  sealed trait BOTTOM_LEFT
    extends navermapsLib.naverNs.mapsNs.Position
  
  @js.native
  sealed trait BOTTOM_RIGHT
    extends navermapsLib.naverNs.mapsNs.Position
  
  @js.native
  sealed trait CENTER
    extends navermapsLib.naverNs.mapsNs.Position
  
  @js.native
  sealed trait LEFT_BOTTOM
    extends navermapsLib.naverNs.mapsNs.Position
  
  @js.native
  sealed trait LEFT_CENTER
    extends navermapsLib.naverNs.mapsNs.Position
  
  @js.native
  sealed trait LEFT_TOP
    extends navermapsLib.naverNs.mapsNs.Position
  
  @js.native
  sealed trait RIGHT_BOTTOM
    extends navermapsLib.naverNs.mapsNs.Position
  
  @js.native
  sealed trait RIGHT_CENTER
    extends navermapsLib.naverNs.mapsNs.Position
  
  @js.native
  sealed trait RIGHT_TOP
    extends navermapsLib.naverNs.mapsNs.Position
  
  @js.native
  sealed trait TOP_CENTER
    extends navermapsLib.naverNs.mapsNs.Position
  
  @js.native
  sealed trait TOP_LEFT
    extends navermapsLib.naverNs.mapsNs.Position
  
  @js.native
  sealed trait TOP_RIGHT
    extends navermapsLib.naverNs.mapsNs.Position
  
  /* 10 */ val BOTTOM_CENTER: BOTTOM_CENTER with scala.Double = js.native
  /* 9 */ val BOTTOM_LEFT: BOTTOM_LEFT with scala.Double = js.native
  /* 11 */ val BOTTOM_RIGHT: BOTTOM_RIGHT with scala.Double = js.native
  /* 0 */ val CENTER: CENTER with scala.Double = js.native
  /* 5 */ val LEFT_BOTTOM: LEFT_BOTTOM with scala.Double = js.native
  /* 3 */ val LEFT_CENTER: LEFT_CENTER with scala.Double = js.native
  /* 4 */ val LEFT_TOP: LEFT_TOP with scala.Double = js.native
  /* 8 */ val RIGHT_BOTTOM: RIGHT_BOTTOM with scala.Double = js.native
  /* 7 */ val RIGHT_CENTER: RIGHT_CENTER with scala.Double = js.native
  /* 6 */ val RIGHT_TOP: RIGHT_TOP with scala.Double = js.native
  /* 1 */ val TOP_CENTER: TOP_CENTER with scala.Double = js.native
  /* 0 */ val TOP_LEFT: TOP_LEFT with scala.Double = js.native
  /* 2 */ val TOP_RIGHT: TOP_RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[navermapsLib.naverNs.mapsNs.Position with scala.Double] = js.native
}

