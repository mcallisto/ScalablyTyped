package typings
package cycledLib.cycledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cycled[T]
  extends stdLib.Array[T] {
  /**
  	Get or set the current index.
  	*/
  var index: scala.Double = js.native
  /**
  	Returns the current item.
  	*/
  def current(): T = js.native
  /**
  	Returns an iterable that will cycle through the array indefinitely.
  	*/
  def indefinitely(): stdLib.IterableIterator[T] = js.native
  /**
  	Returns an iterable that will cycle through the array backward indefinitely.
  	*/
  def indefinitelyReversed(): stdLib.IterableIterator[T] = js.native
  /**
  	Returns the next item.
  	*/
  def next(): T = js.native
  /**
  	Returns the previous item.
  	*/
  def previous(): T = js.native
  /**
  	Returns the item by going the given amount of `steps` through the array. For example, calling `step(2)` is like calling `next()` twice. You go backward by specifying a negative number.
  	*/
  def step(steps: scala.Double): T = js.native
}

