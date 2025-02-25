package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewHitTestResult
  extends stdLib.Object {
  /**
    * Ground intersection result. The ground hit result will always be returned, even if the ground was excluded from the [hitTest](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var ground: HitTestResultGround
  /**
    * An array of result objects returned from the [hitTest()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest). Results are returned when the location of the input screen coordinates intersect a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in the view. See the table below for the specification of each object in this array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var results: js.Array[SceneViewHitTestResultResults]
  /**
    * The screen coordinates (or native mouse event) of the click on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var screenPoint: SceneViewScreenPoint | stdLib.MouseEvent
}

object SceneViewHitTestResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    ground: HitTestResultGround,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    results: js.Array[SceneViewHitTestResultResults],
    screenPoint: SceneViewScreenPoint | stdLib.MouseEvent
  ): SceneViewHitTestResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, ground = ground, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), results = results, screenPoint = screenPoint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SceneViewHitTestResult]
  }
}

