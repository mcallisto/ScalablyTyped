package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stack extends js.Object {
  var items: js.Array[_]
  def isEmpty(): scala.Boolean
  def peek(): js.Any
  def pop(): js.Any
  def push(items: js.Any): scala.Unit
  def size(): scala.Double
}

object Stack {
  @scala.inline
  def apply(
    isEmpty: () => scala.Boolean,
    items: js.Array[_],
    peek: () => js.Any,
    pop: () => js.Any,
    push: js.Any => scala.Unit,
    size: () => scala.Double
  ): Stack = {
    val __obj = js.Dynamic.literal(isEmpty = js.Any.fromFunction0(isEmpty), items = items, peek = js.Any.fromFunction0(peek), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), size = js.Any.fromFunction0(size))
  
    __obj.asInstanceOf[Stack]
  }
}

