package typings
package firebaseDashAdminLib.adminNs.databaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `onDisconnect` class allows you to write or clear data when your client
  * disconnects from the Database server. These updates occur whether your
  * client disconnects cleanly or not, so you can rely on them to clean up data
  * even if a connection is dropped or a client crashes.
  *
  * The `onDisconnect` class is most commonly used to manage presence in
  * applications where it is useful to detect how many clients are connected and
  * when other clients disconnect. See
  * {@link
  *   https://firebase.google.com/docs/database/web/offline-capabilities
  *   Enabling Offline Capabilities in JavaScript} for more information.
  *
  * To avoid problems when a connection is dropped before the requests can be
  * transferred to the Database server, these functions should be called before
  * any data is written.
  *
  * Note that `onDisconnect` operations are only triggered once. If you want an
  * operation to occur each time a disconnect occurs, you'll need to re-establish
  * the `onDisconnect` operations each time you reconnect.
  */
@js.native
trait OnDisconnect extends js.Object {
  /**
    * Cancels all previously queued `onDisconnect()` set or update events for this
    * location and all children.
    *
    * If a write has been queued for this location via a `set()` or `update()` at a
    * parent location, the write at this location will be canceled, though all
    * other siblings will still be written.
    *
    * @example
    * ```javascript
    * var ref = admin.database().ref("onlineState");
    * ref.onDisconnect().set(false);
    * // ... sometime later
    * ref.onDisconnect().cancel();
    * ```
    *
    * @param onComplete An optional callback function that is
    *   called when synchronization to the server has completed. The callback
    *   will be passed a single parameter: null for success, or an Error object
    *   indicating a failure.
    * @return Resolves when synchronization to the server is complete.
    */
  def cancel(): js.Promise[scala.Unit] = js.native
  def cancel(onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): js.Promise[scala.Unit] = js.native
  /**
    * Ensures the data at this location is deleted when the client is disconnected
    * (due to closing the browser, navigating to a new page, or network issues).
    *
    * @param onComplete An optional callback function that is
    *   called when synchronization to the server has completed. The callback
    *   will be passed a single parameter: null for success, or an Error object
    *   indicating a failure.
    * @return Resolves when synchronization to the server is complete.
    */
  def remove(): js.Promise[scala.Unit] = js.native
  def remove(onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): js.Promise[scala.Unit] = js.native
  /**
    * Ensures the data at this location is set to the specified value when the
    * client is disconnected (due to closing the browser, navigating to a new page,
    * or network issues).
    *
    * `set()` is especially useful for implementing "presence" systems, where a
    * value should be changed or cleared when a user disconnects so that they
    * appear "offline" to other users. See
    * {@link
    *   https://firebase.google.com/docs/database/web/offline-capabilities
    *   Enabling Offline Capabilities in JavaScript} for more information.
    *
    * Note that `onDisconnect` operations are only triggered once. If you want an
    * operation to occur each time a disconnect occurs, you'll need to re-establish
    * the `onDisconnect` operations each time.
    *
    * @example
    * ```javascript
    * var ref = admin.database().ref("users/ada/status");
    * ref.onDisconnect().set("I disconnected!");
    * ```
    *
    * @param value The value to be written to this location on
    *   disconnect (can be an object, array, string, number, boolean, or null).
    * @param onComplete An optional callback function that
    *   will be called when synchronization to the database server has completed.
    *   The callback will be passed a single parameter: null for success, or an
    *   `Error` object indicating a failure.
    * @return A promise that resolves when synchronization to the database is complete.
    */
  def set(value: js.Any): js.Promise[scala.Unit] = js.native
  def set(value: js.Any, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): js.Promise[scala.Unit] = js.native
  def setWithPriority(value: js.Any): js.Promise[scala.Unit] = js.native
  def setWithPriority(value: js.Any, priority: java.lang.String): js.Promise[scala.Unit] = js.native
  def setWithPriority(
    value: js.Any,
    priority: java.lang.String,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]
  ): js.Promise[scala.Unit] = js.native
  /**
    * Ensures the data at this location is set to the specified value and priority
    * when the client is disconnected (due to closing the browser, navigating to a
    * new page, or network issues).
    *
    * @param value The value to be written to this location on
    *   disconnect (can be an object, array, string, number, boolean, or null).
    * @param priority
    * @param onComplete An optional callback function that is
    *   called when synchronization to the server has completed. The callback
    *   will be passed a single parameter: null for success, or an Error object
    *   indicating a failure.
    * @return A promise that resolves when synchronization to the database is complete.
    */
  def setWithPriority(value: js.Any, priority: scala.Double): js.Promise[scala.Unit] = js.native
  def setWithPriority(
    value: js.Any,
    priority: scala.Double,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]
  ): js.Promise[scala.Unit] = js.native
  def setWithPriority(
    value: js.Any,
    priority: scala.Null,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]
  ): js.Promise[scala.Unit] = js.native
  /**
    * Writes multiple values at this location when the client is disconnected (due
    * to closing the browser, navigating to a new page, or network issues).
    *
    * The `values` argument contains multiple property-value pairs that will be
    * written to the Database together. Each child property can either be a simple
    * property (for example, "name") or a relative path (for example, "name/first")
    * from the current location to the data to update.
    *
    * As opposed to the `set()` method, `update()` can be use to selectively update
    * only the referenced properties at the current location (instead of replacing
    * all the child properties at the current location).
    *
    * See {@link https://firebase.google.com/docs/reference/admin/node/admin.database.Reference#update}
    * for examples of using the connected version of `update`.
    *
    * @example
    * ```javascript
    * var ref = admin.database().ref("users/ada");
    * ref.update({
    *    onlineState: true,
    *    status: "I'm online."
    * });
    * ref.onDisconnect().update({
    *   onlineState: false,
    *   status: "I'm offline."
    * });
    * ```
    *
    * @param values Object containing multiple values.
    * @param onComplete An optional callback function that will
    *   be called when synchronization to the server has completed. The
    *   callback will be passed a single parameter: null for success, or an Error
    *   object indicating a failure.
    * @return Resolves when synchronization to the
    *   Database is complete.
    */
  def update(values: js.Object): js.Promise[scala.Unit] = js.native
  def update(values: js.Object, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): js.Promise[scala.Unit] = js.native
}

