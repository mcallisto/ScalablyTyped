package typings
package truffleDashPrivatekeyDashProviderLib.truffleDashPrivatekeyDashProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyProvider extends js.Object {
  def send(args: js.Any*): js.Any
  def sendAsync(args: js.Any*): scala.Unit
}

object PrivateKeyProvider {
  @scala.inline
  def apply(send: /* repeated */ js.Any => js.Any, sendAsync: /* repeated */ js.Any => scala.Unit): PrivateKeyProvider = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sendAsync = js.Any.fromFunction1(sendAsync))
  
    __obj.asInstanceOf[PrivateKeyProvider]
  }
}

