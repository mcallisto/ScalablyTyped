package typings
package jsonqueryLib.jsonqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonquery", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](query: Query[T]): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def `match`[T](haystack: T, predicate: Query[T]): scala.Boolean = js.native
}

