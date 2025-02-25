package typings
package debounceDashPromiseLib.debounceDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("debounce-promise", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T): js.Function1[
    /* args */ ArgumentsType[T], 
    js.Promise[stdLib.ReturnType[T]] | stdLib.ReturnType[T]
  ] = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, wait: scala.Double): js.Function1[
    /* args */ ArgumentsType[T], 
    js.Promise[stdLib.ReturnType[T]] | stdLib.ReturnType[T]
  ] = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, wait: scala.Double, options: DebounceOptions): js.Function1[
    /* args */ ArgumentsType[T], 
    js.Promise[stdLib.ReturnType[T]] | stdLib.ReturnType[T]
  ] = js.native
}

