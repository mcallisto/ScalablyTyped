package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface of the EncryptedMediaExtensions API is a read-only map of media key statuses by key IDs. */
@js.native
trait MediaKeyStatusMap extends js.Object {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[BufferSource, MediaKeyStatus]]] = js.native
  val size: scala.Double = js.native
  def entries(): IterableIterator[js.Tuple2[BufferSource, MediaKeyStatus]] = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ MediaKeyStatus, /* key */ BufferSource, /* parent */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ MediaKeyStatus, /* key */ BufferSource, /* parent */ this.type, scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  def get(keyId: BufferSource): js.Any = js.native
  def has(keyId: BufferSource): scala.Boolean = js.native
  def keys(): IterableIterator[BufferSource] = js.native
  def values(): IterableIterator[MediaKeyStatus] = js.native
}

@JSGlobal("MediaKeyStatusMap")
@js.native
class MediaKeyStatusMapCls () extends MediaKeyStatusMap

@JSGlobal("MediaKeyStatusMap")
@js.native
object MediaKeyStatusMap
  extends org.scalablytyped.runtime.Instantiable0[MediaKeyStatusMap]

