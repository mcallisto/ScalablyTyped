package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of DataTransferItem objects representing items being dragged. During a drag operation, each DragEvent has a dataTransfer property and that property is a DataTransferItemList. */
@js.native
trait DataTransferItemList
  extends /* name */ org.scalablytyped.runtime.NumberDictionary[DataTransferItem] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[DataTransferItem]] = js.native
  /**
    * Returns the number of items in the drag data store.
    */
  val length: scala.Double = js.native
  /**
    * Adds a new entry for the given data to the drag data store. If the data is plain
    * text  then a type string has to be provided
    * also.
    */
  def add(data: java.lang.String, `type`: java.lang.String): DataTransferItem | scala.Null = js.native
  def add(data: File): DataTransferItem | scala.Null = js.native
  /**
    * Removes all the entries in the drag data store.
    */
  def clear(): scala.Unit = js.native
  def item(index: scala.Double): DataTransferItem = js.native
  /**
    * Removes the indexth entry in the drag data store.
    */
  def remove(index: scala.Double): scala.Unit = js.native
}

@JSGlobal("DataTransferItemList")
@js.native
class DataTransferItemListCls () extends DataTransferItemList

@JSGlobal("DataTransferItemList")
@js.native
object DataTransferItemList
  extends org.scalablytyped.runtime.Instantiable0[DataTransferItemList]

