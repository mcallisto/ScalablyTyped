package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The PageTransitionEvent is fired when a document is being loaded or unloaded. */
@js.native
trait PageTransitionEvent extends Event {
  val persisted: scala.Boolean = js.native
}

@JSGlobal("PageTransitionEvent")
@js.native
class PageTransitionEventCls () extends PageTransitionEvent

@JSGlobal("PageTransitionEvent")
@js.native
object PageTransitionEvent
  extends org.scalablytyped.runtime.Instantiable0[PageTransitionEvent]

