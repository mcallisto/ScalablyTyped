package typings
package atFirebaseFirestoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassFieldValue
  extends org.scalablytyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.FieldValue] {
  /**
    * Returns a special value that can be used with set() or update() that tells
    * the server to remove the given elements from any array value that already
    * exists on the server. All instances of each element specified will be
    * removed from the array. If the field being modified is not already an
    * array it will be overwritten with an empty array.
    *
    * @param elements The elements to remove from the array.
    * @return The FieldValue sentinel for use in a call to set() or update().
    */
  def arrayRemove(elements: js.Any*): atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.FieldValue = js.native
  /**
    * Returns a special value that can be used with set() or update() that tells
    * the server to union the given elements with any array value that already
    * exists on the server. Each specified element that doesn't already exist in
    * the array will be added to the end. If the field being modified is not
    * already an array it will be overwritten with an array containing exactly
    * the specified elements.
    *
    * @param elements The elements to union into the array.
    * @return The FieldValue sentinel for use in a call to set() or update().
    */
  def arrayUnion(elements: js.Any*): atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.FieldValue = js.native
  /**
    * Returns a sentinel for use with update() to mark a field for deletion.
    */
  def delete(): atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.FieldValue = js.native
  /**
    * Returns a special value that can be used with set() or update() that tells
    * the server to increment the field's current value by the given value.
    *
    * If either the operand or the current field value uses floating point
    * precision, all arithmetic will follow IEEE 754 semantics. If both values
    * are integers, values outside of JavaScript's safe number range
    * (`Number.MIN_SAFE_INTEGER` to `Number.MAX_SAFE_INTEGER`) are also subject
    * to precision loss. Furthermore, once processed by the Firestore backend,
    * all integer operations are capped between -2^63 and 2^63-1.
    *
    * If the current field value is not of type 'number', or if the field does
    * not yet exist, the transformation will set the field to the given value.
    *
    * @param n The value to increment by.
    * @return The FieldValue sentinel for use in a call to set() or update().
    */
  def increment(n: scala.Double): atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.FieldValue = js.native
  /**
    * Returns a sentinel used with set() or update() to include a
    * server-generated timestamp in the written data.
    */
  def serverTimestamp(): atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.FieldValue = js.native
}

