package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coordinateMod {
  type Coordinate = js.Array[scala.Double]
  type CoordinateFormat = js.Function1[/* p0 */ Coordinate, java.lang.String]
}
