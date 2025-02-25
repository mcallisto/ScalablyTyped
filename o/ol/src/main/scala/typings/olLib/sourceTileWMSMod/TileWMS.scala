package typings
package olLib.sourceTileWMSMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileWMS
  extends olLib.sourceTileImageMod.default {
  def getGetFeatureInfoUrl(
    coordinate: olLib.coordinateMod.Coordinate,
    resolution: scala.Double,
    projection: olLib.projMod.ProjectionLike,
    params: js.Any
  ): java.lang.String = js.native
  def getParams(): js.Any = js.native
  def updateParams(params: js.Any): scala.Unit = js.native
}

