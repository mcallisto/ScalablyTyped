package typings
package frecencyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeepScores[T] extends js.Object {
  var keepScores: js.UndefOr[scala.Boolean] = js.undefined
  var searchQuery: T
  var searchResults: js.Array[T]
}

object Anon_KeepScores {
  @scala.inline
  def apply[T](searchQuery: T, searchResults: js.Array[T], keepScores: js.UndefOr[scala.Boolean] = js.undefined): Anon_KeepScores[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], searchResults = searchResults)
    if (!js.isUndefined(keepScores)) __obj.updateDynamic("keepScores")(keepScores)
    __obj.asInstanceOf[Anon_KeepScores[T]]
  }
}

