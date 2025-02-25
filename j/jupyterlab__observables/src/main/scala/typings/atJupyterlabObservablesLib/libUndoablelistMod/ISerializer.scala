package typings
package atJupyterlabObservablesLib.libUndoablelistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISerializer[T] extends js.Object {
  /**
    * Deserialize the object from JSON.
    */
  def fromJSON(value: atPhosphorCoreutilsLib.libJsonMod.JSONValue): T
  /**
    * Convert the object to JSON.
    */
  def toJSON(value: T): atPhosphorCoreutilsLib.libJsonMod.JSONValue
}

object ISerializer {
  @scala.inline
  def apply[T](
    fromJSON: atPhosphorCoreutilsLib.libJsonMod.JSONValue => T,
    toJSON: T => atPhosphorCoreutilsLib.libJsonMod.JSONValue
  ): ISerializer[T] = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), toJSON = js.Any.fromFunction1(toJSON))
  
    __obj.asInstanceOf[ISerializer[T]]
  }
}

