package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestValidators extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfRequestValidator] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object RequestValidators {
  @scala.inline
  def apply(items: ListOfRequestValidator = null, position: String = null): RequestValidators = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[RequestValidators]
  }
}

