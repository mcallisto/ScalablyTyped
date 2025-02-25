package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application, campaign, or segment.
    */
  var ResourceArn: __string
  var TagsModel: awsDashSdkLib.clientsPinpointMod.TagsModel
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: __string, TagsModel: TagsModel): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagsModel = TagsModel)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

