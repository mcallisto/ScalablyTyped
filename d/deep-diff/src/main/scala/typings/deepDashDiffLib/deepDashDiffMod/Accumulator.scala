package typings
package deepDashDiffLib.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accumulator[LHS, RHS] extends js.Object {
  var length: scala.Double
  def push(diff: Diff[LHS, RHS]): scala.Unit
}

object Accumulator {
  @scala.inline
  def apply[LHS, RHS](length: scala.Double, push: Diff[LHS, RHS] => scala.Unit): Accumulator[LHS, RHS] = {
    val __obj = js.Dynamic.literal(length = length, push = js.Any.fromFunction1(push))
  
    __obj.asInstanceOf[Accumulator[LHS, RHS]]
  }
}

