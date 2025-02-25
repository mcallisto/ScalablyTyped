package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Horizontal extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.Horizontal")
@js.native
object Horizontal extends js.Object {
  //Used to display the tooltip horizontally on center side of rows/columns
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Horizontal
  
  //Used to display the tooltip horizontally on left side of rows/columns
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Horizontal
  
  //Used to display the tooltip horizontally on right side of rows/columns
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Horizontal
  
  /* 1 */ val Center: Center with scala.Double = js.native
  /* 0 */ val Left: Left with scala.Double = js.native
  /* 2 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Horizontal with scala.Double
  ] = js.native
}

