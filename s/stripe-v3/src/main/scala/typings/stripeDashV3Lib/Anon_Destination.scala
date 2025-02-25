package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destination extends js.Object {
  /**
    * The account (if any) the payment will be attributed to for tax reporting,
    * and where funds from the payment will be transferred to upon payment success.
    */
  var destination: java.lang.String
}

object Anon_Destination {
  @scala.inline
  def apply(destination: java.lang.String): Anon_Destination = {
    val __obj = js.Dynamic.literal(destination = destination)
  
    __obj.asInstanceOf[Anon_Destination]
  }
}

