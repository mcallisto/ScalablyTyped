package typings
package inboxsdkLib.inboxsdkMod.WidgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerView extends js.Object {
  var destroyed: scala.Boolean = js.native
  def associateComposeView(composeView: inboxsdkLib.inboxsdkMod.ComposeNs.ComposeView, closeWithCompose: scala.Boolean): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def disassociateComposeView(): scala.Unit = js.native
  @JSName("on")
  def on_closing(name: inboxsdkLib.inboxsdkLibStrings.closing, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_preautoclose(
    name: inboxsdkLib.inboxsdkLibStrings.preautoclose,
    cb: js.Function1[/* event */ inboxsdkLib.inboxsdkMod.CommonNs.PreAutoCloseEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_slideAnimationDone(name: inboxsdkLib.inboxsdkLibStrings.slideAnimationDone, cb: js.Function0[scala.Unit]): scala.Unit = js.native
}

