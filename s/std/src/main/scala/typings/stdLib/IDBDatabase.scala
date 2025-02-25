package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface of the IndexedDB API provides a connection to a database; you can use an IDBDatabase object to open a transaction on your database then create, manipulate, and delete objects (data) in that database. The interface provides the only way to get and manage versions of the database. */
@js.native
trait IDBDatabase extends EventTarget {
  /**
    * Returns the name of the database.
    */
  val name: java.lang.String = js.native
  /**
    * Returns a list of the names of object stores in the database.
    */
  val objectStoreNames: DOMStringList = js.native
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onversionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, _]) | scala.Null = js.native
  /**
    * Returns the version of the database.
    */
  val version: scala.Double = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: stdLib.stdLibStrings.versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: stdLib.stdLibStrings.versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: stdLib.stdLibStrings.versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
    * Closes the connection once all running transactions have finished.
    */
  def close(): scala.Unit = js.native
  /**
    * Creates a new object store with the given name and options and returns a new IDBObjectStore.
    * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
    */
  def createObjectStore(name: java.lang.String): IDBObjectStore = js.native
  def createObjectStore(name: java.lang.String, optionalParameters: IDBObjectStoreParameters): IDBObjectStore = js.native
  /**
    * Deletes the object store with the given name.
    * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
    */
  def deleteObjectStore(name: java.lang.String): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_versionchange(
    `type`: stdLib.stdLibStrings.versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_versionchange(
    `type`: stdLib.stdLibStrings.versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_versionchange(
    `type`: stdLib.stdLibStrings.versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  /**
    * Returns a new transaction with the given mode ("readonly" or "readwrite")
    * and scope which can be a single object store name or an array of names.
    */
  def transaction(storeNames: java.lang.String): IDBTransaction = js.native
  def transaction(storeNames: java.lang.String, mode: IDBTransactionMode): IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String]): IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String], mode: IDBTransactionMode): IDBTransaction = js.native
}

@JSGlobal("IDBDatabase")
@js.native
class IDBDatabaseCls () extends IDBDatabase

@JSGlobal("IDBDatabase")
@js.native
object IDBDatabase
  extends org.scalablytyped.runtime.Instantiable0[IDBDatabase]

