package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBasePathMappingRequest extends js.Object {
  /**
    * [Required] The base path name that callers of the API must provide as part of the URL after the domain name. This value must be unique for all of the mappings across a single API. Specify '(none)' if you do not want callers to specify any base path name after the domain name.
    */
  var basePath: String
  /**
    * [Required] The domain name of the BasePathMapping resource to be described.
    */
  var domainName: String
}

object GetBasePathMappingRequest {
  @scala.inline
  def apply(basePath: String, domainName: String): GetBasePathMappingRequest = {
    val __obj = js.Dynamic.literal(basePath = basePath, domainName = domainName)
  
    __obj.asInstanceOf[GetBasePathMappingRequest]
  }
}

