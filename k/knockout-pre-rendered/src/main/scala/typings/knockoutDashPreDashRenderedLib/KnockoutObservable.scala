package typings
package knockoutDashPreDashRenderedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservable[T]
  extends KnockoutSubscribable[T]
     with KnockoutObservableFunctions[T] {
  var valueHasMutated: js.UndefOr[Fn_Void] = js.native
  var valueWillMutate: js.UndefOr[Fn_Void] = js.native
  def apply(): T = js.native
  def apply(value: T): scala.Unit = js.native
  def peek(): T = js.native
}

