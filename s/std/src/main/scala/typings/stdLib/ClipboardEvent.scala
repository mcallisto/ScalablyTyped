package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events providing information related to modification of the clipboard, that is cut, copy, and paste events. */
@js.native
trait ClipboardEvent extends Event {
  val clipboardData: DataTransfer | scala.Null = js.native
}

@JSGlobal("ClipboardEvent")
@js.native
class ClipboardEventCls protected () extends ClipboardEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: ClipboardEventInit) = this()
}

@JSGlobal("ClipboardEvent")
@js.native
object ClipboardEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, ClipboardEvent]
     with org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ ClipboardEventInit, ClipboardEvent]

