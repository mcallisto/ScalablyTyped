package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdialplan extends js.Object {
  def dp_match(dpid: scala.Double, src: java.lang.String): scala.Double
  def dp_replace(dpid: scala.Double, src: java.lang.String, dst: java.lang.String): scala.Double
}

object Typeofdialplan {
  @scala.inline
  def apply(
    dp_match: (scala.Double, java.lang.String) => scala.Double,
    dp_replace: (scala.Double, java.lang.String, java.lang.String) => scala.Double
  ): Typeofdialplan = {
    val __obj = js.Dynamic.literal(dp_match = js.Any.fromFunction2(dp_match), dp_replace = js.Any.fromFunction3(dp_replace))
  
    __obj.asInstanceOf[Typeofdialplan]
  }
}

