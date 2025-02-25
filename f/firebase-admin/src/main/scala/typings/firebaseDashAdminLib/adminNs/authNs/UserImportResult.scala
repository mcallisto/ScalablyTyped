package typings
package firebaseDashAdminLib.adminNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the response from the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#importUsers `importUsers()`} method for batch
  * importing users to Firebase Auth.
  */
trait UserImportResult extends js.Object {
  /**
    * An array of errors corresponding to the provided users to import. The
    * length of this array is equal to [`failureCount`](#failureCount).
    */
  var errors: js.Array[firebaseDashAdminLib.adminNs.FirebaseArrayIndexError]
  /**
    * The number of user records that failed to import to Firebase Auth.
    */
  var failureCount: scala.Double
  /**
    * The number of user records that successfully imported to Firebase Auth.
    */
  var successCount: scala.Double
}

object UserImportResult {
  @scala.inline
  def apply(
    errors: js.Array[firebaseDashAdminLib.adminNs.FirebaseArrayIndexError],
    failureCount: scala.Double,
    successCount: scala.Double
  ): UserImportResult = {
    val __obj = js.Dynamic.literal(errors = errors, failureCount = failureCount, successCount = successCount)
  
    __obj.asInstanceOf[UserImportResult]
  }
}

