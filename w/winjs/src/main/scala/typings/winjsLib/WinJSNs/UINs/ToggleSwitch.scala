package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A control that lets the user switch an option between two states: on (checked is set to true) and off (checked is set to false).
  **/
@JSGlobal("WinJS.UI.ToggleSwitch")
@js.native
//#region Constructors
/**
  * Creates a new ToggleSwitch.
  * @constructor
  * @param element The DOM that hosts the control.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the change event, add a property named "onchange" to the options object and set its value to the event handler.
  **/
class ToggleSwitch () extends js.Object {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets a value that specifies whether the control is on or off.
    **/
  var checked: scala.Boolean = js.native
  /**
    * Gets or sets a value that specifies whether the control is disabled.
    **/
  var disabled: scala.Boolean = js.native
  /**
    * Gets the DOM element that hosts the ToggleSwitch.
    **/
  var element: stdLib.HTMLElement = js.native
  /**
    * Gets or sets the text that displays when the ToggleSwitch is off (checked is set to false).
    **/
  var labelOff: java.lang.String = js.native
  /**
    * Gets or sets the text that displays when the ToggleSwitch is on (checked is set to true).
    **/
  var labelOn: java.lang.String = js.native
  /**
    * Gets or sets the main text for the ToggleSwitch control. This text is always displayed, regardless of whether the control is switched on or off.
    **/
  var title: java.lang.String = js.native
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle.
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function): scala.Unit = js.native
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
  /**
    * Releases resources held by this ToggleSwitch. Call this method when the ToggleSwitch is no longer needed. After calling this method, the ToggleSwitch becomes unusable.
    **/
  def dispose(): scala.Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Occurs when the ToggleSwitch control is flipped to on (checked == true) or off (checked == false).
    * @param eventInfo An object that contains information about the event.
    **/
  def onchange(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function): scala.Unit = js.native
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("WinJS.UI.ToggleSwitch")
@js.native
object ToggleSwitch extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
}

