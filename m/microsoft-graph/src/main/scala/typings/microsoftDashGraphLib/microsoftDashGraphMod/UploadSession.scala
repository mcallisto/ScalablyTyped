package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadSession extends js.Object {
  /** The date and time in UTC that the upload session will expire. The complete file must be uploaded before this expiration time is reached. */
  var expirationDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** A collection of byte ranges that the server is missing for the file. These ranges are zero indexed and of the format 'start-end' (e.g. '0-26' to indicate the first 27 bytes of the file). */
  var nextExpectedRanges: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The URL endpoint that accepts PUT requests for byte ranges of the file. */
  var uploadUrl: js.UndefOr[java.lang.String] = js.undefined
}

object UploadSession {
  @scala.inline
  def apply(
    expirationDateTime: java.lang.String = null,
    nextExpectedRanges: js.Array[java.lang.String] = null,
    uploadUrl: java.lang.String = null
  ): UploadSession = {
    val __obj = js.Dynamic.literal()
    if (expirationDateTime != null) __obj.updateDynamic("expirationDateTime")(expirationDateTime)
    if (nextExpectedRanges != null) __obj.updateDynamic("nextExpectedRanges")(nextExpectedRanges)
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl)
    __obj.asInstanceOf[UploadSession]
  }
}

