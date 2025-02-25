package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutLoggingOptionsRequest extends js.Object {
  /**
    * The new values of the AWS IoT Events logging options.
    */
  var loggingOptions: LoggingOptions
}

object PutLoggingOptionsRequest {
  @scala.inline
  def apply(loggingOptions: LoggingOptions): PutLoggingOptionsRequest = {
    val __obj = js.Dynamic.literal(loggingOptions = loggingOptions)
  
    __obj.asInstanceOf[PutLoggingOptionsRequest]
  }
}

