package typings
package atPulumiAwsLib.ebsGetDefaultKmsKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDefaultKmsKeyResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Amazon Resource Name (ARN) of the default KMS key uses to encrypt an EBS volume in this region when no key is specified in an API call that creates the volume and encryption by default is enabled.
    */
  val keyArn: java.lang.String
}

object GetDefaultKmsKeyResult {
  @scala.inline
  def apply(id: java.lang.String, keyArn: java.lang.String): GetDefaultKmsKeyResult = {
    val __obj = js.Dynamic.literal(id = id, keyArn = keyArn)
  
    __obj.asInstanceOf[GetDefaultKmsKeyResult]
  }
}

