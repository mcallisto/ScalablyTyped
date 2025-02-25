package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the given Amazon Comprehend resource from which you want to remove the tags. 
    */
  var ResourceArn: ComprehendArn
  /**
    * The initial part of a key-value pair that forms a tag being removed from a given resource. For example, a tag with "Sales" as the key might be added to a resource to indicate its use by the sales department. Keys must be unique and cannot be duplicated for a particular resource. 
    */
  var TagKeys: TagKeyList
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: ComprehendArn, TagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

