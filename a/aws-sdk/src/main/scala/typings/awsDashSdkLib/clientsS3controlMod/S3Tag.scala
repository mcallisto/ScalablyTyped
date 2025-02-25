package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Tag extends js.Object {
  /**
    * 
    */
  var Key: NonEmptyMaxLength1024String
  /**
    * 
    */
  var Value: MaxLength1024String
}

object S3Tag {
  @scala.inline
  def apply(Key: NonEmptyMaxLength1024String, Value: MaxLength1024String): S3Tag = {
    val __obj = js.Dynamic.literal(Key = Key, Value = Value)
  
    __obj.asInstanceOf[S3Tag]
  }
}

