package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "WebMercatorTilingScheme")
@js.native
class WebMercatorTilingScheme () extends js.Object {
  def this(options: cesiumLib.Anon_EllipsoidNumberOfLevelZeroTilesXNumberOfLevelZeroTilesY) = this()
  var ellipsoid: Ellipsoid = js.native
  var projection: MapProjection = js.native
  var rectangle: Rectangle = js.native
  def getNumberOfXTilesAtLevel(level: scala.Double): scala.Double = js.native
  def getNumberOfYTilesAtLevel(level: scala.Double): scala.Double = js.native
  def positionToTileXY(position: Cartographic, level: scala.Double): Cartesian2 = js.native
  def positionToTileXY(position: Cartographic, level: scala.Double, result: Cartesian2): Cartesian2 = js.native
  def rectangleToNativeRectangle(rectangle: Rectangle): Rectangle = js.native
  def rectangleToNativeRectangle(rectangle: Rectangle, result: Rectangle): Rectangle = js.native
  def tileXYToNativeRectangle(x: scala.Double, y: scala.Double, level: scala.Double): Rectangle = js.native
  def tileXYToNativeRectangle(x: scala.Double, y: scala.Double, level: scala.Double, result: js.Any): Rectangle = js.native
  def tileXYToRectangle(x: scala.Double, y: scala.Double, level: scala.Double): Rectangle = js.native
  def tileXYToRectangle(x: scala.Double, y: scala.Double, level: scala.Double, result: js.Any): Rectangle = js.native
}

