package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOfferingsRequest extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListOfferingsRequest {
  @scala.inline
  def apply(nextToken: PaginationToken = null): ListOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListOfferingsRequest]
  }
}

