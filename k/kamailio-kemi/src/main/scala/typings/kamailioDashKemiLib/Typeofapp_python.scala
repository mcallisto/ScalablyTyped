package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofapp_python extends js.Object {
  def exec(method: java.lang.String): scala.Double
  def exec_p1(method: java.lang.String, p1: java.lang.String): scala.Double
}

object Typeofapp_python {
  @scala.inline
  def apply(
    exec: java.lang.String => scala.Double,
    exec_p1: (java.lang.String, java.lang.String) => scala.Double
  ): Typeofapp_python = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), exec_p1 = js.Any.fromFunction2(exec_p1))
  
    __obj.asInstanceOf[Typeofapp_python]
  }
}

