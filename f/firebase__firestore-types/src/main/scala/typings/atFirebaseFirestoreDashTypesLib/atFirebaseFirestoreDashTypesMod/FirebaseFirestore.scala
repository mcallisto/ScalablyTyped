package typings
package atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "FirebaseFirestore")
@js.native
class FirebaseFirestore protected () extends js.Object {
  var INTERNAL: atFirebaseFirestoreDashTypesLib.Anon_Delete = js.native
  /**
    * The `FirebaseApp` associated with this `Firestore` instance.
    */
  var app: js.Any = js.native
  /**
    *  Creates a write batch, used for performing multiple writes as a single
    * atomic operation. The maximum number of writes allowed in a single WriteBatch
    * is 500, but note that each usage of `FieldValue.serverTimestamp()`,
    * `FieldValue.arrayUnion()`, `FieldValue.arrayRemove()`, or
    * `FieldValue.increment()` inside a WriteBatch counts as an additional write.
    *
    * @return
    *   A `WriteBatch` that can be used to atomically execute multiple writes.
    */
  def batch(): WriteBatch = js.native
  /**
    * Clears the persistent storage. This includes pending writes and cached
    * documents.
    *
    * Must be called while the firestore instance is not started (after the app is
    * shutdown or when the app is first initialized). On startup, this method
    * must be called before other methods (other than settings()). If the
    * firestore instance is still running, the promise will be rejected with
    * the error code of `failed-precondition`.
    *
    * Note: clearPersistence() is primarily intended to help write reliable
    * tests that use Firestore. It uses the most efficient mechanism possible
    * for dropping existing data but does not attempt to securely overwrite or
    * otherwise make cached data unrecoverable. For applications that are
    * sensitive to the disclosure of cache data in between user sessions we
    * strongly recommend not to enable persistence in the first place.
    *
    * @return A promise that is resolved once the persistent storage has been
    * cleared. Otherwise, the promise is rejected with an error.
    */
  def clearPersistence(): js.Promise[scala.Unit] = js.native
  /**
    * Gets a `CollectionReference` instance that refers to the collection at
    * the specified path.
    *
    * @param collectionPath A slash-separated path to a collection.
    * @return The `CollectionReference` instance.
    */
  def collection(collectionPath: java.lang.String): CollectionReference = js.native
  /**
    * Creates and returns a new Query that includes all documents in the
    * database that are contained in a collection or subcollection with the
    * given collectionId.
    *
    * @param collectionId Identifies the collections to query over. Every
    * collection or subcollection with this ID as the last segment of its path
    * will be included. Cannot contain a slash.
    * @return The created Query.
    */
  def collectionGroup(collectionId: java.lang.String): Query = js.native
  /**
    * Disables network usage for this instance. It can be re-enabled via
    * enableNetwork(). While the network is disabled, any snapshot listeners or
    * get() calls will return results from cache, and any write operations will
    * be queued until the network is restored.
    *
    * @return A promise that is resolved once the network has been disabled.
    */
  def disableNetwork(): js.Promise[scala.Unit] = js.native
  /**
    * Gets a `DocumentReference` instance that refers to the document at the
    * specified path.
    *
    * @param documentPath A slash-separated path to a document.
    * @return The `DocumentReference` instance.
    */
  def doc(documentPath: java.lang.String): DocumentReference = js.native
  /**
    * Re-enables use of the network for this Firestore instance after a prior
    * call to disableNetwork().
    *
    * @return A promise that is resolved once the network has been enabled.
    */
  def enableNetwork(): js.Promise[scala.Unit] = js.native
  /**
    * Attempts to enable persistent storage, if possible.
    *
    * Must be called before any other methods (other than settings() and
    * clearPersistence()).
    *
    * If this fails, enablePersistence() will reject the promise it returns.
    * Note that even after this failure, the firestore instance will remain
    * usable, however offline persistence will be disabled.
    *
    * There are several reasons why this can fail, which can be identified by
    * the `code` on the error.
    *
    *   * failed-precondition: The app is already open in another browser tab.
    *   * unimplemented: The browser is incompatible with the offline
    *     persistence implementation.
    *
    * @param settings Optional settings object to configure persistence.
    * @return A promise that represents successfully enabling persistent
    * storage.
    */
  def enablePersistence(): js.Promise[scala.Unit] = js.native
  def enablePersistence(settings: PersistenceSettings): js.Promise[scala.Unit] = js.native
  /**
    * Executes the given updateFunction and then attempts to commit the
    * changes applied within the transaction. If any document read within the
    * transaction has changed, the updateFunction will be retried. If it fails
    * to commit after 5 attempts, the transaction will fail.
    *
    * The maximum number of writes allowed in a single transaction is 500, but
    * note that each usage of `FieldValue.serverTimestamp()`,
    * `FieldValue.arrayUnion()`, `FieldValue.arrayRemove()`, or
    * `FieldValue.increment()` inside a transaction counts as an additional write.
    *
    * @param updateFunction The function to execute within the transaction
    * context.
    *
    * @return If the transaction completed successfully or was explicitly
    * aborted (by the updateFunction returning a failed Promise), the Promise
    * returned by the updateFunction will be returned here. Else if the
    * transaction failed, a rejected Promise with the corresponding failure
    * error will be returned.
    */
  def runTransaction[T](updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]]): js.Promise[T] = js.native
  /**
    * Specifies custom settings to be used to configure the `Firestore`
    * instance. Must be set before invoking any other methods.
    *
    * @param settings The settings to use.
    */
  def settings(settings: Settings): scala.Unit = js.native
}

