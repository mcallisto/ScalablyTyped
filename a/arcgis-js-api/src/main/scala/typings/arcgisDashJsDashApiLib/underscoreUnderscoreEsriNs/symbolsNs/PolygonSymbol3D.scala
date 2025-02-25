package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.symbolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.symbols.PolygonSymbol3D")
@js.native
/**
  * PolygonSymbol3D is used to render features with [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometry in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). This symbol type is not supported in 2D MapViews. Polygon features may also be rendered as points with icons or objects at the centroid of each polygon.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html)
  */
class PolygonSymbol3DCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.PolygonSymbol3D {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.PolygonSymbol3DProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

