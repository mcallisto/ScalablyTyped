package typings
package pkijsLib.srcKeyAgreeRecipientIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyAgreeRecipientIdentifier extends js.Object {
  var value: js.Any
  var variant: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object KeyAgreeRecipientIdentifier {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    value: js.Any,
    variant: scala.Double
  ): KeyAgreeRecipientIdentifier = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), value = value, variant = variant)
  
    __obj.asInstanceOf[KeyAgreeRecipientIdentifier]
  }
}

