package typings
package phaserLib.PhaserNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EventEmitter is a Scene Systems plugin compatible version of eventemitter3.
  */
@JSGlobal("Phaser.Events.EventEmitter")
@js.native
class EventEmitter () extends js.Object {
  /**
    * Add a listener for a given event.
    * @param event The event name.
    * @param fn The listener function.
    * @param context The context to invoke the listener with. Default this.
    */
  def addListener(event: java.lang.String, fn: js.Function): EventEmitter = js.native
  def addListener(event: java.lang.String, fn: js.Function, context: js.Any): EventEmitter = js.native
  def addListener(event: js.Symbol, fn: js.Function): EventEmitter = js.native
  def addListener(event: js.Symbol, fn: js.Function, context: js.Any): EventEmitter = js.native
  /**
    * Removes all listeners.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Calls each of the listeners registered for a given event.
    * @param event The event name.
    * @param args Additional arguments that will be passed to the event handler.
    */
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /**
    * Return an array listing the events for which the emitter has registered listeners.
    */
  def eventNames(): js.Array[_] = js.native
  /**
    * Return the number of listeners listening to a given event.
    * @param event The event name.
    */
  def listenerCount(event: java.lang.String): scala.Double = js.native
  def listenerCount(event: js.Symbol): scala.Double = js.native
  /**
    * Return the listeners registered for a given event.
    * @param event The event name.
    */
  def listeners(event: java.lang.String): js.Array[_] = js.native
  def listeners(event: js.Symbol): js.Array[_] = js.native
  /**
    * Remove the listeners of a given event.
    * @param event The event name.
    * @param fn Only remove the listeners that match this function.
    * @param context Only remove the listeners that have this context.
    * @param once Only remove one-time listeners.
    */
  def off(event: java.lang.String): EventEmitter = js.native
  def off(event: java.lang.String, fn: js.Function): EventEmitter = js.native
  def off(event: java.lang.String, fn: js.Function, context: js.Any): EventEmitter = js.native
  def off(event: java.lang.String, fn: js.Function, context: js.Any, once: scala.Boolean): EventEmitter = js.native
  def off(event: js.Symbol): EventEmitter = js.native
  def off(event: js.Symbol, fn: js.Function): EventEmitter = js.native
  def off(event: js.Symbol, fn: js.Function, context: js.Any): EventEmitter = js.native
  def off(event: js.Symbol, fn: js.Function, context: js.Any, once: scala.Boolean): EventEmitter = js.native
  /**
    * Add a listener for a given event.
    * @param event The event name.
    * @param fn The listener function.
    * @param context The context to invoke the listener with. Default this.
    */
  def on(event: java.lang.String, fn: js.Function): EventEmitter = js.native
  def on(event: java.lang.String, fn: js.Function, context: js.Any): EventEmitter = js.native
  def on(event: js.Symbol, fn: js.Function): EventEmitter = js.native
  def on(event: js.Symbol, fn: js.Function, context: js.Any): EventEmitter = js.native
  /**
    * Add a one-time listener for a given event.
    * @param event The event name.
    * @param fn The listener function.
    * @param context The context to invoke the listener with. Default this.
    */
  def once(event: java.lang.String, fn: js.Function): EventEmitter = js.native
  def once(event: java.lang.String, fn: js.Function, context: js.Any): EventEmitter = js.native
  def once(event: js.Symbol, fn: js.Function): EventEmitter = js.native
  def once(event: js.Symbol, fn: js.Function, context: js.Any): EventEmitter = js.native
  /**
    * Remove all listeners, or those of the specified event.
    * @param event The event name.
    */
  def removeAllListeners(): EventEmitter = js.native
  def removeAllListeners(event: java.lang.String): EventEmitter = js.native
  def removeAllListeners(event: js.Symbol): EventEmitter = js.native
  /**
    * Remove the listeners of a given event.
    * @param event The event name.
    * @param fn Only remove the listeners that match this function.
    * @param context Only remove the listeners that have this context.
    * @param once Only remove one-time listeners.
    */
  def removeListener(event: java.lang.String): EventEmitter = js.native
  def removeListener(event: java.lang.String, fn: js.Function): EventEmitter = js.native
  def removeListener(event: java.lang.String, fn: js.Function, context: js.Any): EventEmitter = js.native
  def removeListener(event: java.lang.String, fn: js.Function, context: js.Any, once: scala.Boolean): EventEmitter = js.native
  def removeListener(event: js.Symbol): EventEmitter = js.native
  def removeListener(event: js.Symbol, fn: js.Function): EventEmitter = js.native
  def removeListener(event: js.Symbol, fn: js.Function, context: js.Any): EventEmitter = js.native
  def removeListener(event: js.Symbol, fn: js.Function, context: js.Any, once: scala.Boolean): EventEmitter = js.native
  /**
    * Removes all listeners.
    */
  def shutdown(): scala.Unit = js.native
}

