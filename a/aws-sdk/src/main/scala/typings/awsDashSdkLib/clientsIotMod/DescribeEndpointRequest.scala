package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEndpointRequest extends js.Object {
  /**
    * The endpoint type. Valid endpoint types include:    iot:Data - Returns a VeriSign signed data endpoint.      iot:Data-ATS - Returns an ATS signed data endpoint.      iot:CredentialProvider - Returns an AWS IoT credentials provider API endpoint.      iot:Jobs - Returns an AWS IoT device management Jobs API endpoint.  
    */
  var endpointType: js.UndefOr[EndpointType] = js.undefined
}

object DescribeEndpointRequest {
  @scala.inline
  def apply(endpointType: EndpointType = null): DescribeEndpointRequest = {
    val __obj = js.Dynamic.literal()
    if (endpointType != null) __obj.updateDynamic("endpointType")(endpointType)
    __obj.asInstanceOf[DescribeEndpointRequest]
  }
}

