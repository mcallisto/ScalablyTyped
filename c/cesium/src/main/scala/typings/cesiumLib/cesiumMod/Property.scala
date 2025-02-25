package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Property")
@js.native
abstract class Property () extends js.Object {
  val definitionChanged: Event[js.Array[_]] = js.native
  val isConstant: scala.Boolean = js.native
  def equals(): scala.Boolean = js.native
  def equals(other: Property): scala.Boolean = js.native
  def getValue(time: JulianDate): js.Any = js.native
  def getValue(time: JulianDate, result: js.Any): js.Any = js.native
}

