package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUploadResult extends js.Object {
  /**
    * The newly created upload.
    */
  var upload: js.UndefOr[Upload] = js.undefined
}

object CreateUploadResult {
  @scala.inline
  def apply(upload: Upload = null): CreateUploadResult = {
    val __obj = js.Dynamic.literal()
    if (upload != null) __obj.updateDynamic("upload")(upload)
    __obj.asInstanceOf[CreateUploadResult]
  }
}

