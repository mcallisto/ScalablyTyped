package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  /**
    * The action attribute for end-to-end application tracing.
    * This is a write-only property. Displaying a Connection object will show a value of null for this attribute.
    */
  var action: js.UndefOr[java.lang.String] = js.native
  /**
    * Sets the maximum number of milliseconds that each underlying round-trip between node-oracledb and Oracle Database may take.
    * Each node-oracledb method or operation may make zero or more round-trips.
    * The callTimeout value applies to each round-trip individually, not to the sum of all round-trips.
    * Time spent processing in node-oracledb before or after the completion of each round-trip is not counted.
    */
  var callTimeout: js.UndefOr[scala.Double] = js.native
  /**
    * The client identifier for end-to-end application tracing, use with mid-tier authentication, and with Virtual Private Databases.
    * This is a write-only property. Displaying a Connection object will show a value of null for this attribute.
    */
  var clientId: js.UndefOr[java.lang.String] = js.native
  /**
    * The module attribute for end-to-end application tracing.
    * This is a write-only property. Displaying a Connection object will show a value of null for this attribute.
    */
  var module: js.UndefOr[java.lang.String] = js.native
  /**
    * This readonly property gives a numeric representation of the Oracle database version which is useful in comparisons.
    * For version a.b.c.d.e, this property gives the number: (100000000 * a) + (1000000 * b) + (10000 * c) + (100 * d) + e.
    * Note if you connect to Oracle Database 18, the version will only be accurate if node-oracledb is also using Oracle Database 18 client libraries.
    * Otherwise it will show the base release such as 1800000000 instead of 1803000000.
    *
    * @since 1.3
    */
  val oracleServerVersion: scala.Double = js.native
  /**
    * This readonly property gives a string representation of the Oracle database version which is useful for display.
    * Note if you connect to Oracle Database 18, the version will only be accurate if node-oracledb is also using Oracle Database 18 client libraries.
    * Otherwise it will show the base release such as “18.0.0.0.0” instead of “18.3.0.0.0”.
    *
    * @since 2.2
    */
  val oracleServerVersionString: java.lang.String = js.native
  /**
    * The number of statements to be cached in the statement cache of the connection.
    * The default value is the stmtCacheSize property in effect in the Pool object when the connection is created in the pool.
    */
  val stmtCacheSize: scala.Double = js.native
  /**
    * Applications can set the tag property on pooled connections to indicate the ‘session state’ that a connection has.
    * The tag will be retained when the connection is released to the pool.
    * A subsequent pool.getConnection() can request a connection that has a given tag.
    * It is up to the application to set any desired session state and set connection.tag prior to closing the connection.
    * The tag property is not used for standalone connections.
    * When node-oracledb is using Oracle Client libraries 12.2 or later, the tag must be a multi-property tag with name=value pairs like “k1=v1;k2=v2”.
    * An empty string represents not having a tag set.
    *
    * @since 3.1
    */
  var tag: js.UndefOr[java.lang.String] = js.native
  /**
    * Stops the currently running operation on the connection.
    *
    * If there is no operation in progress or the operation has completed by the time the break is issued, the break() is effectively a no-op.
    *
    * If the running asynchronous operation is interrupted, its callback will return an error.
    *
    * In network configurations that drop (or in-line) out-of-band breaks, break() may hang unless you have DISABLE_OOB=ON in a sqlnet.ora file.
    *
    * If you use use break() with DRCP connections, it is currently recommended to drop the connection when releasing it back to the pool: await connection.close({drop: true}).
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#tnsadmin
    */
  def break(): js.Promise[scala.Unit] = js.native
  def break(callback: js.Function1[/* error */ DBError, scala.Unit]): scala.Unit = js.native
  /**
    * Changes the password of the specified user.
    *
    * Only users with the ALTER USER privilege can change passwords of other users.
    *
    * @param user The name of the user whose password is to be changed.
    * @param oldPassword The current password of the currently connected user. If changePassword() is being used by a DBA to change the password of another user, the value of oldPassword is ignored and can be an empty string.
    * @param newPassword The new password of the user whose password is to be changed.
    *
    * @since 2.2
    * @see https://oracle.github.io/node-oracledb/doc/api.html#changingpassword
    */
  def changePassword(user: java.lang.String, oldPassword: java.lang.String, newPassword: java.lang.String): js.Promise[scala.Unit] = js.native
  def changePassword(
    user: java.lang.String,
    oldPassword: java.lang.String,
    newPassword: java.lang.String,
    callback: js.Function1[/* error */ DBError, scala.Unit]
  ): scala.Unit = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def close(callback: js.Function1[/* error */ DBError, scala.Unit]): scala.Unit = js.native
  /**
    * Releases a connection.
    *
    * Calling close() as soon as a connection is no longer required is strongly encouraged for system efficiency.
    * Calling close() for pooled connections is required to prevent the pool running out of connections.
    *
    * When a connection is released, any ongoing transaction on the connection is rolled back.
    *
    * If an error occurs on a pooled connection and that error is known to make the connection
    * unusable, then close() will drop that connection from the connection pool so a future
    * pooled getConnection() call that grows the pool will create a new, valid connection.
    *
    * @param options Only affects pooled connections.
    *
    * @since 1.9
    * @alias release()
    */
  def close(options: CloseConnectionOptions): js.Promise[scala.Unit] = js.native
  def close(options: CloseConnectionOptions, callback: js.Function1[/* error */ DBError, scala.Unit]): scala.Unit = js.native
  /**
    * This call commits the current transaction in progress on the connection.
    */
  def commit(): js.Promise[scala.Unit] = js.native
  def commit(callback: js.Function1[/* error */ DBError, scala.Unit]): scala.Unit = js.native
  /**
    * Creates a Lob as an Oracle temporary LOB. The LOB is initially empty. Data can be streamed to the LOB,
    * which can then be passed into PL/SQL blocks, or inserted into the database.
    *
    * When no longer required, Lobs created with createLob() should be closed with lob.close() because
    * Oracle Database resources are held open if temporary LOBs are not closed.
    *
    * Open temporary LOB usage can be monitored using the view V$TEMPORARY_LOBS.
    *
    * LOBs created with createLob() can be bound for IN, IN OUT and OUT binds.
    *
    * @param type One of the constants CLOB or BLOB
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#lobhandling
    * @see https://oracle.github.io/node-oracledb/doc/api.html#lobbinds
    */
  def createLob(`type`: scala.Double): js.Promise[Lob] = js.native
  def createLob(`type`: scala.Double, callback: js.Function2[/* error */ DBError, /* lob */ Lob, scala.Unit]): scala.Unit = js.native
  /**
    * This call executes a single SQL or PL/SQL statement.
    *
    * @param sql The SQL statement that is executed. The statement may contain bind parameters.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sqlexecution
    * @see https://oracle.github.io/node-oracledb/doc/api.html#querystream For an alternative
    */
  def execute(sql: java.lang.String): js.Promise[Result] = js.native
  /**
    * This call executes a single SQL or PL/SQL statement.
    *
    * @param sql The SQL statement that is executed. The statement may contain bind parameters.
    * @param bindParams This function parameter is needed if there are bind parameters in the SQL statement.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sqlexecution
    * @see https://oracle.github.io/node-oracledb/doc/api.html#querystream For an alternative
    */
  def execute(sql: java.lang.String, bindParams: BindParameters): js.Promise[Result] = js.native
  def execute(
    sql: java.lang.String,
    bindParams: BindParameters,
    callback: js.Function2[/* error */ DBError, /* result */ Result, scala.Unit]
  ): scala.Unit = js.native
  /**
    * This call executes a single SQL or PL/SQL statement.
    *
    * @param sql The SQL statement that is executed. The statement may contain bind parameters.
    * @param bindParams This function parameter is needed if there are bind parameters in the SQL statement.
    * @param options This is an optional parameter to execute() that may be used to control statement execution.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sqlexecution
    * @see https://oracle.github.io/node-oracledb/doc/api.html#querystream For an alternative
    */
  def execute(sql: java.lang.String, bindParams: BindParameters, options: ExecuteOptions): js.Promise[Result] = js.native
  def execute(
    sql: java.lang.String,
    bindParams: BindParameters,
    options: ExecuteOptions,
    callback: js.Function2[/* error */ DBError, /* result */ Result, scala.Unit]
  ): scala.Unit = js.native
  def execute(
    sql: java.lang.String,
    callback: js.Function2[/* error */ DBError, /* result */ Result, scala.Unit]
  ): scala.Unit = js.native
  def executeMany(sql: java.lang.String, binds: js.Array[(stdLib.Record[java.lang.String, _]) | js.Array[_]]): js.Promise[Results] = js.native
  def executeMany(
    sql: java.lang.String,
    binds: js.Array[(stdLib.Record[java.lang.String, _]) | js.Array[_]],
    callback: js.Function2[/* error */ DBError, /* result */ Results, scala.Unit]
  ): scala.Unit = js.native
  /**
    * This method allows sets of data values to be bound to one DML or PL/SQL statement for execution.
    * It is like calling connection.execute() multiple times but requires fewer round-trips.
    * This is an efficient way to handle batch changes, for example when inserting or updating multiple rows.
    * The method cannot be used for queries.
    *
    * The executeMany() method supports IN, IN OUT and OUT binds for most data types
    * except PL/SQL Collection Associative Arrays.
    *
    * The version of this function which accepts a number of iterations should be used when no bind parameters
    * are required or when all bind parameters are OUT binds.
    *
    * @param sql The SQL or PL/SQL statement that executeMany() executes. The statement should contain bind variable names.
    * @param binds
    *
    * Contains values or variables to be bound to the executed statement.
    * It must be an array of arrays (for ‘bind by position’) or an array of objects whose keys
    * match the bind variable names in the SQL statement (for ‘bind by name’). Each sub-array or
    * sub-object should contain values for the bind variables used in the SQL statement.
    * At least one such record must be specified.
    *
    * If a record contains fewer values than expected, NULL values will be used. For bind by position,
    * empty values can be specified using syntax like [a,,c,d].
    *
    * By default, the direction of binds is BIND_IN. The first data record determines
    * the number of bind variables, each bind variable’s data type, and its name (when binding by name).
    * If a variable in the first record contains a null, this value is ignored and a subsequent record
    * is used to determine that variable’s characteristics. If all values in all records for a particular
    * bind variable are null, the type of that bind is STRING with a maximum size of 1.
    *
    * The maximum sizes of strings and buffers are determined by scanning all records in the bind data.
    *
    * If a bindDefs property is used, no data scanning occurs. This property explicitly specifies the
    * characteristics of each bind variable.
    *
    * @param options Optional parameter to control the execution.
    *
    * @since 2.2
    */
  def executeMany(
    sql: java.lang.String,
    binds: js.Array[(stdLib.Record[java.lang.String, _]) | js.Array[_]],
    options: ExecuteManyOptions
  ): js.Promise[Results] = js.native
  def executeMany(
    sql: java.lang.String,
    binds: js.Array[(stdLib.Record[java.lang.String, _]) | js.Array[_]],
    options: ExecuteManyOptions,
    callback: js.Function2[/* error */ DBError, /* result */ Results, scala.Unit]
  ): scala.Unit = js.native
  def executeMany(sql: java.lang.String, iterations: scala.Double): js.Promise[Results] = js.native
  def executeMany(
    sql: java.lang.String,
    iterations: scala.Double,
    callback: js.Function2[/* error */ DBError, /* result */ Results, scala.Unit]
  ): scala.Unit = js.native
  /**
    * This method allows sets of data values to be bound to one DML or PL/SQL statement for execution.
    * It is like calling connection.execute() multiple times but requires fewer round-trips.
    * This is an efficient way to handle batch changes, for example when inserting or updating multiple rows.
    * The method cannot be used for queries.
    *
    * The executeMany() method supports IN, IN OUT and OUT binds for most data types
    * except PL/SQL Collection Associative Arrays.
    *
    * The version of this function which accepts a number of iterations should be used when no bind parameters
    * are required or when all bind parameters are OUT binds.
    *
    * @param sql The SQL or PL/SQL statement that executeMany() executes. The statement should contain bind variable names.
    * @param iterations The number of times the SQL should be executed.
    * @param options Optional parameter to control the execution.
    */
  def executeMany(sql: java.lang.String, iterations: scala.Double, options: ExecuteManyOptions): js.Promise[Results] = js.native
  def executeMany(
    sql: java.lang.String,
    iterations: scala.Double,
    options: ExecuteManyOptions,
    callback: js.Function2[/* error */ DBError, /* result */ Results, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Returns a parent SodaDatabase object for use with Simple Oracle Document Access (SODA).
    *
    * @since 3.0
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sodaoverview
    */
  def getSodaDatabase(): SodaDatabase = js.native
  /**
    * Parses a SQL statement and returns information about it. This is most useful for finding column
    * names of queries, and for finding the names of bind variables used.
    *
    * This method performs a round-trip to the database, so unnecessary calls should be avoided.
    *
    * The information is provided by lower level APIs that have some limitations. Some uncommon
    * statements will return the statement type as oracledb.STMT_TYPE_UNKNOWN.
    * DDL statements are not parsed, so syntax errors in them will not be reported.
    * The direction and types of bind variables cannot be determined.
    *
    * @param sql SQL statement to parse.
    *
    * @since 2.2
    */
  def getStatementInfo(sql: java.lang.String): js.Promise[StatementInfo] = js.native
  def getStatementInfo(
    sql: java.lang.String,
    callback: js.Function2[/* error */ DBError, /* info */ StatementInfo, scala.Unit]
  ): scala.Unit = js.native
  /**
    * This method checks that a connection is currently usable and the network to the database is valid.
    * This call can be useful for system health checks. A ping only confirms that a single connection
    * is usable at the time of the ping.
    *
    * Pinging does not replace error checking during statement execution, since network or database
    * failure may occur in the interval between ping() and execute() calls.
    *
    * Pinging requires a round-trip to the database so unnecessary ping calls should be avoided.
    *
    * If ping() returns an error, the application should close the connection.
    *
    * @since 2.2
    */
  def ping(): js.Promise[scala.Unit] = js.native
  def ping(callback: js.Function1[/* error */ DBError, scala.Unit]): scala.Unit = js.native
  def queryStream(sql: java.lang.String): nodeLib.streamMod.Readable = js.native
  def queryStream(sql: java.lang.String, bindParams: BindParameters): nodeLib.streamMod.Readable = js.native
  /**
    * This function provides query streaming support. The parameters are the same as execute() except
    * a callback is not used. Instead this function returns a stream used to fetch data.
    *
    * Each row is returned as a data event. Query metadata is available via a metadata event.
    * The end event indicates the end of the query results.
    *
    * The connection must remain open until the stream is completely read.
    *
    * For tuning, adjust the value of oracledb.fetchArraySize or the option fetchArraySize (see execute()).
    *
    * @param sql The SQL statement that is executed. The statement may contain bind parameters.
    * @param bindParams This function parameter is needed if there are bind parameters in the SQL statement.
    * @param options This is an optional parameter to execute() that may be used to control statement execution.
    *
    * @since 1.8
    * @see https://oracle.github.io/node-oracledb/doc/api.html#streamingresults
    */
  def queryStream(sql: java.lang.String, bindParams: BindParameters, options: ExecuteOptions): nodeLib.streamMod.Readable = js.native
  def release(): js.Promise[scala.Unit] = js.native
  def release(callback: js.Function1[/* error */ DBError, scala.Unit]): scala.Unit = js.native
  /**
    * Releases a connection.
    *
    * Calling release() as soon as a connection is no longer required is strongly encouraged for system efficiency.
    * Calling release() for pooled connections is required to prevent the pool running out of connections.
    *
    * When a connection is released, any ongoing transaction on the connection is rolled back.
    *
    * If an error occurs on a pooled connection and that error is known to make the connection
    * unusable, then release() will drop that connection from the connection pool so a future
    * pooled getConnection() call that grows the pool will create a new, valid connection.
    *
    * @param options Only affects pooled connections.
    *
    * @since 1.9
    * @alias close()
    */
  def release(options: CloseConnectionOptions): js.Promise[scala.Unit] = js.native
  def release(options: CloseConnectionOptions, callback: js.Function1[/* error */ DBError, scala.Unit]): scala.Unit = js.native
  /**
    * Rolls back the current transaction in progress on the connection.
    */
  def rollback(): js.Promise[scala.Unit] = js.native
  def rollback(callback: js.Function1[/* error */ DBError, scala.Unit]): scala.Unit = js.native
  /**
    * Register a JavaScript callback method to be invoked when data is changed in the database by any committed
    * transaction.
    *
    * For notification to work, the connection must be created with events mode true.
    *
    * The database must be able to connect to the node-oracledb machine for notifications to be received.
    * Typically this means that the machine running node-oracledb needs a fixed IP address. If there is
    * any problem sending a notification, then the callback method will not be invoked.
    *
    * The connection.subscribe() method may be called multiple times with the same name. In this case,
    * the second and subsequent invocations ignore all options properties other than sql and binds. Instead,
    * the new SQL statement is registered to the same subscription, and the same JavaScript notification
    * callback is used. For performance reasons this can be preferable to creating a new subscription for each query.
    *
    * @param name
    *
    * For Continuous Query Notification this is an arbitrary name given to the subscription.
    * For Advanced Queue notifications this must be the queue name.
    *
    * @param options Options that control the subscription.
    */
  def subscribe(name: java.lang.String, options: SubscribeOptions): js.Promise[scala.Unit] = js.native
  def subscribe(
    name: java.lang.String,
    options: SubscribeOptions,
    callback: js.Function1[/* error */ DBError, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Unregister a Continuous Query Notification (CQN) subscription previously created with connection.subscribe().
    * No further notifications will be sent. The notification callback does not receive a notification of the
    * deregistration event.
    *
    * A subscription can be unregistered using a different connection to the initial subscription, as long as
    * the credentials are the same.
    *
    * If the subscription timeout was reached and the subscription was automatically unregistered, you will get
    * an error if you call connection.unsubscribe().
    *
    * @param name Name of the subscription used in connection.subscribe().
    */
  def unsubscribe(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def unsubscribe(name: java.lang.String, callback: js.Function1[/* error */ DBError, scala.Unit]): scala.Unit = js.native
}

