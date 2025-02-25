package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPolicyOperation extends Entity {
  /**
    * Represents when the request for this data policy operation was completed, in UTC time, using the ISO 8601 format.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Null until the operation completes.
    */
  var completedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the progress of an operation. */
  var progress: js.UndefOr[scala.Double] = js.undefined
  /** Possible values are: notStarted, running, complete, failed, unknownFutureValue. */
  var status: js.UndefOr[DataPolicyOperationStatus] = js.undefined
  /** The URL location to where data is being exported for export requests. */
  var storageLocation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Represents when the request for this data operation was submitted, in UTC time, using the ISO 8601 format.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var submittedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** The id for the user on whom the operation is performed. */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object DataPolicyOperation {
  @scala.inline
  def apply(
    completedDateTime: java.lang.String = null,
    id: java.lang.String = null,
    progress: scala.Int | scala.Double = null,
    status: DataPolicyOperationStatus = null,
    storageLocation: java.lang.String = null,
    submittedDateTime: java.lang.String = null,
    userId: java.lang.String = null
  ): DataPolicyOperation = {
    val __obj = js.Dynamic.literal()
    if (completedDateTime != null) __obj.updateDynamic("completedDateTime")(completedDateTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status)
    if (storageLocation != null) __obj.updateDynamic("storageLocation")(storageLocation)
    if (submittedDateTime != null) __obj.updateDynamic("submittedDateTime")(submittedDateTime)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[DataPolicyOperation]
  }
}

