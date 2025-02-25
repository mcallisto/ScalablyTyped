package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeries
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Config Option] (Object) */
  var animate: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Array) */
  var colors: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Returns the value of animate
  		* @returns Object
  		*/
  var getAnimate: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of background
  		* @returns Object
  		*/
  var getBackground: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of colors
  		* @returns Array
  		*/
  var getColors: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of hidden
  		* @returns Boolean|Array
  		*/
  var getHidden: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of highlightCfg
  		* @returns Object
  		*/
  var getHighlightCfg: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of highlightItem
  		* @returns Object
  		*/
  var getHighlightItem: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
  		* @param x Number
  		* @param y Number
  		* @param target Object optional target to receive the result
  		* @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
  		*/
  var getItemForPoint: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* target */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the value of itemInstancing
  		* @returns Object
  		*/
  var getItemInstancing: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of label
  		* @returns Object
  		*/
  var getLabel: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of labelField
  		* @returns String/String[]
  		*/
  var getLabelField: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of labelOverflowPadding
  		* @returns Number
  		*/
  var getLabelOverflowPadding: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of marker
  		* @returns Object
  		*/
  var getMarker: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of markerSubStyle
  		* @returns Object
  		*/
  var getMarkerSubStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of overlaySurface
  		* @returns Object
  		*/
  var getOverlaySurface: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of renderer
  		* @returns Function
  		*/
  var getRenderer: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of showInLegend
  		* @returns Boolean
  		*/
  var getShowInLegend: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Performs drawing of this series  */
  var getSprites: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of style
  		* @returns Object
  		*/
  var getStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of subStyle
  		* @returns Object
  		*/
  var getSubStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of surface
  		* @returns Object
  		*/
  var getSurface: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Boolean|Array) */
  var hidden: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var highlightCfg: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var highlightItem: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var itemInstancing: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/String[]) */
  var labelField: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var labelOverflowPadding: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object) */
  var marker: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var markerSubStyle: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var overlaySurface: js.UndefOr[js.Any] = js.undefined
  /** [Method] Provide legend information to target array
  		* @param target Array The information consists:
  		*/
  var provideLegendInfo: js.UndefOr[
    js.Function1[/* target */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_ISeries: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Property] (String) */
  var seriesType: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of animate
  		* @param animate Object The new value.
  		*/
  var setAnimate: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of background
  		* @param background Object The new value.
  		*/
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of colors
  		* @param colors Array The new value.
  		*/
  var setColors: js.UndefOr[
    js.Function1[/* colors */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of hidden
  		* @param hidden Boolean|Array The new value.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method]
  		* @param index Number
  		* @param value Boolean
  		*/
  var setHiddenByIndex: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* value */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of highlightCfg
  		* @param highlightCfg Object The new value.
  		*/
  var setHighlightCfg: js.UndefOr[js.Function1[/* highlightCfg */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of highlightItem
  		* @param highlightItem Object The new value.
  		*/
  var setHighlightItem: js.UndefOr[js.Function1[/* highlightItem */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemInstancing
  		* @param itemInstancing Object The new value.
  		*/
  var setItemInstancing: js.UndefOr[js.Function1[/* itemInstancing */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of label
  		* @param label Object The new value.
  		* @returns Object/String The attributes that have been changed or added, or the text for the label. Example to enclose every other label in parentheses: renderer: function (text) { if (index % 2 == 0) { return '(' + text + ')' } } Default value: null.
  		*/
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the value of labelField
  		* @param labelField String/String[] The new value.
  		*/
  var setLabelField: js.UndefOr[js.Function1[/* labelField */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of labelOverflowPadding
  		* @param labelOverflowPadding Number The new value.
  		*/
  var setLabelOverflowPadding: js.UndefOr[js.Function1[/* labelOverflowPadding */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of marker
  		* @param marker Object The new value.
  		*/
  var setMarker: js.UndefOr[js.Function1[/* marker */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of markerSubStyle
  		* @param markerSubStyle Object The new value.
  		*/
  var setMarkerSubStyle: js.UndefOr[js.Function1[/* markerSubStyle */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of overlaySurface
  		* @param overlaySurface Object The new value.
  		*/
  var setOverlaySurface: js.UndefOr[js.Function1[/* overlaySurface */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of renderer
  		* @param renderer Function The new value.
  		* @returns Object The attributes that have been changed or added. Note: it is usually possible to add or modify the attributes directly into the config parameter and not return anything, but returning an object with only those attributes that have been changed may allow for optimizations in the rendering of some series. Example to draw every other item in red: renderer: function (sprite, config, rendererData, index) { if (index % 2 == 0) { return { strokeStyle: 'red' }; } }
  		*/
  var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the value of showInLegend
  		* @param showInLegend Boolean The new value.
  		*/
  var setShowInLegend: js.UndefOr[js.Function1[/* showInLegend */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Object The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of style
  		* @param style Object The new value.
  		*/
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of subStyle
  		* @param subStyle Object The new value.
  		*/
  var setSubStyle: js.UndefOr[js.Function1[/* subStyle */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of surface
  		* @param surface Object The new value.
  		*/
  var setSurface: js.UndefOr[js.Function1[/* surface */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var showInLegend: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var subStyle: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var surface: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ISeries {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    animate: js.Any = null,
    background: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => scala.Unit = null,
    colors: senchaUnderscoreTouchLib.ExtNs.Array = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => scala.Unit = null,
    extend: java.lang.String = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => scala.Boolean = null,
    getAnimate: () => _ = null,
    getBackground: () => _ = null,
    getBubbleEvents: () => _ = null,
    getColors: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getHidden: () => _ = null,
    getHighlightCfg: () => _ = null,
    getHighlightItem: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getItemForPoint: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], /* target */ js.UndefOr[js.Any]) => _ = null,
    getItemInstancing: () => _ = null,
    getLabel: () => _ = null,
    getLabelField: () => _ = null,
    getLabelOverflowPadding: () => scala.Double = null,
    getListeners: () => _ = null,
    getMarker: () => _ = null,
    getMarkerSubStyle: () => _ = null,
    getOverlaySurface: () => _ = null,
    getRenderer: () => _ = null,
    getShowInLegend: () => scala.Boolean = null,
    getSprites: () => scala.Unit = null,
    getStyle: () => _ = null,
    getSubStyle: () => _ = null,
    getSurface: () => _ = null,
    getTitle: () => java.lang.String = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    hidden: js.Any = null,
    highlightCfg: js.Any = null,
    highlightItem: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    itemInstancing: js.Any = null,
    label: js.Any = null,
    labelField: js.Any = null,
    labelOverflowPadding: scala.Int | scala.Double = null,
    listeners: js.Any = null,
    marker: js.Any = null,
    markerSubStyle: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    overlaySurface: js.Any = null,
    platformConfig: js.Any = null,
    provideLegendInfo: /* target */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => scala.Unit = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    renderer: js.Any = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    seriesType: java.lang.String = null,
    setAnimate: /* animate */ js.UndefOr[js.Any] => scala.Unit = null,
    setBackground: /* background */ js.UndefOr[js.Any] => scala.Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => scala.Unit = null,
    setColors: /* colors */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => scala.Unit = null,
    setHidden: /* hidden */ js.UndefOr[js.Any] => scala.Unit = null,
    setHiddenByIndex: (/* index */ js.UndefOr[scala.Double], /* value */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    setHighlightCfg: /* highlightCfg */ js.UndefOr[js.Any] => scala.Unit = null,
    setHighlightItem: /* highlightItem */ js.UndefOr[js.Any] => scala.Unit = null,
    setItemInstancing: /* itemInstancing */ js.UndefOr[js.Any] => scala.Unit = null,
    setLabel: /* label */ js.UndefOr[js.Any] => _ = null,
    setLabelField: /* labelField */ js.UndefOr[js.Any] => scala.Unit = null,
    setLabelOverflowPadding: /* labelOverflowPadding */ js.UndefOr[scala.Double] => scala.Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => scala.Unit = null,
    setMarker: /* marker */ js.UndefOr[js.Any] => scala.Unit = null,
    setMarkerSubStyle: /* markerSubStyle */ js.UndefOr[js.Any] => scala.Unit = null,
    setOverlaySurface: /* overlaySurface */ js.UndefOr[js.Any] => scala.Unit = null,
    setRenderer: /* renderer */ js.UndefOr[js.Any] => _ = null,
    setShowInLegend: /* showInLegend */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setStore: /* store */ js.UndefOr[js.Any] => scala.Unit = null,
    setStyle: /* style */ js.UndefOr[js.Any] => scala.Unit = null,
    setSubStyle: /* subStyle */ js.UndefOr[js.Any] => scala.Unit = null,
    setSurface: /* surface */ js.UndefOr[js.Any] => scala.Unit = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => scala.Unit = null,
    showInLegend: js.UndefOr[scala.Boolean] = js.undefined,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    store: js.Any = null,
    style: js.Any = null,
    subStyle: js.Any = null,
    surface: js.Any = null,
    suspendEvents: () => scala.Unit = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ISeries = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (background != null) __obj.updateDynamic("background")(background)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getAnimate != null) __obj.updateDynamic("getAnimate")(js.Any.fromFunction0(getAnimate))
    if (getBackground != null) __obj.updateDynamic("getBackground")(js.Any.fromFunction0(getBackground))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getColors != null) __obj.updateDynamic("getColors")(js.Any.fromFunction0(getColors))
    if (getHidden != null) __obj.updateDynamic("getHidden")(js.Any.fromFunction0(getHidden))
    if (getHighlightCfg != null) __obj.updateDynamic("getHighlightCfg")(js.Any.fromFunction0(getHighlightCfg))
    if (getHighlightItem != null) __obj.updateDynamic("getHighlightItem")(js.Any.fromFunction0(getHighlightItem))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemForPoint != null) __obj.updateDynamic("getItemForPoint")(js.Any.fromFunction3(getItemForPoint))
    if (getItemInstancing != null) __obj.updateDynamic("getItemInstancing")(js.Any.fromFunction0(getItemInstancing))
    if (getLabel != null) __obj.updateDynamic("getLabel")(js.Any.fromFunction0(getLabel))
    if (getLabelField != null) __obj.updateDynamic("getLabelField")(js.Any.fromFunction0(getLabelField))
    if (getLabelOverflowPadding != null) __obj.updateDynamic("getLabelOverflowPadding")(js.Any.fromFunction0(getLabelOverflowPadding))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getMarker != null) __obj.updateDynamic("getMarker")(js.Any.fromFunction0(getMarker))
    if (getMarkerSubStyle != null) __obj.updateDynamic("getMarkerSubStyle")(js.Any.fromFunction0(getMarkerSubStyle))
    if (getOverlaySurface != null) __obj.updateDynamic("getOverlaySurface")(js.Any.fromFunction0(getOverlaySurface))
    if (getRenderer != null) __obj.updateDynamic("getRenderer")(js.Any.fromFunction0(getRenderer))
    if (getShowInLegend != null) __obj.updateDynamic("getShowInLegend")(js.Any.fromFunction0(getShowInLegend))
    if (getSprites != null) __obj.updateDynamic("getSprites")(js.Any.fromFunction0(getSprites))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction0(getStyle))
    if (getSubStyle != null) __obj.updateDynamic("getSubStyle")(js.Any.fromFunction0(getSubStyle))
    if (getSurface != null) __obj.updateDynamic("getSurface")(js.Any.fromFunction0(getSurface))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (highlightCfg != null) __obj.updateDynamic("highlightCfg")(highlightCfg)
    if (highlightItem != null) __obj.updateDynamic("highlightItem")(highlightItem)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (itemInstancing != null) __obj.updateDynamic("itemInstancing")(itemInstancing)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelField != null) __obj.updateDynamic("labelField")(labelField)
    if (labelOverflowPadding != null) __obj.updateDynamic("labelOverflowPadding")(labelOverflowPadding.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (markerSubStyle != null) __obj.updateDynamic("markerSubStyle")(markerSubStyle)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (overlaySurface != null) __obj.updateDynamic("overlaySurface")(overlaySurface)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (provideLegendInfo != null) __obj.updateDynamic("provideLegendInfo")(js.Any.fromFunction1(provideLegendInfo))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (seriesType != null) __obj.updateDynamic("seriesType")(seriesType)
    if (setAnimate != null) __obj.updateDynamic("setAnimate")(js.Any.fromFunction1(setAnimate))
    if (setBackground != null) __obj.updateDynamic("setBackground")(js.Any.fromFunction1(setBackground))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setColors != null) __obj.updateDynamic("setColors")(js.Any.fromFunction1(setColors))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1(setHidden))
    if (setHiddenByIndex != null) __obj.updateDynamic("setHiddenByIndex")(js.Any.fromFunction2(setHiddenByIndex))
    if (setHighlightCfg != null) __obj.updateDynamic("setHighlightCfg")(js.Any.fromFunction1(setHighlightCfg))
    if (setHighlightItem != null) __obj.updateDynamic("setHighlightItem")(js.Any.fromFunction1(setHighlightItem))
    if (setItemInstancing != null) __obj.updateDynamic("setItemInstancing")(js.Any.fromFunction1(setItemInstancing))
    if (setLabel != null) __obj.updateDynamic("setLabel")(js.Any.fromFunction1(setLabel))
    if (setLabelField != null) __obj.updateDynamic("setLabelField")(js.Any.fromFunction1(setLabelField))
    if (setLabelOverflowPadding != null) __obj.updateDynamic("setLabelOverflowPadding")(js.Any.fromFunction1(setLabelOverflowPadding))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setMarker != null) __obj.updateDynamic("setMarker")(js.Any.fromFunction1(setMarker))
    if (setMarkerSubStyle != null) __obj.updateDynamic("setMarkerSubStyle")(js.Any.fromFunction1(setMarkerSubStyle))
    if (setOverlaySurface != null) __obj.updateDynamic("setOverlaySurface")(js.Any.fromFunction1(setOverlaySurface))
    if (setRenderer != null) __obj.updateDynamic("setRenderer")(js.Any.fromFunction1(setRenderer))
    if (setShowInLegend != null) __obj.updateDynamic("setShowInLegend")(js.Any.fromFunction1(setShowInLegend))
    if (setStore != null) __obj.updateDynamic("setStore")(js.Any.fromFunction1(setStore))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction1(setStyle))
    if (setSubStyle != null) __obj.updateDynamic("setSubStyle")(js.Any.fromFunction1(setSubStyle))
    if (setSurface != null) __obj.updateDynamic("setSurface")(js.Any.fromFunction1(setSurface))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (store != null) __obj.updateDynamic("store")(store)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subStyle != null) __obj.updateDynamic("subStyle")(subStyle)
    if (surface != null) __obj.updateDynamic("surface")(surface)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISeries]
  }
}

