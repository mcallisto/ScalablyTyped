package typings
package promiseDotAllsettledLib.promiseDotAllsettledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportedImplementationType extends js.Object {
  @JSName("getPolyfill")
  var getPolyfill_Original: js.Function0[
    /* import warning: ImportType.apply Failed type conversion: typeof implementation */ js.Any
  ] = js.native
  @JSName("implementation")
  var implementation_Original: promiseDotAllsettledLib.Fn_Iterable = js.native
  @JSName("shim")
  var shim_Original: js.Function0[
    /* import warning: ImportType.apply Failed type conversion: typeof implementation */ js.Any
  ] = js.native
  def apply(): js.Promise[js.Array[js.Any]] = js.native
  def apply[T /* <: js.Array[_] */](iterable: promiseDotAllsettledLib.implementationMod.PromiseTuple[T]): js.Promise[promiseDotAllsettledLib.implementationMod.PromiseResultTuple[T]] = js.native
  def apply[T](iterable: stdLib.Iterable[T]): js.Promise[js.Array[T]] = js.native
  def getPolyfill(): /* import warning: ImportType.apply Failed type conversion: typeof implementation */ js.Any = js.native
  def implementation(): js.Promise[js.Array[js.Any]] = js.native
  def implementation[T /* <: js.Array[_] */](iterable: promiseDotAllsettledLib.implementationMod.PromiseTuple[T]): js.Promise[promiseDotAllsettledLib.implementationMod.PromiseResultTuple[T]] = js.native
  def implementation[T](iterable: stdLib.Iterable[T]): js.Promise[js.Array[T]] = js.native
  def shim(): /* import warning: ImportType.apply Failed type conversion: typeof implementation */ js.Any = js.native
}

