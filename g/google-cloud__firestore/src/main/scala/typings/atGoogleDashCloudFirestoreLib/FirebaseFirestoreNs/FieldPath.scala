package typings
package atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FirebaseFirestore.FieldPath")
@js.native
class FieldPath protected () extends js.Object {
  /**
    * Creates a FieldPath from the provided field names. If more than one field
    * name is provided, the path will point to a nested field in a document.
    *
    * @param fieldNames A list of field names.
    */
  def this(fieldNames: java.lang.String*) = this()
  /**
    * Returns true if this `FieldPath` is equal to the provided one.
    *
    * @param other The `FieldPath` to compare against.
    * @return true if this `FieldPath` is equal to the provided one.
    */
  def isEqual(other: FieldPath): scala.Boolean = js.native
}

/* static members */
@JSGlobal("FirebaseFirestore.FieldPath")
@js.native
object FieldPath extends js.Object {
  /**
    * Returns a special sentinel FieldPath to refer to the ID of a document.
    * It can be used in queries to sort or filter by the document ID.
    */
  def documentId(): atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs.FieldPath = js.native
}

