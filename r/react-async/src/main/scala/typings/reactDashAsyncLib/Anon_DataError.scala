package typings
package reactDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataError[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var finishedAt: js.UndefOr[scala.Nothing] = js.undefined
  var isFulfilled: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isInitial: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isLoading: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`
  var isPending: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`
  var isRejected: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isResolved: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isSettled: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var startedAt: stdLib.Date
  var status: reactDashAsyncLib.reactDashAsyncLibStrings.pending
  var value: js.UndefOr[T | stdLib.Error] = js.undefined
}

object Anon_DataError {
  @scala.inline
  def apply[T](
    isFulfilled: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isInitial: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isLoading: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`,
    isPending: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`,
    isRejected: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isResolved: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isSettled: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    startedAt: stdLib.Date,
    status: reactDashAsyncLib.reactDashAsyncLibStrings.pending,
    data: T = null,
    error: stdLib.Error = null,
    finishedAt: js.UndefOr[scala.Nothing] = js.undefined,
    value: T | stdLib.Error = null
  ): Anon_DataError[T] = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled, isInitial = isInitial, isLoading = isLoading, isPending = isPending, isRejected = isRejected, isResolved = isResolved, isSettled = isSettled, startedAt = startedAt, status = status)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(finishedAt)) __obj.updateDynamic("finishedAt")(finishedAt)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataError[T]]
  }
}

