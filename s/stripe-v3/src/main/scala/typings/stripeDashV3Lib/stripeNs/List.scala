package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List[T] extends js.Object {
  /**
    * An array containing the actual response elements, paginated by any request parameters.
    */
  var data: js.Array[T]
  /**
    * Whether or not there are more elements available after this set. If false, this set comprises the end of the list.
    */
  var has_more: scala.Boolean
  /**
    * Value is 'list'
    */
  var `object`: stripeDashV3Lib.stripeDashV3LibStrings.list
  /**
    * The URL for accessing this list.
    */
  var url: java.lang.String
}

object List {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    has_more: scala.Boolean,
    `object`: stripeDashV3Lib.stripeDashV3LibStrings.list,
    url: java.lang.String
  ): List[T] = {
    val __obj = js.Dynamic.literal(data = data, has_more = has_more, url = url)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[List[T]]
  }
}

