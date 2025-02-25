package typings
package signalrDashNoDashJqueryLib.signalrDashNoDashJqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy extends js.Object {
  var connection: Connection
  var hubName: java.lang.String
  var state: js.Any
  def hasSubscriptions(): scala.Boolean
  def init(connection: Connection, hubName: java.lang.String): scala.Unit
  /**
    * Invokes a server hub method with the given arguments.
    *
    * @param methodName The name of the server hub method.
    */
  def invoke(methodName: java.lang.String, args: js.Any*): js.Promise[_]
  /**
    * Removes the callback invocation request from the server hub for the given event name.
    *
    * @param eventName The name of the hub event to unregister the callback for.
    * @param callback The callback to be invoked.
    */
  def off(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Proxy
  /**
    * Wires up a callback to be invoked when a invocation request is received from the server hub.
    *
    * @param eventName The name of the hub event to register the callback for.
    * @param callback The callback to be invoked.
    */
  def on(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Proxy
}

object Proxy {
  @scala.inline
  def apply(
    connection: Connection,
    hasSubscriptions: () => scala.Boolean,
    hubName: java.lang.String,
    init: (Connection, java.lang.String) => scala.Unit,
    invoke: (java.lang.String, /* repeated */ js.Any) => js.Promise[_],
    off: (java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit]) => Proxy,
    on: (java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit]) => Proxy,
    state: js.Any
  ): Proxy = {
    val __obj = js.Dynamic.literal(connection = connection, hasSubscriptions = js.Any.fromFunction0(hasSubscriptions), hubName = hubName, init = js.Any.fromFunction2(init), invoke = js.Any.fromFunction2(invoke), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), state = state)
  
    __obj.asInstanceOf[Proxy]
  }
}

