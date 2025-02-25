package typings
package firebaseDashAdminLib.adminNs.databaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Reference` represents a specific location in your Database and can be used
  * for reading or writing data to that Database location.
  *
  * You can reference the root or child location in your Database by calling
  * `admin.database().ref()` or `admin.database().ref("child/path")`.
  *
  * Writing is done with the `set()` method and reading can be done with the
  * `on()` method. See
  * {@link
  *   https://firebase.google.com/docs/database/web/read-and-write
  *   Read and Write Data on the Web}
  */
@js.native
trait Reference extends Query {
  /**
    * The last part of the `Reference`'s path.
    *
    * For example, `"ada"` is the key for
    * `https://<DATABASE_NAME>.firebaseio.com/users/ada`.
    *
    * The key of a root `Reference` is `null`.
    *
    * @example
    * ```javascript
    * // The key of a root reference is null
    * var rootRef = admin.database().ref();
    * var key = rootRef.key;  // key === null
    * ```
    *
    * @example
    * ```javascript
    * // The key of any non-root reference is the last token in the path
    * var adaRef = admin.database().ref("users/ada");
    * var key = adaRef.key;  // key === "ada"
    * key = adaRef.child("name/last").key;  // key === "last"
    * ```
    */
  var key: java.lang.String | scala.Null = js.native
  /**
    * The parent location of a `Reference`.
    *
    * The parent of a root `Reference` is `null`.
    *
    * @example
    * ```javascript
    * // The parent of a root reference is null
    * var rootRef = admin.database().ref();
    * parent = rootRef.parent;  // parent === null
    * ```
    *
    * @example
    * ```javascript
    * // The parent of any non-root reference is the parent location
    * var usersRef = admin.database().ref("users");
    * var adaRef = admin.database().ref("users/ada");
    * // usersRef and adaRef.parent represent the same location
    * ```
    */
  var parent: Reference | scala.Null = js.native
  var path: java.lang.String = js.native
  /**
    * The root `Reference` of the Database.
    *
    * @example
    * ```javascript
    * // The root of a root reference is itself
    * var rootRef = admin.database().ref();
    * // rootRef and rootRef.root represent the same location
    * ```
    *
    * @example
    * ```javascript
    * // The root of any non-root reference is the root location
    * var adaRef = admin.database().ref("users/ada");
    * // rootRef and adaRef.root represent the same location
    * ```
    */
  var root: Reference = js.native
  /**
    * Gets a `Reference` for the location at the specified relative path.
    *
    * The relative path can either be a simple child name (for example, "ada") or
    * a deeper slash-separated path (for example, "ada/name/first").
    *
    * @example
    * ```javascript
    * var usersRef = admin.database().ref('users');
    * var adaRef = usersRef.child('ada');
    * var adaFirstNameRef = adaRef.child('name/first');
    * var path = adaFirstNameRef.toString();
    * // path is now 'https://sample-app.firebaseio.com/users/ada/name/first'
    * ```
    *
    * @param path A relative path from this location to the desired child
    *   location.
    * @return The specified child location.
    */
  def child(path: java.lang.String): Reference = js.native
  /**
    * Returns an `OnDisconnect` object - see
    * {@link
    *   https://firebase.google.com/docs/database/web/offline-capabilities
    *   Enabling Offline Capabilities in JavaScript} for more information on how
    * to use it.
    *
    * @return An `OnDisconnect` object .
    */
  def onDisconnect(): OnDisconnect = js.native
  /**
    * Generates a new child location using a unique key and returns its
    * `Reference`.
    *
    * This is the most common pattern for adding data to a collection of items.
    *
    * If you provide a value to `push()`, the value will be written to the
    * generated location. If you don't pass a value, nothing will be written to the
    * Database and the child will remain empty (but you can use the `Reference`
    * elsewhere).
    *
    * The unique key generated by `push()` are ordered by the current time, so the
    * resulting list of items will be chronologically sorted. The keys are also
    * designed to be unguessable (they contain 72 random bits of entropy).
    *
    *
    * See
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#append_to_a_list_of_data
    *  Append to a list of data}
    * </br>See
    * {@link
    *  https://firebase.googleblog.com/2015/02/the-2120-ways-to-ensure-unique_68.html
    *  The 2^120 Ways to Ensure Unique Identifiers}
    *
    * @example
    * ```javascript
    * var messageListRef = admin.database().ref('message_list');
    * var newMessageRef = messageListRef.push();
    * newMessageRef.set({
    *   user_id: 'ada',
    *   text: 'The Analytical Engine weaves algebraical patterns just as the Jacquard loom weaves flowers and leaves.'
    * });
    * // We've appended a new message to the message_list location.
    * var path = newMessageRef.toString();
    * // path will be something like
    * // 'https://sample-app.firebaseio.com/message_list/-IKo28nwJLH0Nc5XeFmj'
    * ```
    *
    * @param value Optional value to be written at the generated location.
    * @param onComplete Callback called when write to server is
    *   complete.
    * @return Combined `Promise` and
    *   `Reference`; resolves when write is complete, but can be used immediately
    *   as the `Reference` to the child location.
    */
  def push(): ThenableReference = js.native
  def push(value: js.Any): ThenableReference = js.native
  def push(value: js.Any, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): ThenableReference = js.native
  /**
    * Removes the data at this Database location.
    *
    * Any data at child locations will also be deleted.
    *
    * The effect of the remove will be visible immediately and the corresponding
    * event 'value' will be triggered. Synchronization of the remove to the
    * Firebase servers will also be started, and the returned Promise will resolve
    * when complete. If provided, the onComplete callback will be called
    * asynchronously after synchronization has finished.
    *
    * @example
    * ```javascript
    * var adaRef = admin.database().ref('users/ada');
    * adaRef.remove()
    *   .then(function() {
    *     console.log("Remove succeeded.")
    *   })
    *   .catch(function(error) {
    *     console.log("Remove failed: " + error.message)
    *   });
    * ```
    *
    * @param onComplete Callback called when write to server is
    *   complete.
    * @return Resolves when remove on server is complete.
    */
  def remove(): js.Promise[scala.Unit] = js.native
  def remove(onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): js.Promise[scala.Unit] = js.native
  /**
    * Writes data to this Database location.
    *
    * This will overwrite any data at this location and all child locations.
    *
    * The effect of the write will be visible immediately, and the corresponding
    * events ("value", "child_added", etc.) will be triggered. Synchronization of
    * the data to the Firebase servers will also be started, and the returned
    * Promise will resolve when complete. If provided, the `onComplete` callback
    * will be called asynchronously after synchronization has finished.
    *
    * Passing `null` for the new value is equivalent to calling `remove()`; namely,
    * all data at this location and all child locations will be deleted.
    *
    * `set()` will remove any priority stored at this location, so if priority is
    * meant to be preserved, you need to use `setWithPriority()` instead.
    *
    * Note that modifying data with `set()` will cancel any pending transactions
    * at that location, so extreme care should be taken if mixing `set()` and
    * `transaction()` to modify the same data.
    *
    * A single `set()` will generate a single "value" event at the location where
    * the `set()` was performed.
    *
    * @example
    * ```javascript
    * var adaNameRef = admin.database().ref('users/ada/name');
    * adaNameRef.child('first').set('Ada');
    * adaNameRef.child('last').set('Lovelace');
    * // We've written 'Ada' to the Database location storing Ada's first name,
    * // and 'Lovelace' to the location storing her last name.
    * ```
    *
    * @example
    * ```javascript
    * adaNameRef.set({ first: 'Ada', last: 'Lovelace' });
    * // Exact same effect as the previous example, except we've written
    * // Ada's first and last name simultaneously.
    * ```
    *
    * @example
    * ```javascript
    * adaNameRef.set({ first: 'Ada', last: 'Lovelace' })
    *   .then(function() {
    *     console.log('Synchronization succeeded');
    *   })
    *   .catch(function(error) {
    *     console.log('Synchronization failed');
    *   });
    * // Same as the previous example, except we will also log a message
    * // when the data has finished synchronizing.
    * ```
    *
    * @param value The value to be written (string, number, boolean, object,
    *   array, or null).
    * @param onComplete Callback called when write to server is
    *   complete.
    * @return Resolves when write to server is complete.
    */
  def set(value: js.Any): js.Promise[scala.Unit] = js.native
  def set(value: js.Any, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): js.Promise[scala.Unit] = js.native
  /**
    * Sets a priority for the data at this Database location.
    *
    * Applications need not use priority but can order collections by
    * ordinary properties (see
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#sorting_and_filtering_data
    *  Sorting and filtering data}).
    *
    * @param priority
    * @param onComplete
    * @return
    */
  def setPriority(priority: java.lang.String, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): js.Promise[scala.Unit] = js.native
  def setPriority(priority: scala.Double, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): js.Promise[scala.Unit] = js.native
  def setPriority(priority: scala.Null, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): js.Promise[scala.Unit] = js.native
  def setWithPriority(newVal: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Writes data the Database location. Like `set()` but also specifies the
    * priority for that data.
    *
    * Applications need not use priority but can order collections by
    * ordinary properties (see
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#sorting_and_filtering_data
    *  Sorting and filtering data}).
    *
    * @param newVal
    * @param newPriority
    * @param  onComplete
    * @return
    */
  def setWithPriority(newVal: js.Any, newPriority: java.lang.String): js.Promise[scala.Unit] = js.native
  def setWithPriority(
    newVal: js.Any,
    newPriority: java.lang.String,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]
  ): js.Promise[scala.Unit] = js.native
  def setWithPriority(newVal: js.Any, newPriority: scala.Double): js.Promise[scala.Unit] = js.native
  def setWithPriority(
    newVal: js.Any,
    newPriority: scala.Double,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]
  ): js.Promise[scala.Unit] = js.native
  def setWithPriority(
    newVal: js.Any,
    newPriority: scala.Null,
    onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]
  ): js.Promise[scala.Unit] = js.native
  /**
    * Atomically modifies the data at this location.
    *
    * Atomically modify the data at this location. Unlike a normal `set()`, which
    * just overwrites the data regardless of its previous value, `transaction()` is
    * used to modify the existing value to a new value, ensuring there are no
    * conflicts with other clients writing to the same location at the same time.
    *
    * To accomplish this, you pass `transaction()` an update function which is used
    * to transform the current value into a new value. If another client writes to
    * the location before your new value is successfully written, your update
    * function will be called again with the new current value, and the write will
    * be retried. This will happen repeatedly until your write succeeds without
    * conflict or you abort the transaction by not returning a value from your
    * update function.
    *
    * Note: Modifying data with `set()` will cancel any pending transactions at
    * that location, so extreme care should be taken if mixing `set()` and
    * `transaction()` to update the same data.
    *
    * Note: When using transactions with Security and Firebase Rules in place, be
    * aware that a client needs `.read` access in addition to `.write` access in
    * order to perform a transaction. This is because the client-side nature of
    * transactions requires the client to read the data in order to transactionally
    * update it.
    *
    * @example
    * ```javascript
    * // Increment Ada's rank by 1.
    * var adaRankRef = admin.database().ref('users/ada/rank');
    * adaRankRef.transaction(function(currentRank) {
    *   // If users/ada/rank has never been set, currentRank will be `null`.
    *   return currentRank + 1;
    * });
    * ```
    *
    * @example
    * ```javascript
    * // Try to create a user for ada, but only if the user id 'ada' isn't
    * // already taken
    * var adaRef = admin.database().ref('users/ada');
    * adaRef.transaction(function(currentData) {
    *   if (currentData === null) {
    *     return { name: { first: 'Ada', last: 'Lovelace' } };
    *   } else {
    *     console.log('User ada already exists.');
    *     return; // Abort the transaction.
    *   }
    * }, function(error, committed, snapshot) {
    *   if (error) {
    *     console.log('Transaction failed abnormally!', error);
    *   } else if (!committed) {
    *     console.log('We aborted the transaction (because ada already exists).');
    *   } else {
    *     console.log('User ada added!');
    *   }
    *   console.log("Ada's data: ", snapshot.val());
    * });
    * ```
    *
    * @param transactionUpdate A developer-supplied function which
    *   will be passed the current data stored at this location (as a JavaScript
    *   object). The function should return the new value it would like written (as
    *   a JavaScript object). If `undefined` is returned (i.e. you return with no
    *   arguments) the transaction will be aborted and the data at this location
    *   will not be modified.
    * @param onComplete A callback
    *   function that will be called when the transaction completes. The callback
    *   is passed three arguments: a possibly-null `Error`, a `boolean` indicating
    *   whether the transaction was committed, and a `DataSnapshot` indicating the
    *   final result. If the transaction failed abnormally, the first argument will
    *   be an `Error` object indicating the failure cause. If the transaction
    *   finished normally, but no data was committed because no data was returned
    *   from `transactionUpdate`, then second argument will be false. If the
    *   transaction completed and committed data to Firebase, the second argument
    *   will be true. Regardless, the third argument will be a `DataSnapshot`
    *   containing the resulting data in this location.
    * @param applyLocally By default, events are raised each time the
    *   transaction update function runs. So if it is run multiple times, you may
    *   see intermediate states. You can set this to false to suppress these
    *   intermediate states and instead wait until the transaction has completed
    *   before events are raised.
    * @return Returns a Promise that can optionally be used instead of the `onComplete`
    *   callback to handle success and failure.
    */
  def transaction(transactionUpdate: js.Function1[/* a */ js.Any, _]): js.Promise[firebaseDashAdminLib.Anon_Committed] = js.native
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.Function3[
      /* a */ stdLib.Error | scala.Null, 
      /* b */ scala.Boolean, 
      /* c */ DataSnapshot | scala.Null, 
      _
    ]
  ): js.Promise[firebaseDashAdminLib.Anon_Committed] = js.native
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.Function3[
      /* a */ stdLib.Error | scala.Null, 
      /* b */ scala.Boolean, 
      /* c */ DataSnapshot | scala.Null, 
      _
    ],
    applyLocally: scala.Boolean
  ): js.Promise[firebaseDashAdminLib.Anon_Committed] = js.native
  /**
    * Writes multiple values to the Database at once.
    *
    * The `values` argument contains multiple property-value pairs that will be
    * written to the Database together. Each child property can either be a simple
    * property (for example, "name") or a relative path (for example,
    * "name/first") from the current location to the data to update.
    *
    * As opposed to the `set()` method, `update()` can be use to selectively update
    * only the referenced properties at the current location (instead of replacing
    * all the child properties at the current location).
    *
    * The effect of the write will be visible immediately, and the corresponding
    * events ('value', 'child_added', etc.) will be triggered. Synchronization of
    * the data to the Firebase servers will also be started, and the returned
    * Promise will resolve when complete. If provided, the `onComplete` callback
    * will be called asynchronously after synchronization has finished.
    *
    * A single `update()` will generate a single "value" event at the location
    * where the `update()` was performed, regardless of how many children were
    * modified.
    *
    * Note that modifying data with `update()` will cancel any pending
    * transactions at that location, so extreme care should be taken if mixing
    * `update()` and `transaction()` to modify the same data.
    *
    * Passing `null` to `update()` will remove the data at this location.
    *
    * See
    * {@link
    *  https://firebase.googleblog.com/2015/09/introducing-multi-location-updates-and_86.html
    *  Introducing multi-location updates and more}.
    *
    * @example
    * ```javascript
    * var adaNameRef = admin.database().ref('users/ada/name');
    * // Modify the 'first' and 'last' properties, but leave other data at
    * // adaNameRef unchanged.
    * adaNameRef.update({ first: 'Ada', last: 'Lovelace' });
    * ```
    *
    * @param values Object containing multiple values.
    * @param onComplete Callback called when write to server is
    *   complete.
    * @return Resolves when update on server is complete.
    */
  def update(values: js.Object): js.Promise[scala.Unit] = js.native
  def update(values: js.Object, onComplete: js.Function1[/* a */ stdLib.Error | scala.Null, _]): js.Promise[scala.Unit] = js.native
}

