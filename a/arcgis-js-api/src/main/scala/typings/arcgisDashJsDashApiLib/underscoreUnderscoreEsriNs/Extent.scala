package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extent
  extends Geometry
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.geometryNs.Geometry
     with geometryGeometry {
  /**
    * The center point of the extent in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#center)
    */
  val center: Point = js.native
  /**
    * The height of the extent in map units (the distance between [ymin](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymin) and [ymax](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymax)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#height)
    */
  val height: scala.Double = js.native
  /**
    * The maximum possible `m` value in an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#mmax)
    *
    * @default undefined
    */
  var mmax: scala.Double = js.native
  /**
    * The minimum possible `m` value of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#mmin)
    *
    * @default undefined
    */
  var mmin: scala.Double = js.native
  /**
    * For Extent, the type is always `extent`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#type)
    */
  @JSName("type")
  val type_Extent: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.extent = js.native
  /**
    * The width of the extent in map units (the distance between [xmin](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmin) and [xmax](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmax)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#width)
    */
  val width: scala.Double = js.native
  /**
    * The bottom-right X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmax)
    *
    * @default 0
    */
  var xmax: scala.Double = js.native
  /**
    * The top-left X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmin)
    *
    * @default 0
    */
  var xmin: scala.Double = js.native
  /**
    * The top-right Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymax)
    *
    * @default 0
    */
  var ymax: scala.Double = js.native
  /**
    * The bottom-left Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymin)
    *
    * @default 0
    */
  var ymin: scala.Double = js.native
  /**
    * The maximum possible `z`, or elevation, value in an extent envelope.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmax)
    *
    * @default undefined
    */
  var zmax: scala.Double = js.native
  /**
    * The minimum possible `z`, or elevation, value of an extent envelope.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmin)
    *
    * @default undefined
    */
  var zmin: scala.Double = js.native
  /**
    * Centers the extent to the specified [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html). This method modifies the extent geometry in-place. You should [clone](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#clone) the extent object before calling this method where appropriate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#centerAt)
    *
    * @param point The point to center the extent.
    *
    */
  def centerAt(point: Point): Extent = js.native
  def contains(geometry: Extent): scala.Boolean = js.native
  /**
    * Checks if the input geometry is contained within the extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#contains)
    *
    * @param geometry Input geometry to test if it is contained within the extent.
    *
    */
  def contains(geometry: Point): scala.Boolean = js.native
  /**
    * Indicates if the input extent is equal to the testing extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#equals)
    *
    * @param extent Input extent.
    *
    */
  def equals(extent: Extent): scala.Boolean = js.native
  /**
    * Expands the extent by the given factor. For example, a value of 1.5 will expand the extent to be 50 percent larger than the original extent. This method modifies the extent geometry in-place. You should [clone](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#clone) the extent object before calling this method where appropriate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#expand)
    *
    * @param factor The multiplier value.
    *
    */
  def expand(factor: scala.Double): Extent = js.native
  /**
    * Shrinks the original extent to the intersection with the input extent. This method modifies the extent geometry in-place. You should [clone](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#clone) the extent object before calling this method where appropriate. If the original extent and the input extent have no intersection, the extent is not modified and null is returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#intersection)
    *
    * @param extent The input extent to intersect.
    *
    */
  def intersection(extent: Extent): Extent = js.native
  /**
    * Tests to validate if the input geometry intersects the extent and returns a Boolean value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#intersects)
    *
    * @param geometry The geometry used to test the intersection. It can be a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html), [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) or [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html).
    *
    */
  def intersects(geometry: Geometry): scala.Boolean = js.native
  /**
    * Returns an array with either one Extent that's been shifted to within +/- 180 or two Extents if the original extent intersects the International Dateline.  This method modifies the extent geometry in-place. You should [clone](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#clone) the extent object before calling this method where appropriate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#normalize)
    *
    *
    */
  def normalize(): js.Array[Extent] = js.native
  /**
    * Modifies the extent geometry in-place with X and Y offsets in map units. You should [clone](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#clone) the extent object before calling this method where appropriate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#offset)
    *
    * @param dx The offset distance in map units for the X-coordinate.
    * @param dy The offset distance in map units for the Y-coordinate.
    * @param dz The offset distance in map units for the Z-coordinate.
    *
    */
  def offset(dx: scala.Double, dy: scala.Double, dz: scala.Double): Extent = js.native
  /**
    * Expands the original extent to include the extent of the input Extent. This method modifies the extent geometry in-place. You should [clone](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#clone) the extent object before calling this method where appropriate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#union)
    *
    * @param extent The input extent to union.
    *
    */
  def union(extent: Extent): Extent = js.native
}

@JSGlobal("__esri.Extent")
@js.native
class ExtentCls () extends Extent {
  def this(properties: ExtentProperties) = this()
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

