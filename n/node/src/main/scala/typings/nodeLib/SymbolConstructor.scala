package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolConstructor extends js.Object {
  val asyncIterator: js.Symbol
  val iterator: js.Symbol
  val observable: js.Symbol
}

object SymbolConstructor {
  @scala.inline
  def apply(asyncIterator: js.Symbol, iterator: js.Symbol, observable: js.Symbol): SymbolConstructor = {
    val __obj = js.Dynamic.literal(asyncIterator = asyncIterator, iterator = iterator, observable = observable)
  
    __obj.asInstanceOf[SymbolConstructor]
  }
}

