package typings
package olLib.styleAtlasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Atlas extends js.Object {
  def add(
    id: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    renderCallback: js.Function3[
      /* p0 */ stdLib.CanvasRenderingContext2D, 
      /* p1 */ scala.Double, 
      /* p2 */ scala.Double, 
      scala.Unit
    ]
  ): AtlasInfo = js.native
  def add(
    id: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    renderCallback: js.Function3[
      /* p0 */ stdLib.CanvasRenderingContext2D, 
      /* p1 */ scala.Double, 
      /* p2 */ scala.Double, 
      scala.Unit
    ],
    opt_this: js.Any
  ): AtlasInfo = js.native
  def get(id: java.lang.String): AtlasInfo = js.native
}

