package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ./store/RelayInMemoryRecordSource
@js.native
trait RelayInMemoryRecordSource extends js.Object {
  def clear(): scala.Unit = js.native
  def delete(dataID: DataID): scala.Unit = js.native
  def get(dataID: DataID): js.UndefOr[Record | scala.Null] = js.native
  def getRecordIDs(): js.Array[DataID] = js.native
  def getStatus(dataID: DataID): RecordState = js.native
  def has(dataID: DataID): scala.Boolean = js.native
  def load(
    dataID: DataID,
    callback: js.Function2[
      /* error */ js.UndefOr[stdLib.Error | scala.Null], 
      /* record */ js.UndefOr[Record | scala.Null], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def remove(dataID: DataID): scala.Unit = js.native
  def set(dataID: DataID, record: Record): scala.Unit = js.native
  def size(): scala.Double = js.native
}

