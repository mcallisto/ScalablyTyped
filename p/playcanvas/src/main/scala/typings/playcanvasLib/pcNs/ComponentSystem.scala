package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.ComponentSystem
  * @class Component Systems contain the logic and functionality to update all Components of a particular type
  * @param {pc.Application} app The running Application
  */
@JSGlobal("pc.ComponentSystem")
@js.native
class ComponentSystem protected () extends js.Object {
  def this(app: Application) = this()
  /**
    * @private
    * @field
    * @type Array
    * @name pc.ComponentSystem#store
    * @description The store where all {@link pc.ComponentData} objects are kept
    */
  var store: js.Array[ComponentData] = js.native
  /**
    * @private
    * @function
    * @name pc.ComponentSystem#addComponent
    * @description Create new {@link pc.Component} and {@link pc.ComponentData} instances and attach them to the entity
    * @param {pc.Entity} entity The Entity to attach this component to
    * @param {Object} data The source data with which to create the component
    * @returns {pc.Component} Returns a Component of type defined by the component system
    * @example
    *   var entity = new pc.Entity(app);
    *   app.systems.model.addComponent(entity, { type: 'box' });
    *   // entity.model is now set to a pc.ModelComponent
    */
  /* private */ def addComponent(entity: Entity, data: js.Object): Component = js.native
  /**
    * @private
    * @function
    * @name pc.ComponentSystem#cloneComponent
    * @description Create a clone of component. This creates a copy all ComponentData variables.
    * @param {pc.Entity} entity The entity to clone the component from
    * @param {pc.Entity} clone The entity to clone the component into
    */
  /* private */ def cloneComponent(entity: Entity, clone: Entity): Component = js.native
  /**
    * @function
    * @name pc.ComponentSystem#fire
    * @description Fire an event, all additional arguments are passed on to the event listener
    * @param {Object} name Name of event to fire
    * @param {*} [...] Arguments that are passed to the event handler
    * @example
    * obj.fire('test', 'This is the message');
    */
  def fire(
    name: java.lang.String,
    arg1: js.Any,
    arg2: js.UndefOr[js.Any],
    arg3: js.UndefOr[js.Any],
    arg4: js.UndefOr[js.Any],
    arg5: js.UndefOr[js.Any],
    arg6: js.UndefOr[js.Any],
    arg7: js.UndefOr[js.Any],
    arg8: js.UndefOr[js.Any]
  ): js.Any = js.native
  /**
    * @function
    * @name pc.ComponentSystem#hasEvent
    * @description Test if there are any handlers bound to an event name
    * @param {String} name The name of the event to test
    * @example
    * obj.on('test', function () { }); // bind an event to 'test'
    * obj.hasEvent('test'); // returns true
    */
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  /**
    * @private
    * @function
    * @name pc.ComponentSystem#initializeComponentData
    * @description Called during {@link pc.ComponentSystem#addComponent} to initialize the {@link pc.ComponentData} in the store
    * This can be overridden by derived Component Systems and either called by the derived System or replaced entirely
    */
  /* private */ def initializeComponentData(component: Component, data: js.Object, properties: js.Object): scala.Unit = js.native
  /**
    * @function
    * @name pc.ComponentSystem#off
    * @description Detach an event handler from an event. If callback is not provided then all callbacks are unbound from the event,
    * if scope is not provided then all events with the callback will be unbound.
    * @param {String} [name] Name of the event to unbind
    * @param {Function} [callback] Function to be unbound
    * @param {Object} [scope] Scope that was used as the this when the event is fired
    * @example
    * var handler = function () {
    * };
    * obj.on('test', handler);
    *
    * obj.off(); // Removes all events
    * obj.off('test'); // Removes all events called 'test'
    * obj.off('test', handler); // Removes all handler functions, called 'test'
    * obj.off('test', handler, this); // Removes all hander functions, called 'test' with scope this
    */
  def off(name: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit], scope: js.Any): js.Any = js.native
  // Events
  /**
    * @function
    * @name pc.ComponentSystem#on
    * @description Attach an event handler to an event
    * @param {String} name Name of the event to bind the callback to
    * @param {Function} callback Function that is called when event is fired. Note the callback is limited to 8 arguments.
    * @param {Object} [scope] Object to use as 'this' when the event is fired, defaults to current this
    * @example
    * obj.on('test', function (a, b) {
    *     console.log(a + b);
    * });
    * obj.fire('test', 1, 2); // prints 3 to the console
    */
  def on(name: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit], scope: js.Any): js.Any = js.native
  /**
    * @function
    * @name pc.ComponentSystem#once
    * @description Attach an event handler to an event. This handler will be removed after being fired once.
    * @param {String} name Name of the event to bind the callback to
    * @param {Function} callback Function that is called when event is fired. Note the callback is limited to 8 arguments.
    * @param {Object} [scope] Object to use as 'this' when the event is fired, defaults to current this
    * @example
    * obj.once('test', function (a, b) {
    *     console.log(a + b);
    * });
    * obj.fire('test', 1, 2); // prints 3 to the console
    * obj.fire('test', 1, 2); // not going to get handled
    */
  def once(name: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit], scope: js.Any): js.Any = js.native
  /**
    * @private
    * @function
    * @name pc.ComponentSystem#removeComponent
    * @description Remove the {@link pc.Component} from the entity and delete the associated {@link pc.ComponentData}
    * @param {pc.Entity} entity The entity to remove the component from
    * @example
    * app.systems.model.removeComponent(entity);
    * // entity.model === undefined
    */
  /* private */ def removeComponent(entity: Entity): scala.Unit = js.native
}

