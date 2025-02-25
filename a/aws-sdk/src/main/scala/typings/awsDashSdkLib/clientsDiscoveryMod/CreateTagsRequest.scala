package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTagsRequest extends js.Object {
  /**
    * A list of configuration items that you want to tag.
    */
  var configurationIds: ConfigurationIdList
  /**
    * Tags that you want to associate with one or more configuration items. Specify the tags that you want to create in a key-value format. For example:  {"key": "serverType", "value": "webServer"} 
    */
  var tags: TagSet
}

object CreateTagsRequest {
  @scala.inline
  def apply(configurationIds: ConfigurationIdList, tags: TagSet): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds, tags = tags)
  
    __obj.asInstanceOf[CreateTagsRequest]
  }
}

