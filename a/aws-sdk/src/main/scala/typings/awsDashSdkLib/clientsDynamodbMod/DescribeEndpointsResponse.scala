package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEndpointsResponse extends js.Object {
  /**
    * List of endpoints.
    */
  var Endpoints: awsDashSdkLib.clientsDynamodbMod.Endpoints
}

object DescribeEndpointsResponse {
  @scala.inline
  def apply(Endpoints: Endpoints): DescribeEndpointsResponse = {
    val __obj = js.Dynamic.literal(Endpoints = Endpoints)
  
    __obj.asInstanceOf[DescribeEndpointsResponse]
  }
}

