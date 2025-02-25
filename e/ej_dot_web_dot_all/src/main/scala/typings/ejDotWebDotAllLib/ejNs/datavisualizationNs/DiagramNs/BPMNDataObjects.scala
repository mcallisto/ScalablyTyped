package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNDataObjects extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNDataObjects")
@js.native
object BPMNDataObjects extends js.Object {
  //Used to notate the Input type BPMN data object
  @js.native
  sealed trait Input
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNDataObjects
  
  //Used to set BPMN data object type as None
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNDataObjects
  
  //Used to notate the Output type BPMN data object
  @js.native
  sealed trait Output
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNDataObjects
  
  /* 0 */ val Input: Input with scala.Double = js.native
  /* 2 */ val None: None with scala.Double = js.native
  /* 1 */ val Output: Output with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNDataObjects with scala.Double
  ] = js.native
}

