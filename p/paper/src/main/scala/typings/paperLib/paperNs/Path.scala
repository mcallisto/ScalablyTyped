package typings
package paperLib.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Path")
@js.native
/**
  * Creates a new path item and places it at the top of the active layer.
  * @param segments [optional] - An array of segments (or points to be converted to segments) that will be added to the path
  */
class Path () extends PathItem {
  def this(`object`: js.Any) = this()
  def this(pathData: java.lang.String) = this()
  def this(segments: js.Array[js.Array[scala.Double] | Point | Segment]) = this()
  /**
    * The area of the path in square points. Self-intersecting paths can contain sub-areas that cancel each other out.
    * Read only.
    */
  val area: scala.Double = js.native
  /**
    * Specifies whether the path is closed. If it is closed, Paper.js connects the first and last segments.
    */
  var closed: scala.Boolean = js.native
  /**
    * The curves contained within the path.
    * Array of Curve objects
    * Read only.
    */
  val curves: js.Array[Curve] = js.native
  /**
    * The first Curve contained within the path.
    * Read only.
    */
  val firstCurve: Curve = js.native
  /**
    * The first Segment contained within the path.
    * Read only.
    */
  val firstSegment: Segment = js.native
  /**
    * The last Curve contained within the path.
    * Read only.
    */
  val lastCurve: Curve = js.native
  /**
    * The last Segment contained within the path
    * Read only.
    */
  val lastSegment: Segment = js.native
  /**
    * The approximate length of the path in points.
    * Read only.
    */
  val length: scala.Double = js.native
  /**
    * The segments contained within the path.
    * Array of Segment objects
    */
  var segments: js.Array[Segment] = js.native
  def add(segment: js.Array[scala.Double]): Segment = js.native
  def add(segment: Point): Segment = js.native
  /**
    * Adds one segment to the end of the segments array of this path.
    * @param segment - the segment or point to be added.
    * Returns the added segment. This is not necessarily the same object, e.g. if the segment to be added already belongs to another path.
    */
  def add(segment: Segment): Segment = js.native
  /**
    * Adds an array of segments (or types that can be converted to segments) to the end of the segments array.
    * @param segments - Array of Segment objects
    * @returns an array of the added segments. These segments are not necessarily the same objects, e.g. if the segment to be added already belongs to another path.
    */
  def addSegments(segments: js.Array[js.Array[scala.Double] | Point | Segment]): js.Array[Segment] = js.native
  /**
    * Clears the path’s handles by setting their coordinates to zero, turning the path into a polygon (or a polyline if it isn’t closed).
    */
  def clearHandles(): scala.Unit = js.native
  /**
    * Divides the path on the curve at the given location into two curves, by inserting a new segment at the given location.
    * @param location - the curve location at which to divide the existing curve by inserting a new segment
    * @returns the newly inserted segment if the location is valid, {code null} otherwise
    */
  def divideAt(location: CurveLocation): Segment = js.native
  /**
    * Divides the path on the curve at the given offset into two curves, by inserting a new segment at the given location.
    * @param offset - the offset at which to divide the existing curve by inserting a new segment
    * @returns the newly inserted segment if the location is valid, {code null} otherwise
    */
  def divideAt(offset: scala.Double): Segment = js.native
  /**
    * Calculates the curvature of the path at the given offset. Curvatures indicate how sharply a path changes direction. A straight line has zero curvature, where as a circle has a constant curvature. The path's radius at the given offset is the reciprocal value of its curvature.
    * @param offset - the offset on the path, where 0 is at the beginning of the path and path.length at the end.
    * @param isTime [optional=false] -
    * @param point [optional] - the point for which we search the nearest location
    */
  def getCurvatureAt(offset: scala.Double): scala.Double = js.native
  def getCurvatureAt(offset: scala.Double, isTime: scala.Boolean): scala.Double = js.native
  def getCurvatureAt(offset: scala.Double, isTime: scala.Boolean, point: Point): scala.Double = js.native
  /**
    * Returns the curve location of the specified offset on the path.
    * @param offset - the offset or time on the path, where 0 is at the beginning of the path and path.length at the end.
    * @param isTime [optional=false] -
    */
  def getLocationAt(offset: scala.Double): CurveLocation = js.native
  def getLocationAt(offset: scala.Double, isTime: scala.Boolean): CurveLocation = js.native
  /**
    * Returns the curve location of the specified point if it lies on the path, null otherwise.
    * @param point - the point on the path.
    */
  def getLocationOf(point: Point): CurveLocation = js.native
  /**
    * Calculates the normal vector of the path at the given offset. Returns the normal vector at the given offset
    * @param offset - the offset or time on the path, where 0 is at the beginning of the path and path.length at the end.
    * @param isTime [optional=false] -
    */
  def getNormalAt(offset: scala.Double): Point = js.native
  def getNormalAt(offset: scala.Double, isTime: scala.Boolean): Point = js.native
  /**
    * Returns the length of the path from its beginning up to up to the specified point if it lies on the path, null otherwise.
    * @param point - the point on the path.
    */
  def getOffsetOf(point: Point): scala.Double = js.native
  /**
    * Calculates the point on the path at the given offset. Returns the point at the given offset
    * @param offset - the offset or time on the path, where 0 is at the beginning of the path and path.length at the end.
    * @param isTime [optional=false] -
    */
  def getPointAt(offset: scala.Double): Point = js.native
  def getPointAt(offset: scala.Double, isTime: scala.Boolean): Point = js.native
  /**
    * Calculates the tangent vector of the path at the given offset. Returns the tangent vector at the given offset
    * @param offset - the offset or time on the path, where 0 is at the beginning of the path and path.length at the end.
    * @param isTime [optional=false] -
    */
  def getTangentAt(offset: scala.Double): Point = js.native
  def getTangentAt(offset: scala.Double, isTime: scala.Boolean): Point = js.native
  /**
    * Calculates the weighted normal vector of the path at the given offset.
    * @param offset - the offset or time on the path, where 0 is at the beginning of the path and path.length at the end.
    * @param isTime [optional=false] -
    */
  def getWeightedNormalAt(offset: scala.Double): Point = js.native
  def getWeightedNormalAt(offset: scala.Double, isTime: scala.Boolean): Point = js.native
  /**
    * Calculates the weighted tangent vector of the path at the given offset.
    * @param offset - the offset or time on the path, where 0 is at the beginning of the path and path.length at the end.
    * @param isTime [optional=false] -
    */
  def getWeightedTangentAt(offset: scala.Double): Point = js.native
  def getWeightedTangentAt(offset: scala.Double, isTime: scala.Boolean): Point = js.native
  /**
    * Checks if any of the curves in the path have curve handles set.
    */
  def hasHandles(): scala.Boolean = js.native
  def insert(index: scala.Double, segment: js.Array[scala.Double]): Segment = js.native
  def insert(index: scala.Double, segment: Point): Segment = js.native
  /**
    * Inserts one segment at a given index in the list of this path's segments.
    * @param index - the index at which to insert the segment.
    * @param segment - the segment or point to be inserted.
    * Returns the added segment. This is not necessarily the same object, e.g. if the segment to be added already belongs to another path.
    */
  def insert(index: scala.Double, segment: Segment): Segment = js.native
  /**
    * Inserts an array of segments at a given index in the path's segments array.
    * @param index - the index at which to insert the segments.
    * @param segments - the segments to be inserted.
    * @returns an array of the added segments. These segments are not necessarily the same objects, e.g. if the segment to be added already belongs to another path.
    */
  def insertSegments(index: scala.Double, segments: js.Array[js.Array[scala.Double] | Point | Segment]): js.Array[Segment] = js.native
  /**
    * Joins the path with the specified path, which will be removed in the process.
    * @param path - the path to join this path with
    * @param tolerance [optional] - the tolerance with which to decide if two segments are to be considered the same location when joining. default: 0
    * @returns the joined path
    */
  def join(path: Path): Path = js.native
  def join(path: Path, tolerance: scala.Double): Path = js.native
  /**
    * Reduces the path by removing curves that have a length of 0, and unnecessary segments between two collinear flat curves.
    * @param options [optional] - options for reducing the path. default { simplify: false }
    * @param options.simplify - whether to be slightly tolerant of length when reducing the path. It not set the tolerance will be 1e-7 instead of 0.
    */
  def reducePath(): scala.Unit = js.native
  def reducePath(options: paperLib.Anon_Simplify): scala.Unit = js.native
  /**
    * Removes the segment at the specified index of the path's segments array.
    * @param index - the index of the segment to be removed
    * @returns the removed segment
    */
  def removeSegment(index: scala.Double): Segment = js.native
  /**
    * Removes all segments from the path's segments array.
    * @returns an array containing the removed segments
    */
  def removeSegments(): js.Array[Segment] = js.native
  /**
    * Removes the segments from the specified from index to the to index from the path's segments array.
    * @param from - the beginning index, inclusive
    * @param to [optional = segments.length] - the ending index
    * @returns an array containing the removed segments
    */
  def removeSegments(from: scala.Double): js.Array[Segment] = js.native
  def removeSegments(from: scala.Double, to: scala.Double): js.Array[Segment] = js.native
  /**
    * Splits the path at the given curve index and parameter. After splitting, the path will be open. If the path was open already, splitting will result in two paths.
    * @param index - the index of the curve in the path.curves array at which to split
    * @param offset - the offset at which to split the path as a number between 0 and path.length
    * @returns the newly created path after splitting, if any
    */
  def split(index: scala.Double, offset: scala.Double): Path = js.native
  /**
    * Splits the path at the given curve location. After splitting, the path will be open. If the path was open already, splitting will result in two paths.
    * @param location - the curve location at which to split the path
    * @returns the newly created path after splitting, if any
    */
  def split(location: CurveLocation): Path = js.native
  /**
    * Splits the path at the given offset. After splitting, the path will be open. If the path was open already, splitting will result in two paths.
    * @param offset - the offset at which to split the path as a number between 0 and path.length
    * @returns the newly created path after splitting, if any
    */
  def split(offset: scala.Double): Path = js.native
  /**
    * Attempts to create a new shape item with same geometry as this path item, and inherits all settings from it, similar to item.clone().
    * @param insert [optional] - specifies whether the new shape should be inserted into the scene graph. When set to true, it is inserted above the path item. default: true
    */
  def toShape(): Shape = js.native
  def toShape(insert: scala.Boolean): Shape = js.native
}

