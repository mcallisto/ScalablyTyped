package typings
package atFirebaseUtilLib.distSrcDeferredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/deferred", "Deferred")
@js.native
class Deferred[R] () extends js.Object {
  var promise: js.Promise[R] = js.native
  def reject(): scala.Unit = js.native
  def reject(value: js.Any): scala.Unit = js.native
  def resolve(): scala.Unit = js.native
  def resolve(value: js.Any): scala.Unit = js.native
  /**
    * Our API internals are not promiseified and cannot because our callback APIs have subtle expectations around
    * invoking promises inline, which Promises are forbidden to do. This method accepts an optional node-style callback
    * and returns a node-style callback which will resolve or reject the Deferred's promise.
    */
  def wrapCallback(): js.Function2[/* error */ js.Any, /* value */ js.UndefOr[js.Any], scala.Unit] = js.native
  def wrapCallback(callback: js.Function2[/* error */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], scala.Unit]): js.Function2[/* error */ js.Any, /* value */ js.UndefOr[js.Any], scala.Unit] = js.native
}

