package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- senchaUnderscoreTouchLib.ExtNs.mixinNs.ISelectable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined allowDeselect, deselectOnContainerClick, disableSelection, locked, mode, clearSelections, deselect, deselectAll, doDeselect, doSelect, getAllowDeselect, getCount, getDeselectOnContainerClick, getDisableSelection, getLastSelected, getMode, getSelection, getSelectionCount, getSelectionMode, hasSelection, isLocked, isSelected, select, selectAll, selectRange, setAllowDeselect, setDeselectOnContainerClick, setDisableSelection, setLastFocused, setMode, updateLastFocused */ trait IDataView extends IContainer {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Binds a new Store to this DataView  */
  var bindStore: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var blockRefresh: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Deselects any currently selected records and clears all stored selections  */
  var clearSelections: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Function which can be overridden which returns the data object passed to this DataView s template to render the whole  */
  var collectData: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Object[]) */
  @JSName("data")
  var data_IDataView: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Boolean) */
  var deferEmptyText: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Deselects the given record s
  		* @param records Number/Array/Ext.data.Model The record(s) to deselect. Can also be a number to reference by index.
  		* @param suppressEvent Boolean If true the deselect event will not be fired.
  		*/
  var deselect: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Deselects all records
  		* @param supress Object
  		*/
  var deselectAll: js.UndefOr[js.Function1[js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var deselectOnContainerClick: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Deselects a record instance by record instance or index
  		* @param records Ext.data.Model/Number An array of records or an index.
  		* @param suppressEvent Boolean Set to false to not fire a deselect event.
  		*/
  var doDeselect: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Selects a record instance by record instance or index
  		* @param records Ext.data.Model/Number An array of records or an index.
  		* @param keepExisting Boolean
  		* @param suppressEvent Boolean Set to false to not fire a select event.
  		*/
  var doSelect: js.UndefOr[
    js.Function3[js.UndefOr[js.Any], js.UndefOr[scala.Boolean], js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the template node the passed child belongs to or null if it doesn t belong to one  */
  var findItemByChild: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the template node by the Ext EventObject or null if it is not found  */
  var findTargetByEvent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of allowDeselect
  		* @returns Boolean
  		*/
  var getAllowDeselect: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of data
  		* @returns Object[]
  		*/
  @JSName("getData")
  var getData_IDataView: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of deferEmptyText
  		* @returns Boolean
  		*/
  var getDeferEmptyText: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of deselectOnContainerClick
  		* @returns Boolean
  		*/
  var getDeselectOnContainerClick: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of disableSelection
  		* @returns Boolean
  		*/
  var getDisableSelection: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of emptyText
  		* @returns String
  		*/
  var getEmptyText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of inline
  		* @returns Boolean/Object
  		*/
  var getInline: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an item at the specified index
  		* @param index Number Index of the item.
  		* @returns Ext.dom.Element/Ext.dataview.component.DataItem item Item at the specified index.
  		*/
  var getItemAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Returns the value of itemCls
  		* @returns String
  		*/
  var getItemCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of itemConfig
  		* @returns Object
  		*/
  var getItemConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an index for the specified item
  		* @param item Number The item to locate.
  		* @returns Number Index for the specified item.
  		*/
  var getItemIndex: js.UndefOr[js.Function1[/* item */ js.UndefOr[scala.Double], scala.Double]] = js.undefined
  /** [Method] Returns the value of itemTpl
  		* @returns String/String[]/Ext.XTemplate
  		*/
  var getItemTpl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the array of previously selected items
  		* @returns Array The previous selection.
  		*/
  var getLastSelected: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of loadingText
  		* @returns String/Boolean
  		*/
  var getLoadingText: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of maxItemCache
  		* @returns Number
  		*/
  var getMaxItemCache: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of mode
  		* @returns String
  		*/
  var getMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Gets a template node  */
  var getNode: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets a range nodes  */
  var getNodes: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of pressedCls
  		* @returns String
  		*/
  var getPressedCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of pressedDelay
  		* @returns Number
  		*/
  var getPressedDelay: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Gets an array of the records from an array of nodes  */
  var getRecords: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of scrollToTopOnRefresh
  		* @returns Boolean
  		*/
  var getScrollToTopOnRefresh: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of selectedCls
  		* @returns String
  		*/
  var getSelectedCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Gets the currently selected nodes  */
  var getSelectedNodes: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets an array of the selected records  */
  var getSelectedRecords: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns an array of the currently selected records
  		* @returns Array An array of selected records.
  		*/
  var getSelection: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getSelectionCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the selection mode currently used by this Selectable
  		* @returns String The current mode.
  		*/
  var getSelectionMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of store
  		* @returns Ext.data.Store/Object
  		*/
  var getStore: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of triggerCtEvent
  		* @returns String
  		*/
  var getTriggerCtEvent: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of triggerEvent
  		* @returns String
  		*/
  var getTriggerEvent: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of useComponents
  		* @returns Boolean
  		*/
  var getUseComponents: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns an array of the current items in the DataView
  		* @returns Ext.dom.Element[]/Ext.dataview.component.DataItem[] Array of Items.
  		*/
  var getViewItems: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Method called when the Store s Reader throws an exception */
  var handleException: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns true if there is a selected record
  		* @returns Boolean
  		*/
  var hasSelection: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Finds the index of the passed node  */
  var indexOf: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var `inline`: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns true if the Selectable is currently locked
  		* @returns Boolean True if currently locked
  		*/
  var isLocked: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if the specified row is selected
  		* @param record Ext.data.Model/Number The record or index of the record to check.
  		* @returns Boolean
  		*/
  var isSelected: js.UndefOr[js.Function1[js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var itemConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var itemSelector: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var itemTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Boolean) */
  var loadingText: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var locked: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var maxItemCache: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var overItemCls: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Function which can be overridden to provide custom formatting for each Record that is used by this DataView s templat
  		* @param data Object/Object[] The raw data object that was used to create the Record.
  		* @param index Number the index number of the Record being prepared for rendering.
  		* @param record Ext.data.Model The Record being prepared for rendering.
  		* @returns Array/Object The formatted data in a format expected by the internal template's overwrite() method. (either an array if your params are numeric (i.e. {0}) or an object (i.e. {foo: 'bar'}))
  		*/
  var prepareData: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[scala.Double], 
      /* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var pressedDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
  var refresh: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Refreshes an individual node s data from the store  */
  var refreshNode: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var scrollToTopOnRefresh: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Adds the given records to the currently selected set
  		* @param records Ext.data.Model/Array/Number The records to select.
  		* @param keepExisting Boolean If true, the existing selection will be added to (if not, the old selection is replaced).
  		* @param suppressEvent Boolean If true, the select event will not be fired.
  		*/
  var select: js.UndefOr[
    js.Function3[js.UndefOr[js.Any], js.UndefOr[scala.Boolean], js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Method] Selects all records
  		* @param silent Boolean true to suppress all select events.
  		*/
  var selectAll: js.UndefOr[js.Function1[js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Selects a range of rows if the selection model getDisableSelection is not locked
  		* @param startRecord Number The index of the first row in the range.
  		* @param endRecord Number The index of the last row in the range.
  		* @param keepExisting Boolean true to retain existing selections.
  		*/
  var selectRange: js.UndefOr[
    js.Function3[
      js.UndefOr[scala.Double], 
      js.UndefOr[scala.Double], 
      js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var selectedItemCls: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the value of allowDeselect
  		* @param allowDeselect Boolean The new value.
  		*/
  var setAllowDeselect: js.UndefOr[js.Function1[js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object[] The new value.
  		*/
  @JSName("setData")
  var setData_IDataView: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], scala.Unit]] = js.undefined
  /** [Method] Sets the value of deferEmptyText
  		* @param deferEmptyText Boolean The new value.
  		*/
  var setDeferEmptyText: js.UndefOr[js.Function1[/* deferEmptyText */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of deselectOnContainerClick
  		* @param deselectOnContainerClick Boolean The new value.
  		*/
  var setDeselectOnContainerClick: js.UndefOr[js.Function1[js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of disableSelection
  		* @param disableSelection Boolean The new value.
  		*/
  var setDisableSelection: js.UndefOr[js.Function1[js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of emptyText
  		* @param emptyText String The new value.
  		*/
  var setEmptyText: js.UndefOr[js.Function1[/* emptyText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of inline
  		* @param inline Boolean/Object The new value.
  		*/
  var setInline: js.UndefOr[js.Function1[/* inline */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemCls
  		* @param itemCls String The new value.
  		*/
  var setItemCls: js.UndefOr[js.Function1[/* itemCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemConfig
  		* @param itemConfig Object The new value.
  		*/
  var setItemConfig: js.UndefOr[js.Function1[/* itemConfig */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemTpl
  		* @param itemTpl String/String[]/Ext.XTemplate The new value.
  		*/
  var setItemTpl: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This was an internal function accidentally exposed in 1 x and now deprecated  */
  var setLastFocused: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the value of loadingText
  		* @param loadingText String/Boolean The new value.
  		*/
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxItemCache
  		* @param maxItemCache Number The new value.
  		*/
  var setMaxItemCache: js.UndefOr[js.Function1[/* maxItemCache */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of mode
  		* @param mode String The new value.
  		*/
  var setMode: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pressedCls
  		* @param pressedCls String The new value.
  		*/
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pressedDelay
  		* @param pressedDelay Number The new value.
  		*/
  var setPressedDelay: js.UndefOr[js.Function1[/* pressedDelay */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of scrollToTopOnRefresh
  		* @param scrollToTopOnRefresh Boolean The new value.
  		*/
  var setScrollToTopOnRefresh: js.UndefOr[js.Function1[/* scrollToTopOnRefresh */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of selectedCls
  		* @param selectedCls String The new value.
  		*/
  var setSelectedCls: js.UndefOr[js.Function1[/* selectedCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Ext.data.Store/Object The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of triggerCtEvent
  		* @param triggerCtEvent String The new value.
  		*/
  var setTriggerCtEvent: js.UndefOr[js.Function1[/* triggerCtEvent */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of triggerEvent
  		* @param triggerEvent String The new value.
  		*/
  var setTriggerEvent: js.UndefOr[js.Function1[/* triggerEvent */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useComponents
  		* @param useComponents Boolean The new value.
  		*/
  var setUseComponents: js.UndefOr[js.Function1[/* useComponents */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleSelect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var singleSelect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.data.Store/Object) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var trackOver: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var triggerCtEvent: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var triggerEvent: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets a record as the last focused record
  		* @param newRecord Ext.data.Record
  		* @param oldRecord Ext.data.Record
  		*/
  var updateLastFocused: js.UndefOr[
    js.Function2[
      js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord], 
      js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var useComponents: js.UndefOr[scala.Boolean] = js.undefined
}

object IDataView {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    ISelectable: senchaUnderscoreTouchLib.ExtNs.mixinNs.ISelectable = null,
    baseCls: java.lang.String = null,
    bindStore: () => scala.Unit = null,
    blockRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    clearSelections: () => scala.Unit = null,
    collectData: () => scala.Unit = null,
    data: Array = null,
    defaultType: java.lang.String = null,
    deferEmptyText: js.UndefOr[scala.Boolean] = js.undefined,
    deselect: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    deselectAll: /* supress */ js.UndefOr[js.Any] => scala.Unit = null,
    deselectOnContainerClick: js.UndefOr[scala.Boolean] = js.undefined,
    destroy: () => scala.Unit = null,
    doDeselect: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    doSelect: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[scala.Boolean], /* suppressEvent */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    emptyText: java.lang.String = null,
    findItemByChild: () => scala.Unit = null,
    findTargetByEvent: () => scala.Unit = null,
    getAllowDeselect: () => scala.Boolean = null,
    getBaseCls: () => java.lang.String = null,
    getCount: () => scala.Double = null,
    getData: () => Array = null,
    getDefaultType: () => java.lang.String = null,
    getDeferEmptyText: () => scala.Boolean = null,
    getDeselectOnContainerClick: () => scala.Boolean = null,
    getDisableSelection: () => scala.Boolean = null,
    getEmptyText: () => java.lang.String = null,
    getInline: () => _ = null,
    getItemAt: /* index */ js.UndefOr[scala.Double] => _ = null,
    getItemCls: () => java.lang.String = null,
    getItemConfig: () => _ = null,
    getItemIndex: /* item */ js.UndefOr[scala.Double] => scala.Double = null,
    getItemTpl: () => _ = null,
    getLastSelected: () => Array = null,
    getLoadingText: () => _ = null,
    getMaxItemCache: () => scala.Double = null,
    getMode: () => java.lang.String = null,
    getNode: () => scala.Unit = null,
    getNodes: () => scala.Unit = null,
    getPressedCls: () => java.lang.String = null,
    getPressedDelay: () => scala.Double = null,
    getRecords: () => scala.Unit = null,
    getScrollToTopOnRefresh: () => scala.Boolean = null,
    getScrollable: () => senchaUnderscoreTouchLib.ExtNs.scrollNs.IView = null,
    getSelectedCls: () => java.lang.String = null,
    getSelectedNodes: () => scala.Unit = null,
    getSelectedRecords: () => scala.Unit = null,
    getSelection: () => Array = null,
    getSelectionCount: () => scala.Double = null,
    getSelectionMode: () => java.lang.String = null,
    getStore: () => _ = null,
    getTriggerCtEvent: () => java.lang.String = null,
    getTriggerEvent: () => java.lang.String = null,
    getUseComponents: () => scala.Boolean = null,
    getViewItems: () => _ = null,
    handleException: () => scala.Unit = null,
    hasSelection: () => scala.Boolean = null,
    indexOf: () => scala.Unit = null,
    initialize: () => scala.Unit = null,
    `inline`: js.Any = null,
    isLocked: () => scala.Boolean = null,
    isSelected: /* record */ js.UndefOr[js.Any] => scala.Boolean = null,
    itemCls: java.lang.String = null,
    itemConfig: js.Any = null,
    itemSelector: js.UndefOr[scala.Boolean] = js.undefined,
    itemTpl: js.Any = null,
    loadingText: js.Any = null,
    maxItemCache: scala.Int | scala.Double = null,
    multiSelect: js.UndefOr[scala.Boolean] = js.undefined,
    overItemCls: js.UndefOr[scala.Boolean] = js.undefined,
    prepareData: (/* data */ js.UndefOr[js.Any], /* index */ js.UndefOr[scala.Double], /* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel]) => _ = null,
    pressedCls: java.lang.String = null,
    pressedDelay: scala.Int | scala.Double = null,
    refresh: () => scala.Unit = null,
    refreshNode: () => scala.Unit = null,
    scrollToTopOnRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    scrollable: js.Any = null,
    select: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[scala.Boolean], /* suppressEvent */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    selectAll: /* silent */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    selectRange: (/* startRecord */ js.UndefOr[scala.Double], /* endRecord */ js.UndefOr[scala.Double], /* keepExisting */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    selectedCls: java.lang.String = null,
    selectedItemCls: js.UndefOr[scala.Boolean] = js.undefined,
    setAllowDeselect: /* allowDeselect */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setData: /* data */ js.UndefOr[Array] => scala.Unit = null,
    setDefaultType: /* defaultType */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setDeferEmptyText: /* deferEmptyText */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setDeselectOnContainerClick: /* deselectOnContainerClick */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setDisableSelection: /* disableSelection */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setEmptyText: /* emptyText */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setInline: /* inline */ js.UndefOr[js.Any] => scala.Unit = null,
    setItemCls: /* itemCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setItemConfig: /* itemConfig */ js.UndefOr[js.Any] => scala.Unit = null,
    setItemTpl: /* itemTpl */ js.UndefOr[js.Any] => scala.Unit = null,
    setLastFocused: () => scala.Unit = null,
    setLoadingText: /* loadingText */ js.UndefOr[js.Any] => scala.Unit = null,
    setMaxItemCache: /* maxItemCache */ js.UndefOr[scala.Double] => scala.Unit = null,
    setMode: /* mode */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setPressedCls: /* pressedCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setPressedDelay: /* pressedDelay */ js.UndefOr[scala.Double] => scala.Unit = null,
    setScrollToTopOnRefresh: /* scrollToTopOnRefresh */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setSelectedCls: /* selectedCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setStore: /* store */ js.UndefOr[js.Any] => scala.Unit = null,
    setTriggerCtEvent: /* triggerCtEvent */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setTriggerEvent: /* triggerEvent */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setUseComponents: /* useComponents */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    simpleSelect: js.UndefOr[scala.Boolean] = js.undefined,
    singleSelect: js.UndefOr[scala.Boolean] = js.undefined,
    store: js.Any = null,
    trackOver: js.UndefOr[scala.Boolean] = js.undefined,
    triggerCtEvent: java.lang.String = null,
    triggerEvent: java.lang.String = null,
    updateLastFocused: (/* newRecord */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord], /* oldRecord */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord]) => scala.Unit = null,
    useComponents: js.UndefOr[scala.Boolean] = js.undefined
  ): IDataView = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    js.Dynamic.global.Object.assign(__obj, ISelectable)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (bindStore != null) __obj.updateDynamic("bindStore")(js.Any.fromFunction0(bindStore))
    if (!js.isUndefined(blockRefresh)) __obj.updateDynamic("blockRefresh")(blockRefresh)
    if (clearSelections != null) __obj.updateDynamic("clearSelections")(js.Any.fromFunction0(clearSelections))
    if (collectData != null) __obj.updateDynamic("collectData")(js.Any.fromFunction0(collectData))
    if (data != null) __obj.updateDynamic("data")(data)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (!js.isUndefined(deferEmptyText)) __obj.updateDynamic("deferEmptyText")(deferEmptyText)
    if (deselect != null) __obj.updateDynamic("deselect")(js.Any.fromFunction2(deselect))
    if (deselectAll != null) __obj.updateDynamic("deselectAll")(js.Any.fromFunction1(deselectAll))
    if (!js.isUndefined(deselectOnContainerClick)) __obj.updateDynamic("deselectOnContainerClick")(deselectOnContainerClick)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (doDeselect != null) __obj.updateDynamic("doDeselect")(js.Any.fromFunction2(doDeselect))
    if (doSelect != null) __obj.updateDynamic("doSelect")(js.Any.fromFunction3(doSelect))
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText)
    if (findItemByChild != null) __obj.updateDynamic("findItemByChild")(js.Any.fromFunction0(findItemByChild))
    if (findTargetByEvent != null) __obj.updateDynamic("findTargetByEvent")(js.Any.fromFunction0(findTargetByEvent))
    if (getAllowDeselect != null) __obj.updateDynamic("getAllowDeselect")(js.Any.fromFunction0(getAllowDeselect))
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction0(getData))
    if (getDefaultType != null) __obj.updateDynamic("getDefaultType")(js.Any.fromFunction0(getDefaultType))
    if (getDeferEmptyText != null) __obj.updateDynamic("getDeferEmptyText")(js.Any.fromFunction0(getDeferEmptyText))
    if (getDeselectOnContainerClick != null) __obj.updateDynamic("getDeselectOnContainerClick")(js.Any.fromFunction0(getDeselectOnContainerClick))
    if (getDisableSelection != null) __obj.updateDynamic("getDisableSelection")(js.Any.fromFunction0(getDisableSelection))
    if (getEmptyText != null) __obj.updateDynamic("getEmptyText")(js.Any.fromFunction0(getEmptyText))
    if (getInline != null) __obj.updateDynamic("getInline")(js.Any.fromFunction0(getInline))
    if (getItemAt != null) __obj.updateDynamic("getItemAt")(js.Any.fromFunction1(getItemAt))
    if (getItemCls != null) __obj.updateDynamic("getItemCls")(js.Any.fromFunction0(getItemCls))
    if (getItemConfig != null) __obj.updateDynamic("getItemConfig")(js.Any.fromFunction0(getItemConfig))
    if (getItemIndex != null) __obj.updateDynamic("getItemIndex")(js.Any.fromFunction1(getItemIndex))
    if (getItemTpl != null) __obj.updateDynamic("getItemTpl")(js.Any.fromFunction0(getItemTpl))
    if (getLastSelected != null) __obj.updateDynamic("getLastSelected")(js.Any.fromFunction0(getLastSelected))
    if (getLoadingText != null) __obj.updateDynamic("getLoadingText")(js.Any.fromFunction0(getLoadingText))
    if (getMaxItemCache != null) __obj.updateDynamic("getMaxItemCache")(js.Any.fromFunction0(getMaxItemCache))
    if (getMode != null) __obj.updateDynamic("getMode")(js.Any.fromFunction0(getMode))
    if (getNode != null) __obj.updateDynamic("getNode")(js.Any.fromFunction0(getNode))
    if (getNodes != null) __obj.updateDynamic("getNodes")(js.Any.fromFunction0(getNodes))
    if (getPressedCls != null) __obj.updateDynamic("getPressedCls")(js.Any.fromFunction0(getPressedCls))
    if (getPressedDelay != null) __obj.updateDynamic("getPressedDelay")(js.Any.fromFunction0(getPressedDelay))
    if (getRecords != null) __obj.updateDynamic("getRecords")(js.Any.fromFunction0(getRecords))
    if (getScrollToTopOnRefresh != null) __obj.updateDynamic("getScrollToTopOnRefresh")(js.Any.fromFunction0(getScrollToTopOnRefresh))
    if (getScrollable != null) __obj.updateDynamic("getScrollable")(js.Any.fromFunction0(getScrollable))
    if (getSelectedCls != null) __obj.updateDynamic("getSelectedCls")(js.Any.fromFunction0(getSelectedCls))
    if (getSelectedNodes != null) __obj.updateDynamic("getSelectedNodes")(js.Any.fromFunction0(getSelectedNodes))
    if (getSelectedRecords != null) __obj.updateDynamic("getSelectedRecords")(js.Any.fromFunction0(getSelectedRecords))
    if (getSelection != null) __obj.updateDynamic("getSelection")(js.Any.fromFunction0(getSelection))
    if (getSelectionCount != null) __obj.updateDynamic("getSelectionCount")(js.Any.fromFunction0(getSelectionCount))
    if (getSelectionMode != null) __obj.updateDynamic("getSelectionMode")(js.Any.fromFunction0(getSelectionMode))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getTriggerCtEvent != null) __obj.updateDynamic("getTriggerCtEvent")(js.Any.fromFunction0(getTriggerCtEvent))
    if (getTriggerEvent != null) __obj.updateDynamic("getTriggerEvent")(js.Any.fromFunction0(getTriggerEvent))
    if (getUseComponents != null) __obj.updateDynamic("getUseComponents")(js.Any.fromFunction0(getUseComponents))
    if (getViewItems != null) __obj.updateDynamic("getViewItems")(js.Any.fromFunction0(getViewItems))
    if (handleException != null) __obj.updateDynamic("handleException")(js.Any.fromFunction0(handleException))
    if (hasSelection != null) __obj.updateDynamic("hasSelection")(js.Any.fromFunction0(hasSelection))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction0(indexOf))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`)
    if (isLocked != null) __obj.updateDynamic("isLocked")(js.Any.fromFunction0(isLocked))
    if (isSelected != null) __obj.updateDynamic("isSelected")(js.Any.fromFunction1(isSelected))
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls)
    if (itemConfig != null) __obj.updateDynamic("itemConfig")(itemConfig)
    if (!js.isUndefined(itemSelector)) __obj.updateDynamic("itemSelector")(itemSelector)
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl)
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText)
    if (maxItemCache != null) __obj.updateDynamic("maxItemCache")(maxItemCache.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect)
    if (!js.isUndefined(overItemCls)) __obj.updateDynamic("overItemCls")(overItemCls)
    if (prepareData != null) __obj.updateDynamic("prepareData")(js.Any.fromFunction3(prepareData))
    if (pressedCls != null) __obj.updateDynamic("pressedCls")(pressedCls)
    if (pressedDelay != null) __obj.updateDynamic("pressedDelay")(pressedDelay.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(js.Any.fromFunction0(refresh))
    if (refreshNode != null) __obj.updateDynamic("refreshNode")(js.Any.fromFunction0(refreshNode))
    if (!js.isUndefined(scrollToTopOnRefresh)) __obj.updateDynamic("scrollToTopOnRefresh")(scrollToTopOnRefresh)
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction3(select))
    if (selectAll != null) __obj.updateDynamic("selectAll")(js.Any.fromFunction1(selectAll))
    if (selectRange != null) __obj.updateDynamic("selectRange")(js.Any.fromFunction3(selectRange))
    if (selectedCls != null) __obj.updateDynamic("selectedCls")(selectedCls)
    if (!js.isUndefined(selectedItemCls)) __obj.updateDynamic("selectedItemCls")(selectedItemCls)
    if (setAllowDeselect != null) __obj.updateDynamic("setAllowDeselect")(js.Any.fromFunction1(setAllowDeselect))
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1(setData))
    if (setDefaultType != null) __obj.updateDynamic("setDefaultType")(js.Any.fromFunction1(setDefaultType))
    if (setDeferEmptyText != null) __obj.updateDynamic("setDeferEmptyText")(js.Any.fromFunction1(setDeferEmptyText))
    if (setDeselectOnContainerClick != null) __obj.updateDynamic("setDeselectOnContainerClick")(js.Any.fromFunction1(setDeselectOnContainerClick))
    if (setDisableSelection != null) __obj.updateDynamic("setDisableSelection")(js.Any.fromFunction1(setDisableSelection))
    if (setEmptyText != null) __obj.updateDynamic("setEmptyText")(js.Any.fromFunction1(setEmptyText))
    if (setInline != null) __obj.updateDynamic("setInline")(js.Any.fromFunction1(setInline))
    if (setItemCls != null) __obj.updateDynamic("setItemCls")(js.Any.fromFunction1(setItemCls))
    if (setItemConfig != null) __obj.updateDynamic("setItemConfig")(js.Any.fromFunction1(setItemConfig))
    if (setItemTpl != null) __obj.updateDynamic("setItemTpl")(js.Any.fromFunction1(setItemTpl))
    if (setLastFocused != null) __obj.updateDynamic("setLastFocused")(js.Any.fromFunction0(setLastFocused))
    if (setLoadingText != null) __obj.updateDynamic("setLoadingText")(js.Any.fromFunction1(setLoadingText))
    if (setMaxItemCache != null) __obj.updateDynamic("setMaxItemCache")(js.Any.fromFunction1(setMaxItemCache))
    if (setMode != null) __obj.updateDynamic("setMode")(js.Any.fromFunction1(setMode))
    if (setPressedCls != null) __obj.updateDynamic("setPressedCls")(js.Any.fromFunction1(setPressedCls))
    if (setPressedDelay != null) __obj.updateDynamic("setPressedDelay")(js.Any.fromFunction1(setPressedDelay))
    if (setScrollToTopOnRefresh != null) __obj.updateDynamic("setScrollToTopOnRefresh")(js.Any.fromFunction1(setScrollToTopOnRefresh))
    if (setSelectedCls != null) __obj.updateDynamic("setSelectedCls")(js.Any.fromFunction1(setSelectedCls))
    if (setStore != null) __obj.updateDynamic("setStore")(js.Any.fromFunction1(setStore))
    if (setTriggerCtEvent != null) __obj.updateDynamic("setTriggerCtEvent")(js.Any.fromFunction1(setTriggerCtEvent))
    if (setTriggerEvent != null) __obj.updateDynamic("setTriggerEvent")(js.Any.fromFunction1(setTriggerEvent))
    if (setUseComponents != null) __obj.updateDynamic("setUseComponents")(js.Any.fromFunction1(setUseComponents))
    if (!js.isUndefined(simpleSelect)) __obj.updateDynamic("simpleSelect")(simpleSelect)
    if (!js.isUndefined(singleSelect)) __obj.updateDynamic("singleSelect")(singleSelect)
    if (store != null) __obj.updateDynamic("store")(store)
    if (!js.isUndefined(trackOver)) __obj.updateDynamic("trackOver")(trackOver)
    if (triggerCtEvent != null) __obj.updateDynamic("triggerCtEvent")(triggerCtEvent)
    if (triggerEvent != null) __obj.updateDynamic("triggerEvent")(triggerEvent)
    if (updateLastFocused != null) __obj.updateDynamic("updateLastFocused")(js.Any.fromFunction2(updateLastFocused))
    if (!js.isUndefined(useComponents)) __obj.updateDynamic("useComponents")(useComponents)
    __obj.asInstanceOf[IDataView]
  }
}

