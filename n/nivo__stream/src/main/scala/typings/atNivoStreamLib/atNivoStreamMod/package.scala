package typings
package atNivoStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoStreamMod {
  type DatumToNumber = js.Function1[/* datum */ Datum, scala.Double]
  type StackFunc[T] = js.Function1[/* data */ js.Array[T], js.Array[js.Array[atNivoStreamLib.Anon_0[T]]]]
  type TooltipFormatter[T] = js.Function1[/* value */ T, reactLib.reactMod.ReactNode]
  type TooltipLabel[T] = js.Function1[/* value */ T, java.lang.String]
}
