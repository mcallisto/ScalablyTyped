package typings
package algoliasearchLib.liteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiResponse[T] extends js.Object {
  var results: js.Array[Response[T]]
}

object MultiResponse {
  @scala.inline
  def apply[T](results: js.Array[Response[T]]): MultiResponse[T] = {
    val __obj = js.Dynamic.literal(results = results)
  
    __obj.asInstanceOf[MultiResponse[T]]
  }
}

