package typings
package twilioDashChatLib.libInterfacesPaginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paginator[T] extends js.Object {
  var hasNextPage: scala.Boolean
  var hasPrevPage: scala.Boolean
  var items: js.Array[T]
  /**
    * Request next page.
    * Does not modify existing object.
    * @return {Promise<Paginator<T>>}
    */
  def nextPage(): js.Promise[Paginator[T]]
  /**
    * Request previous page.
    * Does not modify existing object.
    * @return {Promise<Paginator<T>>}
    */
  def prevPage(): js.Promise[Paginator[T]]
}

object Paginator {
  @scala.inline
  def apply[T](
    hasNextPage: scala.Boolean,
    hasPrevPage: scala.Boolean,
    items: js.Array[T],
    nextPage: () => js.Promise[Paginator[T]],
    prevPage: () => js.Promise[Paginator[T]]
  ): Paginator[T] = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage, hasPrevPage = hasPrevPage, items = items, nextPage = js.Any.fromFunction0(nextPage), prevPage = js.Any.fromFunction0(prevPage))
  
    __obj.asInstanceOf[Paginator[T]]
  }
}

