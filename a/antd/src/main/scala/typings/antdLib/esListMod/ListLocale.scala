package typings
package antdLib.esListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLocale extends js.Object {
  var emptyText: reactLib.reactMod.ReactNode | js.Function0[reactLib.reactMod.ReactNode]
}

object ListLocale {
  @scala.inline
  def apply(emptyText: reactLib.reactMod.ReactNode | js.Function0[reactLib.reactMod.ReactNode]): ListLocale = {
    val __obj = js.Dynamic.literal(emptyText = emptyText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListLocale]
  }
}

