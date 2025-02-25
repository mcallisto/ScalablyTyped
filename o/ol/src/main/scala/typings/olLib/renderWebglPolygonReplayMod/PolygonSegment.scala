package typings
package olLib.renderWebglPolygonReplayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonSegment extends js.Object {
  var p0: PolygonVertex
  var p1: PolygonVertex
}

object PolygonSegment {
  @scala.inline
  def apply(p0: PolygonVertex, p1: PolygonVertex): PolygonSegment = {
    val __obj = js.Dynamic.literal(p0 = p0, p1 = p1)
  
    __obj.asInstanceOf[PolygonSegment]
  }
}

