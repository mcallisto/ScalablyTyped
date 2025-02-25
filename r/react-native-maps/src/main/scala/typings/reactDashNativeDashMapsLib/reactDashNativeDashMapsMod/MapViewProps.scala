package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait MapViewProps extends js.Object {
  var cacheEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var camera: js.UndefOr[Camera] = js.undefined
  var compassOffset: js.UndefOr[Point] = js.undefined
  var customMapStyle: js.UndefOr[js.Array[MapStyleElement]] = js.undefined
  var customMapStyleString: js.UndefOr[java.lang.String] = js.undefined
  var followsUserLocation: js.UndefOr[scala.Boolean] = js.undefined
  var initialCamera: js.UndefOr[Camera] = js.undefined
  var initialRegion: js.UndefOr[Region] = js.undefined
  var kmlSrc: js.UndefOr[java.lang.String] = js.undefined
  var legalLabelInsets: js.UndefOr[EdgeInsets] = js.undefined
  var liteMode: js.UndefOr[scala.Boolean] = js.undefined
  var loadingBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var loadingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var loadingIndicatorColor: js.UndefOr[java.lang.String] = js.undefined
  var mapPadding: js.UndefOr[EdgePadding] = js.undefined
  var mapType: js.UndefOr[MapTypes] = js.undefined
  var maxDelta: js.UndefOr[scala.Double] = js.undefined
  var maxZoomLevel: js.UndefOr[scala.Double] = js.undefined
  var minDelta: js.UndefOr[scala.Double] = js.undefined
  var minZoomLevel: js.UndefOr[scala.Double] = js.undefined
  var moveOnMarkerPress: js.UndefOr[scala.Boolean] = js.undefined
  var onCalloutPress: js.UndefOr[
    js.Function1[
      /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionCalloutpress], 
      scala.Unit
    ]
  ] = js.undefined
  var onKmlReady: js.UndefOr[js.Function1[/* values */ KmlMapEvent, scala.Unit]] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], scala.Unit]] = js.undefined
  var onMapReady: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onMarkerDeselect: js.UndefOr[
    js.Function1[
      /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionIdMarkerdeselect], 
      scala.Unit
    ]
  ] = js.undefined
  var onMarkerDrag: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], scala.Unit]] = js.undefined
  var onMarkerDragEnd: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], scala.Unit]] = js.undefined
  var onMarkerDragStart: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], scala.Unit]] = js.undefined
  var onMarkerPress: js.UndefOr[
    js.Function1[/* event */ MapEvent[reactDashNativeDashMapsLib.Anon_Action], scala.Unit]
  ] = js.undefined
  var onMarkerSelect: js.UndefOr[
    js.Function1[/* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionId], scala.Unit]
  ] = js.undefined
  var onPanDrag: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], scala.Unit]] = js.undefined
  var onPoiClick: js.UndefOr[
    js.Function1[/* event */ MapEvent[reactDashNativeDashMapsLib.Anon_Name], scala.Unit]
  ] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], scala.Unit]] = js.undefined
  var onRegionChange: js.UndefOr[js.Function1[/* region */ Region, scala.Unit]] = js.undefined
  var onRegionChangeComplete: js.UndefOr[js.Function1[/* region */ Region, scala.Unit]] = js.undefined
  var onUserLocationChange: js.UndefOr[js.Function1[/* event */ EventUserLocation, scala.Unit]] = js.undefined
  var pitchEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var provider: js.UndefOr[reactDashNativeDashMapsLib.reactDashNativeDashMapsLibStrings.google | scala.Null] = js.undefined
  var region: js.UndefOr[Region] = js.undefined
  var rotateEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var showsBuildings: js.UndefOr[scala.Boolean] = js.undefined
  var showsCompass: js.UndefOr[scala.Boolean] = js.undefined
  var showsIndoorLevelPicker: js.UndefOr[scala.Boolean] = js.undefined
  var showsIndoors: js.UndefOr[scala.Boolean] = js.undefined
  var showsMyLocationButton: js.UndefOr[scala.Boolean] = js.undefined
  var showsPointsOfInterest: js.UndefOr[scala.Boolean] = js.undefined
  var showsScale: js.UndefOr[scala.Boolean] = js.undefined
  var showsTraffic: js.UndefOr[scala.Boolean] = js.undefined
  var showsUserLocation: js.UndefOr[scala.Boolean] = js.undefined
  var toolbarEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var userLocationAnnotationTitle: js.UndefOr[java.lang.String] = js.undefined
  var zoomControlEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var zoomEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var zoomTapEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object MapViewProps {
  @scala.inline
  def apply(
    cacheEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    camera: Camera = null,
    compassOffset: Point = null,
    customMapStyle: js.Array[MapStyleElement] = null,
    customMapStyleString: java.lang.String = null,
    followsUserLocation: js.UndefOr[scala.Boolean] = js.undefined,
    initialCamera: Camera = null,
    initialRegion: Region = null,
    kmlSrc: java.lang.String = null,
    legalLabelInsets: EdgeInsets = null,
    liteMode: js.UndefOr[scala.Boolean] = js.undefined,
    loadingBackgroundColor: java.lang.String = null,
    loadingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    loadingIndicatorColor: java.lang.String = null,
    mapPadding: EdgePadding = null,
    mapType: MapTypes = null,
    maxDelta: scala.Int | scala.Double = null,
    maxZoomLevel: scala.Int | scala.Double = null,
    minDelta: scala.Int | scala.Double = null,
    minZoomLevel: scala.Int | scala.Double = null,
    moveOnMarkerPress: js.UndefOr[scala.Boolean] = js.undefined,
    onCalloutPress: /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionCalloutpress] => scala.Unit = null,
    onKmlReady: /* values */ KmlMapEvent => scala.Unit = null,
    onLongPress: /* event */ MapEvent[js.Object] => scala.Unit = null,
    onMapReady: () => scala.Unit = null,
    onMarkerDeselect: /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionIdMarkerdeselect] => scala.Unit = null,
    onMarkerDrag: /* event */ MapEvent[js.Object] => scala.Unit = null,
    onMarkerDragEnd: /* event */ MapEvent[js.Object] => scala.Unit = null,
    onMarkerDragStart: /* event */ MapEvent[js.Object] => scala.Unit = null,
    onMarkerPress: /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_Action] => scala.Unit = null,
    onMarkerSelect: /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionId] => scala.Unit = null,
    onPanDrag: /* event */ MapEvent[js.Object] => scala.Unit = null,
    onPoiClick: /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_Name] => scala.Unit = null,
    onPress: /* event */ MapEvent[js.Object] => scala.Unit = null,
    onRegionChange: /* region */ Region => scala.Unit = null,
    onRegionChangeComplete: /* region */ Region => scala.Unit = null,
    onUserLocationChange: /* event */ EventUserLocation => scala.Unit = null,
    pitchEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    provider: reactDashNativeDashMapsLib.reactDashNativeDashMapsLibStrings.google = null,
    region: Region = null,
    rotateEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    showsBuildings: js.UndefOr[scala.Boolean] = js.undefined,
    showsCompass: js.UndefOr[scala.Boolean] = js.undefined,
    showsIndoorLevelPicker: js.UndefOr[scala.Boolean] = js.undefined,
    showsIndoors: js.UndefOr[scala.Boolean] = js.undefined,
    showsMyLocationButton: js.UndefOr[scala.Boolean] = js.undefined,
    showsPointsOfInterest: js.UndefOr[scala.Boolean] = js.undefined,
    showsScale: js.UndefOr[scala.Boolean] = js.undefined,
    showsTraffic: js.UndefOr[scala.Boolean] = js.undefined,
    showsUserLocation: js.UndefOr[scala.Boolean] = js.undefined,
    toolbarEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    userLocationAnnotationTitle: java.lang.String = null,
    zoomControlEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    zoomEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    zoomTapEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): MapViewProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheEnabled)) __obj.updateDynamic("cacheEnabled")(cacheEnabled)
    if (camera != null) __obj.updateDynamic("camera")(camera)
    if (compassOffset != null) __obj.updateDynamic("compassOffset")(compassOffset)
    if (customMapStyle != null) __obj.updateDynamic("customMapStyle")(customMapStyle)
    if (customMapStyleString != null) __obj.updateDynamic("customMapStyleString")(customMapStyleString)
    if (!js.isUndefined(followsUserLocation)) __obj.updateDynamic("followsUserLocation")(followsUserLocation)
    if (initialCamera != null) __obj.updateDynamic("initialCamera")(initialCamera)
    if (initialRegion != null) __obj.updateDynamic("initialRegion")(initialRegion)
    if (kmlSrc != null) __obj.updateDynamic("kmlSrc")(kmlSrc)
    if (legalLabelInsets != null) __obj.updateDynamic("legalLabelInsets")(legalLabelInsets)
    if (!js.isUndefined(liteMode)) __obj.updateDynamic("liteMode")(liteMode)
    if (loadingBackgroundColor != null) __obj.updateDynamic("loadingBackgroundColor")(loadingBackgroundColor)
    if (!js.isUndefined(loadingEnabled)) __obj.updateDynamic("loadingEnabled")(loadingEnabled)
    if (loadingIndicatorColor != null) __obj.updateDynamic("loadingIndicatorColor")(loadingIndicatorColor)
    if (mapPadding != null) __obj.updateDynamic("mapPadding")(mapPadding)
    if (mapType != null) __obj.updateDynamic("mapType")(mapType)
    if (maxDelta != null) __obj.updateDynamic("maxDelta")(maxDelta.asInstanceOf[js.Any])
    if (maxZoomLevel != null) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.asInstanceOf[js.Any])
    if (minDelta != null) __obj.updateDynamic("minDelta")(minDelta.asInstanceOf[js.Any])
    if (minZoomLevel != null) __obj.updateDynamic("minZoomLevel")(minZoomLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(moveOnMarkerPress)) __obj.updateDynamic("moveOnMarkerPress")(moveOnMarkerPress)
    if (onCalloutPress != null) __obj.updateDynamic("onCalloutPress")(js.Any.fromFunction1(onCalloutPress))
    if (onKmlReady != null) __obj.updateDynamic("onKmlReady")(js.Any.fromFunction1(onKmlReady))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onMapReady != null) __obj.updateDynamic("onMapReady")(js.Any.fromFunction0(onMapReady))
    if (onMarkerDeselect != null) __obj.updateDynamic("onMarkerDeselect")(js.Any.fromFunction1(onMarkerDeselect))
    if (onMarkerDrag != null) __obj.updateDynamic("onMarkerDrag")(js.Any.fromFunction1(onMarkerDrag))
    if (onMarkerDragEnd != null) __obj.updateDynamic("onMarkerDragEnd")(js.Any.fromFunction1(onMarkerDragEnd))
    if (onMarkerDragStart != null) __obj.updateDynamic("onMarkerDragStart")(js.Any.fromFunction1(onMarkerDragStart))
    if (onMarkerPress != null) __obj.updateDynamic("onMarkerPress")(js.Any.fromFunction1(onMarkerPress))
    if (onMarkerSelect != null) __obj.updateDynamic("onMarkerSelect")(js.Any.fromFunction1(onMarkerSelect))
    if (onPanDrag != null) __obj.updateDynamic("onPanDrag")(js.Any.fromFunction1(onPanDrag))
    if (onPoiClick != null) __obj.updateDynamic("onPoiClick")(js.Any.fromFunction1(onPoiClick))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onRegionChange != null) __obj.updateDynamic("onRegionChange")(js.Any.fromFunction1(onRegionChange))
    if (onRegionChangeComplete != null) __obj.updateDynamic("onRegionChangeComplete")(js.Any.fromFunction1(onRegionChangeComplete))
    if (onUserLocationChange != null) __obj.updateDynamic("onUserLocationChange")(js.Any.fromFunction1(onUserLocationChange))
    if (!js.isUndefined(pitchEnabled)) __obj.updateDynamic("pitchEnabled")(pitchEnabled)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (region != null) __obj.updateDynamic("region")(region)
    if (!js.isUndefined(rotateEnabled)) __obj.updateDynamic("rotateEnabled")(rotateEnabled)
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled)
    if (!js.isUndefined(showsBuildings)) __obj.updateDynamic("showsBuildings")(showsBuildings)
    if (!js.isUndefined(showsCompass)) __obj.updateDynamic("showsCompass")(showsCompass)
    if (!js.isUndefined(showsIndoorLevelPicker)) __obj.updateDynamic("showsIndoorLevelPicker")(showsIndoorLevelPicker)
    if (!js.isUndefined(showsIndoors)) __obj.updateDynamic("showsIndoors")(showsIndoors)
    if (!js.isUndefined(showsMyLocationButton)) __obj.updateDynamic("showsMyLocationButton")(showsMyLocationButton)
    if (!js.isUndefined(showsPointsOfInterest)) __obj.updateDynamic("showsPointsOfInterest")(showsPointsOfInterest)
    if (!js.isUndefined(showsScale)) __obj.updateDynamic("showsScale")(showsScale)
    if (!js.isUndefined(showsTraffic)) __obj.updateDynamic("showsTraffic")(showsTraffic)
    if (!js.isUndefined(showsUserLocation)) __obj.updateDynamic("showsUserLocation")(showsUserLocation)
    if (!js.isUndefined(toolbarEnabled)) __obj.updateDynamic("toolbarEnabled")(toolbarEnabled)
    if (userLocationAnnotationTitle != null) __obj.updateDynamic("userLocationAnnotationTitle")(userLocationAnnotationTitle)
    if (!js.isUndefined(zoomControlEnabled)) __obj.updateDynamic("zoomControlEnabled")(zoomControlEnabled)
    if (!js.isUndefined(zoomEnabled)) __obj.updateDynamic("zoomEnabled")(zoomEnabled)
    if (!js.isUndefined(zoomTapEnabled)) __obj.updateDynamic("zoomTapEnabled")(zoomTapEnabled)
    __obj.asInstanceOf[MapViewProps]
  }
}

