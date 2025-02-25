package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofv8 extends js.Object {
  /**
    * Generates a snapshot of the current V8 heap and returns a Readable
    * Stream that may be used to read the JSON serialized representation.
    * This conversation was marked as resolved by joyeecheung
    * This JSON stream format is intended to be used with tools such as
    * Chrome DevTools. The JSON schema is undocumented and specific to the
    * V8 engine, and may change from one version of V8 to the next.
    */
  def getHeapSnapshot(): nodeLib.streamMod.Readable = js.native
  def getHeapSpaceStatistics(): js.Array[nodeLib.v8Mod.HeapSpaceInfo] = js.native
  def getHeapStatistics(): nodeLib.v8Mod.HeapInfo = js.native
  def setFlagsFromString(flags: java.lang.String): scala.Unit = js.native
  /**
    *
    * @param fileName The file path where the V8 heap snapshot is to be
    * saved. If not specified, a file name with the pattern
    * `'Heap-${yyyymmdd}-${hhmmss}-${pid}-${thread_id}.heapsnapshot'` will be
    * generated, where `{pid}` will be the PID of the Node.js process,
    * `{thread_id}` will be `0` when `writeHeapSnapshot()` is called from
    * the main Node.js thread or the id of a worker thread.
    */
  def writeHeapSnapshot(): java.lang.String = js.native
  def writeHeapSnapshot(fileName: java.lang.String): java.lang.String = js.native
}

