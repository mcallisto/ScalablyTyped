package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmsilo extends js.Object {
  def mdump(): scala.Double
  def mdump_uri(owner_s: java.lang.String): scala.Double
  def mstore(): scala.Double
  def mstore_uri(owner_s: java.lang.String): scala.Double
}

object Typeofmsilo {
  @scala.inline
  def apply(
    mdump: () => scala.Double,
    mdump_uri: java.lang.String => scala.Double,
    mstore: () => scala.Double,
    mstore_uri: java.lang.String => scala.Double
  ): Typeofmsilo = {
    val __obj = js.Dynamic.literal(mdump = js.Any.fromFunction0(mdump), mdump_uri = js.Any.fromFunction1(mdump_uri), mstore = js.Any.fromFunction0(mstore), mstore_uri = js.Any.fromFunction1(mstore_uri))
  
    __obj.asInstanceOf[Typeofmsilo]
  }
}

