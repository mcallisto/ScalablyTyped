package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event properties that are specific to modifications to the Document Object Model (DOM) hierarchy and nodes. */
@js.native
trait MutationEvent extends Event {
  val ADDITION: scala.Double = js.native
  val MODIFICATION: scala.Double = js.native
  val REMOVAL: scala.Double = js.native
  val attrChange: scala.Double = js.native
  val attrName: java.lang.String = js.native
  val newValue: java.lang.String = js.native
  val prevValue: java.lang.String = js.native
  val relatedNode: Node = js.native
  def initMutationEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    relatedNodeArg: Node,
    prevValueArg: java.lang.String,
    newValueArg: java.lang.String,
    attrNameArg: java.lang.String,
    attrChangeArg: scala.Double
  ): scala.Unit = js.native
}

@JSGlobal("MutationEvent")
@js.native
class MutationEventCls () extends MutationEvent

@JSGlobal("MutationEvent")
@js.native
object MutationEvent
  extends org.scalablytyped.runtime.Instantiable0[MutationEvent] {
  val ADDITION: scala.Double = js.native
  val MODIFICATION: scala.Double = js.native
  val REMOVAL: scala.Double = js.native
}

