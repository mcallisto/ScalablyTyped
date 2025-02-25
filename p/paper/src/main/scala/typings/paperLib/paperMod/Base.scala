package typings
package paperLib.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class for all library classes.
  */
@JSImport("paper", "Base")
@js.native
class Base ()
  extends paperLib.paperNs.Base

/* static members */
@JSImport("paper", "Base")
@js.native
object Base extends js.Object {
  /**
    * Checks if two values or objects are equals to each other, by using their
    * equals() methods if available, and also comparing elements of arrays and
    * properties of objects.
    */
  def equals(obj1: js.Any, obj2: js.Any): scala.Boolean = js.native
  /**
    * Exports (serializes) object to a JSON data object or string.
    *
    *
    * @param options [optional] - the serialization options
    * @option [options.asString=true] - whether the JSON is returned as a Object or a String.
    * @option [options.precision=5] - the amount of fractional digits in numbers used in JSON data.
    * @return the exported JSON data
    */
  def exportJSON(obj: js.Any): java.lang.String = js.native
  def exportJSON(obj: js.Any, options: paperLib.Anon_AsStringFalse): js.Object | js.Array[_] = js.native
  def exportJSON(obj: js.Any, options: paperLib.Anon_AsStringPrecision): java.lang.String = js.native
  def importJSON(json: java.lang.String): js.Any = js.native
  def importJSON(json: java.lang.String, target: js.Any): js.Any = js.native
  def importJSON(json: js.Array[_]): js.Any = js.native
  def importJSON(json: js.Array[_], target: js.Any): js.Any = js.native
  /**
    * Imports (deserializes) the stored JSON data into the target, if the
    * classes match. If they do not match, a newly created object is returned
    * instead.
    */
  def importJSON(json: js.Object): js.Any = js.native
  def importJSON(json: js.Object, target: js.Any): js.Any = js.native
  def importJSON[T /* <: paperLib.paperNs.Base */](json: T): T = js.native
  def importJSON[T /* <: paperLib.paperNs.Base */](json: T, target: T): T = js.native
}

