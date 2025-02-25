package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- senchaUnderscoreTouchLib.ExtNs.chartNs.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ trait IAxis
  extends senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite {
  /** [Config Option] (Number) */
  var The: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Ext.chart.axis.Axis) */
  var axis: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis] = js.undefined
  /** [Config Option] (Boolean) */
  var axisLine: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method]
  		* @param name String
  		* @param marker Ext.chart.Markers
  		*/
  var bindMarker: js.UndefOr[
    js.Function2[
      js.UndefOr[java.lang.String], 
      js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.IMarkers], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Number) */
  var centerX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var centerY: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var dataMax: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var dataMin: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var enlargeEstStepSizeByText: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of axis
  		* @returns Ext.chart.axis.Axis
  		*/
  var getAxis: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns the bounding box for the given Sprite as calculated with the Canvas engine  */
  @JSName("getBBox")
  var getBBox_IAxis: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of label
  		* @returns Object
  		*/
  var getLabel: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of layout
  		* @returns Object|Ext.chart.axis.layout.Layout
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of renderer
  		* @returns Function
  		*/
  var getRenderer: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of segmenter
  		* @returns Object|Ext.chart.axis.segmenter.Segmenter
  		*/
  var getSegmenter: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var grid: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object|Ext.chart.axis.layout.Layout) */
  var layout: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var length: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var majorTickSize: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var majorTicks: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var max: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var min: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minStepSize: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minorTickSize: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var minorTricks: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Render method
  		* @param surface Object
  		* @param ctx Object
  		* @param clipRegion Object
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_IAxis: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object|Ext.chart.axis.segmenter.Segmenter) */
  var segmenter: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of axis
  		* @param axis Ext.chart.axis.Axis The new value.
  		*/
  var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[this.type], scala.Unit]] = js.undefined
  /** [Method] Sets the value of label
  		* @param label Object The new value.
  		*/
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of layout
  		* @param layout Object|Ext.chart.axis.layout.Layout The new value.
  		*/
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of renderer
  		* @param renderer Function The new value.
  		*/
  var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of segmenter
  		* @param segmenter Object|Ext.chart.axis.segmenter.Segmenter The new value.
  		*/
  var setSegmenter: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var textPadding: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var visibleMax: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var visibleMin: js.UndefOr[scala.Double] = js.undefined
}

object IAxis {
  @scala.inline
  def apply(
    A: scala.Int | scala.Double = null,
    An: senchaUnderscoreTouchLib.ExtNs.Array = null,
    The: scala.Int | scala.Double = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    attr: js.Any = null,
    axis: senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis = null,
    axisLine: js.UndefOr[scala.Boolean] = js.undefined,
    bindMarker: (/* name */ js.UndefOr[java.lang.String], /* marker */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.IMarkers]) => scala.Unit = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    centerX: scala.Int | scala.Double = null,
    centerY: scala.Int | scala.Double = null,
    clearListeners: () => scala.Unit = null,
    config: js.Any = null,
    dataMax: scala.Int | scala.Double = null,
    dataMin: scala.Int | scala.Double = null,
    destroy: () => scala.Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => scala.Unit = null,
    enlargeEstStepSizeByText: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    fillStyle: java.lang.String = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => scala.Boolean = null,
    getAxis: () => IAxis = null,
    getBBox: () => scala.Unit = null,
    getBBoxCenter: /* isWithoutTransform */ js.UndefOr[scala.Boolean] => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getBubbleEvents: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getLabel: () => _ = null,
    getLayout: () => _ = null,
    getListeners: () => _ = null,
    getParent: () => _ = null,
    getRenderer: () => _ = null,
    getSegmenter: () => _ = null,
    globalAlpha: scala.Int | scala.Double = null,
    grid: js.UndefOr[scala.Boolean] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hide: () => IAxis = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    label: js.Any = null,
    layout: js.Any = null,
    length: scala.Int | scala.Double = null,
    lineCap: java.lang.String = null,
    lineJoin: java.lang.String = null,
    lineWidth: scala.Int | scala.Double = null,
    listeners: js.Any = null,
    majorTickSize: scala.Int | scala.Double = null,
    majorTicks: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    minStepSize: scala.Int | scala.Double = null,
    minorTickSize: scala.Int | scala.Double = null,
    minorTricks: js.UndefOr[scala.Boolean] = js.undefined,
    miterLimit: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    platformConfig: js.Any = null,
    position: java.lang.String = null,
    preRender: () => scala.Unit = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    render: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => _ = null,
    renderer: js.Any = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    rotationCenterX: scala.Int | scala.Double = null,
    rotationCenterY: scala.Int | scala.Double = null,
    rotationRads: scala.Int | scala.Double = null,
    scalingCenterX: scala.Int | scala.Double = null,
    scalingCenterY: scala.Int | scala.Double = null,
    scalingX: scala.Int | scala.Double = null,
    scalingY: scala.Int | scala.Double = null,
    segmenter: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAttributes: (/* changes */ js.UndefOr[js.Any], /* bypassNormalization */ js.UndefOr[scala.Boolean], /* avoidCopy */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    setAttributesBypassingNormalization: (/* changes */ js.UndefOr[js.Any], /* avoidCopy */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    setAxis: /* axis */ js.UndefOr[IAxis] => scala.Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => scala.Unit = null,
    setLabel: /* label */ js.UndefOr[js.Any] => scala.Unit = null,
    setLayout: /* layout */ js.UndefOr[js.Any] => scala.Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => scala.Unit = null,
    setParent: /* parent */ js.UndefOr[js.Any] => scala.Unit = null,
    setRenderer: /* renderer */ js.UndefOr[js.Any] => scala.Unit = null,
    setSegmenter: /* segmenter */ js.UndefOr[js.Any] => scala.Unit = null,
    shadowBlur: scala.Int | scala.Double = null,
    shadowColor: java.lang.String = null,
    shadowOffsetX: scala.Int | scala.Double = null,
    shadowOffsetY: scala.Int | scala.Double = null,
    show: () => IAxis = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokeStyle: java.lang.String = null,
    suspendEvents: () => scala.Unit = null,
    textPadding: scala.Int | scala.Double = null,
    transformFillStroke: js.UndefOr[scala.Boolean] = js.undefined,
    translationX: scala.Int | scala.Double = null,
    translationY: scala.Int | scala.Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    updatePlainBBox: /* plain */ js.UndefOr[js.Any] => scala.Unit = null,
    updateTransformedBBox: (/* transform */ js.UndefOr[js.Any], /* plain */ js.UndefOr[js.Any]) => scala.Unit = null,
    useAttributes: (/* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array]) => scala.Unit = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    visibleMax: scala.Int | scala.Double = null,
    visibleMin: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): IAxis = {
    val __obj = js.Dynamic.literal()
    if (A != null) __obj.updateDynamic("A")(A.asInstanceOf[js.Any])
    if (An != null) __obj.updateDynamic("An")(An)
    if (The != null) __obj.updateDynamic("The")(The.asInstanceOf[js.Any])
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (attr != null) __obj.updateDynamic("attr")(attr)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (!js.isUndefined(axisLine)) __obj.updateDynamic("axisLine")(axisLine)
    if (bindMarker != null) __obj.updateDynamic("bindMarker")(js.Any.fromFunction2(bindMarker))
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (centerX != null) __obj.updateDynamic("centerX")(centerX.asInstanceOf[js.Any])
    if (centerY != null) __obj.updateDynamic("centerY")(centerY.asInstanceOf[js.Any])
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (dataMax != null) __obj.updateDynamic("dataMax")(dataMax.asInstanceOf[js.Any])
    if (dataMin != null) __obj.updateDynamic("dataMin")(dataMin.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (!js.isUndefined(enlargeEstStepSizeByText)) __obj.updateDynamic("enlargeEstStepSizeByText")(enlargeEstStepSizeByText)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle)
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getAxis != null) __obj.updateDynamic("getAxis")(js.Any.fromFunction0(getAxis))
    if (getBBox != null) __obj.updateDynamic("getBBox")(js.Any.fromFunction0(getBBox))
    if (getBBoxCenter != null) __obj.updateDynamic("getBBoxCenter")(js.Any.fromFunction1(getBBoxCenter))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLabel != null) __obj.updateDynamic("getLabel")(js.Any.fromFunction0(getLabel))
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getParent != null) __obj.updateDynamic("getParent")(js.Any.fromFunction0(getParent))
    if (getRenderer != null) __obj.updateDynamic("getRenderer")(js.Any.fromFunction0(getRenderer))
    if (getSegmenter != null) __obj.updateDynamic("getSegmenter")(js.Any.fromFunction0(getSegmenter))
    if (globalAlpha != null) __obj.updateDynamic("globalAlpha")(globalAlpha.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (label != null) __obj.updateDynamic("label")(label)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (majorTickSize != null) __obj.updateDynamic("majorTickSize")(majorTickSize.asInstanceOf[js.Any])
    if (!js.isUndefined(majorTicks)) __obj.updateDynamic("majorTicks")(majorTicks)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minStepSize != null) __obj.updateDynamic("minStepSize")(minStepSize.asInstanceOf[js.Any])
    if (minorTickSize != null) __obj.updateDynamic("minorTickSize")(minorTickSize.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTricks)) __obj.updateDynamic("minorTricks")(minorTricks)
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (position != null) __obj.updateDynamic("position")(position)
    if (preRender != null) __obj.updateDynamic("preRender")(js.Any.fromFunction0(preRender))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3(render))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (rotationCenterX != null) __obj.updateDynamic("rotationCenterX")(rotationCenterX.asInstanceOf[js.Any])
    if (rotationCenterY != null) __obj.updateDynamic("rotationCenterY")(rotationCenterY.asInstanceOf[js.Any])
    if (rotationRads != null) __obj.updateDynamic("rotationRads")(rotationRads.asInstanceOf[js.Any])
    if (scalingCenterX != null) __obj.updateDynamic("scalingCenterX")(scalingCenterX.asInstanceOf[js.Any])
    if (scalingCenterY != null) __obj.updateDynamic("scalingCenterY")(scalingCenterY.asInstanceOf[js.Any])
    if (scalingX != null) __obj.updateDynamic("scalingX")(scalingX.asInstanceOf[js.Any])
    if (scalingY != null) __obj.updateDynamic("scalingY")(scalingY.asInstanceOf[js.Any])
    if (segmenter != null) __obj.updateDynamic("segmenter")(segmenter)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAttributes != null) __obj.updateDynamic("setAttributes")(js.Any.fromFunction3(setAttributes))
    if (setAttributesBypassingNormalization != null) __obj.updateDynamic("setAttributesBypassingNormalization")(js.Any.fromFunction2(setAttributesBypassingNormalization))
    if (setAxis != null) __obj.updateDynamic("setAxis")(js.Any.fromFunction1(setAxis))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setLabel != null) __obj.updateDynamic("setLabel")(js.Any.fromFunction1(setLabel))
    if (setLayout != null) __obj.updateDynamic("setLayout")(js.Any.fromFunction1(setLayout))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setParent != null) __obj.updateDynamic("setParent")(js.Any.fromFunction1(setParent))
    if (setRenderer != null) __obj.updateDynamic("setRenderer")(js.Any.fromFunction1(setRenderer))
    if (setSegmenter != null) __obj.updateDynamic("setSegmenter")(js.Any.fromFunction1(setSegmenter))
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (textPadding != null) __obj.updateDynamic("textPadding")(textPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(transformFillStroke)) __obj.updateDynamic("transformFillStroke")(transformFillStroke)
    if (translationX != null) __obj.updateDynamic("translationX")(translationX.asInstanceOf[js.Any])
    if (translationY != null) __obj.updateDynamic("translationY")(translationY.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (updatePlainBBox != null) __obj.updateDynamic("updatePlainBBox")(js.Any.fromFunction1(updatePlainBBox))
    if (updateTransformedBBox != null) __obj.updateDynamic("updateTransformedBBox")(js.Any.fromFunction2(updateTransformedBBox))
    if (useAttributes != null) __obj.updateDynamic("useAttributes")(js.Any.fromFunction2(useAttributes))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (visibleMax != null) __obj.updateDynamic("visibleMax")(visibleMax.asInstanceOf[js.Any])
    if (visibleMin != null) __obj.updateDynamic("visibleMin")(visibleMin.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAxis]
  }
}

