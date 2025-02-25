package typings
package winjsLib.winjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides controls and objects that manipulate data.
**/
@JSImport("winjs", "UI")
@js.native
object UINs extends js.Object {
  //#endregion Interfaces
  //#region Objects
  /**
    * Displays ICommands in overlayed application pane that opens and closes at the top or bottom of the main view.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new AppBar object.
    * @constructor
    * @param element The DOM element that will host the control.
    * @param options The set of properties and values to apply to the new AppBar.
    **/
  class AppBar ()
    extends winjsLib.WinJSNs.UINs.AppBar {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Represents a command to be displayed in an app bar.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new AppBarCommand object.
    * @constructor
    * @param element The DOM element that will host the control.
    * @param options The set of properties and values to apply to the new AppBarCommand.
    **/
  class AppBarCommand ()
    extends winjsLib.WinJSNs.UINs.AppBarCommand {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * A rich input box that provides suggestions as the user types.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new AutoSuggestBox.
    * @constructor
    * @param element The DOM element hosts the new AutoSuggestBox.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
    **/
  class AutoSuggestBox ()
    extends winjsLib.WinJSNs.UINs.AutoSuggestBox {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Provides backwards navigation in the form of a button.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new BackButton.
    * @constructor
    * @param element The DOM element hosts the new BackButton.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
    **/
  class BackButton ()
    extends winjsLib.WinJSNs.UINs.BackButton {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Represents a layout for the ListView in which items are arranged in a grid and items can span multiple grid cells.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new CellSpanningLayout.
    * @constructor
    * @param options An object that contains one or more property/value pairs to apply to the new CellSpanningLayout. Each property of the options object corresponds to one of the object's properties or events. Event names must begin with "on".
    **/
  class CellSpanningLayout ()
    extends winjsLib.WinJSNs.UINs.CellSpanningLayout {
    def this(options: js.Any) = this()
  }
  
  /**
    * Represents a command to be displayed in an AppBar or ToolBar
    **/
  @js.native
  class Command ()
    extends winjsLib.WinJSNs.UINs.Command
  
  /**
    * Displays a modal dialog which can display arbitrary HTML content.
    **/
  @js.native
  /**
    * Creates a new ContentDialog control.
    * @constructor
    * @param The DOM element that hosts the ContentDialog control.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
    **/
  class ContentDialog ()
    extends winjsLib.WinJSNs.UINs.ContentDialog {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Allows users to pick a date value.
    **/
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of the DatePicker control.
    * @constructor
    * @param element The DOM element associated with the DatePicker control.
    * @param options The set of options to be applied initially to the DatePicker control. The options are the following: calendar, current, datePattern, disabled, maxYear, minYear, monthPattern, yearPattern.
    **/
  class DatePicker ()
    extends winjsLib.WinJSNs.UINs.DatePicker {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Displays a collection, such as a set of photos, one item at a time.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new FlipView.
    * @constructor
    * @param element The DOM element that hosts the control.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the pageselected event, add a property named "onpageselected" and set its value to the event handler.
    **/
  class FlipView[T] ()
    extends winjsLib.WinJSNs.UINs.FlipView[T] {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Displays lightweight UI that is either information, or requires user interaction. Unlike a dialog, a Flyout can be light dismissed by clicking or tapping off of it.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new Flyout object.
    * @constructor
    * @param element The DOM element that will host the control.
    * @param options The set of properties and values to apply to the new Flyout.
    **/
  class Flyout ()
    extends winjsLib.WinJSNs.UINs.Flyout {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Represents a grid layout for the ListView in which items are arranged in a horizontal grid.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new GridLayout object.
    * @constructor
    * @param options The set of properties and values to apply to the new GridLayout.
    **/
  class GridLayout ()
    extends winjsLib.WinJSNs.UINs.GridLayout {
    def this(options: js.Any) = this()
  }
  
  /**
    * Enables you to include an HTML page dynamically. As part of the constructor, you must include an option indicating the URI of the page.
    **/
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of HtmlControl to define a new page control.
    * @constructor
    * @param element The element that hosts the HtmlControl.
    * @param options The options for configuring the page. The uri option is required in order to specify the source document for the content of the page. Other options are the ones used by the WinJS.Pages.render method.
    **/
  class HtmlControl ()
    extends winjsLib.WinJSNs.UINs.HtmlControl {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Creates a hub navigation pattern consisting of sections that can be navigated to. Each section is defined by a HubSection object.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new Hub control.
    * @constructor
    * @param element The DOM element that will host the Hub control.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the contentanimating event, add a property named "oncontentanimating" to the options object and set its value to the event handler.
    **/
  class Hub ()
    extends winjsLib.WinJSNs.UINs.Hub {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Defines a section of a Hub.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new HubSection.
    * @constructor
    * @param element The DOM element hosts the new HubSection.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
    **/
  class HubSection ()
    extends winjsLib.WinJSNs.UINs.HubSection {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  @js.native
  trait ICommand extends js.Object {
    //#endregion Methods
    //#region Properties
    /**
      * Gets or sets a value that indicates whether the ICommand is disabled.
      **/
    var disabled: scala.Boolean = js.native
    /**
      * Gets the DOM element that hosts the ICommand.
      **/
    var element: stdLib.HTMLElement = js.native
    /**
      * Adds an extra CSS class during construction.
      **/
    var extraClass: java.lang.String = js.native
    /**
      * Gets or sets the HTMLElement with a 'content' type ICommand that should receive focus whenever focus moves by the user pressing HOME or the arrow keys, from the previous ICommand to this ICommand.
      **/
    var firstElementFocus: stdLib.HTMLElement = js.native
    /**
      * Gets or sets the Flyout object displayed by this command. The specified flyout is shown when the ICommand's button is invoked.
      **/
    var flyout: winjsLib.WinJSNs.UINs.Flyout = js.native
    /**
      * Gets or sets a value that indicates whether the ICommand is hiding or in the process of becoming hidden.
      **/
    var hidden: scala.Boolean = js.native
    /**
      * Gets or sets the icon of the ICommand.
      **/
    var icon: java.lang.String = js.native
    /**
      * Gets the element identifier (ID) of the command.
      **/
    var id: java.lang.String = js.native
    /**
      * Gets or sets the label of the command.
      **/
    var label: java.lang.String = js.native
    /**
      * Gets or sets the HTMLElement with a 'content' type ICommand that should receive focus whenever focus moves by the user pressing END or the arrow keys, from the previous Command to this Command.
      **/
    var lastElementFocus: stdLib.HTMLElement = js.native
    /**
      * Gets or sets the function to be invoked when the command is clicked.
      **/
    var onclick: js.Function = js.native
    /**
      * Gets or sets the priority of the command.
      **/
    var priority: scala.Double = js.native
    /**
      * Gets the section of the parent control that the command is in. The section can only be set through constructor options.
      **/
    var section: java.lang.String = js.native
    /**
      * Gets or sets the selected state of a toggle button.
      **/
    var selected: scala.Boolean = js.native
    /**
      * Gets or sets the tooltip of the command.
      **/
    var tooltip: java.lang.String = js.native
    /**
      * Gets the type of the command. The type can only be set through constructor options.
      **/
    var `type`: java.lang.String = js.native
    //#region Methods
    /**
      * Registers an event handler for the specified event.
      * @param type The event type to register.
      * @param listener The event handler function to associate with the event.
      * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
      **/
    def addEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
    def addEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
    /**
      * Releases resources held by this ICommand. Call this method when the ICommand is no longer needed. After calling this method, the ICommand becomes unusable.
      **/
    def dispose(): scala.Unit = js.native
    /**
      * Removes an event handler that the addEventListener method registered.
      * @param type The event type to unregister.
      * @param listener The event handler function to remove.
      * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
      **/
    def removeEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
    def removeEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  }
  
  /**
    * Defines an item that can be pressed, swiped, and dragged.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new ItemContainer.
    * @constructor
    * @param element The DOM element hosts the new ItemContainer. For the ItemContainer to be accessible, this element must have its role attribute set to "list" or "listbox". If tapBehavior is set to none and selectionDisabled is true, then use the "list" role; otherwise, use the "listbox" role.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
    **/
  class ItemContainer ()
    extends winjsLib.WinJSNs.UINs.ItemContainer {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  @js.native
  class Layout ()
    extends winjsLib.WinJSNs.UINs.Layout
  
  /**
    * Represents a layout for the ListView in which items are arranged in a vertical list.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new ListLayout.
    * @constructor
    * @param options An object that contains one or more property/value pairs to apply to the new ListLayout. Each property of the options object corresponds to one of the object's properties or events. Event names must begin with "on".
    **/
  class ListLayout ()
    extends winjsLib.WinJSNs.UINs.ListLayout {
    def this(options: js.Any) = this()
  }
  
  /**
    * Displays data items in a customizable list or grid.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new ListView.
    * @constructor
    * @param element The DOM element that hosts the ListView control.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the selectionchanged event, add a property named "onselectionchanged" to the options object and set its value to the event handler.
    **/
  class ListView[T] ()
    extends winjsLib.WinJSNs.UINs.ListView[T] {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Represents a menu flyout for displaying commands.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new Menu object.
    * @constructor
    * @param element The DOM element that will host the control.
    * @param options The set of properties and values to apply to the new Menu.
    **/
  class Menu ()
    extends winjsLib.WinJSNs.UINs.Menu {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Represents a command to be displayed in a Menu object.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new MenuCommand object.
    * @constructor
    * @param element The DOM element that will host the control.
    * @param options The set of properties and values to apply to the new MenuCommand.
    **/
  class MenuCommand ()
    extends winjsLib.WinJSNs.UINs.MenuCommand {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Displays NavBarCommands in an overlayed navigation pane that opens and closes at the top or bottom of the main view.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new NavBar.
    * @constructor
    * @param element The DOM element that will host the new NavBar.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
    **/
  class NavBar ()
    extends winjsLib.WinJSNs.UINs.NavBar {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Represents a navigation command in a NavBarContainer.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new NavBarCommand.
    * @constructor
    * @param element The DOM element hosts the new NavBarCommand.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
    **/
  class NavBarCommand ()
    extends winjsLib.WinJSNs.UINs.NavBarCommand {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Contains a group of NavBarCommand objects in a NavBar.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new NavBarContainer.
    * @constructor
    * @param element The DOM element hosts the new NavBarContainer.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
    **/
  class NavBarContainer ()
    extends winjsLib.WinJSNs.UINs.NavBarContainer {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * A tab control that displays multiple items.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new Pivot.
    * @constructor
    * @param element The DOM element hosts the new Pivot.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the cancel event, add a property named "oncancel" to the options object and set its value to the event handler.
    **/
  class Pivot ()
    extends winjsLib.WinJSNs.UINs.Pivot {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * An item within a Pivot control.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new PivotItem.
    * @constructor
    * @param element The DOM element hosts the new PivotItem.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the cancel event, add a property named "oncancel" to the options object and set its value to the event handler.
    **/
  class PivotItem ()
    extends winjsLib.WinJSNs.UINs.PivotItem {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Lets the user rate something by clicking an icon that represents a rating. The Rating control can display three types of ratings: an average rating, a tentative rating, and the user's rating.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new Rating.
    * @constructor
    * @param element The DOM element hosts the new Rating.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the cancel event, add a property named "oncancel" to the options object and set its value to the event handler.
    **/
  class Rating ()
    extends winjsLib.WinJSNs.UINs.Rating {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Generates HTML from a set of data. Use this control to generate lists of items.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new Repeater control.
    * @constructor
    * @param elemnt The DOM element that will host the new control. The Repeater will create an element if this value is null.
    * @param options An object that contains one or more property/value pairs to apply to the new Repeater. Each property of the options object corresponds to one of the object's properties or events. Event names must begin with "on".
    **/
  class Repeater ()
    extends winjsLib.WinJSNs.UINs.Repeater {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Enables the user to perform search queries and select suggestions.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new SearchBox.
    * @constructor
    * @param element The DOM element hosts the new SearchBox.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
    **/
  class SearchBox ()
    extends winjsLib.WinJSNs.UINs.SearchBox {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Enables the user to zoom between two different views supplied by two child controls. One child control supplies the zoomed-out view and the other provides the zoomed-in view.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new SemanticZoom.
    * @constructor
    * @param element The DOM element that hosts the SemanticZoom.
    * @param options An object that contains one or more property/value pairs to apply to the new control. This object can contain these properties: initiallyZoomedOut Boolean, zoomFactor 0.2–0.85.
    **/
  class SemanticZoom ()
    extends winjsLib.WinJSNs.UINs.SemanticZoom {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Provides users with fast, in-context access to settings that affect the current Windows Store app.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new SettingsFlyout object.
    * @constructor
    * @param element The DOM element that will host the control.
    * @param options The set of properties and values to apply to the new SettingsFlyout.
    **/
  class SettingsFlyout ()
    extends winjsLib.WinJSNs.UINs.SettingsFlyout {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Displays a SplitView which renders a collapsable pane next to arbitrary HTML content.
    **/
  @js.native
  /**
    * Creates a new SplitView.
    * @constructor
    * @param element The DOM element hosts the new SplitView.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
    **/
  class SplitView ()
    extends winjsLib.WinJSNs.UINs.SplitView {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Represents a command in the SplitView Pane.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new SplitViewCommand.
    * @constructor
    * @param element The DOM element hosts the new SplitViewCommand.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
    **/
  class SplitViewCommand ()
    extends winjsLib.WinJSNs.UINs.SplitViewCommand {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Displays a button which is used for opening and closing a SplitView's pane.
    **/
  @js.native
  /**
    * Creates a new SplitViewPaneToggle.
    * @constructor
    * @param element The DOM element hosts the new SplitViewPaneToggle.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
    **/
  class SplitViewPaneToggle ()
    extends winjsLib.WinJSNs.UINs.SplitViewPaneToggle {
    def this(element: stdLib.HTMLButtonElement) = this()
    def this(element: stdLib.HTMLButtonElement, options: js.Any) = this()
  }
  
  /**
    * A type of IListDataSource that provides read-access to an object that implements the IStorageQueryResultBase interface. A StorageDataSource enables you to query and bind to items in the data source.
    **/
  @js.native
  class StorageDataSource[T] protected ()
    extends winjsLib.WinJSNs.UINs.StorageDataSource[T] {
    //#region Constructors
    /**
      * Creates a new StorageDataSource object.
      * @constructor
      * @param query The IStorageQueryResultBase that the StorageDataSource obtains its items from. Instead of IStorageQueryResultBase, you can also pass one of these string values: Music, Pictures, Videos, Documents.
      * @param options The set of properties and values to apply to the new StorageDataSource. Properties on this object may include: mode , requestedThumbnailSize , thumbnailOptions , synchronous .
      **/
    def this(query: js.Any) = this()
    def this(query: js.Any, options: js.Any) = this()
  }
  
  /**
    * Prevents a DOM sub-tree from receiving tab navigations and focus.
    **/
  @js.native
  class TabContainer protected ()
    extends winjsLib.WinJSNs.UINs.TabContainer {
    //#region Constructors
    /**
      * Creates a new TabContainer.
      * @constructor
      * @param element The DOM element that hosts the TabContainer control.
      * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties.
      **/
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Allows users to select time values.
    **/
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of a TimePicker control.
    * @constructor
    * @param element The DOM element associated with the TimePicker control.
    * @param options The set of options to be applied initially to the TimePicker control. The options are the following: clock.
    **/
  class TimePicker ()
    extends winjsLib.WinJSNs.UINs.TimePicker {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * A control that lets the user switch an option between two states: on (checked is set to true) and off (checked is set to false).
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new ToggleSwitch.
    * @constructor
    * @param element The DOM that hosts the control.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the change event, add a property named "onchange" to the options object and set its value to the event handler.
    **/
  class ToggleSwitch ()
    extends winjsLib.WinJSNs.UINs.ToggleSwitch {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Displays ICommands within the flow of the app. Use the ToolBar around other statically positioned app content.
    **/
  @js.native
  /**
    * Creates a new ToolBar control.
    * @param element The DOM element that will host the control.
    * @param options The set of properties and values to apply to the new ToolBar.
    **/
  class ToolBar ()
    extends winjsLib.WinJSNs.UINs.ToolBar {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Displays a tooltip that can contain images and formatting.
    **/
  @js.native
  //#region Constructors
  /**
    * Creates a new Tooltip.
    * @constructor
    * @param element The DOM element associated that hosts the Tooltip.
    * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the opened event, add a property named "onopened" to the options object and set its value to the event handler.
    **/
  class Tooltip ()
    extends winjsLib.WinJSNs.UINs.Tooltip {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Scales a single child element to fill the available space without resizing it. This control reacts to changes in the size of the container as well as changes in size of the child element. For example, a media query may result in a change in aspect ratio.
    **/
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of the ViewBox control.
    * @constructor
    * @param element The DOM element that functions as the scaling box. This element fills 100% of the width and height allotted to it.
    * @param options The set of options to be applied initially to the ViewBox control. There are currently no options on this control, and any options included in this parameter are ignored.
    **/
  class ViewBox ()
    extends winjsLib.WinJSNs.UINs.ViewBox {
    def this(element: stdLib.HTMLElement) = this()
    def this(element: stdLib.HTMLElement, options: js.Any) = this()
  }
  
  /**
    * Serves as the base class for a custom IListDataSource.
    **/
  @js.native
  class VirtualizedDataSource[T] protected ()
    extends winjsLib.WinJSNs.UINs.VirtualizedDataSource[T] {
    //#region Constructors
    /**
      * Initializes the VirtualizedDataSource base class of a custom data source.
      * @constructor
      * @param listDataAdapter The object that supplies data to the VirtualizedDataSource.
      * @param options An object that can contain properties that specify additional options for the VirtualizedDataSource. It supports these properties: cacheSize.
      **/
    def this(listDataAdapter: winjsLib.WinJSNs.UINs.IListDataAdapter[T]) = this()
    def this(listDataAdapter: winjsLib.WinJSNs.UINs.IListDataAdapter[T], options: js.Any) = this()
  }
  
  //#endregion Objects
  //#region Functions
  /**
    * Returns a new IListDataSource that adds group information to the items of another IListDataSource.
    * @param listDataSource The data source for the individual items to group.
    * @param groupKey A callback function that accepts a single argument: an item in the IListDataSource. The function is called for each item in the list and must return the group key for that item as a string.
    * @param groupData A callback function that accepts a single argument: an item in the IListDataSource. The function is called on one IListDataSource item for each group and must return an object that represents the header of that group.
    * @param options An object that can contain properties that specify additional options: groupCountEstimate, batchSize.
    * @returns An IListGroupDataSource that contains the items in the original data source and provides additional group information in the form of a "groups" property. The "groups" property returns another IListDataSource that enumerates the different groups in the list.
    **/
  def computeDataSourceGroups[T](
    listDataSource: winjsLib.WinJSNs.UINs.IListDataSource[T],
    groupKey: js.Function,
    groupData: js.Function
  ): winjsLib.WinJSNs.UINs.IListGroupDataSource[T] = js.native
  def computeDataSourceGroups[T](
    listDataSource: winjsLib.WinJSNs.UINs.IListDataSource[T],
    groupKey: js.Function,
    groupData: js.Function,
    options: js.Any
  ): winjsLib.WinJSNs.UINs.IListGroupDataSource[T] = js.native
  /**
    * Used to disables all Animations Library and ListView animations. Calling this function does not guarantee that the animations will be disabled, as the determination is made based on several factors.
    **/
  def disableAnimations(): scala.Unit = js.native
  /**
    * Used to enable all Animations Library and ListView animations. Calling this function does not guarantee that the animations will be enabled, as the determination is made based on several factors.
    **/
  def enableAnimations(): scala.Unit = js.native
  /**
    * Marks a event handler function as being compatible with declarative processing.
    * @param handler The handler to be marked as compatible with declarative processing.
    * @returns The handler, marked as compatible with declarative processing.
    **/
  def eventHandler(handler: js.Any): js.Any = js.native
  /**
    * Asynchronously executes a collection of CSS animations on a collection of elements. This is the underlying animation mechanism used by the Animations Library. Apps are encouraged to use the Animations Library to conform with the standard look and feel of the rest of the system, rather than calling this function directly.
    * @param element Element or elements to be animated. This parameter can be expressed in several ways: As the special value "undefined", which means that the animation has no target, As a single object, As a JavaScript array (possibly empty), in which each element of the array can be a single element or a JavaScript array of elements., As a NodeList (for example, the result of querySelectorAll), As an HTMLCollection.
    * @param animation The animation description or an array of animation descriptions to apply to element. An animation description is a JavaScript object with specific properties, listed below. There are two types of animation descriptions: one for keyframe-based animations and one for explicit animations. These types are distinguished by whether the keyframe property has a defined value. The following properties are required for both types of animation descriptions: property (string), delay (number), duration (number), timing (string). If an animation has a keyframe property with a defined, non-null value, then the animation is a keyframe-based animation. A keyframe-based animation description requires the following property in addition to those mentioned above: keyframe (string). If an animation does not have a keyframe property, or if the value of the property is null or undefined, then the animation is an explicit animation. An explicit animation description requires the following properties in addition to the common properties mentioned above: from, to. The values given in the from and to properties must be valid for the CSS property specified by the property property. For example, if the CSS property is "opacity", then the from and to properties must be numbers between 0 and 1 (inclusive).
    * @returns Returns a Promise object that completes when the CSS animation is complete.
    **/
  def executeAnimation(element: stdLib.HTMLElement, animation: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
  /**
    * Asynchronously executes a collection of CSS transitions on a collection of elements. This is the underlying animation mechanism used by the Animations Library. Apps are encouraged to use the Animations Library to conform with the standard look and feel of the rest of the system, rather than calling this function directly.
    * @param element Element or elements on which to perform the transition. This parameter can be expressed in several ways: As the special value "undefined", which means that the transition has no target, As a single object, As a JavaScript array (possibly empty), in which each element of the array can be a single element or a JavaScript array of elements., As a NodeList (for example, the result of querySelectorAll), As an HTMLCollection.
    * @param transition The transition description or an array of transition descriptions to apply to element. A transition description is a JavaScript object with these properties: property (string), delay (number), duration (number), timing (string), from (optional), to. The values given in the from and to properties must be valid for the CSS property specified by the property property. For example, if the CSS property is "opacity", then the from and to properties must be numbers between 0 and 1 (inclusive).
    * @returns Returns a Promise that completes when the transition is finished.
    **/
  def executeTransition(element: stdLib.HTMLElement, transition: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
  /**
    * Retrieves the items in the specified index range.
    * @param dataSource The data source that contains the items to retrieve.
    * @param ranges An array of ISelectionRange objects that have firstIndex and lastIndex values.
    * @returns A Promise that contains an array of the requested IItem objects.
    **/
  def getItemsFromRanges[U](
    dataSource: winjsLib.WinJSNs.UINs.IListDataSource[U],
    ranges: js.Array[winjsLib.WinJSNs.UINs.ISelectionRange]
  ): winjsLib.WinJSNs.Promise[winjsLib.WinJSNs.UINs.IItem[U]] = js.native
  /**
    * Determines whether the Animations Library and ListView animations will be performed if called.
    * @returns Returns true if animations will be performed; otherwise false.
    **/
  def isAnimationEnabled(): scala.Boolean = js.native
  /**
    * * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def optionsParser(value: java.lang.String): js.Any = js.native
  def optionsParser(value: java.lang.String, context: js.Any): js.Any = js.native
  def optionsParser(value: java.lang.String, context: js.Any, functionContext: js.Any): js.Any = js.native
  /**
    * Applies declarative control binding to the specified element.
    * @param element The element to bind.
    * @returns A promise that is fulfilled after the control is activated. The value of the promise is the control that is attached to element.
    **/
  def process(element: winjsLib.Element): winjsLib.WinJSNs.Promise[_] = js.native
  /**
    * Applies declarative control binding to all elements, starting at the specified root element.
    * @param rootElement The element at which to start applying the binding. If this parameter is not specified, the binding is applied to the entire document.
    * @param skipRoot If true, the elements to be bound skip the specified root element and include only the children.
    * @returns A promise that is fulfilled when binding has been applied to all the controls.
    **/
  def processAll(): winjsLib.WinJSNs.Promise[_] = js.native
  def processAll(rootElement: winjsLib.Element): winjsLib.WinJSNs.Promise[_] = js.native
  def processAll(rootElement: winjsLib.Element, skipRoot: scala.Boolean): winjsLib.WinJSNs.Promise[_] = js.native
  /**
    * Walks the DOM tree from the given element to the root of the document. Whenever a selector scope is encountered, this method performs a lookup within that scope for the specified selector string. The first matching element is returned.
    * @param selector The selector string.
    * @param element The element to begin walking to the root of the document from.
    * @returns The target element, if found.
    **/
  def scopedSelect(selector: java.lang.String, element: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  /**
    * Adds the set of declaratively specified options (properties and events) to the specified control. If name of the options property begins with "on", the property value is a function and the control supports addEventListener, setOptions calls addEventListener on the control.
    * @param control The control on which the properties and events are to be applied.
    * @param options The set of options that are specified declaratively.
    **/
  def setOptions(control: js.Any): scala.Unit = js.native
  def setOptions(control: js.Any, options: js.Any): scala.Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def simpleItemRenderer(fn: js.Function): js.Function = js.native
  /**
    * Provides access to the Windows animations. These functions provide developers with the ability to use animations in their custom controls that are consistent with animations used by Windows controls.
  **/
  @JSName("Animation")
  @js.native
  object AnimationNs extends js.Object {
    /**
      * Execute a continuum animation, scaling down the incoming page while scaling, rotating, and translating the incoming item.
      * @param page Single element to be scaled down that is the page root and contains the incoming item.
      * @param item Single element to be scaled, rotated, and translated into its final position on the page.
      * @returns A Promise that completes when the animation is finished.
      **/
    def continuumBackwardIn(page: js.Any, item: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute a continuum animation, scaling down the outgoing page while.
      * @param page Single element to be scaled down that is the page root.
      * @returns A Promise that completes when the animation is finished.
      **/
    def continuumBackwardOut(page: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute a continuum animation, scaling up the incoming page while scaling, rotating, and translating the incoming item.
      * @param page Single element to be scaled up that is the page root and does not contain the incoming item.
      * @param itemRoot Root of the item that will be translated as part of the continuum animation.
      * @param itemContent Content of the item that will be scaled and rotated as part of the continuum animation.
      * @returns A Promise that completes when the animation is finished.
      **/
    def continuumForwardIn(page: js.Any, itemRoot: js.Any, itemContent: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute a continuum animation, scaling down the outgoing page while scaling, rotating, and translating the outgoing item.
      * @param page Single element to be scaled down that is the page root and contains the outgoing item.
      * @param item Single element to be scaled, rotated, and translated away from the outgoing page.
      * @returns A Promise that completes when the animation is finished.
      **/
    def continuumForwardOut(page: js.Any, item: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    //#region Functions
    /**
      * Creates an object that performs an animation that adds an item or items to a list.
      * @param added Element or elements to add to the list.
      * @param affected Element or elements affected by the added items. Typically, this is all other items displayed in the list.
      * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
      **/
    def createAddToListAnimation(added: js.Any, affected: js.Any): winjsLib.WinJSNs.UINs.AnimationNs.IAnimationMethodResponse = js.native
    /**
      * Creates an object that performs an animation that adds an item or items to a list of search results.
      * @param added Element or elements to add to the list.
      * @param affected Element or elements affected by the added items. Typically, this is all other items displayed in the list.
      * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
      **/
    def createAddToSearchListAnimation(added: js.Any, affected: js.Any): winjsLib.WinJSNs.UINs.AnimationNs.IAnimationMethodResponse = js.native
    /**
      * Creates an object that performs an animation that collapses a list.
      * @param hidden Element or elements hidden as a result of the collapse.
      * @param affected Element or elements affected by the hidden items. Typically, this is all other items displayed in the list.
      * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
      **/
    def createCollapseAnimation(hidden: js.Any, affected: js.Any): winjsLib.WinJSNs.UINs.AnimationNs.IAnimationMethodResponse = js.native
    /**
      * Creates an object that performs an animation that removes an item or items from a list.
      * @param deleted Element or elements to delete from the list.
      * @param remaining Element or elements affected by the removal of the deleted items. Typically, this is all other items displayed in the list.
      * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
      **/
    def createDeleteFromListAnimation(deleted: js.Any, remaining: js.Any): winjsLib.WinJSNs.UINs.AnimationNs.IAnimationMethodResponse = js.native
    /**
      * Creates an object that performs an animation that removes an item or items from a list of search results.
      * @param deleted Element or elements to delete from the list.
      * @param remaining Element or elements affected by the removal of the deleted items. Typically, this is all other items displayed in the list.
      * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
      **/
    def createDeleteFromSearchListAnimation(deleted: js.Any, remaining: js.Any): winjsLib.WinJSNs.UINs.AnimationNs.IAnimationMethodResponse = js.native
    /**
      * Creates an object that performs an animation that expands a list.
      * @param revealed Element or elements revealed by the expansion.
      * @param affected Element or elements affected by the newly revealed items. Typically, this is all other items displayed in the list.
      * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
      **/
    def createExpandAnimation(revealed: js.Any, affected: js.Any): winjsLib.WinJSNs.UINs.AnimationNs.IAnimationMethodResponse = js.native
    /**
      * Creates an exit and entrance animation to play for a page navigation given the current and incoming pages'
      * animation preferences and whether the pages are navigating forwards or backwards.
      * @param currentPreferredAnimation A value from WinJS.UI.PageNavigationAnimation describing the animation the current page prefers to use.
      * @param A value from nextPreferredAnimation WinJS.UI.PageNavigationAnimation describing the animation the incoming page prefers to use.
      * @param movingBackwards Boolean value for whether the navigation is moving backwards.
      * @returns an object containing the exit and entrance animations to play based on the parameters given.
      **/
    def createPageNavigationAnimations(
      currentPreferredAnimation: java.lang.String,
      nextPreferredAnimation: java.lang.String,
      movingBackwards: scala.Boolean
    ): winjsLib.Anon_Entrance = js.native
    /**
      * Creates an object that performs a peek animation.
      * @param element Element or elements involved in the peek.
      * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
      **/
    def createPeekAnimation(element: js.Any): winjsLib.WinJSNs.UINs.AnimationNs.IAnimationMethodResponse = js.native
    /**
      * Creates an object that performs an animation that moves an item or items.
      * @param element Element or elements involved in the reposition.
      * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise object that completes when the animation is finished.
      **/
    def createRepositionAnimation(element: js.Any): winjsLib.WinJSNs.UINs.AnimationNs.IAnimationMethodResponse = js.native
    /**
      * Performs an animation that fades an item or items in, fading out existing items that occupy the same space.
      * @param incoming Element or elements being faded in.
      * @param outgoing Element or elements being replaced.
      * @returns An object that completes when the animation has finished.
      **/
    def crossFade(incoming: js.Any, outgoing: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation when a dragged object is moved such that dropping it in that position would move other items. The potentially affected items are animated out of the way to show where the object would be dropped.
      * @param target Element or elements that the dragged object would cause to be moved if it were dropped.
      * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
      * @returns An object that completes when the animation is finished.
      **/
    def dragBetweenEnter(target: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def dragBetweenEnter(target: js.Any, offset: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation when a dragged object is moved away from items that it had previously involved in a dragBetweenEnter animation. The affected objects are animated back to their original positions.
      * @param target Element or elements that the dragged object would no longer cause to be displaced, due to its moving away. This should be the same element or element collection passed as the target parameter in the dragBetweenEnter animation.
      * @returns An object that completes when the animation is finished.
      **/
    def dragBetweenLeave(target: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation when the user finishes dragging an object.
      * @param dragSource Element or elements that were dragged.
      * @param offset Initial offset from the drop point. The dropped object begins at the offset and animates to its final position at the drop point. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
      * @param affected Element or elements whose position the dropped object affects. Typically, this is all other items in a reorderable list. This should be the same element or element collection passed as the affected parameter in the dragSourceStart animation.
      * @returns An object that completes when the animation is finished.
      **/
    def dragSourceEnd(dragSource: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def dragSourceEnd(dragSource: js.Any, offset: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def dragSourceEnd(dragSource: js.Any, offset: js.Any, affected: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation when the user begins to drag an object.
      * @param dragSource Element or elements being dragged.
      * @param affected Element or elements whose position is affected by the movement of the dragged object. Typically, this is all other items in a reorderable list.
      * @returns An object that completes when the animation is finished.
      **/
    def dragSourceStart(dragSource: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def dragSourceStart(dragSource: js.Any, affected: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute the incoming phase of the drill in animation, scaling up the incoming page while fading it in.
      * @param incomingPage Element to be scaled up and faded in.
      * @returns Promise object that completes when the animation is complete.
      **/
    def drillInIncoming(incomingPage: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute the outgoing phase of the drill in animation, scaling up the outgoing page while fading it out.
      * @param incomingPage Element to be scaled up and faded out.
      * @returns Promise object that completes when the animation is complete.
      **/
    def drillInOutgoing(outgoingPage: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute the incoming phase of the drill out animation, scaling down the incoming page while fading it in.
      * @param incomingPage Element to be scaled up and faded in.
      * @returns Promise object that completes when the animation is complete.
      **/
    def drillOutIncoming(incomingPage: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute the outgoing phase of the drill out animation, scaling down the outgoing page while fading it out.
      * @param outgoingPage Element to be scaled down and faded out.
      * @returns Promise object that completes when the animation is complete.
      **/
    def drillOutOutgoing(outgoingPage: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation that displays one or more elements on a page.
      * @param incoming Element or elements that compose the incoming content.
      * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
      * @param options Optional. Set this value to { mechanism: "transition" } to play the animation using CSS transitions instead of the default CSS animations. In some cases this can result in improved performance.
      * @returns An object that completes when the animation is finished.
      **/
    def enterContent(incoming: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def enterContent(incoming: js.Any, offset: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def enterContent(incoming: js.Any, offset: js.Any, options: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation that shows a new page of content, either when transitioning between pages in a running app or when displaying the first content in a newly launched app.
      * @param element Element or an array of elements that represent the content. If element refers to an array of elements, the elements enter in array order.
      * @param offset An initial offset where the element or elements begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
      * @returns An object that completes when the animation is finished.
      **/
    def enterPage(element: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def enterPage(element: js.Any, offset: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation that hides one or more elements on a page.
      * @param outgoing Element or elements that compose the outgoing content.
      * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
      * @returns An object that completes when the animation is finished.
      **/
    def exitContent(outgoing: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def exitContent(outgoing: js.Any, offset: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation that dismisses the current page when transitioning between pages in an app.
      * @param outgoing Element or elements that compose the outgoing page.
      * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
      * @returns An object that completes when the animation is finished.
      **/
    def exitPage(outgoing: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def exitPage(outgoing: js.Any, offset: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation that fades an item or set of items into view.
      * @param shown Element or elements being faded in.
      * @returns An object that completes when the animation has finished. Use this object when subsequent actions need this animation to finish before they take place.
      **/
    def fadeIn(shown: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation that fades an item or set of items out of view.
      * @param hidden Element or elements being faded out.
      * @returns An object that completes when the animation is finished.
      **/
    def fadeOut(hidden: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation that hides edge-based user interface (UI).
      * @param element Element or elements that are being hidden.
      * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements end the animation just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
      * @param options Optional. Set this value to { mechanism: "transition" } to play the animation using CSS transitions instead of the default CSS animations. In some cases this can result in improved performance.
      * @returns An object that completes when the animation is finished.
      **/
    def hideEdgeUI(element: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def hideEdgeUI(element: js.Any, offset: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def hideEdgeUI(element: js.Any, offset: js.Any, options: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation that hides a panel.
      * @param element Element or elements that are being hidden.
      * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements end the animation just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
      * @returns An object that completes when the animation is finished.
      **/
    def hidePanel(element: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def hidePanel(element: js.Any, offset: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation that removes pop-up user interface (UI).
      * @param element Element or elements that are being hidden.
      * @returns An object that completes when the animation is finished.
      **/
    def hidePopup(element: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation when a pointer is pressed on an object.
      * @param element Element or elements on which the pointer is pressed.
      * @returns An object that completes when the animation is finished.
      **/
    def pointerDown(element: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation when a pointer is released.
      * @param element Element or elements that the pointer was pressed on.
      * @returns An object that completes when the animation is finished.
      **/
    def pointerUp(element: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation that slides a narrow, edge-based user interface (UI) into view.
      * @param element Element or elements that are being shown.
      * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements begin the animation from just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
      * @param options Optional. Set this value to { mechanism: "transition" } to play the animation using CSS transitions instead of the default CSS animations. In some cases this can result in improved performance.
      * @returns An object that completes when the animation is finished.
      **/
    def showEdgeUI(element: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def showEdgeUI(element: js.Any, offset: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def showEdgeUI(element: js.Any, offset: js.Any, options: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation that slides a large panel user interface (UI) into view.
      * @param element Element or elements that are being shown.
      * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements begin the animation from just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
      * @returns An object that completes when the animation is finished.
      **/
    def showPanel(element: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def showPanel(element: js.Any, offset: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation that displays a pop-up user interface (UI).
      * @param element Element or elements that are being shown.
      * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements begin the animation from just off-screen. Set this parameter to null to use the recommended default offset. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
      * @returns An object that completes when the animation is finished.
      **/
    def showPopup(element: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def showPopup(element: js.Any, offset: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute a slide down animation.
      * @param incoming Single element or collection of elements to animate sliding down.
      * @returns A Promise that completes when the animation is finished.
      **/
    def slideDown(incoming: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute a slide in from right to left animation.
      * @param page The page containing all elements to slide.
      * @param first First element or collection of elements to animate sliding in.
      * @param second Second element or collection of elements to animate sliding in, which will be offset slightly farther than the first.
      * @param third Third element or collection of elements to animate sliding in, which will be offset slightly farther than the second.
      * @returns A Promise that completes when the animation is finished.
      **/
    def slideLeftIn(page: js.Any, first: js.Any, second: js.Any, third: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute a slide out from right to left animation.
      * @param page The page containing all elements to slide.
      * @param first First element or collection of elements to animate sliding out.
      * @param second Second element or collection of elements to animate sliding out, which will be offset slightly farther than the first.
      * @param third Third element or collection of elements to animate sliding out, which will be offset slightly farther than the second.
      * @returns A Promise that completes when the animation is finished.
      **/
    def slideLeftOut(page: js.Any, first: js.Any, second: js.Any, third: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute a slide in from left to right animation.
      * @param page The page containing all elements to slide.
      * @param first First element or collection of elements to animate sliding in.
      * @param second Second element or collection of elements to animate sliding in, which will be offset slightly farther than the first.
      * @param third Third element or collection of elements to animate sliding in, which will be offset slightly farther than the second.
      * @returns A Promise that completes when the animation is finished.
      **/
    def slideRightIn(page: js.Any, first: js.Any, second: js.Any, third: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute a slide out from left to right animation.
      * @param page The page containing all elements to slide.
      * @param first First element or collection of elements to animate sliding out.
      * @param second Second element or collection of elements to animate sliding out, which will be offset slightly farther than the first.
      * @param third Third element or collection of elements to animate sliding out, which will be offset slightly farther than the second.
      * @returns A Promise that completes when the animation is finished.
      **/
    def slideRightOut(page: js.Any, first: js.Any, second: js.Any, third: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute a slide up animation.
      * @param incoming Single element or collection of elements to animate sliding up.
      * @returns A Promise that completes when the animation is finished.
      **/
    def slideUp(incoming: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs a deselection animation in response to a swipe interaction.
      * @param deselected Element or elements that become unselected.
      * @param selection Element or elements that represent the selection, typically a check mark.
      * @returns An object that completes when the animation is finished.
      **/
    def swipeDeselect(deselected: js.Any, selection: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation that reveals an item or items in response to a swipe interaction.
      * @param target Element or elements being revealed.
      * @param offset An initial offset where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
      * @returns An object that completes when the animation is finished.
      **/
    def swipeReveal(target: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def swipeReveal(target: js.Any, offset: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs a selection animation in response to a swipe interaction.
      * @param selected Element or elements being selected.
      * @param selection Element or elements that show that something is selected, typically a check mark.
      * @returns An object that completes when the animation is finished.
      **/
    def swipeSelect(selected: js.Any, selection: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute a turnstile backward in animation.
      * @param incoming Single element or collection of elements to animate.
      * @returns A Promise that completes when the animation is finished.
      **/
    def turnstileBackwardIn(incoming: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute a turnstile backward out animation.
      * @param outgoing Single element or collection of elements to animate.
      * @returns A Promise that completes when the animation is finished.
      **/
    def turnstileBackwardOut(outgoing: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute a turnstile forward in animation.
      * @param incoming Single element or collection of elements to animate.
      * @returns A Promise that completes when the animation is finished.
      **/
    def turnstileForwardIn(incoming: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Execute a turnstile forward out animation.
      * @param outgoing Single element or collection of elements to animate.
      * @returns A Promise that completes when the animation is finished.
      **/
    def turnstileForwardOut(outgoing: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Performs an animation that updates a badge.
      * @param incoming Element or elements that comprise the new badge.
      * @param offset Initial offsets where incoming animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
      * @returns An object that completes when the animation is finished.
      **/
    def updateBadge(incoming: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def updateBadge(incoming: js.Any, offset: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
  }
  
  /* static members */
  @js.native
  object AppBar extends js.Object {
    /**
      * Display options for the AppBar when closed.
      **/
    var ClosedDisplayMode: winjsLib.Anon_Compact = js.native
    /**
      * Display options for AppBar placement in relation to the main view.
      */
    var Placement: winjsLib.Anon_Bottom = js.native
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object AppBarCommand extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  //#region Enumerations
  /**
    * Specifies an icon that appears in an AppBarCommand object.
    **/
  @js.native
  object AppBarIcon extends js.Object {
    /* 11 */ val accept: winjsLib.WinJSNs.UINs.AppBarIcon.accept with scala.Double = js.native
    /* 100 */ val accounts: winjsLib.WinJSNs.UINs.AppBarIcon.accounts with scala.Double = js.native
    /* 9 */ val add: winjsLib.WinJSNs.UINs.AppBarIcon.add with scala.Double = js.native
    /* 186 */ val addfriend: winjsLib.WinJSNs.UINs.AppBarIcon.addfriend with scala.Double = js.native
    /* 155 */ val admin: winjsLib.WinJSNs.UINs.AppBarIcon.admin with scala.Double = js.native
    /* 149 */ val aligncenter: winjsLib.WinJSNs.UINs.AppBarIcon.aligncenter with scala.Double = js.native
    /* 150 */ val alignleft: winjsLib.WinJSNs.UINs.AppBarIcon.alignleft with scala.Double = js.native
    /* 148 */ val alignright: winjsLib.WinJSNs.UINs.AppBarIcon.alignright with scala.Double = js.native
    /* 114 */ val allapps: winjsLib.WinJSNs.UINs.AppBarIcon.allapps with scala.Double = js.native
    /* 104 */ val attach: winjsLib.WinJSNs.UINs.AppBarIcon.attach with scala.Double = js.native
    /* 47 */ val attachcamera: winjsLib.WinJSNs.UINs.AppBarIcon.attachcamera with scala.Double = js.native
    /* 127 */ val audio: winjsLib.WinJSNs.UINs.AppBarIcon.audio with scala.Double = js.native
    /* 19 */ val back: winjsLib.WinJSNs.UINs.AppBarIcon.back with scala.Double = js.native
    /* 177 */ val backtowindow: winjsLib.WinJSNs.UINs.AppBarIcon.backtowindow with scala.Double = js.native
    /* 184 */ val blockcontact: winjsLib.WinJSNs.UINs.AppBarIcon.blockcontact with scala.Double = js.native
    /* 143 */ val bold: winjsLib.WinJSNs.UINs.AppBarIcon.bold with scala.Double = js.native
    /* 49 */ val bookmarks: winjsLib.WinJSNs.UINs.AppBarIcon.bookmarks with scala.Double = js.native
    /* 82 */ val browsephotos: winjsLib.WinJSNs.UINs.AppBarIcon.browsephotos with scala.Double = js.native
    /* 53 */ val bullets: winjsLib.WinJSNs.UINs.AppBarIcon.bullets with scala.Double = js.native
    /* 169 */ val calculator: winjsLib.WinJSNs.UINs.AppBarIcon.calculator with scala.Double = js.native
    /* 95 */ val calendar: winjsLib.WinJSNs.UINs.AppBarIcon.calendar with scala.Double = js.native
    /* 93 */ val calendarday: winjsLib.WinJSNs.UINs.AppBarIcon.calendarday with scala.Double = js.native
    /* 180 */ val calendarreply: winjsLib.WinJSNs.UINs.AppBarIcon.calendarreply with scala.Double = js.native
    /* 94 */ val calendarweek: winjsLib.WinJSNs.UINs.AppBarIcon.calendarweek with scala.Double = js.native
    /* 22 */ val camera: winjsLib.WinJSNs.UINs.AppBarIcon.camera with scala.Double = js.native
    /* 10 */ val cancel: winjsLib.WinJSNs.UINs.AppBarIcon.cancel with scala.Double = js.native
    /* 86 */ val caption: winjsLib.WinJSNs.UINs.AppBarIcon.caption with scala.Double = js.native
    /* 132 */ val cc: winjsLib.WinJSNs.UINs.AppBarIcon.cc with scala.Double = js.native
    /* 162 */ val cellphone: winjsLib.WinJSNs.UINs.AppBarIcon.cellphone with scala.Double = js.native
    /* 96 */ val characters: winjsLib.WinJSNs.UINs.AppBarIcon.characters with scala.Double = js.native
    /* 6 */ val clear: winjsLib.WinJSNs.UINs.AppBarIcon.clear with scala.Double = js.native
    /* 158 */ val clearselection: winjsLib.WinJSNs.UINs.AppBarIcon.clearselection with scala.Double = js.native
    /* 35 */ val clock: winjsLib.WinJSNs.UINs.AppBarIcon.clock with scala.Double = js.native
    /* 40 */ val closepane: winjsLib.WinJSNs.UINs.AppBarIcon.closepane with scala.Double = js.native
    /* 54 */ val comment: winjsLib.WinJSNs.UINs.AppBarIcon.comment with scala.Double = js.native
    /* 63 */ val contact: winjsLib.WinJSNs.UINs.AppBarIcon.contact with scala.Double = js.native
    /* 125 */ val contact2: winjsLib.WinJSNs.UINs.AppBarIcon.contact2 with scala.Double = js.native
    /* 56 */ val contactinfo: winjsLib.WinJSNs.UINs.AppBarIcon.contactinfo with scala.Double = js.native
    /* 119 */ val contactpresence: winjsLib.WinJSNs.UINs.AppBarIcon.contactpresence with scala.Double = js.native
    /* 107 */ val copy: winjsLib.WinJSNs.UINs.AppBarIcon.copy with scala.Double = js.native
    /* 37 */ val crop: winjsLib.WinJSNs.UINs.AppBarIcon.crop with scala.Double = js.native
    /* 103 */ val cut: winjsLib.WinJSNs.UINs.AppBarIcon.cut with scala.Double = js.native
    /* 7 */ val delete: winjsLib.WinJSNs.UINs.AppBarIcon.delete with scala.Double = js.native
    /* 170 */ val directions: winjsLib.WinJSNs.UINs.AppBarIcon.directions with scala.Double = js.native
    /* 136 */ val disableupdates: winjsLib.WinJSNs.UINs.AppBarIcon.disableupdates with scala.Double = js.native
    /* 115 */ val disconnectdrive: winjsLib.WinJSNs.UINs.AppBarIcon.disconnectdrive with scala.Double = js.native
    /* 146 */ val dislike: winjsLib.WinJSNs.UINs.AppBarIcon.dislike with scala.Double = js.native
    /* 71 */ val dockbottom: winjsLib.WinJSNs.UINs.AppBarIcon.dockbottom with scala.Double = js.native
    /* 69 */ val dockleft: winjsLib.WinJSNs.UINs.AppBarIcon.dockleft with scala.Double = js.native
    /* 70 */ val dockright: winjsLib.WinJSNs.UINs.AppBarIcon.dockright with scala.Double = js.native
    /* 50 */ val document: winjsLib.WinJSNs.UINs.AppBarIcon.document with scala.Double = js.native
    /* 26 */ val download: winjsLib.WinJSNs.UINs.AppBarIcon.download with scala.Double = js.native
    /* 4 */ val edit: winjsLib.WinJSNs.UINs.AppBarIcon.edit with scala.Double = js.native
    /* 31 */ val emoji: winjsLib.WinJSNs.UINs.AppBarIcon.emoji with scala.Double = js.native
    /* 108 */ val emoji2: winjsLib.WinJSNs.UINs.AppBarIcon.emoji2 with scala.Double = js.native
    /* 21 */ val favorite: winjsLib.WinJSNs.UINs.AppBarIcon.favorite with scala.Double = js.native
    /* 106 */ val filter: winjsLib.WinJSNs.UINs.AppBarIcon.filter with scala.Double = js.native
    /* 28 */ val find: winjsLib.WinJSNs.UINs.AppBarIcon.find with scala.Double = js.native
    /* 43 */ val flag: winjsLib.WinJSNs.UINs.AppBarIcon.flag with scala.Double = js.native
    /* 126 */ val folder: winjsLib.WinJSNs.UINs.AppBarIcon.folder with scala.Double = js.native
    /* 123 */ val font: winjsLib.WinJSNs.UINs.AppBarIcon.font with scala.Double = js.native
    /* 124 */ val fontcolor: winjsLib.WinJSNs.UINs.AppBarIcon.fontcolor with scala.Double = js.native
    /* 159 */ val fontdecrease: winjsLib.WinJSNs.UINs.AppBarIcon.fontdecrease with scala.Double = js.native
    /* 160 */ val fontincrease: winjsLib.WinJSNs.UINs.AppBarIcon.fontincrease with scala.Double = js.native
    /* 161 */ val fontsize: winjsLib.WinJSNs.UINs.AppBarIcon.fontsize with scala.Double = js.native
    /* 17 */ val forward: winjsLib.WinJSNs.UINs.AppBarIcon.forward with scala.Double = js.native
    /* 193 */ val fourbars: winjsLib.WinJSNs.UINs.AppBarIcon.fourbars with scala.Double = js.native
    /* 178 */ val fullscreen: winjsLib.WinJSNs.UINs.AppBarIcon.fullscreen with scala.Double = js.native
    /* 45 */ val globe: winjsLib.WinJSNs.UINs.AppBarIcon.globe with scala.Double = js.native
    /* 67 */ val go: winjsLib.WinJSNs.UINs.AppBarIcon.go with scala.Double = js.native
    /* 188 */ val gotostart: winjsLib.WinJSNs.UINs.AppBarIcon.gotostart with scala.Double = js.native
    /* 122 */ val gototoday: winjsLib.WinJSNs.UINs.AppBarIcon.gototoday with scala.Double = js.native
    /* 196 */ val hamburger: winjsLib.WinJSNs.UINs.AppBarIcon.hamburger with scala.Double = js.native
    /* 57 */ val hangup: winjsLib.WinJSNs.UINs.AppBarIcon.hangup with scala.Double = js.native
    /* 29 */ val help: winjsLib.WinJSNs.UINs.AppBarIcon.help with scala.Double = js.native
    /* 102 */ val hidebcc: winjsLib.WinJSNs.UINs.AppBarIcon.hidebcc with scala.Double = js.native
    /* 135 */ val highlight: winjsLib.WinJSNs.UINs.AppBarIcon.highlight with scala.Double = js.native
    /* 15 */ val home: winjsLib.WinJSNs.UINs.AppBarIcon.home with scala.Double = js.native
    /* 80 */ val `import`: winjsLib.WinJSNs.UINs.AppBarIcon.`import` with scala.Double = js.native
    /* 81 */ val importall: winjsLib.WinJSNs.UINs.AppBarIcon.importall with scala.Double = js.native
    /* 109 */ val important: winjsLib.WinJSNs.UINs.AppBarIcon.important with scala.Double = js.native
    /* 141 */ val italic: winjsLib.WinJSNs.UINs.AppBarIcon.italic with scala.Double = js.native
    /* 68 */ val keyboard: winjsLib.WinJSNs.UINs.AppBarIcon.keyboard with scala.Double = js.native
    /* 33 */ val leavechat: winjsLib.WinJSNs.UINs.AppBarIcon.leavechat with scala.Double = js.native
    /* 20 */ val left: winjsLib.WinJSNs.UINs.AppBarIcon.left with scala.Double = js.native
    /* 172 */ val library: winjsLib.WinJSNs.UINs.AppBarIcon.library with scala.Double = js.native
    /* 147 */ val like: winjsLib.WinJSNs.UINs.AppBarIcon.like with scala.Double = js.native
    /* 145 */ val likedislike: winjsLib.WinJSNs.UINs.AppBarIcon.likedislike with scala.Double = js.native
    /* 99 */ val link: winjsLib.WinJSNs.UINs.AppBarIcon.link with scala.Double = js.native
    /* 76 */ val list: winjsLib.WinJSNs.UINs.AppBarIcon.list with scala.Double = js.native
    /* 27 */ val mail: winjsLib.WinJSNs.UINs.AppBarIcon.mail with scala.Double = js.native
    /* 55 */ val mail2: winjsLib.WinJSNs.UINs.AppBarIcon.mail2 with scala.Double = js.native
    /* 34 */ val mailforward: winjsLib.WinJSNs.UINs.AppBarIcon.mailforward with scala.Double = js.native
    /* 110 */ val mailreply: winjsLib.WinJSNs.UINs.AppBarIcon.mailreply with scala.Double = js.native
    /* 97 */ val mailreplyall: winjsLib.WinJSNs.UINs.AppBarIcon.mailreplyall with scala.Double = js.native
    /* 113 */ val manage: winjsLib.WinJSNs.UINs.AppBarIcon.manage with scala.Double = js.native
    /* 157 */ val map: winjsLib.WinJSNs.UINs.AppBarIcon.map with scala.Double = js.native
    /* 116 */ val mapdrive: winjsLib.WinJSNs.UINs.AppBarIcon.mapdrive with scala.Double = js.native
    /* 59 */ val mappin: winjsLib.WinJSNs.UINs.AppBarIcon.mappin with scala.Double = js.native
    /* 174 */ val memo: winjsLib.WinJSNs.UINs.AppBarIcon.memo with scala.Double = js.native
    /* 91 */ val message: winjsLib.WinJSNs.UINs.AppBarIcon.message with scala.Double = js.native
    /* 175 */ val microphone: winjsLib.WinJSNs.UINs.AppBarIcon.microphone with scala.Double = js.native
    /* 12 */ val more: winjsLib.WinJSNs.UINs.AppBarIcon.more with scala.Double = js.native
    /* 144 */ val movetofolder: winjsLib.WinJSNs.UINs.AppBarIcon.movetofolder with scala.Double = js.native
    /* 66 */ val musicinfo: winjsLib.WinJSNs.UINs.AppBarIcon.musicinfo with scala.Double = js.native
    /* 140 */ val mute: winjsLib.WinJSNs.UINs.AppBarIcon.mute with scala.Double = js.native
    /* 179 */ val newfolder: winjsLib.WinJSNs.UINs.AppBarIcon.newfolder with scala.Double = js.native
    /* 117 */ val newwindow: winjsLib.WinJSNs.UINs.AppBarIcon.newwindow with scala.Double = js.native
    /* 1 */ val next: winjsLib.WinJSNs.UINs.AppBarIcon.next with scala.Double = js.native
    /* 190 */ val onebar: winjsLib.WinJSNs.UINs.AppBarIcon.onebar with scala.Double = js.native
    /* 153 */ val openfile: winjsLib.WinJSNs.UINs.AppBarIcon.openfile with scala.Double = js.native
    /* 139 */ val openlocal: winjsLib.WinJSNs.UINs.AppBarIcon.openlocal with scala.Double = js.native
    /* 41 */ val openpane: winjsLib.WinJSNs.UINs.AppBarIcon.openpane with scala.Double = js.native
    /* 118 */ val openwith: winjsLib.WinJSNs.UINs.AppBarIcon.openwith with scala.Double = js.native
    /* 79 */ val orientation: winjsLib.WinJSNs.UINs.AppBarIcon.orientation with scala.Double = js.native
    /* 154 */ val otheruser: winjsLib.WinJSNs.UINs.AppBarIcon.otheruser with scala.Double = js.native
    /* 167 */ val outlinestar: winjsLib.WinJSNs.UINs.AppBarIcon.outlinestar with scala.Double = js.native
    /* 52 */ val page: winjsLib.WinJSNs.UINs.AppBarIcon.page with scala.Double = js.native
    /* 92 */ val page2: winjsLib.WinJSNs.UINs.AppBarIcon.page2 with scala.Double = js.native
    /* 105 */ val paste: winjsLib.WinJSNs.UINs.AppBarIcon.paste with scala.Double = js.native
    /* 3 */ val pause: winjsLib.WinJSNs.UINs.AppBarIcon.pause with scala.Double = js.native
    /* 39 */ val people: winjsLib.WinJSNs.UINs.AppBarIcon.people with scala.Double = js.native
    /* 134 */ val permissions: winjsLib.WinJSNs.UINs.AppBarIcon.permissions with scala.Double = js.native
    /* 60 */ val phone: winjsLib.WinJSNs.UINs.AppBarIcon.phone with scala.Double = js.native
    /* 173 */ val phonebook: winjsLib.WinJSNs.UINs.AppBarIcon.phonebook with scala.Double = js.native
    /* 84 */ val pictures: winjsLib.WinJSNs.UINs.AppBarIcon.pictures with scala.Double = js.native
    /* 65 */ val pin: winjsLib.WinJSNs.UINs.AppBarIcon.pin with scala.Double = js.native
    /* 128 */ val placeholder: winjsLib.WinJSNs.UINs.AppBarIcon.placeholder with scala.Double = js.native
    /* 2 */ val play: winjsLib.WinJSNs.UINs.AppBarIcon.play with scala.Double = js.native
    /* 176 */ val postupdate: winjsLib.WinJSNs.UINs.AppBarIcon.postupdate with scala.Double = js.native
    /* 195 */ val preview: winjsLib.WinJSNs.UINs.AppBarIcon.preview with scala.Double = js.native
    /* 44 */ val previewlink: winjsLib.WinJSNs.UINs.AppBarIcon.previewlink with scala.Double = js.native
    /* 0 */ val previous: winjsLib.WinJSNs.UINs.AppBarIcon.previous with scala.Double = js.native
    /* 120 */ val priority: winjsLib.WinJSNs.UINs.AppBarIcon.priority with scala.Double = js.native
    /* 51 */ val protecteddocument: winjsLib.WinJSNs.UINs.AppBarIcon.protecteddocument with scala.Double = js.native
    /* 98 */ val read: winjsLib.WinJSNs.UINs.AppBarIcon.read with scala.Double = js.native
    /* 13 */ val redo: winjsLib.WinJSNs.UINs.AppBarIcon.redo with scala.Double = js.native
    /* 73 */ val refresh: winjsLib.WinJSNs.UINs.AppBarIcon.refresh with scala.Double = js.native
    /* 72 */ val remote: winjsLib.WinJSNs.UINs.AppBarIcon.remote with scala.Double = js.native
    /* 8 */ val remove: winjsLib.WinJSNs.UINs.AppBarIcon.remove with scala.Double = js.native
    /* 64 */ val rename: winjsLib.WinJSNs.UINs.AppBarIcon.rename with scala.Double = js.native
    /* 90 */ val repair: winjsLib.WinJSNs.UINs.AppBarIcon.repair with scala.Double = js.native
    /* 166 */ val repeatall: winjsLib.WinJSNs.UINs.AppBarIcon.repeatall with scala.Double = js.native
    /* 165 */ val repeatone: winjsLib.WinJSNs.UINs.AppBarIcon.repeatone with scala.Double = js.native
    /* 182 */ val reporthacked: winjsLib.WinJSNs.UINs.AppBarIcon.reporthacked with scala.Double = js.native
    /* 163 */ val reshare: winjsLib.WinJSNs.UINs.AppBarIcon.reshare with scala.Double = js.native
    /* 18 */ val right: winjsLib.WinJSNs.UINs.AppBarIcon.right with scala.Double = js.native
    /* 74 */ val rotate: winjsLib.WinJSNs.UINs.AppBarIcon.rotate with scala.Double = js.native
    /* 38 */ val rotatecamera: winjsLib.WinJSNs.UINs.AppBarIcon.rotatecamera with scala.Double = js.native
    /* 5 */ val save: winjsLib.WinJSNs.UINs.AppBarIcon.save with scala.Double = js.native
    /* 85 */ val savelocal: winjsLib.WinJSNs.UINs.AppBarIcon.savelocal with scala.Double = js.native
    /* 194 */ val scan: winjsLib.WinJSNs.UINs.AppBarIcon.scan with scala.Double = js.native
    /* 78 */ val selectall: winjsLib.WinJSNs.UINs.AppBarIcon.selectall with scala.Double = js.native
    /* 36 */ val send: winjsLib.WinJSNs.UINs.AppBarIcon.send with scala.Double = js.native
    /* 130 */ val setlockscreen: winjsLib.WinJSNs.UINs.AppBarIcon.setlockscreen with scala.Double = js.native
    /* 131 */ val settile: winjsLib.WinJSNs.UINs.AppBarIcon.settile with scala.Double = js.native
    /* 23 */ val settings: winjsLib.WinJSNs.UINs.AppBarIcon.settings with scala.Double = js.native
    /* 77 */ val shop: winjsLib.WinJSNs.UINs.AppBarIcon.shop with scala.Double = js.native
    /* 101 */ val showbcc: winjsLib.WinJSNs.UINs.AppBarIcon.showbcc with scala.Double = js.native
    /* 88 */ val showresults: winjsLib.WinJSNs.UINs.AppBarIcon.showresults with scala.Double = js.native
    /* 75 */ val shuffle: winjsLib.WinJSNs.UINs.AppBarIcon.shuffle with scala.Double = js.native
    /* 111 */ val slideshow: winjsLib.WinJSNs.UINs.AppBarIcon.slideshow with scala.Double = js.native
    /* 168 */ val solidstar: winjsLib.WinJSNs.UINs.AppBarIcon.solidstar with scala.Double = js.native
    /* 112 */ val sort: winjsLib.WinJSNs.UINs.AppBarIcon.sort with scala.Double = js.native
    /* 87 */ val stop: winjsLib.WinJSNs.UINs.AppBarIcon.stop with scala.Double = js.native
    /* 133 */ val stopslideshow: winjsLib.WinJSNs.UINs.AppBarIcon.stopslideshow with scala.Double = js.native
    /* 156 */ val street: winjsLib.WinJSNs.UINs.AppBarIcon.street with scala.Double = js.native
    /* 62 */ val switch: winjsLib.WinJSNs.UINs.AppBarIcon.switch with scala.Double = js.native
    /* 185 */ val switchapps: winjsLib.WinJSNs.UINs.AppBarIcon.switchapps with scala.Double = js.native
    /* 25 */ val sync: winjsLib.WinJSNs.UINs.AppBarIcon.sync with scala.Double = js.native
    /* 183 */ val syncfolder: winjsLib.WinJSNs.UINs.AppBarIcon.syncfolder with scala.Double = js.native
    /* 164 */ val tag: winjsLib.WinJSNs.UINs.AppBarIcon.tag with scala.Double = js.native
    /* 171 */ val target: winjsLib.WinJSNs.UINs.AppBarIcon.target with scala.Double = js.native
    /* 192 */ val threebars: winjsLib.WinJSNs.UINs.AppBarIcon.threebars with scala.Double = js.native
    /* 187 */ val touchpointer: winjsLib.WinJSNs.UINs.AppBarIcon.touchpointer with scala.Double = js.native
    /* 46 */ val trim: winjsLib.WinJSNs.UINs.AppBarIcon.trim with scala.Double = js.native
    /* 191 */ val twobars: winjsLib.WinJSNs.UINs.AppBarIcon.twobars with scala.Double = js.native
    /* 32 */ val twopage: winjsLib.WinJSNs.UINs.AppBarIcon.twopage with scala.Double = js.native
    /* 142 */ val underline: winjsLib.WinJSNs.UINs.AppBarIcon.underline with scala.Double = js.native
    /* 14 */ val undo: winjsLib.WinJSNs.UINs.AppBarIcon.undo with scala.Double = js.native
    /* 137 */ val unfavorite: winjsLib.WinJSNs.UINs.AppBarIcon.unfavorite with scala.Double = js.native
    /* 138 */ val unpin: winjsLib.WinJSNs.UINs.AppBarIcon.unpin with scala.Double = js.native
    /* 181 */ val unsyncfolder: winjsLib.WinJSNs.UINs.AppBarIcon.unsyncfolder with scala.Double = js.native
    /* 16 */ val up: winjsLib.WinJSNs.UINs.AppBarIcon.up with scala.Double = js.native
    /* 30 */ val upload: winjsLib.WinJSNs.UINs.AppBarIcon.upload with scala.Double = js.native
    /* 121 */ val uploadskydrive: winjsLib.WinJSNs.UINs.AppBarIcon.uploadskydrive with scala.Double = js.native
    /* 24 */ val video: winjsLib.WinJSNs.UINs.AppBarIcon.video with scala.Double = js.native
    /* 61 */ val videochat: winjsLib.WinJSNs.UINs.AppBarIcon.videochat with scala.Double = js.native
    /* 129 */ val view: winjsLib.WinJSNs.UINs.AppBarIcon.view with scala.Double = js.native
    /* 58 */ val viewall: winjsLib.WinJSNs.UINs.AppBarIcon.viewall with scala.Double = js.native
    /* 89 */ val volume: winjsLib.WinJSNs.UINs.AppBarIcon.volume with scala.Double = js.native
    /* 83 */ val webcam: winjsLib.WinJSNs.UINs.AppBarIcon.webcam with scala.Double = js.native
    /* 42 */ val world: winjsLib.WinJSNs.UINs.AppBarIcon.world with scala.Double = js.native
    /* 189 */ val zerobars: winjsLib.WinJSNs.UINs.AppBarIcon.zerobars with scala.Double = js.native
    /* 151 */ val zoom: winjsLib.WinJSNs.UINs.AppBarIcon.zoom with scala.Double = js.native
    /* 48 */ val zoomin: winjsLib.WinJSNs.UINs.AppBarIcon.zoomin with scala.Double = js.native
    /* 152 */ val zoomout: winjsLib.WinJSNs.UINs.AppBarIcon.zoomout with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.AppBarIcon with scala.Double] = js.native
  }
  
  /* static members */
  @js.native
  object AutoSuggestBox extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
    //#endregion Properties
    /**
      * Creates the image argument for SearchSuggestionCollection.appendResultSuggestion.
      * @param url The url of the image.
      **/
    def createResultSuggestionImage(url: java.lang.String): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object BackButton extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CellSpanningLayout extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Command extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ContentDialog extends js.Object {
    /**
      * Specifies the result of dismissing the ContentDialog.
      **/
    var DismissalResult: winjsLib.Anon_None = js.native
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /**
    * Indicates that the IListDataAdapter was unable to provide a count.
    **/
  @js.native
  object CountError extends js.Object {
    /* 0 */ val noResponse: winjsLib.WinJSNs.UINs.CountError.noResponse with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.CountError with scala.Double] = js.native
  }
  
  /**
    * Indicates whether the IListDataAdapter was able to provide a count.
    **/
  @js.native
  object CountResult extends js.Object {
    /* 0 */ val unknown: winjsLib.WinJSNs.UINs.CountResult.unknown with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.CountResult with scala.Double] = js.native
  }
  
  /**
    * Adds event-related methods to the control.
    **/
  @JSName("DOMEventMixin")
  @js.native
  object DOMEventMixinNs extends js.Object {
    def addEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
    def addEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
    def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
    def removeEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
    def removeEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  }
  
  /**
    * Describes the status of an IListDataSource.
    **/
  @js.native
  object DataSourceStatus extends js.Object {
    /* 2 */ val failure: winjsLib.WinJSNs.UINs.DataSourceStatus.failure with scala.Double = js.native
    /* 0 */ val ready: winjsLib.WinJSNs.UINs.DataSourceStatus.ready with scala.Double = js.native
    /* 1 */ val waiting: winjsLib.WinJSNs.UINs.DataSourceStatus.waiting with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.DataSourceStatus with scala.Double] = js.native
  }
  
  /* static members */
  @js.native
  object DatePicker extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
    /**
      * This API supports the WinJS infrastructure and is not intended to be used directly from your code. Use render instead.
      **/
    def getInformation(startDate: js.Any, endDate: js.Any): js.Any = js.native
    def getInformation(startDate: js.Any, endDate: js.Any, calendar: js.Any): js.Any = js.native
    def getInformation(startDate: js.Any, endDate: js.Any, calendar: js.Any, datePatterns: js.Any): js.Any = js.native
  }
  
  /**
    * Specifies the type of error that occurred during an edit operation on a IListDataSource or an IListDataAdapter.
    **/
  @js.native
  object EditError extends js.Object {
    /* 1 */ val canceled: winjsLib.WinJSNs.UINs.EditError.canceled with scala.Double = js.native
    /* 3 */ val noLongerMeaningful: winjsLib.WinJSNs.UINs.EditError.noLongerMeaningful with scala.Double = js.native
    /* 0 */ val noResponse: winjsLib.WinJSNs.UINs.EditError.noResponse with scala.Double = js.native
    /* 2 */ val notPermitted: winjsLib.WinJSNs.UINs.EditError.notPermitted with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.EditError with scala.Double] = js.native
  }
  
  /**
    * Specifies the type of error encountered when retrieving items from an IListDataAdapter.
    **/
  @js.native
  object FetchError extends js.Object {
    /* 1 */ val doesNotExist: winjsLib.WinJSNs.UINs.FetchError.doesNotExist with scala.Double = js.native
    /* 0 */ val noResponse: winjsLib.WinJSNs.UINs.FetchError.noResponse with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.FetchError with scala.Double] = js.native
  }
  
  /* static members */
  @js.native
  object FlipView extends js.Object {
    /**
      * Event Name
      **/
    var datasourceCountChangedEvent: java.lang.String = js.native
    /**
      * Event Name
      **/
    var pageCompletedEvent: java.lang.String = js.native
    /**
      * Event Name
      **/
    var pageSelectedEvent: java.lang.String = js.native
    /**
      * Event Name
      **/
    var pageVisibilityChangedEvent: java.lang.String = js.native
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Flyout extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /**
    * Provides functions to load HTML content programmatically.
  **/
  @JSName("Fragments")
  @js.native
  object FragmentsNs extends js.Object {
    //#region Functions
    /**
      * Starts loading the fragment at the specified location. The returned promise completes when the fragment is ready to be copied.
      * @param href The URI that contains the fragment to be copied.
      * @returns A promise that is fulfilled when the fragment has been prepared for copying.
      **/
    def cache(href: java.lang.String): winjsLib.WinJSNs.Promise[_] = js.native
    /**
      * Removes any cached information about the specified fragment. This method does not unload any scripts or styles that are referenced by the fragment.
      * @param href The URI that contains the fragment to be cleared. If no URI is provided, the entire contents of the cache are cleared.
      **/
    def clearCache(href: java.lang.String): scala.Unit = js.native
    def clearCache(href: stdLib.HTMLElement): scala.Unit = js.native
    /**
      * Loads the contents of the specified URI into the specified element without copying it.
      * @param href The URI that contains the fragment to copy.
      * @param element Optional. The element to which the fragment is appended.
      * @returns A promise that is fulfilled when the fragment has been loaded. If a target element is not specified, the copied fragment is the completed value. The element is not added to the cache. See also rendercopy, where the element is added to the cache.
      **/
    def render(href: java.lang.String): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
    def render(href: java.lang.String, element: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
    /**
      * Loads and copies the contents of the specified URI into the specified element.
      * @param href The URI that contains the fragment to copy.
      * @param target The element to which the fragment is appended.
      * @returns A promise that is fulfilled when the fragment has been loaded. If a target element is not specified, the copied fragment is the completed value. The fragment is added to the cache. See also render, where the element is not added to the cache.
      **/
    def renderCopy(href: java.lang.String): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
    def renderCopy(href: java.lang.String, target: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
    def renderCopy(href: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
    def renderCopy(href: stdLib.HTMLElement, target: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
  }
  
  /* static members */
  @js.native
  object GridLayout extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /**
    * Specifies how group headers in a ListView respond to the tap interaction.
    **/
  @js.native
  object GroupHeaderTapBehavior extends js.Object {
    /* 0 */ val invoke: winjsLib.WinJSNs.UINs.GroupHeaderTapBehavior.invoke with scala.Double = js.native
    /* 1 */ val none: winjsLib.WinJSNs.UINs.GroupHeaderTapBehavior.none with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.GroupHeaderTapBehavior with scala.Double] = js.native
  }
  
  /**
    * Specifies the position of group headers relative to their items in a ListView.
    **/
  @js.native
  object HeaderPosition extends js.Object {
    /* 0 */ val left: winjsLib.WinJSNs.UINs.HeaderPosition.left with scala.Double = js.native
    /* 1 */ val top: winjsLib.WinJSNs.UINs.HeaderPosition.top with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.HeaderPosition with scala.Double] = js.native
  }
  
  /* static members */
  @js.native
  object HtmlControl extends js.Object {
    //#endregion Constructors
    //#region Properties
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Hub extends js.Object {
    /**
      * Specifies whether the Hub animation is an entrance animation or a transition animation.
      **/
    var AnimationType: winjsLib.Anon_ContentTransition = js.native
    /**
      * Gets the current loading state of the Hub.
      **/
    var LoadingState: winjsLib.Anon_Complete = js.native
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object HubSection extends js.Object {
    /**
      * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
      **/
    var isDeclarativeControlContainer: js.Any = js.native
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ItemContainer extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Layout extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ListLayout extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ListView extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
    /**
      * Triggers the ListView disposal service manually.
      **/
    def triggerDispose(): scala.Unit = js.native
  }
  
  /**
    * Specifies that type of animation for which a contentanimating event was raised.
    **/
  @js.native
  object ListViewAnimationType extends js.Object {
    /* 1 */ val contentTransition: winjsLib.WinJSNs.UINs.ListViewAnimationType.contentTransition with scala.Double = js.native
    /* 0 */ val entrance: winjsLib.WinJSNs.UINs.ListViewAnimationType.entrance with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.ListViewAnimationType with scala.Double] = js.native
  }
  
  /* static members */
  @js.native
  object Menu extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MenuCommand extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NavBar extends js.Object {
    /**
      * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
      **/
    var isDeclarativeControlContainer: js.Any = js.native
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NavBarCommand extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NavBarContainer extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /**
    * Describes the type of object in a ListView.
    **/
  @js.native
  object ObjectType extends js.Object {
    /* 3 */ val footer: winjsLib.WinJSNs.UINs.ObjectType.footer with scala.Double = js.native
    /* 0 */ val groupHeader: winjsLib.WinJSNs.UINs.ObjectType.groupHeader with scala.Double = js.native
    /* 2 */ val header: winjsLib.WinJSNs.UINs.ObjectType.header with scala.Double = js.native
    /* 1 */ val item: winjsLib.WinJSNs.UINs.ObjectType.item with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.ObjectType with scala.Double] = js.native
  }
  
  /**
    * Specifies the orientation of a control.
    **/
  @js.native
  object Orientation extends js.Object {
    /* 0 */ val horizontal: winjsLib.WinJSNs.UINs.Orientation.horizontal with scala.Double = js.native
    /* 1 */ val vertical: winjsLib.WinJSNs.UINs.Orientation.vertical with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.Orientation with scala.Double] = js.native
  }
  
  /**
    * Specifies what animation type should be returned by WinJS.UI.Animation.createPageNavigationAnimations.
    **/
  @js.native
  object PageNavigationAnimation extends js.Object {
    /* 3 */ val continuum: winjsLib.WinJSNs.UINs.PageNavigationAnimation.continuum with scala.Double = js.native
    /* 2 */ val enterPage: winjsLib.WinJSNs.UINs.PageNavigationAnimation.enterPage with scala.Double = js.native
    /* 1 */ val slide: winjsLib.WinJSNs.UINs.PageNavigationAnimation.slide with scala.Double = js.native
    /* 0 */ val turnstile: winjsLib.WinJSNs.UINs.PageNavigationAnimation.turnstile with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.PageNavigationAnimation with scala.Double] = js.native
  }
  
  /**
    * Provides methods for defining and displaying PageControl objects.
  **/
  @JSName("Pages")
  @js.native
  object PagesNs extends js.Object {
    //#endregion Interfaces
    //#region Objects
    //#endregion Objects
    //#region Functions
    /**
      * Creates a new PageControl from the specified URI that contains the specified members. Multiple calls to this method for the same URI are allowed, and all members will be merged.
      * @param uri The URI for the content that defines the page.
      * @param members An object that defines the members that the control will have.
      * @returns A constructor function that creates the PageControl.
      **/
    def define(uri: java.lang.String, members: winjsLib.WinJSNs.UINs.PagesNs.IPageControlMembers): js.Function4[
        /* element */ js.UndefOr[stdLib.HTMLElement], 
        /* options */ js.UndefOr[js.Any], 
        /* complete */ js.UndefOr[js.Function1[/* page */ js.Any, scala.Unit]], 
        /* parentedPromise */ js.UndefOr[winjsLib.WinJSNs.Promise[_]], 
        scala.Unit
      ] = js.native
    /**
      * Gets an already-defined page control for the specified URI, or creates a new one.
      * @param uri The URI for the content that defines the page.
      * @returns A constructor function that creates the page.
      **/
    def get(uri: java.lang.String): js.Function4[
        /* element */ js.UndefOr[stdLib.HTMLElement], 
        /* options */ js.UndefOr[js.Any], 
        /* complete */ js.UndefOr[js.Function1[/* page */ js.Any, scala.Unit]], 
        /* parentedPromise */ js.UndefOr[winjsLib.WinJSNs.Promise[_]], 
        scala.Unit
      ] = js.native
    /**
      * Creates a PageControl from the specified URI and inserts it inside the specified element.
      * @param uri The URI for the content that defines the page.
      * @param element The DOM element to which the PageControl is appended.
      * @param options An object that contains one or more property/value pairs to apply to the new PageControl. How these property/value pairs are used (or not used) depends on the implementation of that particular PageControl.
      * @param parentedPromise A Promise that is fulfilled when the new PageControl is done rendering and its contents becomes the child of element.
      * @returns A promise that is fulfilled when rendering is complete, if asynchronous processing is necessary. If not, returns nothing.
      **/
    def render(uri: java.lang.String): winjsLib.WinJSNs.Promise[_] = js.native
    def render(uri: java.lang.String, element: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[_] = js.native
    def render(uri: java.lang.String, element: stdLib.HTMLElement, options: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
    def render(
      uri: java.lang.String,
      element: stdLib.HTMLElement,
      options: js.Any,
      parentedPromise: winjsLib.WinJSNs.Promise[_]
    ): winjsLib.WinJSNs.Promise[_] = js.native
  }
  
  /* static members */
  @js.native
  object Pivot extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PivotItem extends js.Object {
    /**
      * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
      **/
    var isDeclarativeControlContainer: js.Any = js.native
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Rating extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Repeater extends js.Object {
    /**
      * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
      **/
    var isDeclarativeControlContainer: js.Any = js.native
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SearchBox extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
    //#endregion Properties
    def createResultSuggestionImage(url: java.lang.String): js.Any = js.native
  }
  
  /**
    * Specifies the selection mode of a ListView.
    **/
  @js.native
  object SelectionMode extends js.Object {
    /* 2 */ val multi: winjsLib.WinJSNs.UINs.SelectionMode.multi with scala.Double = js.native
    /* 0 */ val none: winjsLib.WinJSNs.UINs.SelectionMode.none with scala.Double = js.native
    /* 1 */ val single: winjsLib.WinJSNs.UINs.SelectionMode.single with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.SelectionMode with scala.Double] = js.native
  }
  
  /* static members */
  @js.native
  object SemanticZoom extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SettingsFlyout extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
    /**
      * Loads a fragment of the SettingsFlyout. Your app calls this when the user invokes a settings command and the WinJS.Application.onsettings event occurs.
      * @param e An object that contains information about the event, received from the WinJS.Application.onsettings event. The detail property of this object contains the applicationcommands sub-property that you set to an array of settings commands. You then populate the SettingsFlyout with these commands by a call to populateSettings.
      **/
    def populateSettings(e: stdLib.CustomEvent[_]): scala.Unit = js.native
    /**
      * Shows the SettingsPane UI, if hidden, regardless of other state.
      **/
    def show(): scala.Unit = js.native
    /**
      * Show the Settings flyout using the Settings element identifier (ID) and the path of the page that contains the Settings element.
      * @param id The ID of the Settings element.
      * @param path The path of the page that contains the Settings element.
      **/
    def showSettings(id: java.lang.String, path: js.Any): scala.Unit = js.native
  }
  
  /* static members */
  @js.native
  object SplitView extends js.Object {
    /**
      * Display options for a SplitView's pane when it is closed.
      **/
    var ClosedDisplayMode: winjsLib.Anon_Inline = js.native
    /**
      * Display options for a SplitView's pane when it is open.
      **/
    var OpenedDisplayMode: winjsLib.Anon_InlineOverlay = js.native
    /**
      * Placement options for a SplitView's pane.
      **/
    var PanePlacement: winjsLib.Anon_BottomLeft = js.native
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SplitViewCommand extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SplitViewPaneToggle extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StorageDataSource extends js.Object {
    //#endregion Methods
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /**
    * Specifies whether elements are selected when the user performs a swipe interaction.
    **/
  @js.native
  object SwipeBehavior extends js.Object {
    /* 1 */ val none: winjsLib.WinJSNs.UINs.SwipeBehavior.none with scala.Double = js.native
    /* 0 */ val select: winjsLib.WinJSNs.UINs.SwipeBehavior.select with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.SwipeBehavior with scala.Double] = js.native
  }
  
  /* static members */
  @js.native
  object TabContainer extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /**
    * Specifies how items in a ListView respond to the tap interaction.
    **/
  @js.native
  object TapBehavior extends js.Object {
    /* 0 */ val directSelect: winjsLib.WinJSNs.UINs.TapBehavior.directSelect with scala.Double = js.native
    /* 2 */ val invokeOnly: winjsLib.WinJSNs.UINs.TapBehavior.invokeOnly with scala.Double = js.native
    /* 3 */ val none: winjsLib.WinJSNs.UINs.TapBehavior.none with scala.Double = js.native
    /* 1 */ val toggleSelect: winjsLib.WinJSNs.UINs.TapBehavior.toggleSelect with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.TapBehavior with scala.Double] = js.native
  }
  
  /* static members */
  @js.native
  object TimePicker extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
    /**
      * This API supports the WinJS infrastructure and is not intended to be used directly from your code. Use render instead.
      **/
    def getInformation(clock: js.Any, minuteIncrement: js.Any): js.Any = js.native
    def getInformation(clock: js.Any, minuteIncrement: js.Any, timerPatterns: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ToggleSwitch extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ToolBar extends js.Object {
    /**
      * Display options for the closed ToolBar.
      **/
    var ClosedDisplayMode: winjsLib.Anon_CompactFull = js.native
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Tooltip extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /**
    * Provides methods for detecting when the user tabs to or from DOM elements.
  **/
  @JSName("TrackTabBehavior")
  @js.native
  object TrackTabBehaviorNs extends js.Object {
    //#region Functions
    /**
      * Sets the tab order for the specified element within its container.
      * @param element The element to update.
      * @param tabIndex The index value of the element within its container.
      **/
    def attach(element: stdLib.HTMLElement, tabIndex: scala.Double): scala.Unit = js.native
    /**
      * Removes the tab order information from the specified element.
      * @param element The element to remove tab information from.
      **/
    def detach(element: stdLib.HTMLElement): scala.Unit = js.native
  }
  
  /* static members */
  @js.native
  object ViewBox extends js.Object {
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VirtualizedDataSource extends js.Object {
    //#endregion Methods
    //#region Properties
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: scala.Boolean = js.native
  }
  
  /**
    * Provides utility functions for generic directional focus movement
  **/
  @JSName("XYFocus")
  @js.native
  object XYFocusNs extends js.Object {
    trait IRect extends js.Object {
      var bottom: js.UndefOr[scala.Double] = js.undefined
      var height: scala.Double
      var left: scala.Double
      var right: js.UndefOr[scala.Double] = js.undefined
      var top: scala.Double
      var width: scala.Double
    }
    
    @js.native
    trait XYFocusEvent
      extends stdLib.CustomEvent[js.Any] {
      @JSName("detail")
      var detail_XYFocusEvent: winjsLib.Anon_KeyCode = js.native
    }
    
    trait XYFocusOptions extends js.Object {
      /**
        * The focus scope, only children of this element are considered in the calculation.
        **/
      var focusRoot: js.UndefOr[stdLib.HTMLElement] = js.undefined
      /**
        * A rectangle indicating where focus came from before the current state.
        **/
      var historyRect: js.UndefOr[winjsLib.WinJSNs.UINs.XYFocusNs.IRect] = js.undefined
      /**
        * The element from which to calculate the next focusable element; if specified, referenceRect is ignored.
        **/
      var referenceElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
      /**
        * The rectangle from which to calculate next focusable element; ignored if referenceElement is also specified.
        **/
      var referenceRect: js.UndefOr[winjsLib.WinJSNs.UINs.XYFocusNs.IRect] = js.undefined
    }
    
    var focusRoot: stdLib.HTMLElement = js.native
    def addEventListener(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
    def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
    def findNextFocusElement(direction: java.lang.String): stdLib.HTMLElement = js.native
    def findNextFocusElement(direction: java.lang.String, options: winjsLib.WinJSNs.UINs.XYFocusNs.XYFocusOptions): stdLib.HTMLElement = js.native
    @JSName("findNextFocusElement")
    def findNextFocusElement_down(direction: winjsLib.winjsLibStrings.down): stdLib.HTMLElement = js.native
    @JSName("findNextFocusElement")
    def findNextFocusElement_down(direction: winjsLib.winjsLibStrings.down, options: winjsLib.WinJSNs.UINs.XYFocusNs.XYFocusOptions): stdLib.HTMLElement = js.native
    @JSName("findNextFocusElement")
    def findNextFocusElement_left(direction: winjsLib.winjsLibStrings.left): stdLib.HTMLElement = js.native
    @JSName("findNextFocusElement")
    def findNextFocusElement_left(direction: winjsLib.winjsLibStrings.left, options: winjsLib.WinJSNs.UINs.XYFocusNs.XYFocusOptions): stdLib.HTMLElement = js.native
    @JSName("findNextFocusElement")
    def findNextFocusElement_right(direction: winjsLib.winjsLibStrings.right): stdLib.HTMLElement = js.native
    @JSName("findNextFocusElement")
    def findNextFocusElement_right(direction: winjsLib.winjsLibStrings.right, options: winjsLib.WinJSNs.UINs.XYFocusNs.XYFocusOptions): stdLib.HTMLElement = js.native
    @JSName("findNextFocusElement")
    def findNextFocusElement_up(direction: winjsLib.winjsLibStrings.up): stdLib.HTMLElement = js.native
    @JSName("findNextFocusElement")
    def findNextFocusElement_up(direction: winjsLib.winjsLibStrings.up, options: winjsLib.WinJSNs.UINs.XYFocusNs.XYFocusOptions): stdLib.HTMLElement = js.native
    def moveFocus(direction: java.lang.String): stdLib.HTMLElement = js.native
    def moveFocus(direction: java.lang.String, options: winjsLib.WinJSNs.UINs.XYFocusNs.XYFocusOptions): stdLib.HTMLElement = js.native
    @JSName("moveFocus")
    def moveFocus_down(direction: winjsLib.winjsLibStrings.down): stdLib.HTMLElement = js.native
    @JSName("moveFocus")
    def moveFocus_down(direction: winjsLib.winjsLibStrings.down, options: winjsLib.WinJSNs.UINs.XYFocusNs.XYFocusOptions): stdLib.HTMLElement = js.native
    @JSName("moveFocus")
    def moveFocus_left(direction: winjsLib.winjsLibStrings.left): stdLib.HTMLElement = js.native
    @JSName("moveFocus")
    def moveFocus_left(direction: winjsLib.winjsLibStrings.left, options: winjsLib.WinJSNs.UINs.XYFocusNs.XYFocusOptions): stdLib.HTMLElement = js.native
    @JSName("moveFocus")
    def moveFocus_right(direction: winjsLib.winjsLibStrings.right): stdLib.HTMLElement = js.native
    @JSName("moveFocus")
    def moveFocus_right(direction: winjsLib.winjsLibStrings.right, options: winjsLib.WinJSNs.UINs.XYFocusNs.XYFocusOptions): stdLib.HTMLElement = js.native
    @JSName("moveFocus")
    def moveFocus_up(direction: winjsLib.winjsLibStrings.up): stdLib.HTMLElement = js.native
    @JSName("moveFocus")
    def moveFocus_up(direction: winjsLib.winjsLibStrings.up, options: winjsLib.WinJSNs.UINs.XYFocusNs.XYFocusOptions): stdLib.HTMLElement = js.native
    def onfocuschanged(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
    def onfocuschanging(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
    def removeEventListener(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
    @js.native
    object keyCodeMap extends js.Object {
      /**
        * The array of keycodes that cause XYFocus to accept.
        **/
      var accept: js.Array[scala.Double] = js.native
      /**
        * The array of keycodes that cause XYFocus to cancel.
        **/
      var cancel: js.Array[scala.Double] = js.native
      /**
        * The array of keycodes that cause XYFocus to navigate down.
        **/
      var down: js.Array[scala.Double] = js.native
      /**
        * The array of keycodes that cause XYFocus to navigate left.
        **/
      var left: js.Array[scala.Double] = js.native
      /**
        * The array of keycodes that cause XYFocus to navigate right.
        **/
      var right: js.Array[scala.Double] = js.native
      /**
        * The array of keycodes that cause XYFocus to navigate up.
        **/
      var up: js.Array[scala.Double] = js.native
    }
    
  }
  
}

