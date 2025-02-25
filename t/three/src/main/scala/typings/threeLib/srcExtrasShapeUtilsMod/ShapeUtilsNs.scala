package typings
package threeLib.srcExtrasShapeUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/ShapeUtils", "ShapeUtils")
@js.native
object ShapeUtilsNs extends js.Object {
  def area(contour: js.Array[threeLib.srcExtrasShapeUtilsMod.Vec2]): scala.Double = js.native
  def isClockWise(pts: js.Array[threeLib.srcExtrasShapeUtilsMod.Vec2]): scala.Boolean = js.native
  def triangulate(contour: js.Array[threeLib.srcExtrasShapeUtilsMod.Vec2], indices: scala.Boolean): js.Array[scala.Double] = js.native
  def triangulateShape(
    contour: js.Array[threeLib.srcExtrasShapeUtilsMod.Vec2],
    holes: js.Array[threeLib.srcExtrasShapeUtilsMod.Vec2]
  ): js.Array[js.Array[scala.Double]] = js.native
}

