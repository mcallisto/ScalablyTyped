package typings
package awsDashSdkLib.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentLocation extends js.Object {
  /**
    * The Amazon S3 bucket that contains the input document.
    */
  var S3Object: js.UndefOr[S3Object] = js.undefined
}

object DocumentLocation {
  @scala.inline
  def apply(S3Object: S3Object = null): DocumentLocation = {
    val __obj = js.Dynamic.literal()
    if (S3Object != null) __obj.updateDynamic("S3Object")(S3Object)
    __obj.asInstanceOf[DocumentLocation]
  }
}

