package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofregex extends js.Object {
  def pcre_match(string: java.lang.String, regex: java.lang.String): scala.Double
  def pcre_match_group(string: java.lang.String, num_pcre: scala.Double): scala.Double
}

object Typeofregex {
  @scala.inline
  def apply(
    pcre_match: (java.lang.String, java.lang.String) => scala.Double,
    pcre_match_group: (java.lang.String, scala.Double) => scala.Double
  ): Typeofregex = {
    val __obj = js.Dynamic.literal(pcre_match = js.Any.fromFunction2(pcre_match), pcre_match_group = js.Any.fromFunction2(pcre_match_group))
  
    __obj.asInstanceOf[Typeofregex]
  }
}

