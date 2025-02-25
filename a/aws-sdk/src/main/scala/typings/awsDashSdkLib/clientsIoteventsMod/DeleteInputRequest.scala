package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInputRequest extends js.Object {
  /**
    * The name of the input to be deleted.
    */
  var inputName: InputName
}

object DeleteInputRequest {
  @scala.inline
  def apply(inputName: InputName): DeleteInputRequest = {
    val __obj = js.Dynamic.literal(inputName = inputName)
  
    __obj.asInstanceOf[DeleteInputRequest]
  }
}

