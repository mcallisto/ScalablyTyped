package typings
package coreDashJsLib.shimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/shim", "WeakMap")
@js.native
class WeakMap[K /* <: js.Object */, V] ()
  extends stdLib.WeakMap[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
}

