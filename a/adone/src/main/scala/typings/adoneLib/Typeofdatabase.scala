package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdatabase extends js.Object {
  def collation(): java.lang.String
  def column(): java.lang.String
  def engine(): java.lang.String
  def `type`(): java.lang.String
}

object Typeofdatabase {
  @scala.inline
  def apply(
    collation: () => java.lang.String,
    column: () => java.lang.String,
    engine: () => java.lang.String,
    `type`: () => java.lang.String
  ): Typeofdatabase = {
    val __obj = js.Dynamic.literal(collation = js.Any.fromFunction0(collation), column = js.Any.fromFunction0(column), engine = js.Any.fromFunction0(engine))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[Typeofdatabase]
  }
}

