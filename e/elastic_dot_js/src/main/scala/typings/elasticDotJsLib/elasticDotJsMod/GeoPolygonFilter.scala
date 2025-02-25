package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "GeoPolygonFilter")
@js.native
class GeoPolygonFilter protected () extends js.Object {
  /*
    Filter results to those which are contained within the polygon of points.
    */
  def this(fieldName: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): GeoPolygonFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): GeoPolygonFilter = js.native
  /*
    Sets the fields to filter against.
    */
  def field(f: java.lang.String): GeoPolygonFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): GeoPolygonFilter = js.native
  /*
    If the lat/long points should be normalized to lie within their
    respective normalized ranges.
    Normalized ranges are:
    lon = -180 (exclusive) to 180 (inclusive) range
    lat = -90 to 90 (both inclusive) range
    */
  def normalize(trueFalse: java.lang.String): GeoPolygonFilter = js.native
  /*
    Sets a series of points that represent a polygon.  If passed a
    single GeoPoint object, it is added to the current
    list of points.  If passed an array of GeoPoint
    objects it replaces all current values.
    */
  def points(pointsArray: js.Array[_]): GeoPolygonFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): GeoPolygonFilter = js.native
}

