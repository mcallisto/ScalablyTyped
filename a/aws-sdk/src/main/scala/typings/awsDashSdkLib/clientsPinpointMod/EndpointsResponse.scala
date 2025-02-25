package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointsResponse extends js.Object {
  /**
    * An array of responses, one for each endpoint that's associated with the user ID.
    */
  var Item: ListOfEndpointResponse
}

object EndpointsResponse {
  @scala.inline
  def apply(Item: ListOfEndpointResponse): EndpointsResponse = {
    val __obj = js.Dynamic.literal(Item = Item)
  
    __obj.asInstanceOf[EndpointsResponse]
  }
}

