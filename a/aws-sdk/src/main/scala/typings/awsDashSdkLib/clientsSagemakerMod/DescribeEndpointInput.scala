package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEndpointInput extends js.Object {
  /**
    * The name of the endpoint.
    */
  var EndpointName: awsDashSdkLib.clientsSagemakerMod.EndpointName
}

object DescribeEndpointInput {
  @scala.inline
  def apply(EndpointName: EndpointName): DescribeEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName)
  
    __obj.asInstanceOf[DescribeEndpointInput]
  }
}

