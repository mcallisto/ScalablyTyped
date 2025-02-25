package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

@JSGlobal("ej.datavisualization.Diagram.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  //Used to align text horizontally on center of node/connector
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.HorizontalAlignment
  
  //Used to align text horizontally on left side of node/connector
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.HorizontalAlignment
  
  //Used to align text horizontally on right side of node/connector
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.HorizontalAlignment
  
  /* 1 */ val Center: Center with scala.Double = js.native
  /* 0 */ val Left: Left with scala.Double = js.native
  /* 2 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.HorizontalAlignment with scala.Double
  ] = js.native
}

