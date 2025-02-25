package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An event sent when the state of contacts with a touch-sensitive surface changes. This surface can be a touch screen or trackpad, for example. The event can describe one or more points of contact with the screen and includes support for detecting movement, addition and removal of contact points, and so forth. */
@js.native
trait TouchEvent extends UIEvent {
  val altKey: scala.Boolean = js.native
  val changedTouches: TouchList = js.native
  val ctrlKey: scala.Boolean = js.native
  val metaKey: scala.Boolean = js.native
  val shiftKey: scala.Boolean = js.native
  val targetTouches: TouchList = js.native
  val touches: TouchList = js.native
}

@JSGlobal("TouchEvent")
@js.native
class TouchEventCls protected () extends TouchEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: TouchEventInit) = this()
}

@JSGlobal("TouchEvent")
@js.native
object TouchEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, TouchEvent]
     with org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ TouchEventInit, TouchEvent]

