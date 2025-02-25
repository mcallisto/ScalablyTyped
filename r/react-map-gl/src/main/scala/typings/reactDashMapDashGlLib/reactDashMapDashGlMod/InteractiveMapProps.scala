package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveMapProps extends StaticMapProps {
  var clickRadius: js.UndefOr[scala.Double] = js.undefined
  var controller: js.UndefOr[MapController] = js.undefined
  var doubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined
  var dragPan: js.UndefOr[scala.Boolean] = js.undefined
  var dragRotate: js.UndefOr[scala.Boolean] = js.undefined
  var getCursor: js.UndefOr[js.Function1[/* state */ ExtraState, scala.Unit]] = js.undefined
  var interactiveLayerIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var maxPitch: js.UndefOr[scala.Double] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minPitch: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ PointerEvent, scala.Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* event */ PointerEvent, scala.Unit]] = js.undefined
  var onDblClick: js.UndefOr[js.Function1[/* event */ PointerEvent, scala.Unit]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* event */ PointerEvent, scala.Unit]] = js.undefined
  var onInteractionStateChange: js.UndefOr[js.Function1[/* state */ ExtraState, scala.Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* event */ PointerEvent, scala.Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, scala.Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, scala.Unit]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* event */ PointerEvent, scala.Unit]] = js.undefined
  var onMouseOut: js.UndefOr[js.Function1[/* event */ PointerEvent, scala.Unit]] = js.undefined
  var onMouseUp: js.UndefOr[js.Function1[/* event */ PointerEvent, scala.Unit]] = js.undefined
  var onNativeClick: js.UndefOr[js.Function1[/* event */ PointerEvent, scala.Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ PointerEvent, scala.Unit]] = js.undefined
  var onTouchMove: js.UndefOr[js.Function1[/* event */ PointerEvent, scala.Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function1[/* event */ PointerEvent, scala.Unit]] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTransitionInterrupt: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onViewStateChange: js.UndefOr[ViewStateChangeHandler] = js.undefined
  var onViewportChange: js.UndefOr[ViewportChangeHandler] = js.undefined
  var onWheel: js.UndefOr[js.Function1[/* event */ PointerEvent, scala.Unit]] = js.undefined
  var scrollZoom: js.UndefOr[scala.Boolean] = js.undefined
  var touchAction: js.UndefOr[java.lang.String] = js.undefined
  var touchRotate: js.UndefOr[scala.Boolean] = js.undefined
  var touchZoom: js.UndefOr[scala.Boolean] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
  var transitionEasing: js.UndefOr[EasingFunction] = js.undefined
  var transitionInterpolator: js.UndefOr[TransitionInterpolator] = js.undefined
  var transitionInterruption: js.UndefOr[TRANSITION_EVENTS] = js.undefined
}

object InteractiveMapProps {
  @scala.inline
  def apply(
    height: scala.Double | java.lang.String,
    width: scala.Double | java.lang.String,
    attributionControl: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    clickRadius: scala.Int | scala.Double = null,
    container: js.Object = null,
    controller: MapController = null,
    disableTokenWarning: js.UndefOr[scala.Boolean] = js.undefined,
    doubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined,
    dragPan: js.UndefOr[scala.Boolean] = js.undefined,
    dragRotate: js.UndefOr[scala.Boolean] = js.undefined,
    getCursor: /* state */ ExtraState => scala.Unit = null,
    gl: js.Object = null,
    interactiveLayerIds: js.Array[java.lang.String] = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    mapOptions: js.Object = null,
    mapStyle: java.lang.String | js.Object = null,
    mapboxApiAccessToken: java.lang.String = null,
    maxPitch: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minPitch: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    onClick: /* event */ PointerEvent => scala.Unit = null,
    onContextMenu: /* event */ PointerEvent => scala.Unit = null,
    onDblClick: /* event */ PointerEvent => scala.Unit = null,
    onError: /* e */ MapError => scala.Unit = null,
    onHover: /* event */ PointerEvent => scala.Unit = null,
    onInteractionStateChange: /* state */ ExtraState => scala.Unit = null,
    onLoad: /* event */ MapLoadEvent => scala.Unit = null,
    onMouseDown: /* event */ PointerEvent => scala.Unit = null,
    onMouseEnter: /* event */ PointerEvent => scala.Unit = null,
    onMouseLeave: /* event */ PointerEvent => scala.Unit = null,
    onMouseMove: /* event */ PointerEvent => scala.Unit = null,
    onMouseOut: /* event */ PointerEvent => scala.Unit = null,
    onMouseUp: /* event */ PointerEvent => scala.Unit = null,
    onNativeClick: /* event */ PointerEvent => scala.Unit = null,
    onResize: /* dimensions */ reactDashMapDashGlLib.Anon_Height => scala.Unit = null,
    onTouchEnd: /* event */ PointerEvent => scala.Unit = null,
    onTouchMove: /* event */ PointerEvent => scala.Unit = null,
    onTouchStart: /* event */ PointerEvent => scala.Unit = null,
    onTransitionEnd: () => scala.Unit = null,
    onTransitionInterrupt: () => scala.Unit = null,
    onTransitionStart: () => scala.Unit = null,
    onViewStateChange: ViewStateChangeHandler = null,
    onViewportChange: ViewportChangeHandler = null,
    onWheel: /* event */ PointerEvent => scala.Unit = null,
    preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    preventStyleDiffing: js.UndefOr[scala.Boolean] = js.undefined,
    reuseMap: js.UndefOr[scala.Boolean] = js.undefined,
    reuseMaps: js.UndefOr[scala.Boolean] = js.undefined,
    scrollZoom: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Object = null,
    touchAction: java.lang.String = null,
    touchRotate: js.UndefOr[scala.Boolean] = js.undefined,
    touchZoom: js.UndefOr[scala.Boolean] = js.undefined,
    transformRequest: (/* url */ js.UndefOr[java.lang.String], /* resourceType */ js.UndefOr[java.lang.String]) => MapRequest = null,
    transitionDuration: scala.Int | scala.Double = null,
    transitionEasing: EasingFunction = null,
    transitionInterpolator: TransitionInterpolator = null,
    transitionInterruption: TRANSITION_EVENTS = null,
    viewState: ViewState = null,
    visibilityConstraints: reactDashMapDashGlLib.Anon_MaxPitch = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): InteractiveMapProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl)
    if (className != null) __obj.updateDynamic("className")(className)
    if (clickRadius != null) __obj.updateDynamic("clickRadius")(clickRadius.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (!js.isUndefined(disableTokenWarning)) __obj.updateDynamic("disableTokenWarning")(disableTokenWarning)
    if (!js.isUndefined(doubleClickZoom)) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom)
    if (!js.isUndefined(dragPan)) __obj.updateDynamic("dragPan")(dragPan)
    if (!js.isUndefined(dragRotate)) __obj.updateDynamic("dragRotate")(dragRotate)
    if (getCursor != null) __obj.updateDynamic("getCursor")(js.Any.fromFunction1(getCursor))
    if (gl != null) __obj.updateDynamic("gl")(gl)
    if (interactiveLayerIds != null) __obj.updateDynamic("interactiveLayerIds")(interactiveLayerIds)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions)
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle.asInstanceOf[js.Any])
    if (mapboxApiAccessToken != null) __obj.updateDynamic("mapboxApiAccessToken")(mapboxApiAccessToken)
    if (maxPitch != null) __obj.updateDynamic("maxPitch")(maxPitch.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minPitch != null) __obj.updateDynamic("minPitch")(minPitch.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1(onDblClick))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    if (onInteractionStateChange != null) __obj.updateDynamic("onInteractionStateChange")(js.Any.fromFunction1(onInteractionStateChange))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onNativeClick != null) __obj.updateDynamic("onNativeClick")(js.Any.fromFunction1(onNativeClick))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction0(onTransitionEnd))
    if (onTransitionInterrupt != null) __obj.updateDynamic("onTransitionInterrupt")(js.Any.fromFunction0(onTransitionInterrupt))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction0(onTransitionStart))
    if (onViewStateChange != null) __obj.updateDynamic("onViewStateChange")(onViewStateChange)
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(onViewportChange)
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer)
    if (!js.isUndefined(preventStyleDiffing)) __obj.updateDynamic("preventStyleDiffing")(preventStyleDiffing)
    if (!js.isUndefined(reuseMap)) __obj.updateDynamic("reuseMap")(reuseMap)
    if (!js.isUndefined(reuseMaps)) __obj.updateDynamic("reuseMaps")(reuseMaps)
    if (!js.isUndefined(scrollZoom)) __obj.updateDynamic("scrollZoom")(scrollZoom)
    if (style != null) __obj.updateDynamic("style")(style)
    if (touchAction != null) __obj.updateDynamic("touchAction")(touchAction)
    if (!js.isUndefined(touchRotate)) __obj.updateDynamic("touchRotate")(touchRotate)
    if (!js.isUndefined(touchZoom)) __obj.updateDynamic("touchZoom")(touchZoom)
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction2(transformRequest))
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEasing != null) __obj.updateDynamic("transitionEasing")(transitionEasing)
    if (transitionInterpolator != null) __obj.updateDynamic("transitionInterpolator")(transitionInterpolator)
    if (transitionInterruption != null) __obj.updateDynamic("transitionInterruption")(transitionInterruption)
    if (viewState != null) __obj.updateDynamic("viewState")(viewState)
    if (visibilityConstraints != null) __obj.updateDynamic("visibilityConstraints")(visibilityConstraints)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[InteractiveMapProps]
  }
}

