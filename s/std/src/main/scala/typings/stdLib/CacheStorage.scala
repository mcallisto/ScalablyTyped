package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The storage for Cache objects. */
@js.native
trait CacheStorage extends js.Object {
  def delete(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def has(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def keys(): js.Promise[js.Array[java.lang.String]] = js.native
  def `match`(request: RequestInfo): js.Promise[js.UndefOr[Response]] = js.native
  def `match`(request: RequestInfo, options: CacheQueryOptions): js.Promise[js.UndefOr[Response]] = js.native
  def open(cacheName: java.lang.String): js.Promise[Cache] = js.native
}

@JSGlobal("CacheStorage")
@js.native
class CacheStorageCls () extends CacheStorage

@JSGlobal("CacheStorage")
@js.native
object CacheStorage
  extends org.scalablytyped.runtime.Instantiable0[CacheStorage]

