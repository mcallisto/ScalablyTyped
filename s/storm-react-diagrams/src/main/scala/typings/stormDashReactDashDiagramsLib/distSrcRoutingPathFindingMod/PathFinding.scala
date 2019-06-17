package typings
package stormDashReactDashDiagramsLib.distSrcRoutingPathFindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathFinding extends js.Object {
  var diagramEngine: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DiagramEngine */ js.Any
  var instance: js.Any
  /**
    * Taking as argument a fully unblocked walking matrix, this method
    * finds a direct path from point A to B.
    */
  def calculateDirectPath(from: stormDashReactDashDiagramsLib.Anon_X, to: stormDashReactDashDiagramsLib.Anon_X): js.Array[js.Array[scala.Double]]
  /**
    * Puts everything together: merges the paths from/to the centre of the ports,
    * with the path calculated around other elements.
    */
  def calculateDynamicPath(
    routingMatrix: js.Array[js.Array[scala.Double]],
    start: stormDashReactDashDiagramsLib.Anon_X,
    end: stormDashReactDashDiagramsLib.Anon_X,
    pathToStart: js.Array[js.Array[scala.Double]],
    pathToEnd: js.Array[js.Array[scala.Double]]
  ): js.Any
  /**
    * Using @link{#calculateDirectPath}'s result as input, we here
    * determine the first walkable point found in the matrix that includes
    * blocked paths.
    */
  def calculateLinkStartEndCoords(matrix: js.Array[js.Array[scala.Double]], path: js.Array[js.Array[scala.Double]]): stormDashReactDashDiagramsLib.Anon_End
}

object PathFinding {
  @scala.inline
  def apply(
    calculateDirectPath: (stormDashReactDashDiagramsLib.Anon_X, stormDashReactDashDiagramsLib.Anon_X) => js.Array[js.Array[scala.Double]],
    calculateDynamicPath: (js.Array[js.Array[scala.Double]], stormDashReactDashDiagramsLib.Anon_X, stormDashReactDashDiagramsLib.Anon_X, js.Array[js.Array[scala.Double]], js.Array[js.Array[scala.Double]]) => js.Any,
    calculateLinkStartEndCoords: (js.Array[js.Array[scala.Double]], js.Array[js.Array[scala.Double]]) => stormDashReactDashDiagramsLib.Anon_End,
    diagramEngine: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DiagramEngine */ js.Any,
    instance: js.Any
  ): PathFinding = {
    val __obj = js.Dynamic.literal(calculateDirectPath = js.Any.fromFunction2(calculateDirectPath), calculateDynamicPath = js.Any.fromFunction5(calculateDynamicPath), calculateLinkStartEndCoords = js.Any.fromFunction2(calculateLinkStartEndCoords), diagramEngine = diagramEngine, instance = instance)
  
    __obj.asInstanceOf[PathFinding]
  }
}

