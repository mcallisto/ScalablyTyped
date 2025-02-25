package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface of the IndexedDB API represents a cursor for traversing or iterating over multiple records in a database. */
@js.native
trait IDBCursor extends js.Object {
  /**
    * Returns the direction ("next", "nextunique", "prev" or "prevunique")
    * of the cursor.
    */
  val direction: IDBCursorDirection = js.native
  /**
    * Returns the key of the cursor.
    * Throws a "InvalidStateError" DOMException if the cursor is advancing or is finished.
    */
  val key: IDBValidKey = js.native
  /**
    * Returns the effective key of the cursor.
    * Throws a "InvalidStateError" DOMException if the cursor is advancing or is finished.
    */
  val primaryKey: IDBValidKey = js.native
  /**
    * Returns the IDBObjectStore or IDBIndex the cursor was opened from.
    */
  val source: IDBObjectStore | IDBIndex = js.native
  /**
    * Advances the cursor through the next count records in
    * range.
    */
  def advance(count: scala.Double): scala.Unit = js.native
  /**
    * Advances the cursor to the next record in range matching or
    * after key.
    */
  def continue(): scala.Unit = js.native
  def continue(key: IDBValidKey): scala.Unit = js.native
  /**
    * Advances the cursor to the next record in range matching
    * or after key and primaryKey. Throws an "InvalidAccessError" DOMException if the source is not an index.
    */
  def continuePrimaryKey(key: IDBValidKey, primaryKey: IDBValidKey): scala.Unit = js.native
  /**
    * Delete the record pointed at by the cursor with a new value.
    * If successful, request's result will be undefined.
    */
  def delete(): IDBRequest[js.UndefOr[scala.Nothing]] = js.native
  /**
    * Updated the record pointed at by the cursor with a new value.
    * Throws a "DataError" DOMException if the effective object store uses in-line keys and the key would have changed.
    * If successful, request's result will be the record's key.
    */
  def update(value: js.Any): IDBRequest[IDBValidKey] = js.native
}

@JSGlobal("IDBCursor")
@js.native
class IDBCursorCls () extends IDBCursor

@JSGlobal("IDBCursor")
@js.native
object IDBCursor
  extends org.scalablytyped.runtime.Instantiable0[IDBCursor]

