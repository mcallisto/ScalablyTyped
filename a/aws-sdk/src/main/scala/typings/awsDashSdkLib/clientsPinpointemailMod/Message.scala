package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    * The body of the message. You can specify an HTML version of the message, a text-only version of the message, or both.
    */
  var Body: awsDashSdkLib.clientsPinpointemailMod.Body
  /**
    * The subject line of the email. The subject line can only contain 7-bit ASCII characters. However, you can specify non-ASCII characters in the subject line by using encoded-word syntax, as described in RFC 2047.
    */
  var Subject: Content
}

object Message {
  @scala.inline
  def apply(Body: Body, Subject: Content): Message = {
    val __obj = js.Dynamic.literal(Body = Body, Subject = Subject)
  
    __obj.asInstanceOf[Message]
  }
}

