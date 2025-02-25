package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Secret extends js.Object {
  /**
    * The name of the secret.
    */
  var name: String
  /**
    * The secret to expose to the container. The supported values are either the full ARN of the AWS Secrets Manager secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.  If the AWS Systems Manager Parameter Store parameter exists in the same Region as the task you are launching, then you can use either the full ARN or name of the parameter. If the parameter exists in a different Region, then the full ARN must be specified. 
    */
  var valueFrom: String
}

object Secret {
  @scala.inline
  def apply(name: String, valueFrom: String): Secret = {
    val __obj = js.Dynamic.literal(name = name, valueFrom = valueFrom)
  
    __obj.asInstanceOf[Secret]
  }
}

