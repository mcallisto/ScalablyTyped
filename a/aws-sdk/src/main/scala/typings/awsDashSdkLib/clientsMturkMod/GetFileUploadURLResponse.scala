package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileUploadURLResponse extends js.Object {
  /**
    *  A temporary URL for the file that the Worker uploaded for the answer. 
    */
  var FileUploadURL: js.UndefOr[String] = js.undefined
}

object GetFileUploadURLResponse {
  @scala.inline
  def apply(FileUploadURL: String = null): GetFileUploadURLResponse = {
    val __obj = js.Dynamic.literal()
    if (FileUploadURL != null) __obj.updateDynamic("FileUploadURL")(FileUploadURL)
    __obj.asInstanceOf[GetFileUploadURLResponse]
  }
}

