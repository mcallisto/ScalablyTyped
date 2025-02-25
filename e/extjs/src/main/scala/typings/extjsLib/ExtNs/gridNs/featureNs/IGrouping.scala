package typings
package extjsLib.ExtNs.gridNs.featureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGrouping extends IAbstractSummary {
  /** [Method] Collapse a group
  		* @param groupName String The group name
  		* @param focus Boolean Pass true to focus the group after expand.
  		*/
  var collapse: js.UndefOr[
    js.Function2[
      /* groupName */ js.UndefOr[java.lang.String], 
      /* focus */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Collapse all groups */
  var collapseAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var depthToIndent: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var enableGroupingMenu: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableNoGroups: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Expand a group
  		* @param groupName String The group name
  		* @param focus Boolean Pass true to focus the group after expand.
  		*/
  var expand: js.UndefOr[
    js.Function2[
      /* groupName */ js.UndefOr[java.lang.String], 
      /* focus */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Expand all groups */
  var expandAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the group data object for the group to which the passed record belongs if the Store is grouped
  		* @param record Ext.data.Model The record for which to return group information.
  		* @returns Object A single group data block as returned from Store.getGroups. Returns undefined if the Store is not grouped.
  		*/
  var getRecordGroup: js.UndefOr[js.Function1[/* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], _]] = js.undefined
  /** [Config Option] (String) */
  var groupByText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/Array/Ext.Template) */
  var groupHeaderTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hideGroupedHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns true if the named group is expanded
  		* @param groupName String The group name as returned from getGroupString. This is usually the value of the groupField.
  		* @returns Boolean true if the group defined by that value is expanded.
  		*/
  var isExpanded: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var showGroupsText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var startCollapsed: js.UndefOr[scala.Boolean] = js.undefined
}

object IGrouping {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => scala.Unit = null,
    clearManagedListeners: () => scala.Unit = null,
    collapse: (/* groupName */ js.UndefOr[java.lang.String], /* focus */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    collapseAll: () => scala.Unit = null,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    config: js.Any = null,
    depthToIndent: scala.Int | scala.Double = null,
    disable: () => scala.Unit = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    enable: () => scala.Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    enableGroupingMenu: js.UndefOr[scala.Boolean] = js.undefined,
    enableNoGroups: js.UndefOr[scala.Boolean] = js.undefined,
    eventPrefix: java.lang.String = null,
    eventSelector: java.lang.String = null,
    expand: (/* groupName */ js.UndefOr[java.lang.String], /* focus */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    expandAll: () => scala.Unit = null,
    extend: java.lang.String = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => scala.Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[extjsLib.ExtNs.Array]) => scala.Boolean = null,
    getFireEventArgs: (/* type */ js.UndefOr[js.Any], /* view */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any]) => scala.Unit = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getRecordGroup: /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel] => _ = null,
    grid: extjsLib.ExtNs.gridNs.IPanel = null,
    groupByText: java.lang.String = null,
    groupHeaderTpl: js.Any = null,
    hasFeatureEvent: js.UndefOr[scala.Boolean] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    hasListeners: js.Any = null,
    hideGroupedHeader: js.UndefOr[scala.Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IGrouping = null,
    isExpanded: /* groupName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[extjsLib.ExtNs.Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    remoteRoot: java.lang.String = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    requires: extjsLib.ExtNs.Array = null,
    resumeEvent: /* repeated */ js.Any => scala.Unit = null,
    resumeEvents: () => scala.Unit = null,
    self: extjsLib.ExtNs.IClass = null,
    showGroupsText: java.lang.String = null,
    showSummaryRow: js.UndefOr[scala.Boolean] = js.undefined,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    startCollapsed: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => scala.Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    toggleSummaryRow: /* visible */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    uses: extjsLib.ExtNs.Array = null,
    view: extjsLib.ExtNs.viewNs.ITable = null
  ): IGrouping = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction2(collapse))
    if (collapseAll != null) __obj.updateDynamic("collapseAll")(js.Any.fromFunction0(collapseAll))
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (config != null) __obj.updateDynamic("config")(config)
    if (depthToIndent != null) __obj.updateDynamic("depthToIndent")(depthToIndent.asInstanceOf[js.Any])
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction0(disable))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (!js.isUndefined(enableGroupingMenu)) __obj.updateDynamic("enableGroupingMenu")(enableGroupingMenu)
    if (!js.isUndefined(enableNoGroups)) __obj.updateDynamic("enableNoGroups")(enableNoGroups)
    if (eventPrefix != null) __obj.updateDynamic("eventPrefix")(eventPrefix)
    if (eventSelector != null) __obj.updateDynamic("eventSelector")(eventSelector)
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction2(expand))
    if (expandAll != null) __obj.updateDynamic("expandAll")(js.Any.fromFunction0(expandAll))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getFireEventArgs != null) __obj.updateDynamic("getFireEventArgs")(js.Any.fromFunction4(getFireEventArgs))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getRecordGroup != null) __obj.updateDynamic("getRecordGroup")(js.Any.fromFunction1(getRecordGroup))
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (groupByText != null) __obj.updateDynamic("groupByText")(groupByText)
    if (groupHeaderTpl != null) __obj.updateDynamic("groupHeaderTpl")(groupHeaderTpl)
    if (!js.isUndefined(hasFeatureEvent)) __obj.updateDynamic("hasFeatureEvent")(hasFeatureEvent)
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (!js.isUndefined(hideGroupedHeader)) __obj.updateDynamic("hideGroupedHeader")(hideGroupedHeader)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isExpanded != null) __obj.updateDynamic("isExpanded")(js.Any.fromFunction1(isExpanded))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (remoteRoot != null) __obj.updateDynamic("remoteRoot")(remoteRoot)
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (showGroupsText != null) __obj.updateDynamic("showGroupsText")(showGroupsText)
    if (!js.isUndefined(showSummaryRow)) __obj.updateDynamic("showSummaryRow")(showSummaryRow)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (!js.isUndefined(startCollapsed)) __obj.updateDynamic("startCollapsed")(startCollapsed)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (toggleSummaryRow != null) __obj.updateDynamic("toggleSummaryRow")(js.Any.fromFunction1(toggleSummaryRow))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[IGrouping]
  }
}

