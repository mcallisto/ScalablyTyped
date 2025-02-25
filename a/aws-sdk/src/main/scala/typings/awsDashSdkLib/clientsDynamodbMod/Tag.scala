package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The key of the tag. Tag keys are case sensitive. Each DynamoDB table can only have up to one tag with the same key. If you try to add an existing tag (same key), the existing tag value will be updated to the new value. 
    */
  var Key: TagKeyString
  /**
    * The value of the tag. Tag values are case-sensitive and can be null.
    */
  var Value: TagValueString
}

object Tag {
  @scala.inline
  def apply(Key: TagKeyString, Value: TagValueString): Tag = {
    val __obj = js.Dynamic.literal(Key = Key, Value = Value)
  
    __obj.asInstanceOf[Tag]
  }
}

