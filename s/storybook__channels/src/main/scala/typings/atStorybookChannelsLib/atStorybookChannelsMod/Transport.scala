package typings
package atStorybookChannelsLib.atStorybookChannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  def send(event: js.Any): scala.Unit
  def setHandler(handler: EventHandler): scala.Unit
}

object Transport {
  @scala.inline
  def apply(send: js.Any => scala.Unit, setHandler: EventHandler => scala.Unit): Transport = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), setHandler = js.Any.fromFunction1(setHandler))
  
    __obj.asInstanceOf[Transport]
  }
}

