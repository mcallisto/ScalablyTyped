package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Token extends js.Object {
  /**
    * Converts the provided token into a PaymentMethod to
    * use for the payment.
    */
  var token: java.lang.String
}

object Anon_Token {
  @scala.inline
  def apply(token: java.lang.String): Anon_Token = {
    val __obj = js.Dynamic.literal(token = token)
  
    __obj.asInstanceOf[Anon_Token]
  }
}

