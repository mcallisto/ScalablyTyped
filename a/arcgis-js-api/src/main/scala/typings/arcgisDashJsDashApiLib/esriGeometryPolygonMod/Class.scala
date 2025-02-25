package typings
package arcgisDashJsDashApiLib.esriGeometryPolygonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/geometry/Polygon", JSImport.Namespace)
@js.native
/**
  * A polygon contains an array of [rings](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings) and a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#spatialReference). Each ring is represented as an array of points. The first and last points of a ring must be the same. A polygon also has boolean-valued [hasM](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM) and [hasZ](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) fields.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html)
  */
class Class ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Polygon {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.PolygonProperties) = this()
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

