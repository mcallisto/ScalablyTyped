package typings
package winjsLib.winjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides helper functions, for example, functions to add and remove CSS classes.
**/
@JSImport("winjs", "Utilities")
@js.native
object UtilitiesNs extends js.Object {
  /**
    * Represents the result of a query selector, and provides various operations that perform actions over the elements of the collection.
    **/
  @js.native
  class QueryCollection[T] ()
    extends winjsLib.WinJSNs.UtilitiesNs.QueryCollection[T]
  
  //#endregion Functions
  //#region Properties
  /**
    * Gets whether the current script context has access to WinRT APIs.
    **/
  var hasWinRT: scala.Boolean = js.native
  /**
    * Determines if strict declarative processing is enabled in this script context.
    **/
  var strictProcessing: scala.Boolean = js.native
  //#endregion Objects
  //#region Functions
  /**
    * Adds the specified class to the specified element.
    * @param e The element to which to add the class.
    * @param name The name of the class to add.
    * @returns The element.
    **/
  def addClass[T /* <: stdLib.HTMLElement */](e: T, name: java.lang.String): T = js.native
  /**
    * Gets a collection of elements that are the direct children of the specified element.
    * @param element The parent element.
    * @returns The collection of children of the element.
    **/
  def children(element: stdLib.HTMLElement): winjsLib.WinJSNs.UtilitiesNs.QueryCollection[stdLib.HTMLElement] = js.native
  /**
    * Converts a CSS positioning string for the specified element to pixels.
    * @param element The element.
    * @param value The CSS positioning string.
    * @returns The number of pixels.
    **/
  def convertToPixels(element: stdLib.HTMLElement, value: java.lang.String): scala.Double = js.native
  /**
    * Creates an object that has one event for each name passed to the function.
    * @param events A variable list of property names.
    * @returns The object with the specified properties. The names of the properties are prefixed with 'on'.
    **/
  def createEventProperties(events: java.lang.String*): js.Any = js.native
  /**
    * Gets the data value associated with the specified element.
    * @param element The element.
    * @returns The value associated with the element.
    **/
  def data(element: stdLib.HTMLElement): js.Any = js.native
  /**
    * Disposes all first-generation disposable elements that are descendents of the specified element. The specified element itself is not disposed.
    * @param element The root element whose sub-tree is to be disposed.
    **/
  def disposeSubTree(element: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * Removes all the child nodes from the specified element.
    * @param element The element.
    * @returns The element.
    **/
  def empty[T /* <: stdLib.HTMLElement */](element: T): T = js.native
  /**
    * Determines whether the specified event occurred within the specified element.
    * @param element The element.
    * @param event The event.
    * @returns true if the event occurred within the element; otherwise, false.
    **/
  def eventWithinElement(element: stdLib.HTMLElement, event: stdLib.Event): scala.Boolean = js.native
  /**
    * Adds tags and type to a logging message.
    * @param message The message to be formatted.
    * @param tag The tag(s) to be applied to the message. Multiple tags should be separated by spaces.
    * @param type The type of the message.
    * @returns The formatted message.
    **/
  def formatLog(message: java.lang.String, tag: java.lang.String, `type`: java.lang.String): java.lang.String = js.native
  /**
    * Gets the height of the content of the specified element. The content height does not include borders or padding.
    * @param element The element.
    * @returns The content height of the element.
    **/
  def getContentHeight(element: stdLib.HTMLElement): scala.Double = js.native
  /**
    * Gets the width of the content of the specified element. The content width does not include borders or padding.
    * @param element The element.
    * @returns The content width of the element.
    **/
  def getContentWidth(element: stdLib.HTMLElement): scala.Double = js.native
  /**
    * Gets the leaf-level type or namespace specified by the name parameter.
    * @param name The name of the member.
    * @param root The root to start in. Defaults to the global object.
    * @returns The leaf-level type or namespace in the specified parent namespace.
    **/
  def getMember(name: java.lang.String): js.Any = js.native
  def getMember(name: java.lang.String, root: js.Any): js.Any = js.native
  /**
    * Gets the position of the specified element.
    * @param element The element.
    * @returns An object that contains the left, top, width and height properties of the element.
    **/
  def getPosition(element: stdLib.HTMLElement): winjsLib.WinJSNs.UtilitiesNs.IPosition = js.native
  /**
    * Gets the left coordinate of the specified element relative to the specified parent.
    * @param element The element.
    * @param parent The parent element.
    * @returns The relative left coordinate.
    **/
  def getRelativeLeft(): scala.Double = js.native
  def getRelativeLeft(element: stdLib.HTMLElement): scala.Double = js.native
  def getRelativeLeft(element: stdLib.HTMLElement, parent: stdLib.HTMLElement): scala.Double = js.native
  /**
    * Gets the top coordinate of the element relative to the specified parent.
    * @param element The element.
    * @param parent The parent element.
    * @returns The relative top coordinate.
    **/
  def getRelativeTop(): scala.Double = js.native
  def getRelativeTop(element: stdLib.HTMLElement): scala.Double = js.native
  def getRelativeTop(element: stdLib.HTMLElement, parent: stdLib.HTMLElement): scala.Double = js.native
  /**
    * Gets the scrollLeft and scrollTop of the specified element, adjusting the scrollLeft to change from browser specific coordinates to logical coordinates when in RTL.
    * @param element The element.
    * @returns An object with two properties: scrollLeft and scrollTop
    **/
  def getScrollPosition(element: stdLib.HTMLElement): winjsLib.Anon_ScrollLeft = js.native
  /**
    * Gets the tab index of the specified element.
    * @param element The element
    * @returns The tabIndex of the element. Returns -1 if the element cannot be tabbed to.
    **/
  def getTabIndex(element: stdLib.HTMLElement): scala.Double = js.native
  /**
    * Gets the height of the element, including its margins.
    * @param element The element.
    * @returns The height of the element including margins.
    **/
  def getTotalHeight(element: stdLib.HTMLElement): scala.Double = js.native
  /**
    * Gets the width of the element, including margins.
    * @param element The element.
    * @returns The width of the element including margins.
    **/
  def getTotalWidth(element: stdLib.HTMLElement): scala.Double = js.native
  /**
    * Determines whether the specified element has the specified class.
    * @param e The element.
    * @param name The name of the class.
    * @returns true if the element has the class, otherwise false.
    **/
  def hasClass(e: stdLib.HTMLElement, name: java.lang.String): scala.Boolean = js.native
  /**
    * Returns a collection with zero or one elements matching the specified id.
    * @param id The ID of the element (or elements).
    * @returns A collection of elements whose id matches the id parameter.
    **/
  def id(id: java.lang.String): winjsLib.WinJSNs.UtilitiesNs.QueryCollection[stdLib.HTMLElement] = js.native
  /**
    * Calls insertAdjacentHTML on the specified element.
    * @param element The element on which insertAdjacentHTML is to be called.
    * @param position The position relative to the element at which to insert the HTML. Possible values are: beforebegin, afterbegin, beforeend, afterend.
    * @param text The text to insert.
    **/
  def insertAdjacentHTML(element: stdLib.HTMLElement, position: java.lang.String, text: java.lang.String): scala.Unit = js.native
  /**
    * Calls insertAdjacentHTML on the specified element in the context of MSApp.execUnsafeLocalFunction.
    * @param element The element on which insertAdjacentHTML is to be called.
    * @param position The position relative to the element at which to insert the HTML. Possible values are: beforebegin, afterbegin, beforeend, afterend.
    * @param text Value to be provided to insertAdjacentHTML.
    **/
  def insertAdjacentHTMLUnsafe(element: stdLib.HTMLElement, position: java.lang.String, text: java.lang.String): scala.Unit = js.native
  /**
    * Attaches the default dispose API wrapping the dispose implementation to the specified element.
    * @param element The element to mark as disposable.
    * @param disposeImpl The function containing the element-specific dispose logic, called by the dispose function that markDisposable attaches.
    **/
  def markDisposable(element: stdLib.HTMLElement): scala.Unit = js.native
  def markDisposable(element: stdLib.HTMLElement, disposeImpl: js.Function): scala.Unit = js.native
  /**
    * Marks a function as being compatible with declarative processing. Declarative processing is performed by WinJS.UI.processAll or WinJS.Binding.processAll.
    * @param func The function to be marked as compatible with declarative processing.
    * @returns The input function, marked as compatible with declarative processing.
    **/
  def markSupportedForProcessing[U /* <: js.Function */](func: U): U = js.native
  /**
    * Returns a QueryCollection with zero or one elements matching the specified selector query.
    * @param query The CSS selector to use. See Selectors for more information.
    * @param element Optional. The root element at which to start the query. If this parameter is omitted, the scope of the query is the entire document.
    * @returns A QueryCollection with zero or one elements matching the specified selector query.
    **/
  def query(query: js.Any): winjsLib.WinJSNs.UtilitiesNs.QueryCollection[stdLib.HTMLElement] = js.native
  def query(query: js.Any, element: stdLib.HTMLElement): winjsLib.WinJSNs.UtilitiesNs.QueryCollection[stdLib.HTMLElement] = js.native
  /**
    * Ensures that the specified function executes only after the DOMContentLoaded event has fired for the current page. The DOMContentLoaded event occurs after the page has been parsed but before all the resources are loaded.
    * @param callback A function that executes after the DOMContentLoaded event has occurred.
    * @param async If true, the callback should be executed asynchronously.
    * @returns A promise that completes after the DOMContentLoaded event has occurred.
    **/
  def ready(): winjsLib.WinJSNs.Promise[_] = js.native
  def ready(callback: js.Function): winjsLib.WinJSNs.Promise[_] = js.native
  def ready(callback: js.Function, async: scala.Boolean): winjsLib.WinJSNs.Promise[_] = js.native
  /**
    * Removes the specified class from the specified element.
    * @param e The element from which to remove the class.
    * @param name The name of the class to remove.
    * @returns The element.
    **/
  def removeClass[T /* <: stdLib.HTMLElement */](e: T, name: java.lang.String): T = js.native
  /**
    * Asserts that the value is compatible with declarative processing. Declarative processing is performed by WinJS.UI.processAll or WinJS.Binding.processAll. If the value is not compatible, and strictProcessing is on, an exception is thrown. All functions that have been declared using WinJS.Class.define, WinJS.Class.derive, WinJS.UI.Pages.define, or WinJS.Binding.converter are automatically marked as supported for declarative processing. Any other function that you use from a declarative context (that is, a context in which an HTML element has a data-win-control or data-win-options attribute) must be marked manually by calling this function. When you mark a function as supported for declarative processing, you are guaranteeing that the code in the function is secure from injection of third-party content.
    * @param value The value to be tested for compatibility with declarative processing. If the value is a function it must be marked with a property supportedForProcessing with a value of true when strictProcessing is on. For more information, see WinJS.Utilities.markSupportedForProcessing.
    * @returns The input value.
    **/
  def requireSupportedForProcessing[T](value: T): T = js.native
  /**
    * Sets the innerHTML property of the specified element to the specified text.
    * @param element The element on which the innerHTML property is to be set.
    * @param text The value to be set to the innerHTML property.
    **/
  def setInnerHTML(element: stdLib.HTMLElement, text: java.lang.String): scala.Unit = js.native
  /**
    * Sets the innerHTML property of the specified element to the specified text.
    * @param element The element on which the innerHTML property is to be set.
    * @param text The value to be set to the innerHTML property.
    **/
  def setInnerHTMLUnsafe(element: stdLib.HTMLElement, text: java.lang.String): scala.Unit = js.native
  /**
    * Sets the outerHTML property of the specified element to the specified text.
    * @param element The element on which the outerHTML property is to be set.
    * @param text The value to be set to the outerHTML property.
    **/
  def setOuterHTML(element: stdLib.HTMLElement, text: java.lang.String): scala.Unit = js.native
  /**
    * Sets the outerHTML property of the specified element to the specified text in the context of MSApp.execUnsafeLocalFunction.
    * @param element The element on which the outerHTML property is to be set.
    * @param text The value to be set to the outerHTML property.
    **/
  def setOuterHTMLUnsafe(element: stdLib.HTMLElement, text: java.lang.String): scala.Unit = js.native
  /**
    * Sets the scrollLeft and scrollTop of the specified element, changing the scrollLeft from logical coordinates to browser-specific coordinates when in RTL.
    * @param element The element.
    * @param position An object describing the position to set.
    **/
  def setScrollPosition(element: stdLib.HTMLElement, position: winjsLib.Anon_ScrollLeft): scala.Unit = js.native
  /**
    * Configures a logger that writes messages containing the specified tags to the JavaScript console.
    * @param options The tags for messages to log. Multiple tags should be separated by spaces. May contain type, tags, excludeTags and action properties.
    **/
  def startLog(): scala.Unit = js.native
  def startLog(options: winjsLib.WinJSNs.UtilitiesNs.ILogOptions): scala.Unit = js.native
  def startLog(tags: java.lang.String): scala.Unit = js.native
  /**
    * Removes the WinJS logger that had previously been set up.
    **/
  def stopLog(): scala.Unit = js.native
  /**
    * Toggles (adds or removes) the specified class on the specified element. If the class is present, it is removed; if it is absent, it is added.
    * @param e The element on which to toggle the class.
    * @param name The name of the class to toggle.
    * @returns The element.
    **/
  def toggleClass[T /* <: stdLib.HTMLElement */](e: T, name: java.lang.String): T = js.native
  //#region Enumerations
  /**
    * Defines a set of keyboard values.
    **/
  @js.native
  object Key extends js.Object {
    /* 74 */ val F1: winjsLib.WinJSNs.UtilitiesNs.Key.F1 with scala.Double = js.native
    /* 83 */ val F10: winjsLib.WinJSNs.UtilitiesNs.Key.F10 with scala.Double = js.native
    /* 84 */ val F11: winjsLib.WinJSNs.UtilitiesNs.Key.F11 with scala.Double = js.native
    /* 85 */ val F12: winjsLib.WinJSNs.UtilitiesNs.Key.F12 with scala.Double = js.native
    /* 75 */ val F2: winjsLib.WinJSNs.UtilitiesNs.Key.F2 with scala.Double = js.native
    /* 76 */ val F3: winjsLib.WinJSNs.UtilitiesNs.Key.F3 with scala.Double = js.native
    /* 77 */ val F4: winjsLib.WinJSNs.UtilitiesNs.Key.F4 with scala.Double = js.native
    /* 78 */ val F5: winjsLib.WinJSNs.UtilitiesNs.Key.F5 with scala.Double = js.native
    /* 79 */ val F6: winjsLib.WinJSNs.UtilitiesNs.Key.F6 with scala.Double = js.native
    /* 80 */ val F7: winjsLib.WinJSNs.UtilitiesNs.Key.F7 with scala.Double = js.native
    /* 81 */ val F8: winjsLib.WinJSNs.UtilitiesNs.Key.F8 with scala.Double = js.native
    /* 82 */ val F9: winjsLib.WinJSNs.UtilitiesNs.Key.F9 with scala.Double = js.native
    /* 105 */ val GamepadA: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadA with scala.Double = js.native
    /* 106 */ val GamepadB: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadB with scala.Double = js.native
    /* 114 */ val GamepadDPadDown: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadDPadDown with scala.Double = js.native
    /* 115 */ val GamepadDPadLeft: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadDPadLeft with scala.Double = js.native
    /* 116 */ val GamepadDPadRight: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadDPadRight with scala.Double = js.native
    /* 113 */ val GamepadDPadUp: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadDPadUp with scala.Double = js.native
    /* 110 */ val GamepadLeftShoulder: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadLeftShoulder with scala.Double = js.native
    /* 119 */ val GamepadLeftThumbstick: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadLeftThumbstick with scala.Double = js.native
    /* 122 */ val GamepadLeftThumbstickDown: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadLeftThumbstickDown with scala.Double = js.native
    /* 124 */ val GamepadLeftThumbstickLeft: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadLeftThumbstickLeft with scala.Double = js.native
    /* 123 */ val GamepadLeftThumbstickRight: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadLeftThumbstickRight with scala.Double = js.native
    /* 121 */ val GamepadLeftThumbstickUp: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadLeftThumbstickUp with scala.Double = js.native
    /* 111 */ val GamepadLeftTrigger: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadLeftTrigger with scala.Double = js.native
    /* 117 */ val GamepadMenu: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadMenu with scala.Double = js.native
    /* 109 */ val GamepadRightShoulder: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadRightShoulder with scala.Double = js.native
    /* 120 */ val GamepadRightThumbstick: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadRightThumbstick with scala.Double = js.native
    /* 126 */ val GamepadRightThumbstickDown: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadRightThumbstickDown with scala.Double = js.native
    /* 128 */ val GamepadRightThumbstickLeft: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadRightThumbstickLeft with scala.Double = js.native
    /* 127 */ val GamepadRightThumbstickRight: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadRightThumbstickRight with scala.Double = js.native
    /* 125 */ val GamepadRightThumbstickUp: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadRightThumbstickUp with scala.Double = js.native
    /* 112 */ val GamepadRightTrigger: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadRightTrigger with scala.Double = js.native
    /* 118 */ val GamepadView: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadView with scala.Double = js.native
    /* 107 */ val GamepadX: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadX with scala.Double = js.native
    /* 108 */ val GamepadY: winjsLib.WinJSNs.UtilitiesNs.Key.GamepadY with scala.Double = js.native
    /* 133 */ val IME: winjsLib.WinJSNs.UtilitiesNs.Key.IME with scala.Double = js.native
    /* 92 */ val NavigationAccept: winjsLib.WinJSNs.UtilitiesNs.Key.NavigationAccept with scala.Double = js.native
    /* 93 */ val NavigationCancel: winjsLib.WinJSNs.UtilitiesNs.Key.NavigationCancel with scala.Double = js.native
    /* 89 */ val NavigationDown: winjsLib.WinJSNs.UtilitiesNs.Key.NavigationDown with scala.Double = js.native
    /* 90 */ val NavigationLeft: winjsLib.WinJSNs.UtilitiesNs.Key.NavigationLeft with scala.Double = js.native
    /* 87 */ val NavigationMenu: winjsLib.WinJSNs.UtilitiesNs.Key.NavigationMenu with scala.Double = js.native
    /* 91 */ val NavigationRight: winjsLib.WinJSNs.UtilitiesNs.Key.NavigationRight with scala.Double = js.native
    /* 88 */ val NavigationUp: winjsLib.WinJSNs.UtilitiesNs.Key.NavigationUp with scala.Double = js.native
    /* 86 */ val NavigationView: winjsLib.WinJSNs.UtilitiesNs.Key.NavigationView with scala.Double = js.native
    /* 30 */ val a: winjsLib.WinJSNs.UtilitiesNs.Key.a with scala.Double = js.native
    /* 70 */ val add: winjsLib.WinJSNs.UtilitiesNs.Key.add with scala.Double = js.native
    /* 5 */ val alt: winjsLib.WinJSNs.UtilitiesNs.Key.alt with scala.Double = js.native
    /* 31 */ val b: winjsLib.WinJSNs.UtilitiesNs.Key.b with scala.Double = js.native
    /* 130 */ val backSlash: winjsLib.WinJSNs.UtilitiesNs.Key.backSlash with scala.Double = js.native
    /* 0 */ val backspace: winjsLib.WinJSNs.UtilitiesNs.Key.backspace with scala.Double = js.native
    /* 96 */ val browserBack: winjsLib.WinJSNs.UtilitiesNs.Key.browserBack with scala.Double = js.native
    /* 97 */ val browserForward: winjsLib.WinJSNs.UtilitiesNs.Key.browserForward with scala.Double = js.native
    /* 32 */ val c: winjsLib.WinJSNs.UtilitiesNs.Key.c with scala.Double = js.native
    /* 7 */ val capsLock: winjsLib.WinJSNs.UtilitiesNs.Key.capsLock with scala.Double = js.native
    /* 131 */ val closeBracket: winjsLib.WinJSNs.UtilitiesNs.Key.closeBracket with scala.Double = js.native
    /* 100 */ val comma: winjsLib.WinJSNs.UtilitiesNs.Key.comma with scala.Double = js.native
    /* 4 */ val ctrl: winjsLib.WinJSNs.UtilitiesNs.Key.ctrl with scala.Double = js.native
    /* 33 */ val d: winjsLib.WinJSNs.UtilitiesNs.Key.d with scala.Double = js.native
    /* 101 */ val dash: winjsLib.WinJSNs.UtilitiesNs.Key.dash with scala.Double = js.native
    /* 72 */ val decimalPoint: winjsLib.WinJSNs.UtilitiesNs.Key.decimalPoint with scala.Double = js.native
    /* 19 */ val deleteKey: winjsLib.WinJSNs.UtilitiesNs.Key.deleteKey with scala.Double = js.native
    /* 73 */ val divide: winjsLib.WinJSNs.UtilitiesNs.Key.divide with scala.Double = js.native
    /* 17 */ val downArrow: winjsLib.WinJSNs.UtilitiesNs.Key.downArrow with scala.Double = js.native
    /* 34 */ val e: winjsLib.WinJSNs.UtilitiesNs.Key.e with scala.Double = js.native
    /* 12 */ val end: winjsLib.WinJSNs.UtilitiesNs.Key.end with scala.Double = js.native
    /* 2 */ val enter: winjsLib.WinJSNs.UtilitiesNs.Key.enter with scala.Double = js.native
    /* 99 */ val equal: winjsLib.WinJSNs.UtilitiesNs.Key.equal with scala.Double = js.native
    /* 8 */ val escape: winjsLib.WinJSNs.UtilitiesNs.Key.escape with scala.Double = js.native
    /* 35 */ val f: winjsLib.WinJSNs.UtilitiesNs.Key.f with scala.Double = js.native
    /* 103 */ val forwardSlash: winjsLib.WinJSNs.UtilitiesNs.Key.forwardSlash with scala.Double = js.native
    /* 36 */ val g: winjsLib.WinJSNs.UtilitiesNs.Key.g with scala.Double = js.native
    /* 104 */ val graveAccent: winjsLib.WinJSNs.UtilitiesNs.Key.graveAccent with scala.Double = js.native
    /* 37 */ val h: winjsLib.WinJSNs.UtilitiesNs.Key.h with scala.Double = js.native
    /* 13 */ val home: winjsLib.WinJSNs.UtilitiesNs.Key.home with scala.Double = js.native
    /* 38 */ val i: winjsLib.WinJSNs.UtilitiesNs.Key.i with scala.Double = js.native
    /* 18 */ val insert: winjsLib.WinJSNs.UtilitiesNs.Key.insert with scala.Double = js.native
    /* 39 */ val j: winjsLib.WinJSNs.UtilitiesNs.Key.j with scala.Double = js.native
    /* 40 */ val k: winjsLib.WinJSNs.UtilitiesNs.Key.k with scala.Double = js.native
    /* 41 */ val l: winjsLib.WinJSNs.UtilitiesNs.Key.l with scala.Double = js.native
    /* 14 */ val leftArrow: winjsLib.WinJSNs.UtilitiesNs.Key.leftArrow with scala.Double = js.native
    /* 56 */ val leftWindows: winjsLib.WinJSNs.UtilitiesNs.Key.leftWindows with scala.Double = js.native
    /* 42 */ val m: winjsLib.WinJSNs.UtilitiesNs.Key.m with scala.Double = js.native
    /* 58 */ val menu: winjsLib.WinJSNs.UtilitiesNs.Key.menu with scala.Double = js.native
    /* 69 */ val multiply: winjsLib.WinJSNs.UtilitiesNs.Key.multiply with scala.Double = js.native
    /* 43 */ val n: winjsLib.WinJSNs.UtilitiesNs.Key.n with scala.Double = js.native
    /* 20 */ val num0: winjsLib.WinJSNs.UtilitiesNs.Key.num0 with scala.Double = js.native
    /* 21 */ val num1: winjsLib.WinJSNs.UtilitiesNs.Key.num1 with scala.Double = js.native
    /* 22 */ val num2: winjsLib.WinJSNs.UtilitiesNs.Key.num2 with scala.Double = js.native
    /* 23 */ val num3: winjsLib.WinJSNs.UtilitiesNs.Key.num3 with scala.Double = js.native
    /* 24 */ val num4: winjsLib.WinJSNs.UtilitiesNs.Key.num4 with scala.Double = js.native
    /* 25 */ val num5: winjsLib.WinJSNs.UtilitiesNs.Key.num5 with scala.Double = js.native
    /* 26 */ val num6: winjsLib.WinJSNs.UtilitiesNs.Key.num6 with scala.Double = js.native
    /* 27 */ val num7: winjsLib.WinJSNs.UtilitiesNs.Key.num7 with scala.Double = js.native
    /* 28 */ val num8: winjsLib.WinJSNs.UtilitiesNs.Key.num8 with scala.Double = js.native
    /* 29 */ val num9: winjsLib.WinJSNs.UtilitiesNs.Key.num9 with scala.Double = js.native
    /* 94 */ val numLock: winjsLib.WinJSNs.UtilitiesNs.Key.numLock with scala.Double = js.native
    /* 59 */ val numPad0: winjsLib.WinJSNs.UtilitiesNs.Key.numPad0 with scala.Double = js.native
    /* 60 */ val numPad1: winjsLib.WinJSNs.UtilitiesNs.Key.numPad1 with scala.Double = js.native
    /* 61 */ val numPad2: winjsLib.WinJSNs.UtilitiesNs.Key.numPad2 with scala.Double = js.native
    /* 62 */ val numPad3: winjsLib.WinJSNs.UtilitiesNs.Key.numPad3 with scala.Double = js.native
    /* 63 */ val numPad4: winjsLib.WinJSNs.UtilitiesNs.Key.numPad4 with scala.Double = js.native
    /* 64 */ val numPad5: winjsLib.WinJSNs.UtilitiesNs.Key.numPad5 with scala.Double = js.native
    /* 65 */ val numPad6: winjsLib.WinJSNs.UtilitiesNs.Key.numPad6 with scala.Double = js.native
    /* 66 */ val numPad7: winjsLib.WinJSNs.UtilitiesNs.Key.numPad7 with scala.Double = js.native
    /* 67 */ val numPad8: winjsLib.WinJSNs.UtilitiesNs.Key.numPad8 with scala.Double = js.native
    /* 68 */ val numPad9: winjsLib.WinJSNs.UtilitiesNs.Key.numPad9 with scala.Double = js.native
    /* 44 */ val o: winjsLib.WinJSNs.UtilitiesNs.Key.o with scala.Double = js.native
    /* 129 */ val openBracket: winjsLib.WinJSNs.UtilitiesNs.Key.openBracket with scala.Double = js.native
    /* 45 */ val p: winjsLib.WinJSNs.UtilitiesNs.Key.p with scala.Double = js.native
    /* 11 */ val pageDown: winjsLib.WinJSNs.UtilitiesNs.Key.pageDown with scala.Double = js.native
    /* 10 */ val pageUp: winjsLib.WinJSNs.UtilitiesNs.Key.pageUp with scala.Double = js.native
    /* 6 */ val pause: winjsLib.WinJSNs.UtilitiesNs.Key.pause with scala.Double = js.native
    /* 102 */ val period: winjsLib.WinJSNs.UtilitiesNs.Key.period with scala.Double = js.native
    /* 46 */ val q: winjsLib.WinJSNs.UtilitiesNs.Key.q with scala.Double = js.native
    /* 47 */ val r: winjsLib.WinJSNs.UtilitiesNs.Key.r with scala.Double = js.native
    /* 16 */ val rightArrow: winjsLib.WinJSNs.UtilitiesNs.Key.rightArrow with scala.Double = js.native
    /* 57 */ val rightWindows: winjsLib.WinJSNs.UtilitiesNs.Key.rightWindows with scala.Double = js.native
    /* 48 */ val s: winjsLib.WinJSNs.UtilitiesNs.Key.s with scala.Double = js.native
    /* 95 */ val scrollLock: winjsLib.WinJSNs.UtilitiesNs.Key.scrollLock with scala.Double = js.native
    /* 98 */ val semicolon: winjsLib.WinJSNs.UtilitiesNs.Key.semicolon with scala.Double = js.native
    /* 3 */ val shift: winjsLib.WinJSNs.UtilitiesNs.Key.shift with scala.Double = js.native
    /* 132 */ val singleQuote: winjsLib.WinJSNs.UtilitiesNs.Key.singleQuote with scala.Double = js.native
    /* 9 */ val space: winjsLib.WinJSNs.UtilitiesNs.Key.space with scala.Double = js.native
    /* 71 */ val subtract: winjsLib.WinJSNs.UtilitiesNs.Key.subtract with scala.Double = js.native
    /* 49 */ val t: winjsLib.WinJSNs.UtilitiesNs.Key.t with scala.Double = js.native
    /* 1 */ val tab: winjsLib.WinJSNs.UtilitiesNs.Key.tab with scala.Double = js.native
    /* 50 */ val u: winjsLib.WinJSNs.UtilitiesNs.Key.u with scala.Double = js.native
    /* 15 */ val upArrow: winjsLib.WinJSNs.UtilitiesNs.Key.upArrow with scala.Double = js.native
    /* 51 */ val v: winjsLib.WinJSNs.UtilitiesNs.Key.v with scala.Double = js.native
    /* 52 */ val w: winjsLib.WinJSNs.UtilitiesNs.Key.w with scala.Double = js.native
    /* 53 */ val x: winjsLib.WinJSNs.UtilitiesNs.Key.x with scala.Double = js.native
    /* 54 */ val y: winjsLib.WinJSNs.UtilitiesNs.Key.y with scala.Double = js.native
    /* 55 */ val z: winjsLib.WinJSNs.UtilitiesNs.Key.z with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UtilitiesNs.Key with scala.Double] = js.native
  }
  
  /* static members */
  @js.native
  object QueryCollection extends js.Object {
    //#endregion Methods
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /**
    * Provides functions and objects for scheduling and managing asynchronous tasks.
  **/
  @JSName("Scheduler")
  @js.native
  object SchedulerNs extends js.Object {
    //#endregion Interfaces
    //#region Properties
    /**
      * Gets the current priority at which the caller is executing.
      **/
    var currentPriority: winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority = js.native
    //#endregion Properties
    //#region Functions
    /**
      * Creates and returns a new IOwnerToken which can be set to the owner property of one or more jobs.
      * @returns A new IOwnerToken which can be set to the owner property of one or more jobs.
      **/
    def createOwnerToken(): winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.IOwnerToken = js.native
    /**
      * Runs the specified callback in a high priority context.
      * @param callback The callback to run in a high priority callback.
      * @returns The return value of the callback.
      **/
    def execHigh[U](callback: js.Function0[U]): U = js.native
    /**
      * Runs jobs in the scheduler without timeslicing until all jobs at the specified priority and higher have executed.
      * @param priority The priority to which the scheduler should drain. The default is -15.
      * @param name An optional description of the drain request for diagnostics.
      * @returns A Promise which completes when the drain has finished. Canceling this Promise cancels the drain request. This Promise will never enter an error state.
      **/
    def requestDrain(): winjsLib.WinJSNs.Promise[_] = js.native
    def requestDrain(priority: winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority): winjsLib.WinJSNs.Promise[_] = js.native
    def requestDrain(priority: winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority, name: java.lang.String): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Returns a string representation of the scheduler's state for diagnostic purposes. The jobs and drain requests are displayed in the order in which they are currently expected to be processed. The current job and drain request are marked by an asterisk.
      * @returns A string representation of the scheduler's state for diagnostic purposes. The jobs and drain requests are displayed in the order in which they are currently expected to be processed. The current job and drain request are marked by an asterisk.
      **/
    def retrieveState(): java.lang.String = js.native
    /**
      * Schedules the specified function to execute asynchronously.
      * @param work A function that represents the work item to be scheduled. When called the work item will receive as its first argument an object which allows the work item to ask the scheduler if it should yield cooperatively and if so allows the work item to either provide a function to be run as a continuation or a WinJS.Promise which will when complete provide a function to run as a continuation. Provide these fields for the object: shouldYield, setWork(work), setPromise(promise), job.
      * @param priority The priority of the work item. If you don't specify a priority, it defaults to WinJS.Utilities.Scheduler.Priority.normal.
      * @param thisArg A "this" instance to be bound to the work item. The default value is null.
      * @param name A description of the work item for diagnostics. The default value is an empty string.
      * @returns The job instance that represents this work item.
      **/
    def schedule(work: js.Function1[/* jobInfo */ winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.IJobInfo, _]): winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.IJob = js.native
    def schedule(
      work: js.Function1[/* jobInfo */ winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.IJobInfo, _],
      priority: winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority
    ): winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.IJob = js.native
    def schedule(
      work: js.Function1[/* jobInfo */ winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.IJobInfo, _],
      priority: winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority,
      thisArg: js.Any
    ): winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.IJob = js.native
    def schedule(
      work: js.Function1[/* jobInfo */ winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.IJobInfo, _],
      priority: winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority,
      thisArg: js.Any,
      name: java.lang.String
    ): winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.IJob = js.native
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.aboveNormal priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of aboveNormal priority.
      **/
    def schedulePromiseAboveNormal[U](): winjsLib.WinJSNs.Promise[U] = js.native
    def schedulePromiseAboveNormal[U](promiseValue: U): winjsLib.WinJSNs.Promise[U] = js.native
    def schedulePromiseAboveNormal[U](promiseValue: U, jobName: java.lang.String): winjsLib.WinJSNs.Promise[U] = js.native
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.belowNormal priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of belowNormal priority.
      **/
    def schedulePromiseBelowNormal[U](): winjsLib.WinJSNs.Promise[U] = js.native
    def schedulePromiseBelowNormal[U](promiseValue: U): winjsLib.WinJSNs.Promise[U] = js.native
    def schedulePromiseBelowNormal[U](promiseValue: U, jobName: java.lang.String): winjsLib.WinJSNs.Promise[U] = js.native
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.high priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of high priority.
      **/
    def schedulePromiseHigh[U](): winjsLib.WinJSNs.Promise[U] = js.native
    def schedulePromiseHigh[U](promiseValue: U): winjsLib.WinJSNs.Promise[U] = js.native
    def schedulePromiseHigh[U](promiseValue: U, jobName: java.lang.String): winjsLib.WinJSNs.Promise[U] = js.native
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.Idle priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of idle priority.
      **/
    def schedulePromiseIdle[U](): winjsLib.WinJSNs.Promise[U] = js.native
    def schedulePromiseIdle[U](promiseValue: U): winjsLib.WinJSNs.Promise[U] = js.native
    def schedulePromiseIdle[U](promiseValue: U, jobName: java.lang.String): winjsLib.WinJSNs.Promise[U] = js.native
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.normal priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of normal priority.
      **/
    def schedulePromiseNormal[U](): winjsLib.WinJSNs.Promise[U] = js.native
    def schedulePromiseNormal[U](promiseValue: U): winjsLib.WinJSNs.Promise[U] = js.native
    def schedulePromiseNormal[U](promiseValue: U, jobName: java.lang.String): winjsLib.WinJSNs.Promise[U] = js.native
    //#region Enumerations
    /**
      * Represents a priority for a job managed by the Scheduler.
      **/
    @js.native
    object Priority extends js.Object {
      /* 0 */ val aboveNormal: winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority.aboveNormal with scala.Double = js.native
      /* 1 */ val belowNormal: winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority.belowNormal with scala.Double = js.native
      /* 2 */ val high: winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority.high with scala.Double = js.native
      /* 3 */ val idle: winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority.idle with scala.Double = js.native
      /* 4 */ val max: winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority.max with scala.Double = js.native
      /* 5 */ val min: winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority.min with scala.Double = js.native
      /* 6 */ val normal: winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority.normal with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UtilitiesNs.SchedulerNs.Priority with scala.Double] = js.native
    }
    
  }
  
  //#endregion Enumerations
  //#region Objects
  /**
    * A mixin that contains event-related functions.
    **/
  @js.native
  object eventMixin extends js.Object {
    //#region Methods
    /**
      * Adds an event listener to the control.
      * @param type The type (name) of the event.
      * @param listener The listener to invoke when the event gets raised.
      * @param useCapture If true, initiates capture, otherwise false.
      **/
    def addEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
    def addEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
    /**
      * Raises an event of the specified type and with the specified additional properties.
      * @param type The type (name) of the event.
      * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
      * @returns true if preventDefault was called on the event.
      **/
    def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
    /**
      * Removes an event listener from the control.
      * @param type The type (name) of the event.
      * @param listener The listener to remove.
      * @param useCapture true if capture is to be initiated, otherwise false.
      **/
    def removeEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
    def removeEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  }
  
}

