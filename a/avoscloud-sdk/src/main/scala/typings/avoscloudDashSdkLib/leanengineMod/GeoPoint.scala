package typings
package avoscloudDashSdkLib.leanengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new GeoPoint with any of the following forms:<br>
  *   <pre>
  *   new GeoPoint(otherGeoPoint)
  *   new GeoPoint(30, 30)
  *   new GeoPoint([30, 30])
  *   new GeoPoint({latitude: 30, longitude: 30})
  *   new GeoPoint()  // defaults to (0, 0)
  *   </pre>
  * @class
  *
  * <p>Represents a latitude / longitude point that may be associated
  * with a key in a AVObject or used as a reference point for geo queries.
  * This allows proximity-based queries on the key.</p>
  *
  * <p>Only one key in a class may contain a GeoPoint.</p>
  *
  * <p>Example:<pre>
  *   var point = new AV.GeoPoint(30.0, -20.0);
  *   var object = new AV.Object("PlaceObject");
  *   object.set("location", point);
  *   object.save();</pre></p>
  */
@JSImport("leanengine", "GeoPoint")
@js.native
class GeoPoint ()
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.GeoPoint {
  def this(arg1: js.Any) = this()
  def this(arg1: js.Any, arg2: js.Any) = this()
}

