package typings
package atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "PendingActions")
@js.native
class PendingActions ()
  extends Plugin[scala.Unit] {
  var first: (scala.Null | atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Observable) with atCkeditorCkeditor5DashCoreLib.Anon_Message = js.native
  val hasAny: scala.Boolean = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[
    stdLib.Iterator[
      atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Observable with atCkeditorCkeditor5DashCoreLib.Anon_Message
    ]
  ] = js.native
  def add(message: java.lang.String): atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Observable with atCkeditorCkeditor5DashCoreLib.Anon_Message = js.native
  def remove(
    action: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Observable with atCkeditorCkeditor5DashCoreLib.Anon_Message
  ): scala.Unit = js.native
}

/* static members */
@JSImport("@ckeditor/ckeditor5-core", "PendingActions")
@js.native
object PendingActions extends js.Object {
  val pluginName: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreLibStrings.PendingActions = js.native
}

